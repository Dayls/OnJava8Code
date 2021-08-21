package innerClasses;
import innerClasses.controller.*;
// This is an example of the Command design pattern 
// — each object in eventList is a request encapsulated as an object
public class GreenHouseController {
	public static void main(String[] args) {
		GreenHouseControls gc = new GreenHouseControls();
		gc.addEvent(gc.new Bell(900));
		Event[] eventList = {
			gc.new ThermostatNight(0),
			gc.new LightOn(200),
			gc.new LightOff(400),
			gc.new WaterOn(600),
			gc.new WaterOff(800),
			gc.new ThermostatDay(1400)
		};
		gc.addEvent(gc.new Restart(2000, eventList));
		gc.addEvent(new GreenHouseControls.Terminate(5000));
		gc.run();
	}
}
