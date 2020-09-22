package normalJavaExcercises;

import java.util.Scanner;

public class GreaterBetweenThreeNumbers {

	public static void main(String[] args) {

		int a,b,c;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		a = scan.nextInt();
		System.out.println("enter a number");
		b = scan.nextInt();
		System.out.println("enter a number");
		c = scan.nextInt();
		
		if(a>b && a>c){
			System.out.println(a+" is greater than "+b+" and "+c);
		}
		else if((b>a && b>c)){
			System.out.println(b+" is greater than "+a+" and "+c);
			
		}else{
			System.out.println(c+" is greater than "+a+" and "+b);
		}

	}

}
