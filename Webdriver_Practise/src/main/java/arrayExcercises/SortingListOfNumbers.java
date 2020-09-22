package arrayExcercises;

public class SortingListOfNumbers {

	public static void main(String[] args) {
		 int[] num = {50,10,15,90,2,0,105,17}; 
		 int num1,temp=0,counter=0;
		 num1 = num.length;
		 
		 for(int i=0;i<num1;i++){
			 
			 for(int j=i+1;j<num1;j++){
				 
				 if(num[i]>num[j]){
					 temp = num[i];
					 num[i]=num[j];
					 num[j]=temp;
					 }		 
			 }	
			 counter++;
		 }
		 
		 for(int k=0;k<num1;k++){
			 System.out.print(num[k]+ " ");
		 }	 
		 System.out.println();
		 System.out.print("With minimum swaps-->"+counter);
	}
}
