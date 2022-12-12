/**
 * Program:	ReadingaVaryingAmountofDataFromaFile.java
 * Purpose:	REPLACE!!!
 * Author:  Kelvin Xiao
 * Date:	Dec. 6, 2022
 */


import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingaVaryingAmountofDataFromaFile
{

	 public static void main(String[] args) throws IOException {
	      FileInputStream fileByteStream = null; // File input stream
	      Scanner inFS = null;                   // Scanner object
	      int fileNum;       
	      // Try to open file
	      System.out.println("Opening file myfile.txt.");
	      fileByteStream = new FileInputStream("myfile.txt");
	      inFS = new Scanner(fileByteStream);

	      // File is open and valid if we got this far (otherwise exception thrown)
	      System.out.println("Reading and printing numbers.");

	      while (inFS.hasNextInt()) {
	         fileNum = inFS.nextInt();
	         System.out.println("num: " + fileNum);
	      }

	      // Done with file, so try to close it
	      System.out.println("Closing file myfile.txt.");
	      fileByteStream.close(); // close() may throw IOException if fails
	  
	      /*
	      myfile.txt with variable number of integers:
	      111
	      222
	      333
	      444
	      555

	      Opening file myfile.txt.
	      Reading and printing numbers.
	      num: 111
	      num: 222
	      num: 333
	      num: 444
	      num: 555
	      Closing file myfile.txt.
	      */
	      
	}
	// end main
}
//end class
