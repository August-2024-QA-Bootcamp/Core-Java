package lec09_02_Java_oop_abstraction;

// A regular class
// A regular class can inherit only one (regular class or one abstract class) by extends keyword
// A regular class can't inherit an Interface by extends keyword

// implements keyword is used to inherit Interface in regular class
// a regular class can inherit more than one Interface
// a regular class cannot inherit a regular class or abstract class by implements keyword 
// extends keyword used before implements keyword if regular class, abstract class, interface need to be inherited

public class Toyota extends ElectricCar implements Car, Drone {
	// Global variable or class variable
	// Inside a class, variable can be declared or initialized
	public int priceOfToyota;
	public int yearOfManufacture = 1885;
	
	// Constructor is declared inside Class
	public Toyota() {
		System.out.println("This constructor is from Toyota class");
	}
	
	// method implemented inside a class, but not [declared or defined]
	// This is a very very important interview question
	
	// non abstract method or implemented method
	public void toyota() {
		System.out.println("This method is from Toyota class");
	}
	
	// we can also create parameterized method, return type method too
	
	// static method is a local method, can be used inside Regular class
	public static void countryOfOrigin() {
		System.out.println("Made in Japan");
	}

	@Override
	public void rent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void carryingGoods() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lightWeight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String stop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void brake(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void canFloat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void expensive() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void autoPilot() {
		// TODO Auto-generated method stub
		
	}
	
	// Default methods are allowed only in interfaces, not in regular class
	/*
	public default void toyotaColor () {
		
	}
	*/
		
	
	

}
