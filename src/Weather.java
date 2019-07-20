
public class Weather  {
	private int temp;//private temp(property)
	
	public Weather(int t) {//constructor
		this.temp = t;
	}
	
	public void sayHello() {//function
		System.out.println("I'm a weather station. Temp is: " + this.temp);
	}
	//getter &setter

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}
	
	
	
}
