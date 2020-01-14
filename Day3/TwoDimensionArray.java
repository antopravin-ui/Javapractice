
public class TwoDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*int a[] = {1,4,5,3};
		int b[]= {11,12,13,14};
		int c[]= {21,22,23,24};
		*/
		int arr[][] = {
				
				{1,4,5,3},
				{11,12,13,14},
				{21,22,23,24}
					};
		
	
		/*System.out.println(arr[1][1]);
		
		System.out.println("row  " +arr.length);
		System.out.println("Col of Row (0)  " + arr[0].length);
		System.out.println("Col of Row (1)  " +arr[1].length);
		System.out.println("Col of Row (2)  " +arr[2].length);
		*/
		
	
		for (int row =0 ;row<arr.length; row++) {
			
			for (int col=0 ;col<arr[row].length ;col++) {
				
				//System.out.print(" "+row +col);
				System.out.print(" " +arr[row][col]);
				
			}
			
				System.out.println("");
			
			}
		
		
		
	
	}
}
