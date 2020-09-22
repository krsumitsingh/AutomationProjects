
package normalJavaExcercises;

import java.util.Scanner;

/**
 * @author Sumit Kumar Singh
 *
 */
public class GreaterBetweenTwoNmbers {

	
	public static void main(String[] args) {
		
		int a,b;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		a = scan.nextInt();
		System.out.println("enter a number");
		b = scan.nextInt();
		if(a>b){
			System.out.println(a+" is greater");
		}else{
			System.out.println(b+" is greater");
		}
		

	}

}
