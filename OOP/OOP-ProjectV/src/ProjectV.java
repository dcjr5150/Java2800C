
/*

Created by Daniel Conlin

 */

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ProjectV {

    public static void main(String args[]){

        ArrayList<ArrayList<String>> students = new ArrayList<ArrayList<String>>();

             char choice;


        do {
            choice = getChoice();



            switch (choice){
                case 'A':
                    JOptionPane.showMessageDialog(null, "Add a President", "Add President", JOptionPane.INFORMATION_MESSAGE);




                    break;
                case 'B':
                    JOptionPane.showMessageDialog(null, "Add a Student");

                    addStudent(students);

                    break;
                case 'C':
                    JOptionPane.showMessageDialog(null, "Displaying all Presidents");

                    break;
                case 'D':
                    JOptionPane.showMessageDialog(null, "Displaying all Students");

                    break;
                case 'F':
                    JOptionPane.showMessageDialog(null, "Displaying all students with a specific gender");

                    break;
                case 'G':

                    JOptionPane.showMessageDialog(null, "Displaying all Presidents from the state.");

                    break;
                case 'Q':

                    JOptionPane.showMessageDialog(null, "Have a nice day!");

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid Selection","Alert", JOptionPane.WARNING_MESSAGE);

                    break;

            }//end switch

        }while (choice != 'Q');


    }

    private static void addStudent(ArrayList<ArrayList<String>> students) {

        String inputLine, prompt, first, last;
        char inital;

        prompt = "First Name: ";

        inputLine = JOptionPane .showInputDialog("", prompt);

        first = inputLine;

        prompt = "Middile Inital";

        inputLine = JOptionPane .showInputDialog("", prompt);
        inputLine = inputLine.toUpperCase();
        inital = inputLine.charAt(0);

        prompt = "Last Name";

        inputLine = JOptionPane .showInputDialog("", prompt);
        last = inputLine;


        prompt = first + " " + inital + ". " + last;
        JOptionPane .showMessageDialog(null, prompt);

        //students.+




    }

    public static char getChoice(){
        char result;
        String inputLine, message, prompt;
        message = "A. Add a President \n";
        message += "B. Add a Student \n";
        message += "C. Display all Presidents \n";
        message += "D. Display all Students \n";
        message += "F. Display all Students of a Gender \n";
        message += "G. Display all Presidents from a State \n";
        message += "Q. Quit \n";

        prompt = "Enter your Choice";

        inputLine = JOptionPane.showInputDialog(message,prompt);
        inputLine = inputLine.toUpperCase();

        result = inputLine.charAt(0);

        return result;
    }// end getChoice


}
