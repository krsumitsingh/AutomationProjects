/**
 * 
 */
package normalJavaExcercises;

import java.util.Scanner;

/**
 * @author Sumit Kumar Singh
 *
 */
public class CheckEvenOrOdd {
	
	//Scanner scan = new Scanner(System.in);
	
	static int number;
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter a number");
		number = scan.nextInt();
		
		System.out.println(numberentered(number));
				
	}
	
	public static int numberentered(int num1){
		if(num1%2==0){
			System.out.println(num1+" is a even number");		
		}
		else{
			System.out.println(num1+" is a odd number");
		}
		return num1;
		
		
	}
	
	
}
