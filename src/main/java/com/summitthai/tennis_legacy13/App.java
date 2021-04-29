package com.summitthai.tennis_legacy13;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc= new Scanner(System.in); 
    	System.out.print("First player score : ");  
    	int a= sc.nextInt();  
    	
    	System.out.print("Second player score : "); 
    	int b= sc.nextInt();  
    	
    	String result = doFucntion(a, b);
    	System.out.print("Score announcement =====> "+result);  
    }

	private static String doFucntion(int a, int b) {
		String result = "";
		String resultA = "";
		String resultB = "";
		
		if (a == 0) resultA = "First player is love";
		if (b == 0) resultB = "Second player is love";
		if (a == 15) resultA = "First player is fifteen";
		if (b == 15) resultB = "Second player is fifteen";
		if (a == 30) resultA = "First player is thirty";
		if (b == 30) resultB = "Second player is thirty";
		if (a == 40) resultA = "First player is forty";
		if (b == 40) resultB = "Second player is forty";
		
		
		
		if (a != 40 && b != 40) {
			result = resultA + " and " + resultB;
		} else {
			if (a == 40 && b != 40) {
				result = "First player win!";
			} else {
				result = "Second player win!";
			}
			
			if (a == 40 && b == 40) {
				result = "deuce";
			}
		}
		
		
		return result;
	}
}
