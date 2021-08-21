package innerClasses.controller;
import java.util.*;

public class Controller {
	// a class from java.util to hold event of objects
	private List<Event> eventList = new ArrayList<>();
	public void addEvent(Event c) {
		eventList.add(c);
	}
	public void run() {
		while(eventList.size() > 0)
			// make a copy of array list to not modify it
			// while selection
			for(Event e : new ArrayList<>(eventList))
				if(e.ready()) {
					System.out.println(e);
					e.action();
					eventList.remove(e);
				}
	}
}
