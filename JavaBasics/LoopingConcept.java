
public class LoopingConcept {

	public static void main(String[] args) {
		
		//1. While loop
		// Dis-advantage : This will generate infinite loop if we miss increment or decrement part
		
		int i = 1; 	 // initialization	
		
		while(i<=10) { // conditional
			System.out.println(i);
			i++; // Increment/Decrement
		}
		
		System.out.println("***************************");
		
		//2. For loop
		
		for(int j=1; j<=10; j++) { //Initialization;condition;increment/decrement
			System.out.println(j);
		}
		
		System.out.println("***************************");
		
		// Print 10 - 1
		
		for(int k=10;k>=-10;k--) {
			System.out.println(k);
		}
		
	}

}
