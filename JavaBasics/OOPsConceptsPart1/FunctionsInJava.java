package OOPsConceptsPart1;

public class FunctionsInJava {

	public static void main(String[] args) {
		
		FunctionsInJava obj = new FunctionsInJava();
		// Creates a one object
		// obj is Object reference variable 
		// After creating an object a copy of non static methods will be given to the object
		
		obj.test();
		
		int add = obj.pqr();
		System.out.println(add);
		
		String name = obj.qa();
		System.out.println(name);
		
		int div = obj.division(30, 10);
		System.out.println(div);
		

	}
	
	// Void returns nothing
	
	//return type --> void
	
	public void test() { // No input and no return
		System.out.println("test Method");
	}
	
	// return type  --> int
	
	public int pqr() { // no input, some output
		
		System.out.println("pqr method");
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;		
	}
	
	// return type --> String
	public String qa() { // no input, some output
		
		System.out.println("qa method");
		String s = "Selenium";
		return s;
	}
	
	//return type --> int
	
	public int division(int x, int y) { //Some input, some output
		
		System.out.println("division method");		
		int z = x/y;
		
		return z;
	}

}
