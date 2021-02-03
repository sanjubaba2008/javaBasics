package mitAssignments;

import java.util.Hashtable;

public class HashTableDemo {
	public static void main( String[] args ) {
		Hashtable t = new Hashtable();
		t.put(new Temp(1), "A");
		t.put(new Temp(9), "B");
		t.put(new Temp(4), "H");
		t.put(new Temp(6), "J");
		t.put(new Temp(8), "K");
		t.put(new Temp(5), "L");
		t.put(new Temp(23), "M");
		t.put(new Temp(45), "U");
		
		System.out.println(t);
		
	}//end main method
	

}

class Temp{
	//fields
	
	int i;
	
	//constructor
	Temp(int i){
		this.i = i;
	}
	
	public int hashCode() {
		return i;
		
	}
	public String toString() {
		return i + "";
	}
}//end Temp class
