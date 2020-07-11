package arrayExcercises;

import java.util.*;

public class Sumvaluesofanarray {

	public static void main(String[] args) {
		int i=0,sum=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array length:");
		i= scan.nextInt();
		
		int[] ARR = new int[i];
		
		ARR[0]=10;
		ARR[1]=20;
		
		for(int b:ARR){
			sum = sum+b;
			
		}
		
		System.out.println("The Sum of ARRAY is "+sum);
		
		
	}

}
