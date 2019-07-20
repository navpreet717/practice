import java.util.Observable;
import java.util.Observer;

public class Person implements Observer {

	private String name;
	
	public Person(String n) {
		this.name = n;
	}
	
	public void sayHello() {
		System.out.println("Hello, my name is: " + this.name);
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
