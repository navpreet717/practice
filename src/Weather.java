import java.util.Observable;

// Change this to a publisher
public class Weather extends Observable {
	private int temp;
	
	public Weather(int t) {
		this.temp = t;
	}
	
	public void sayHello() {
		System.out.println("I'm a weather station. Temp is: " + this.temp);
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		// 1. Change the weather
		this.temp = temp;

		// 2. Tell everyone about the new weather
		// -------------------------------

		// Indicate that something changed
		this.setChanged();
		// Tell subscribers about the new temperature
		this.notifyObservers(this.temp);
	}
	
	
}