//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow {
    
    /**
     * Returns an array of the totals of each row of a given
     * integer matrix
     */
    static int[] getRowTotals(int[][] matrix) {
        int[] totals = new int[matrix.length];
        for(int i = 0; i < matrix.length; i++) {
            int rowTotal = 0;
            for(int item: matrix[i]) {
                rowTotal += item;
            }
            totals[i] = rowTotal;
        }
        return totals;
    }
    
    /**
     * Takes in a matrix and uses the getRowTotals method
     * to find its row totals
     * Prints to the terminal the row totals
     */
    public static void printMatrixRows(int[][] matrix) {
        System.out.println("Row totals are :: " + 
                Arrays.toString(TotalRow.getRowTotals(matrix)));
    }
    

    
}