/**
 * Program:	ExamQuestion1.java
 * Purpose:	REPLACE!!!
 * Author:  Kelvin Xiao
 * Date:	Dec. 11, 2022
 */

import java.util.*;

public class ExamQuestion1
{
	
	public static String[] sortStreetNames(String[] streetNames )
	{
		//bubble sort string asc
		int n = streetNames.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
            	if (streetNames[j].compareTo(streetNames[j+1]) > 0 )
            	{
                    // swap arr[j+1] and arr[j]
                    String temp = streetNames[j];
                    streetNames[j] = streetNames[j + 1];
                    streetNames[j + 1] = temp;
                } 
		
		return streetNames;
	}
	
	public static void printArray(int[] intArr, String[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.printf("%-15s", arr[i]); // using a nice format :)
			System.out.printf("%-15s\n", intArr[i]);
		}
	}
	
	
	public static int[] sortTrafficLights(int[] trafficLights)
	{
		////bubble sort string des
		int n = trafficLights.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (trafficLights[j] > trafficLights[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = trafficLights[j];
                    trafficLights[j] = trafficLights[j + 1];
                    trafficLights[j + 1] = temp;
                }
        return trafficLights;
	}
	

	
	public static void main(String[] args)
	{
		// Create a Scanner for obtaining keyboard inputs

		Scanner input = new Scanner(System.in);

		//Display a title/explanation
		System.out.println("Street Names\n");
	
		/*Then program should then print two lists of the street names and numbers of lights on the screen.
		 * You should create your
		own sort methods to achieve this using either the bubble sort or selection sort algorithm. The arrays
		should remain “synchronized” after sorting such that the elements at index 0 (for example) in each
		array are for the same street.
		The first list should show the street names listed alphabetically (ascending).*/
		
		String [] streetNames = {"Oxford", "Dundas", "Cheapside", "Highbury", "Clarke", "Richmond"};
		int [] trafficLights = {21, 23, 7, 10, 5, 19};
		
		//The second list should show the names sorted by decreasing number of traffic lights (descending).
		streetNames = sortStreetNames(streetNames);
		
		trafficLights = sortTrafficLights(trafficLights);
		printArray(trafficLights, streetNames);
		
		//Close the Scanner
		input.close();
	}
	// end main
}
//end class
