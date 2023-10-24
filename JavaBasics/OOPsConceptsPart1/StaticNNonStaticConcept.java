package OOPsConceptsPart1;

public class StaticNNonStaticConcept {
	
	// GLobal Variables: Scope of these variables is across all the functions with some conditions
	
	String name = "Tom";
	static int age = 25;

	public static void main(String[] args) {
		
		// Static variable and methods can be called by 2 ways:
		
		//1. direct call:
		
		sum();
		
		//2. Call by class name
		
		StaticNNonStaticConcept.sum();
		
		System.out.println(age);
        System.out.println(StaticNNonStaticConcept.age);
        
        //Calling Non static method and variables
        
        StaticNNonStaticConcept obj = new StaticNNonStaticConcept();
        
        obj.sendMail();
        System.out.println(obj.name);
        
        // Can I use object to call static methods or variables? Yes but not a good practice
        
        obj.sum();

	}
	
	public void sendMail() { // Non static method
		System.out.println("Send mail method");
	}
	
	public static void sum() {// ststic method
		
		System.out.println("Sum method");		
	}

}
