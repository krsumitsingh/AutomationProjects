package normalJavaExcercises;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		
		String rev="";
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter a string");
		String string1 = scan.next();
		System.out.println("The lenght of string is: "+string1.length());
		
		/*char[] stringArray = string1.toCharArray();
		
		for(int i=stringArray.length-1;i>=0;i--){
			
			System.out.println(stringArray[i]);
			
		}*/
		
          for(int i=string1.length()-1;i>=0;i--){
			
        	 rev = rev+string1.charAt(i);
			
		}
		
		System.out.println(rev);
	}

}
