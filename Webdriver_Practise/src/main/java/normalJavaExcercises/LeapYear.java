/**
 * 
 */
package normalJavaExcercises;

import java.util.Scanner;

/**
 * @author Sumit Kumar Singh
 *
 */
public class LeapYear {
	
	public static void main(String[]args){
		
	Scanner scan = new Scanner(System.in);
	System.out.println("please enter a year..");
	int year = scan.nextInt();
	if(calculateLeapYear(year)){
		System.out.println(year+" is a leap year");
	}else{
		System.out.println(year+" is not a leap year");
	}
}

	private static boolean calculateLeapYear(int year) {
		
		if(year%4==0){	
			
			if((year%100!=0)||(year%400==0)){
				return true;
				}
			} return false;
		
			
	
	
	
	}
}
