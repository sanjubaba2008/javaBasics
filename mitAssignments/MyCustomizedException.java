package mitAssignments;



public class MyCustomizedException extends Throwable  {
	
	
	private static final long serialVersionUID = 1L;
	
	MyCustomizedException(String s){
		
		System.out.println(s);
		
	}// end of constructor

	
	
}//end MyCustomizedException
