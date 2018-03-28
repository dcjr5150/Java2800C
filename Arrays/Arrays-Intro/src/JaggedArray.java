
import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class JaggedArray {

    public static void main(String[] args){
        // Variables
        char choice;
        int gradeCounter = 0;

        // Arrays
        int [][] grades =  new int [25][];
        ArrayList<String> names = new ArrayList<String>();


        do{
            choice = getChoice();
            switch (choice){
                case 'A': // Add grades for a student

                       gradeCounter =  addGrades(grades, gradeCounter );

                    break;
                case 'B': //Add a name

                        addName(names);

                    break;
                case 'C': //Display all Grades


                    displayGrades(grades, gradeCounter);

                    break;
                case 'D': //Display all Names

                    displayNames(names);

                    break;
                case 'Q':

                    JOptionPane.showMessageDialog(null, "Have a nice day!");


                    break;
                default:

                    JOptionPane.showMessageDialog(null, "Invalid Selection");
                    break;

            }

        }while (choice != 'Q');


    }// End main

    private static int addGrades(int[][] grades, int gradeCount) {
        int result;
        Scanner input = new Scanner(System.in);
        String inputLine, message, prompt;
        message = "Enter number of exams taken by student " +
                (gradeCount + 1) + ".";
        prompt = "number of exams";
        inputLine = JOptionPane.showInputDialog(message, prompt);
        // get int from front of string
        result = Integer.parseInt(inputLine);
        grades[gradeCount] = new int[result];
        for(int i = 0; i < result; i++) {
            System.out.print("Enter grade " +
                    (i + 1) + " of " + result + ": ");
            grades[gradeCount][i] = input.nextInt();
        }// end for loop
        result = gradeCount + 1;
        return result;
    }

    private static void addName(ArrayList<String> names) {

        String inputLine, prompt;

        prompt = "Enter your name";

        inputLine = JOptionPane.showInputDialog(" ", prompt);

        //names.add(inputLine);

    }// end add name

    private static void displayGrades(int[][] grades, int gradeCounter) {

        for(int i = 0; i < gradeCounter; i++){

            for(int j = 0; j < grades[i].length; j++){

                System.out.print(grades[i][j] + "\t");

            }

            System.out.println();

        }

    }// end displayGrades

    private static void displayNames(ArrayList<String> names) {

        String message = "";

        for(int i = 0; i < names.size(); i++){
            message +=  names.get(i) + "\n";
        }

        JOptionPane.showMessageDialog(null, message);

    }// end displayNames


    public static char getChoice(){
        char result;
        String inputLine, message, prompt;
        message = "A. Add Grades \n";
        message += "B. Add a Name \n";
        message += "C. Display all Grades \n";
        message += "D. Display all Names \n";
        message += "Q. Quit \n";

        prompt = "Enter your Choice";

        inputLine = JOptionPane.showInputDialog(message,prompt);
        inputLine = inputLine.toUpperCase();

        result = inputLine.charAt(0);

        return result;
    }// end getChoice
}
