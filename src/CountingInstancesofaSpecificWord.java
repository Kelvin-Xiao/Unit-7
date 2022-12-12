/**
 * Program:	CountingInstancesofaSpecificWord.java
 * Purpose:	REPLACE!!!
 * Author:  Kelvin Xiao
 * Date:	Dec. 6, 2022
 */

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class CountingInstancesofaSpecificWord
{

	public static void main(String[] args) throws IOException {
	      Scanner scnr = new Scanner(System.in);
	      FileInputStream fileByteStream = null; // File input stream
	      Scanner inFS = null;                   // Scanner object
	      String userWord;
	      int wordFreq = 0;
	      String currWord;

	      // Try to open file
	      System.out.println("Opening file wordFile.txt.");
	      fileByteStream = new FileInputStream("wordFile.txt");
	      inFS = new Scanner(fileByteStream);

	      // Word to be found
	      System.out.print("Enter a word: ");
	      userWord = scnr.next();

	      while (inFS.hasNext()) {
	         currWord = inFS.next();
	         if(currWord.equals(userWord)) {
	            ++wordFreq;
	         }
	      }

	      System.out.println(userWord + " appears in the file " +
	                         wordFreq + " times.");

	      // Done with file, so try to close it
	      fileByteStream.close(); // close() may throw IOException if fails
	      
	      scnr.close();
	      inFS.close();
	      
	      /*
	       * wordFile.txt with a list of words:
				twenty
				associable
				twenty
				unredacted
				associable
				folksay
				twenty
				
				Opening file wordFile.txt.
				Enter a word: twenty
				twenty appears in the file 3 times.
	       */
	}
	// end main
}
//end class
