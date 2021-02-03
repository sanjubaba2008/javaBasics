package mitAssignments;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.Instant;
import java.time.LocalTime;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int[] array = new int[a];
		for(int i = 0; i < array.length;i++) {
			array[i] = scan.nextInt();
		}
		for(int s:array) {
		System.out.println(s);
		}
		for(int k:array) {
			Test t = new Test();
			t.isPrime(k);
		}
		
		
	}
	public void isPrime(int n) {
		boolean flag = false;
		for(int i = 2; i<=n/2;i++) {
			if(n%i==0) {
				flag = true;
				break;
			}
			
		}
		if (!flag)
		      System.out.println("is a prime number.");
		    else
		      System.out.println("is not a prime number.");
		
	}
}

	
  

//end of class Test
		     
