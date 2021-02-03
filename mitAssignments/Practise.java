package mitAssignments;



public class Practise {
	
	

	public static void fizzBuzz(int n) {
	    // Write your code here
		try {
			
			int count = 1;
			int [] myArray = new int [n];
			 
			for(int number:myArray) {
				
				number = number+count;
				
				if(( number % 3 == 0) && ( number % 5 == 0 )) {
					
					System.out.println(" FizzBuzz");
				}
				else if( number % 3 == 0) {
					
					System.out.println(" Fizz");
				}
				
	            else if( number % 5 == 0) {
					
					System.out.println(" Buzz");
				}
	            else
	            	System.out.println(number);
				
				count++;
				
				}//end of for
	   }//end of try
			
			catch (ArithmeticException e) {
				
				System.out.print("Exception is found ");
			}
			

	    }
	
	public static void main( String [] args){
	
		Practise.fizzBuzz(25);
	}

}
