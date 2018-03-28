/*

    Ask the user for how big the array will be.
    store the first value entered to create the size of the array
    ask the user for a number that youd like the max column size to be for the 2D array
    generate a random number with the max entered prevously
    then populate the arrays with random numbers
    and then display the array.

 */


import java.util.Scanner;

public class Assign04JaggedArrays {

    public static void main(String args[]){
        int arrySize = 0;

        System.out.println(" Size of the array: ");
        Scanner input = new Scanner(System.in);

        arrySize = input.nextInt();


        int [][] numbers = new int[arrySize][];


        System.out.println("Array Size " + arrySize);


        generateArray(arrySize, numbers);
        displayArray(numbers);



    }


    private static void displayArray(int[][] numbers) {

        for(int i  = 0; i < numbers.length; i++){

            System.out.print(i + "\t");

            for (int j  = 0; j < numbers[i].length; j++){

                System.out.print(numbers[i][j] + "\t");

            }
            System.out.println();
        }

    }// end displayArray


    private static void generateArray(int size, int[][] numbers) {

        System.out.println("Max size of the 2D Arrays: ");
        Scanner input = new Scanner(System.in);

        size = input.nextInt();

        System.out.println("2D Size " + size);



        for(int i  = 0; i < numbers.length; i++){


            int num = colSize(size);


            for (int j  = 0; j < num; j++){
                //numbers[i][j] = new int[][];

                        numbers[i][j] = (int)(0 + Math.random() * 100);

            }
        }



    }


    private static int colSize( int size ){

        int rand = 0;


            rand = (int)(0 + Math.random() * size);


        return rand;
    }

    private static int loadArray() {
        int num;

             num = (int)(0 + Math.random() * 100);

        return num;
    }// end of loadArray


}

