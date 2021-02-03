package mitAssignments;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryConversion {
	
	public static void main( String [] args) {
	
	Scanner scan = new Scanner(System.in);
	
	ArrayList myList = new ArrayList();
	
	System.out.print("please enter the integer");
	
	int n = scan.nextInt();
	while(n > 0) {
	
		int remainder = n % 2;
	    n = n / 2;
	    myList.add(remainder);
	
    }
	System.out.println(myList);
	Object[] myIntArray = myList.toArray();
	
	System.out.print(myIntArray.length);
	int count = 0;
	
	for(int i = 0;i < myIntArray.length; i++) {
		
		//System.out.println(myIntArray[i].equals(1)); 
		if(myIntArray[i] == myIntArray[i+1]) {
			count++;
		}
	
	}
	System.out.println(count);
	scan.close();
	
	}
	
}
