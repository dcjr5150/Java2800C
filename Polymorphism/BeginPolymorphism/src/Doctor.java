import java.util.Scanner;

public class Doctor extends People{
    private boolean surgeon;
    private double studentLoanDebt;


    public Doctor(String name, int age, boolean surgeon, double studentLoanDebt) {
        super(name, age);
        this.surgeon = surgeon;
        this.studentLoanDebt = studentLoanDebt;
    }

    public String isSurgeon() {
        String result;

        if(surgeon){
            result = "I am Honest.";
        }else {
            result = "I am not Honest";
        }


        return result;
    }

    public void setSurgeon(boolean surgeon) {
        this.surgeon = surgeon;
    }

    public double getStudentLoanDebt() {
        return studentLoanDebt;
    }

    public void setStudentLoanDebt(double studentLoanDebt) {

        boolean validDebt;

        if(studentLoanDebt >= 0 && studentLoanDebt <= 500000){
            this.studentLoanDebt = studentLoanDebt;
        }else {
            validDebt = false;
            while(!validDebt){

                Scanner input = new Scanner(System.in);
                System.out.print("Error: Invalid Entry.\nHow much debt do you/he have: ");
                studentLoanDebt = input.nextDouble();

                if(studentLoanDebt >= 0 && studentLoanDebt <= 500000){
                    this.studentLoanDebt = studentLoanDebt;
                    validDebt = true;
                }
            }
        }

    }

    public People returnPerson(){

        People person = new People(getName(), getAge());



        return person;
    }


    public static Doctor makeDoctor(){

        Doctor doctor;
        Scanner input = new Scanner(System.in);

        boolean surgeon;
        double studentLoanDebt;

        People tempPerson = People.makePerson();


        System.out.println("\nIs the Doctor a Surgeon? ");
        surgeon = input.nextBoolean();

        System.out.println("\nHow much debt do you/he have? ");
        studentLoanDebt = input.nextDouble();

        doctor = new Doctor(tempPerson.getName(), tempPerson.getAge(),surgeon, studentLoanDebt);

        return doctor;
    }


}
