import java.util.Scanner;

public class Assign04JaggedArrays32
{
	
	// Main method
    public static void main(String args[])
	{
		int size = 50;
        double jaggedArray[][] = createJaggedArray(size);
		
		// Print outputs as stated by the doc.
		printJaggedArray(jaggedArray, size);
		printSum(jaggedArray, size);
		printAvg(jaggedArray, size);
    }
	
	// This method creates AND initializes the jagged array.
	public static double[][] createJaggedArray(int size){
		int rand = 0;
		double jaggedArray[][] = new double[size][];

		// Loop through all of the rows of the jagged array.
		for (int i = 0; i < 50; i++)
		{
			// Create a random integer
			rand = (int)(Math.random() * 20 + 1);
			
			// Now create the new columns based off that random number.
			jaggedArray[i] = new double[rand];
			
			// Loop through the newly created column and initialize all values as stated in doc.
			for(int j = 1; j < 20; j++)
			{
				jaggedArray[i][j] = jaggedArray[i][j-1] + 1;
			}
		}
		
		// Return the jaggedArray so it is usable in the main method.
		return jaggedArray;
	}

	// This method should print the entire array
	public static void printJaggedArray(double jaggedArray[][], int size)
	{
		int colLen;
		for (int i = 0; i < size; i++)
		{
			// Makes sure we are using the correct length
			// This also prevents creating a large time sink in the program.
			colLen = jaggedArray[i].length;
			for (int j = 0; j < colLen; j++)
			{
				// Ill let you handle the printing.
			}
		}
	}
	
	// This method should calculate and print the sum of the entire array.
	public static void printSum(double jaggedArray[][], int size)
	{
		// You should be able to do this.
	}
	
	// This method should calculate and print the avg of the entire array.
	public static void printAvg(double jaggedArray[][], int size)
	{
		// You should be able to do this.
	}
}

