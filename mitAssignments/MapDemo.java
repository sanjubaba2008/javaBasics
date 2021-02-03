package mitAssignments;
import java.util.*;
import java.io.*;

public class MapDemo {
	
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map < String, Integer > m = new HashMap < String,Integer >();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            //Map m = new HashMap();
            m.put(name , phone);
        }
        //System.out.println(m);
        //String[] myString = new String[n];
        while(in.hasNext()){
            String s = in.next();
            // Write code here
         if(m.containsKey(s))
          System.out.println(s+"="+m.get(s));
             else 
                System.out.println(" Not found ");
           }
            
        
        in.close();
       }
	}


