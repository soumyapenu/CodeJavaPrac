package OOPsConceptsPart1;

public class Car {
	
	// Class Variables or Global Variables
	
	int mod;
	int wheel;

	public static void main(String[] args) {
		
		// Car is a class
		// new Car is the object of Car class
		// new keyword is used to create an object
		// a,b,c ----> are Object reference variables
		
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.mod = 2015;
		a.wheel = 4;
		
		b.mod = 2014;
		b.wheel = 4;
		
		c.mod = 2013;
		c.wheel = 4;
		
		System.out.println("Before Assignment");
		
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		System.out.println(c.mod);
		System.out.println(c.wheel);	
		
		System.out.println("After Assignment");
		
		a=b;
		b=c;
		c=a;
		
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		a.mod = 10;
		 System.out.println(a.mod);
		 
		c.mod = 20;
		
		 System.out.println(a.mod); //20
		 System.out.println(c.mod);
		
		
		

	}

}
