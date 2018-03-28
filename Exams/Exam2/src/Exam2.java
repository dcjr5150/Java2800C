/*
 *
 *          File: Exam2.java
 *          Author(s): Daniel and China
 *          Date: 2/14/18
 *          Course: COP2800C Java Programming
 *          Assignment: EXAM TWO: Aunt Vera in Vegas
 *
 *          Psuedocode:
 *
 *          1. Preset all the values for the variables from the document with the provided number, if no number was provided set it to zero or the default value.
 *          2. Enter a do/while loop that will cycle between each machine depositing one quarter in and then checking on if that machine is ready to pay out.
 *          3. If it is it will display a message saying winner along with the machine number and the amount won along with the new balance in the quarter jar.
 *          4. If the machine is not ready to pay it will pass on to the next and loop around until one pays out based on the values provided.
 *          5. After the quarter jar is empty the program will display the number of wins on each machine and the total number of plays on each machine.
 *          6. And then exit.
 *
 *
 */

import javax.swing.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exam2 {

    public static void main(String args[]) throws IOException {

        File file = new File("outputFile.txt");
        file.delete();

        String message = " ";

        //Declaring and initializing int values
        int coins = 350;
        int machineNumber = 0;
        int count = 1;

        //Declaring and initializing array values
        int machine[] = new int[]{31, 69, 7, 5};
        int payout[] = new int[]{25, 75, 7, 2};
        int winCount[] = new int[]{0,0,0,0};


        //Starting do while loop. Stops when user is out of coins
        do {
            //For loop that reiterates 4 times(machine array length)
            for (int i = 0; i < machine.length; i++){

                //The machine the user is currently on
                machineNumber = i + 1;

                //Subtracting coins from the user
                coins--;
                coins += payoutCoins(machine[i], payout[i], coins, count, machineNumber);


                //If statements runs when isTimeToPay method is true
                if (isTimeToPay(machine[i], count)){
                    winCount[i] = winCount[i] + 1;
                    message += "\n\nWinner!!!!\n";
                    message += "Machine #" + machineNumber;
                    message += "\nAmount to be paid: $" + (double)payout[i]/4 + "\n";
                    int balance = coins + payout[i];
                    message += "Number of Quarters: " + balance + "New Balance: $" + (double)balance/4 + "\n";




                }

                count++;

            }

        }while (coins > 0);

        message += "\n" + displayWins(machine, machineNumber, winCount);

        fileOutput(message);


    }
    //method to display the amounts of wins
    private static String displayWins(int[] machine, int machineNumber, int[] winCount) {
        String message;

        message = "Number of wins: ";

        //using for loop to display the machine number and the amount of wins
        for (int i = 0; i < machine.length; i++){
            machineNumber = i +1;
            message += " Machine #" + machineNumber + ": " + winCount[i];
        }
        return message;
    }// end of displayWins

    public static int payoutCoins(int i, int payout, int coins, int count, int machineNumber) throws IOException {
        int result = 0;
        // if isTimetoPlay method returns true
        if (isTimeToPay(i, count )){
            int balance = coins + payout;

            result = payout;

        }

        return result;
    }// end of payoutCoins

    public static boolean isTimeToPay(int i, int count) {
        boolean result = false;

        int math = 0;

        math = count % i;

        if(math == 0){
            result = true;
        }else {
            result = false;
        }



        return result;
    } // end of isTimeToPay


    private static void fileOutput(String writeString) throws IOException{

        // File fileName = new File("outputFile.txt");

        try(PrintWriter fileWriter = new PrintWriter(new FileOutputStream(new File("outputFile.txt"), true))){

            fileWriter.println(writeString);

        }catch (IOException e){
            JOptionPane.showMessageDialog(null,"Error: Unable to create file.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } // end of fileOutput

} // end of main
