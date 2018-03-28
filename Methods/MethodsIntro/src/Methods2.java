import java.util.Scanner;

public class Methods2 {

    public static void displayMenu(){

        String line = "1. Red \n";
        line += "2. White\n";
        line += "3. Blue\n";
        line += "4. Green\n";
        line += "5. Quit\n\n";
        line += "Enter your Selection: ";

        System.out.println(line);



    }// end displayMenu
    public static double getADouble() {

        double result;
        System.out.print("Give me a number: ");
        Scanner input = new Scanner(System.in);
        result = input.nextDouble();

        return result;
    }// end of getADouble

    public static int getChoice(){
        int result;
        displayMenu();

        Scanner input = new Scanner(System.in);
        result = input.nextInt();

        return result;
    }// Ends getChoice

}// end class Methods2
