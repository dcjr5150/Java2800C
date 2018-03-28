import java.util.Scanner;



public class ObjectMain {

    public static void main(String args[]){

        Date dob = new Date(07, 26,1999);

        Student you = new Student("Daniel Conlin", dob, 3.5);

        dob.setDate("Birthday");

        System.out.println(dob);
        System.out.println(you);

    }//end of main

}// end of ObjectMain
