package mitAssignments;
import java.math.*;
import java.util.ArrayList;
import java.util.Scanner;

class NegativeIntergerMessage extends RuntimeException{
	
	NegativeIntergerMessage(String msg){
		super (msg);
	}
}
class Calculator{
	
public int power (int n, int p){
        
        int result = 1;
        if(n < 0 || p < 0){
   throw new NegativeIntergerMessage ("n and p should be non-negative");

        }
        else{
        for(int i = 1; i <= p; i++){
            result *= n; 
            }
        }
        return result;
        
    }
     
}

public class ScopeDemo {
	
	public static void main( String [] args) {
		
		
		/*Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();*/
        
        String s1 = "ZZZ";
        String s2 = "XXX";
        
        System.out.println(s2.compareTo(s1));
		
		
	}
}

	


