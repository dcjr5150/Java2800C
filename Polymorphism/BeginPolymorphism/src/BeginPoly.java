import java.util.Scanner;

public class BeginPoly {

    public static void main(String[] args) {

        int ARRAYLENGTH = 10;

        People [] people = new People[ARRAYLENGTH];
        int peopleCount = 0;

        Politician [] politicians = new Politician[ARRAYLENGTH];
        int politicianCount = 0;
        Farmer [] farmers = new Farmer[ARRAYLENGTH];
        int farmerCount = 0;
        Lawyer [] lawyers = new Lawyer[ARRAYLENGTH];
        int lawyerCount = 0;
        Doctor [] doctors = new Doctor[ARRAYLENGTH];
        int doctorCount = 0;

        char choice;

        do{
            choice = getChoice();

            switch (choice){
                case 'A':
                    People tempPerson = People.makePerson();

                    people[peopleCount] = tempPerson;

                    peopleCount++;

                    break;
                case 'B':
                    Politician tempPolitician = Politician.makePolitician();

                    people[peopleCount] = tempPolitician.returnPerson();
                    politicianCount++;
                    peopleCount++;

                    break;
                case 'C':

                    Farmer tempFarmer = Farmer.makeFarmer();


                    people[peopleCount] = tempFarmer.returnPerson();
                    peopleCount++;
                    farmerCount++;


                    break;
                case 'D':

                    Lawyer tempLawyer = Lawyer.makeLawyer();
                    people[peopleCount] = tempLawyer.returnPerson();
                    peopleCount++;
                    lawyerCount++;


                    break;
                case 'E':
                    Doctor tempDoctor = Doctor.makeDoctor();
                    people[peopleCount] = tempDoctor.returnPerson();
                    peopleCount++;
                    doctorCount++;

                    break;
                case 'F':
                    for (int i = 0; i < people.length; i++) {

                        if(people[i] == null){

                        }else {
                            System.out.println(people[i]);

                        }

                    }

                    break;
                case 'G':

                    for (int i = 0; i < people.length; i++) {
                        if(people[i] == null){

                        }else {
                            System.out.println(politicians[i]);

                        }

                    }

                    break;
                case 'H':

                    for (int i = 0; i < people.length; i++) {
                        if(people[i] == null){

                        }else {
                            System.out.println(lawyers[i]);

                        }

                    }

                    break;
                case 'I':

                    for (int i = 0; i < people.length; i++) {
                        if(people[i] == null){

                        }else {
                            System.out.println(doctors[i]);

                        }

                    }

                    break;
                case 'J':
                    break;
                default:
                    System.out.println("Invalid Entry. Try again.");
                    break;
            }


        }while(choice != 'J');

    }
    public static char getChoice(){
        char result;
        displayMenu();

        Scanner input = new Scanner(System.in);
        result = input.next().charAt(0);

        result = Character.toUpperCase(result);

        return result;
    }// Ends getChoice

    public static void displayMenu() {
        String line = "";
        line += "A. Add a Person\n";
        line += "B. Add a Politician\n";
        line += "C. Add a Farmer\n";
        line += "D. Add a Lawyer\n";
        line += "E. Add a Doctor\n";
        line += "F. Display all People\n";
        line += "G. Display all Politicians\n";
        line += "H. Display all Lawyers\n";
        line += "I. Display all Doctors\n";
        line += "J. Exit Program\n";

        System.out.println(line);
    }


}
