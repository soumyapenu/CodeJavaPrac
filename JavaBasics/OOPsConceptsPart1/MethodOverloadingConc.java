package OOPsConceptsPart1;

public class MethodOverloadingConc {
	
	public static void main(String args[]) {
		
		MethodOverloadingConc obj = new MethodOverloadingConc();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 5);
	}
	
	// We cannot create a method in another method
	// Duplicate methods ---> Same methods name with same number of arguments /input parameters are not allowed
	// main method can be overloaded. But we never used it
	
	//Method Overloding ---> When the methos name is same with different arguments/input parameters with different data types in the same class
	
	public void sum() { // Method with zero parameters
		
		System.out.println("Sum Method ----> Zero Parameters");
	}
	
	public void sum(int i) { // method with 1 parameter
		
		System.out.println("Sum Method ----> One Parameter");
		System.out.println(i);
	}
	
	public void sum(int k, int j) {// method with 2 parameters
		
		System.out.println("Sum Method ----> Two Parameters");
		System.out.println(k+j);
		
	}

}
