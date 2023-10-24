package OOPsConceptsPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		// String to int
		
		String s = "100";
		System.out.println(s+20);
		
		int i = Integer.parseInt(s);
		System.out.println(i+20);
		
		//String to double
		
		String sd = "12.22";
		System.out.println(sd+4);
		
		double d = Double.parseDouble(sd);
		System.out.println(d+4);
		
		// String to boolean
		
		String sb = "true";
		System.out.println(sb);
		
		Boolean b = Boolean.parseBoolean(sb);
		System.out.println(b);
		
		//int to String
		
		int j = 100;
		System.out.println(j+4);
		
		String si = String.valueOf(j);
		System.out.println(si+4);
		
		
		

	}

}
