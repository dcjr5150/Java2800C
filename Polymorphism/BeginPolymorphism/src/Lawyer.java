import java.util.Scanner;

public class Lawyer extends People{

    private String speciality;
    private String lawSchool;

    public Lawyer(String name, int age, String speciality, String lawSchool) {
        super(name, age);
        setSpeciality(speciality);
        setLawSchool(lawSchool);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getLawSchool() {
        return lawSchool;
    }

    public void setLawSchool(String lawSchool) {
        this.lawSchool = lawSchool;
    }



    @Override
    public String toString() {
        String string;
        string ="\n";
        string += "Specialty\t\t\t: " + getSpeciality() + "\n";
        string += "Law School\t\t\t\t: " + getLawSchool() + "\n";

        return string;
    }

    public People returnPerson(){

        People person = new People(getName(), getAge());



        return person;
    }

    public static Lawyer makeLawyer(){

        Lawyer lawyer;
        Scanner input = new Scanner(System.in);
        String specialty, lawSchool;

        People tempPerson = People.makePerson();

        System.out.print("\nEnter the Lawyers Specialty: ");
        specialty = input.nextLine();

        System.out.println("\nWhat school did you/he study at: ");
        lawSchool = input.nextLine();


        lawyer = new Lawyer(tempPerson.getName(), tempPerson.getAge(),specialty, lawSchool);

        return lawyer;
    }


}
