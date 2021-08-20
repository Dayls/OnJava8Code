package controller;
import java.time.*;

public abstract class Event {
	private Instant eventTime;
	protected final Duration delayTime;
	public Event(long millisecondDelay) {
		delayTime = Duration.ofMillis(millisecondDelay);
		start();
	}
	public void start() {	// allows restarting
		eventTime = Instant.now().plus(delayTime);
	}
	public boolean ready() {
		return Instant.now().isAfter(eventTime);	// checks if instant is after the specified instant
	}
	public abstract void action();
}
