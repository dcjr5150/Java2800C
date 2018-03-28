import java.util.Scanner;

public class Assign04 {


    public static void main(String args[]){


        char choice;


        do{
            choice = getChoice();
            switch (choice) {

                case 'A' : // Fence Caluclator

                        Assign04_SubMethods.fenceCalculator();

                break;


            }
        }while (choice != 'Q');

    }

    public static char getChoice(){
        char result;

        System.out.println("A. Fence Calculator");

        Scanner cha = new Scanner(System.in);

        result = cha.next().toUpperCase().charAt(0);


        return result;
    }// end getChoice



}
