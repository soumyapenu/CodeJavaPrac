
public class ArrayConcept {

	public static void main(String[] args) {
		
		// Array : is used to store similar data types in array variable
		// lowest bound/ index : 0
		// highest bound/ index: n-1 where n is the size of array
		
		// Disadvantages of Arrays
		//1. Size is fixed - Static Array --> To overcome this problem we use Collections -- array list, hash table --- dynamic array.
		//2. Only Similar data types can be stored --> To overcome this problem we use object array.
		
		int i[] = new int [4];
		 i[0] = 10;
		 i[1] = 20;
		 i[2] = 30;
		 i[3] = 40;
		 
		 
		 System.out.println(i[2]);
		 System.out.println(i[3]);
		 
		 System.out.println("Length of array is :"+i.length);
		 
		 // Print all values of array : Use for loop
		 
		 System.out.println("Values of array are as listed:");
		 
		 for(int j=0; j<i.length; j++ ) {
			 System.out.println(i[j]);
		 }	
		 
		 //2. double array
		 
		 double d[] = new double[3];
		 
		 d[0] = 10.22;
		 d[1] = 28.298;
		 d[2] = 37.57;
		 
		 System.out.println(d[2]);
		 
		 //3. char array
		 
		 char c[] = new char[4];
		 
		 c[0] = 'c';
	     c[1] = 's';
	     c[2] = 2;
	     
	     //4. Boolean Array
	     boolean b[] = new boolean[2];
	     b[0] = true;
	     b[1] = false;
	     
	     //5. String Array
	      String s[] = new String[3];
	      s[0] = "test";
	      s[1] = "Hello";
	      s[2] = "World";
	      
	      System.out.println(s.length); 
	      System.out.println(s[1]);
	      
	      //6. Object Array ---> Object is a class --> Used to store multiple datatypes
	      
	      Object ob[] = new Object[6];
	      
	       ob[0] = "Soumya";
	       ob[1] = 38;
	       ob[2] = "04/04/1986";
	       ob[3] = 'F';
	       ob[4] = 14.67;
	       ob[5] = "Nandyal";
	       
	       for(int j=0; j<ob.length; j++) {
	    	   System.out.println(ob[j]);
	       }
	      
	}

}
