import java.util.Scanner;

public class Person {

    private String name;

    public Person(String name) {
        super();
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toUpperCase();
    }

    @Override
    public String toString() {
        return "Name: " + name + ".";
    }

    public static Person makePerson(){

        Scanner input = new Scanner(System.in);

        String tempName;

        System.out.println("Enter the name of the person: ");
        tempName = input.nextLine();

        Person result = new Person(tempName);
        return result;
    }

}
