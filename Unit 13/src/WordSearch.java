//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str ) 
    {
      int k = 0;
      m = new String[size][size];
      for(int i = 0; i < size; i++){
        for(int j = 0; j < size; j++){
             m[i][j] = String.valueOf(str.charAt(k++));
          
        }
        
      }
    }

    public boolean isFound( String word )
    {
    	for (int i = 0; i < m.length; i++) {
          for (int j = 0; j < m[0].length; j++) {
            
            if (checkRight(word, i, j) || checkLeft(word, i, j) || checkUp(word, i, j) || checkDown(word, i, j) 
                || checkDiagUpLeft(word, i, j) || checkDiagUpRight(word, i, j) || checkDiagDownLeft(word, i, j)
                || checkDiagDownRight(word, i, j)) {
              return true;
            }
          }
        }
        return false;
    }

	public boolean checkRight(String word, int row, int col)
   {      
     StringBuilder sb = new StringBuilder();
     for (int j = col; j < m[0].length; j++) {
       sb.append(m[row][j]);
       if (sb.toString().equals(word)) {
         return true;
       }
     }
     return false;
		
	}

	public boolean checkLeft(String word, int row, int col)
	{
     StringBuilder sb = new StringBuilder();
     for (int j = col; j >= 0; j--) {
       sb.append(m[row][j]);
       if (sb.toString().equals(word)) {
         return true;
       }
     }
     return false;
	}

	public boolean checkUp(String word, int row, int col)
	{
     StringBuilder sb = new StringBuilder();
     for (int i = row; i >= 0; i--) {
       sb.append(m[i][col]);
       if (sb.toString().equals(word)) {
         return true;
       }
     }
     return false;
	}

	public boolean checkDown(String word, int row, int col)
   {
     StringBuilder sb = new StringBuilder();
     for (int i = row; i < m.length; i++) {
       sb.append(m[i][col]);
       if (sb.toString().equals(word)) {
         return true;
       }
     }
     return false;
	}

	public boolean checkDiagUpRight(String word, int row, int col)
	{
     StringBuilder sb = new StringBuilder();
     int i = row;
     int j = col;
     while (i >= 0 && j < m[0].length) {
        sb.append(m[i][j]);
        if (sb.toString().equals(word)) {
         return true;
        }
        i--;
        j++;

     }
     return false;
	}

	public boolean checkDiagUpLeft(String word, int row, int col)
	{
     StringBuilder sb = new StringBuilder();
     int i = row;
     int j = col;
     while (i >= 0 && j >= 0) {
        sb.append(m[i][j]);
        if (sb.toString().equals(word)) {
         return true;
        }
        i--;
        j--;

     }
     return false;
	}

	public boolean checkDiagDownLeft(String word, int row, int col)
   {
     StringBuilder sb = new StringBuilder();
     int i = row;
     int j = col;
     while (i < m.length && j >= 0) {
        sb.append(m[i][j]);
        if (sb.toString().equals(word)) {
         return true;
        }
        i++;
        j--;

     }
     return false;
	}

	public boolean checkDiagDownRight(String word, int row, int col)
	{
     StringBuilder sb = new StringBuilder();
     int i = row;
     int j = col;
     while (i < m.length && j < m[0].length) {
        sb.append(m[i][j]);
        if (sb.toString().equals(word)) {
         return true;
        }
        i++;
        j++;

     }
     return false;
	}

    public String toString()
    {
 		return "";
    }
}