package arrayExcercises;

import java.util.Scanner;

public class InputArray {
	
	static Scanner scan;
	
	static int i=0, j,k;
	
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		System.out.println("Enter Array length:");
		i = scan.nextInt();
		int sam[] = new int[i];
		System.out.println("The Size of Array is: " +sam.length);	
		
		/*sam[0] = 11;
        sam[1] = 9;*/
        
        for(int j=0; j<i;j++)
        {
        	System.out.println("Please Enter Value at index: "+j);    	
        	sam[j] = scan.nextInt();
        	System.out.println("The value at INDEX-->"+j+" is-->"+sam[j]);//print
        }
        
        scan.close();
        //System.out.println("The value at INDEX-"+j+" is-"+sam[j]);
        /*for(int k=0;k<i;k++){
        	System.out.println("The value at INDEX-"+k+" is-"+sam[j]);
        }*/
        
        
        
	}

}
