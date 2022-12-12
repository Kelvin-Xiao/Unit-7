/**
 * Program:	ArrayReversal.java
 * Purpose:	REPLACE!!!
 * Author:  Kelvin Xiao
 * Date:	Dec. 12, 2022
 */

import java.util.*;

public class ArrayReversal
{

	public static void main(String[] args)
	{

		// Create a Scanner for obtaining keyboard inputs
		Scanner input = new Scanner(System.in);

		// Display a title/explanation
		System.out.println("Let's reverse the elements in a series!\n");

		// Ask the user how many random numbers to generate
		System.out.print("How many numbers should the series contain? ");
		int numElements = input.nextInt();

		// Create an int array of the size requested by the user and populating 
		// it with random numbers between 1 and 100
		int[] theArray = new int[numElements];
		MyToolbox.populateArray(theArray, 1, 100);
		
		// Print the contents of the array on the screen
		MyToolbox.printArray(theArray, "\nHere's the original series...");
		
		// Call the reverseArrayRecursive method using the first and last array indexes 
		// as the low and high indexes.
		reverseArrayRecursive(theArray, 0, theArray.length - 1);
		
		// Print the contents of the reversed array on the screen
		MyToolbox.printArray(theArray, "\nHere's the reversed series...");
		
		// Close the Scanner 
		input.close();
		
	}  // end main
	
	/**
		Method:		reverseArrayRecursive
		Purpose:		Reverses the order of all the elements in an array using a 
						recursive algorithm
	   Accepts:		int[] - the array
	   				int - the index of the one element in the array to be swapped next
	   				int - the index of the the other element in the array to be swapped next
		Returns:		void
	*/
	public static void reverseArrayRecursive(int[] array, int lowIndex, int highIndex)
	{
		// The base case happens (it does nothing, but simply returns) when this 
		// if statement is false
		if (lowIndex < highIndex)
		{
			MyToolbox.swap(array, lowIndex, highIndex);
			reverseArrayRecursive(array, lowIndex + 1, highIndex - 1);
		} 
	} // end reverseArrayRecursive
	
} // end class





