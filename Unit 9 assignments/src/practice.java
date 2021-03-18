import java.io.*;
import java.util.*;
import java.lang.*;

public class practice {

	
	public static void printString(String words) {
        // Add the words to an array
        String[] wordArray = new String[7];
        wordArray = words.split(" ");
        
        // Print words individually
        for (String word: wordArray) {
            System.out.println(word);
        }
        System.out.println();
        // Print words that start with t (lower or capital)
        for (String word : wordArray) {
            if (word.charAt(0) == 't' || word.charAt(0) == 'T') {
                System.out.println(word);
            }
        }
        System.out.println();
        // Print words in reverse order
        for (int i = 0; i < wordArray.length; i++) {
            System.out.println(wordArray[wordArray.length-i-1]);
        }
        
    }

	
	 

	
}
