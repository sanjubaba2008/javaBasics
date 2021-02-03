package mitAssignments;


	import java.util.*;
	import java.io.*;

	class Solution{
	    public static void main(String []argh){
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        Map m = new HashMap();
	        for(int i = 0; i < n; i++){
	            String name = in.next();
	            int phone = in.nextInt();
	            // Write code here
	            //Map m = new HashMap();
	            m.put(name , phone);
	        }
	        System.out.println(m);
	        while(in.hasNext()){
	            String s = in.next();
	            // Write code here
	        }
	        in.close();
	    }
	}


