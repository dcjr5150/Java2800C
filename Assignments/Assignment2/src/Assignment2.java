import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        float num1 = 5.5f, num2 = 5.5f, total = 5.5f;

        System.out.print("Please enter the first number you want to add: ");
        Scanner input1 = new Scanner(System.in);
        num1 = input1.nextFloat();
        System.out.print("Please enter the second number you want to add: ");
        Scanner input2 = new Scanner(System.in);
        num2 = input2.nextFloat();
        total = num1 + num2;

        System.out.println("The sum of " + num1 + " + " + num2 +" = " + total);


    }
}
