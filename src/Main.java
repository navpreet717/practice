import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1. Create the PUBLISHER
		Weather w = new Weather(20);
		w.sayHello();
		
		// 2. Create the SUBSCRIBER
		Person e = new Person("Nav");
		Person e2 = new Person("gursahab");
		Person e3 = new Person("Dhillon");
		//e.sayHello();
		
		// 3. Make nav listen to the weather station
		w.addObserver(e);
		w.addObserver(e2);
		w.addObserver(e3);
		
		// 3. Publisher sends a message (Weather station changes the weather)
		// Get temperature from user
		System.out.println("What is the new temperature? ");
		Scanner s = new Scanner(System.in);
		int temperature = s.nextInt();
		w.setTemp(temperature);
		
		System.out.println("Updated the weather.");
		
	}
}