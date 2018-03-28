import java.util.Scanner;

public class Politician extends Person{

    private boolean honest = false;
    private char party;

    public Politician(String name, boolean honest, char party) {
        super(name);
        setHonest(honest);
        setParty(party);
    }

    public boolean isHonest() {
        return honest;
    }

    public void setHonest(boolean honest) {
        this.honest = honest;
    }

    public char getParty() {
        return party;
    }

    public void setParty(char party) {
        boolean badParty = false;
        Scanner input = new Scanner(System.in);

        do {

            party = Character.toUpperCase(party);
            switch (party){
                case 'D':
                case 'R':
                case 'I':
                    break;

                    default:
                        System.out.println("Invalid party \n Enter only a D, R, or I: ");
                        party = input.next().charAt(0);

                        badParty = true;

                        break;
            }

        }while(badParty);


        this.party = party;

    }

    @Override
    public String toString() {
        String result;

        result = "Party: ";

        if(party == 'R'){
            result += "Republican.";
        }
        else if (party == 'D'){
            result += "Democrat.";

        }else{
            result += "Independent.";
        }

        if(honest){
            result += "\nI am honest.";
        }else {
            result += "\nI am not honest.";
        }



        return result;
    }

    public static Politician makePolitician(){
        Person tempPerson = Person.makePerson();
        char party;
        boolean honest;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the politicans party: ");

        party = input.next().charAt(0);
        party = Character.toUpperCase(party);

        System.out.println("Honest? True or false: ");
        honest = input.nextBoolean();

        Politician result = new Politician(tempPerson.getName(), honest, party );
        return result;
    }


}
