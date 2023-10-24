
public class IfElseCondition {

	public static void main(String[] args) {
		
		int a = 30;
		int b = 20;
		
		if(b>a) {
			System.out.println("b is greater than a");
		}
		else {
			System.out.println("a is greater than b");
		}
		
		int c = 40;
		int d = 50;
		
		if(c==d) {
			System.out.println("C and d are equal");			
		}
		else {
			System.out.println("c and d are not equal");
		}
		
		//write a program to find the highest number
		
		int a1 = 100;
		int b1 = 400;
		int c1 = 300;
		
		if (a1>b1 & a1>c1) {
			System.out.println("a1 is the highest number");
		}
		else if(b1>c1) {
			System.out.println("b1 is the highest number");
		}
		else {
			System.out.println("c1 is the highest number");
		}

	}

}
