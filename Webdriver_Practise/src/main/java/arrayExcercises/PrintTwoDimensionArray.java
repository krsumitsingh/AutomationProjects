package arrayExcercises;

public class PrintTwoDimensionArray {

	public static void main(String[] args) {
		
		int[][] ARRAY_TWO = new int [5][5];
		
		for(int i=0;i<5;i++){
			
			for(int j=0;j<5;j++){
				
				if(i==j){
					ARRAY_TWO[i][j] = 1;
				}
				else{
					ARRAY_TWO[i][j] = 0;
				}
				
				System.out.print(ARRAY_TWO[i][j]+ "");
			}
			 System.out.println();
			
			
			
		}
		
		
		
		
		
	}

}
