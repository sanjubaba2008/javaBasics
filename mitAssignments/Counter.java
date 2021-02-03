package mitAssignments;

public class Counter {
	
	//fields
	int myCount = 0;
	static int ourCount = 0;//it is class variable, it is not varied from object to object
	
	//methods
	void increment() {
		myCount++;
		ourCount++;
	}
	//above method increments myCount and ourCount by 1 unit whenever we call it
	public static void main( String [] args) {
		//this is my console
		//I am creating objects of Counter class
		
		Counter counter1 = new Counter();
		Counter counter2 = new Counter();
		
		counter1.increment();
		counter1.increment();
		counter2.increment();
		System.out.println(counter1.myCount);
		System.out.println(counter2.myCount);
		System.out.println(Counter.ourCount);
		
		System.out.println("Counter 1: " + counter1.myCount + " " + counter1.ourCount );
		
		
	}

}
