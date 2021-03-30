
public class practice2 {
	public static void main(String[] args) {
		   int[][] array = new int [3] [4];
		    System.out.println("Original:");
		   for (int i = 0; i < array.length; i++) {
			      System.out.print("[");
			      for (int j = 0; j < array[0].length; j++) {
			            array[i][j] += i+1;
			            System.out.print(array[i][j] + " ");
			      }
			      System.out.print("] ");
			    }
		    	System.out.println(); 
		    	System.out.println("Changed:");
	
		    	 for (int i = 0; i < array.length; i++) {
				      System.out.print("[");
				      for (int j = 0; j < array[0].length; j++) {
				            array[i][j] += i+1;
				            System.out.print(array[i][j] + " ");
				      }
				      System.out.print("] ");
				    }
		
	}


	
	
	public static int[][] transSimple(int[][] data) {
	    int Leng = 0;
	    for (int[] row : data)
	        if (row.length > Leng)
	            Leng = row.length;
	    int[][] temp = new int[Leng][data.length];
	    for (int i = 0; i < data.length; i++)
	        for (int j = 0; j < data[i].length; j++)
	            temp[j][i] = data[i][j];
	    return temp;
	}
}
