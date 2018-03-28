import java.util.Scanner;

public class People {

    private String name;
    private int age;

    public People(String name, int age) {

        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name.toUpperCase();
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        boolean validAge;
        if(age >= 0 && age <= 125 ){
            this.age = age;
        }else {
            validAge = false;
            while(!validAge){
                Scanner input = new Scanner(System.in);
                System.out.print("\nPlease enter a valid Age (between 0 and 125): ");
                age = input.nextInt();

                if(age >= 0 && age <= 125 ){
                    validAge = true;
                    this.age = age;
                }
            }
        }

    }


    @Override
    public String toString() {
        String string;
        string ="\n";
        string += "Name\t\t\t: " + getName() + "\n";
        string += "Age\t\t\t\t: " + getAge() + "\n";

        return string;
    }

    public static People makePerson(){
        String tempName;
        int tempAge;

        Scanner input = new Scanner(System.in);

        System.out.print("Persons Name: ");
        tempName = input.nextLine();

        System.out.print("Persons age: ");
        tempAge = input.nextInt();

        People person = new People(tempName, tempAge);

        return person;
    }
}
