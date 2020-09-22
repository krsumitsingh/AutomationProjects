package normalJavaExcercises;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {  
		
		int num;
		int rem;
		int revnum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("please enter a number");
		
		num = scan.nextInt();
		
		while(num!=0){
			rem = num%10;
			revnum = revnum*10+rem;
			num=num/10;
		}
		System.out.println(revnum);
		
		
	}

}
