//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.util.Arrays;

public class TotalRowRunner
{
    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3},{5,5,5,5}};
        TotalRow.printMatrixRows(matrix1);
        int[][] matrix2 = {{1,2,3},{5},{1},{2,2}};
        TotalRow.printMatrixRows(matrix2);
        int[][] matrix3 = {{1,2},{5,5},{5,5},{4,5,6,7},{123124,12312}};
        TotalRow.printMatrixRows(matrix3);
    }
}
