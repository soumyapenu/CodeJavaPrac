package OOPsConceptsPart1;

public class CallByValueNCallByRef {
	
	int p;
	int q;

	public static void main(String[] args) {
		
		CallByValueNCallByRef obj = new CallByValueNCallByRef();
		int l = obj.add(10, 20);
		System.out.println(l);  // Call by Value
		
		obj.p = 20;
		obj.q = 40;
		
	    obj.swap(obj);
	    
	    System.out.println(obj.p);
	    System.out.println(obj.q);

	}
	
	public int add (int i,int j) {
		i = 20;
		j = 30;
		int k = i+j;
		return k;
	}
	
	// Call by referrence
	public void swap(CallByValueNCallByRef t) {
		int temp = p;
		temp = t.p;
		t.p = t.q;
		t.q = temp;
	}

}
