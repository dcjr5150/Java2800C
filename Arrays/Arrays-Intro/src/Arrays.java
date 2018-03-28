
/*
            Class Notes
        Date: 1/29/18
        Purpose: Learning Arrays by populating and displaying then including sorting the information in the arrays.

 */

import java.util.Scanner;

import static java.util.Arrays.sort;

public class Arrays {

    public static void main( String[] args){

        int size;

        System.out.println("How many elements for the array? ");

        Scanner input = new Scanner(System.in);

        size = input.nextInt();

        double [] myArray = new double[size];

        displayArray(myArray);

        loadArray(myArray);
        System.out.println("-————-");
        displayArray(myArray);

        sortArray(myArray);
        System.out.println("—————");
        displayArray(myArray);

    }// End of main

    private static void sortArray(double[] sortArray) {

        sort(sortArray);

    }

    private static void loadArray(double[] loadArraymethod) {


        for (int i = 0; i < loadArraymethod.length; i++){

            loadArraymethod[i] = (int)(0 + Math.random() * 100);

        }

    }// end of loadArray

    public static void displayArray(double [] methodArray ){

        for (int i = 0; i < methodArray.length; i++){
            System.out.println(i + 1 +". " + methodArray[i]);
        }

    }// end of displayArray



}
