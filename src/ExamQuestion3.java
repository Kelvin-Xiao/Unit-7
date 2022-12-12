/**
 * Program:	ExamQuestion3.java
 * Purpose:	REPLACE!!!
 * Author:  Kelvin Xiao
 * Date:	Dec. 11, 2022
 */

import java.util.*;

public class ExamQuestion3
{

	
	public static void getRandomDistances(int[] distanceArray)
	{
		int low = 10;
		int high = 150;
		
		for(int i = 0; i < distanceArray.length; i++)
		{
			distanceArray[i] = (int)(Math.random()*(high - low)) + low;
		}	
	}
	
	public static double calculateFuelUsed(double distance)
	{
		double fuelUsed = (distance * 6.2) /100;
		
		return fuelUsed;
	}
	
	public static double calculateEfficiency(double fuelUsed, int totalDistance)
	{
		double fuelEfficiency = (fuelUsed * 100)/totalDistance;
		
		return fuelEfficiency;
	}
	
	public static void reportDetails(int[] distanceArray, double[] fuelUsedArray, double[] fuelEfficiencyArray ) 
	{
		System.out.println(); 
		for(int i =0; i<distanceArray.length;i++)
		{
			System.out.printf("%-15s" + distanceArray[i] + " " + "%-15s" + fuelUsedArray[i] + " " + "%-15s"
		+ fuelEfficiencyArray[i]);
		}
	}
	
	public static double calculateAverage(double[] arr) 
	{
		double average = 0.0;
		for(int i =0; i < arr.length; i++)
		{
			average += arr[i]; 
		}
		
		return average/arr.length;
	}
	
	
	
	
	public static void main(String[] args)
	{

		// Create a Scanner for obtaining keyboard inputs

		Scanner input = new Scanner(System.in);

		//Display a title/explanation
		System.out.println("Fuel Efficiency Simulation \n");
		System.out.println("This program will generate a simulated group of commuters assigning them");
		System.out.println("random daily commutes. It will then calculate the fuel used daily and the");
		System.out.println("combined fuel efficiency achieved by the new extended range electric car.\n");
		System.out.println("Enter the number of commuters: \n");
		int numCom = input.nextInt();
		
		System.out.println("Here are the group’s distance, fuel usage and fuel efficiency details...\n");
		
		
		int[] distanceArray = new int [numCom];
		double[] fuelUsedArray = new double [numCom];
		double[] fuelEfficiencyArray = new double [numCom];
		getRandomDistances(distanceArray);
		
		for(int i = 0; i < distanceArray.length; i++)
		{
			if(distanceArray[i] <= 55)
			{
				fuelUsedArray[i] = 0;
			}
			
			else
			{
				fuelUsedArray[i] = calculateFuelUsed((double)distanceArray[i] - 55);
			}
			fuelEfficiencyArray[i] = calculateEfficiency(fuelUsedArray[i], distanceArray[i]);
		}
		
		
		double fuelEfficiencyAverage = calculateAverage(fuelEfficiencyArray);
		double fuelUsedAverage = calculateAverage(fuelUsedArray);
			System.out.printf("The average fuel used is %f and the average efficiency achieved is %f", fuelEfficiencyAverage, fuelUsedAverage );
			reportDetails(distanceArray, fuelUsedArray, fuelEfficiencyArray);

		//Close the Scanner
		input.close();
	}
	// end main
}
//end class
