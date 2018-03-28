import java.util.Scanner;

public class Name {

    private String firstName;
    private char middleInital;
    private String lastName;

    public Name(String firstName, char middleInital, String lastName) {

        setFirstName(firstName);
        setMiddleInital(middleInital);
        setLastName(lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public char getMiddleInital() {
        return middleInital;
    }

    public void setMiddleInital(char middleInital) {
        this.middleInital = middleInital;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        return firstName + " " + middleInital + ". " + lastName;
    }

    public static Name makeName() {
        Name result;

        Scanner input = new Scanner(System.in);

        System.out.println("What is your first name? ");

        System.out.println("What is your middle inital?  ");
        System.out.println("What is your last name?  ");



        return result;
    }
}// end of Name


