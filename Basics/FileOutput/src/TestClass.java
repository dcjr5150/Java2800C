import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestClass {

    public static void main(String args[]) throws IOException{

        String name;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");

        name = input.nextLine();

        System.out.println("Your name is " + name);

        sendOutput(name);

    }// end of main

    private static void sendOutput(String name) throws IOException {

        File fileName = new File("outputFile.txt");

        System.out.println("Does it exist? " + fileName.exists());
        System.out.println("File Length " + fileName.length() + " bytes");
        System.out.println("Can it be read? " + fileName.canRead());
        System.out.println("Can it be Written? " + fileName.canWrite());

        try(

            PrintWriter fileWriter = new PrintWriter(fileName); // Ths is where the file is created.

        ){

            for (int i = 0; i < 9; i++){

                fileWriter.println("Hello " + name);

            }
            fileWriter.println("\n\n\n\n\n\n");

            for (int i = 0; i < 25; i++){

                for (int j = 0; j <= i ;j++){
                    fileWriter.print("*");
                }
                fileWriter.println("");

            }

            fileWriter.close();// Close the output file

        }// end of try
        catch(IOException e){

            System.out.println("Couldnt create the file.");

        }

    }// end of sendOutput

}// end of TestClass
