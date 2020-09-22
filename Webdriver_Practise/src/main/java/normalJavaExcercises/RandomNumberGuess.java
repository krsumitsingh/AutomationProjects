package normalJavaExcercises;

import java.util.Scanner;

import net.sf.saxon.exslt.Math;

public class RandomNumberGuess {
	static Scanner scan;
	static int MIN_RANGE = 0;
	static int MAX_RANGE = 10;
	static int input_number;
	static int random_number;
	static int counter=0;
	static int MAX_counter=0;
	
	public static void main(String[]args){
		for (int i = MIN_RANGE; i <= MAX_RANGE; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter a guess value");
			input_number = scan.nextInt();
			if (input_number > MAX_RANGE) {
				System.out.println(
						"You have entered value beyond MAX RANGE.." + MAX_RANGE + " Please enter another value");
				//input_number = scan.nextInt();
			} else {
				random_number = (int) (Math.random() * MAX_RANGE);
				if (!(random_number == input_number)) {
					System.out.println("Incorrect Guess!!!Please try again..");
					counter++;
					//MAX_counter = 0;
					/*MAX_counter = MAX_counter+1;
					if(MAX_counter>MAX_RANGE){
						System.out.println("You have achieved the maximum number of tries-->"+MAX_counter);
						break;
					}*/
					
				} else {
					//MAX_counter++;
					System.out.println("Correct Guess!!!" + input_number + " Retry-Attempt.." +counter);
					break;
				}
				
			}
		} 									
		//scan.close();			
	}	
}
