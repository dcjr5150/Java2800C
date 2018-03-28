import java.util.Scanner;

public class Politician extends People{

    private char party;
    private boolean honest = false;
    private String position;

    public Politician(String name, int age, char party, boolean honest, String position) {
        super(name, age);
        this.party = party;
        this.honest = honest;
        this.position = position;
    }

    public String getParty() {
        String result = "";
        if(party == 'D'){
            result = "Democrat.";
        }
        if(party == 'R'){
            result = "Republican";
        }
        if(party == 'I'){
            result = "Independent";
        }

        return result;
    }

    public void setParty(char party) {
        boolean validParty;
        party = Character.toUpperCase(party);

        if(party == 'D' || party == 'R' || party == 'I'){
            this.party = party;
        }else {
            validParty = false;
            while(!validParty){

                Scanner input = new Scanner(System.in);
                System.out.print("Error: Invalid Entry.\nParty (Democrat, Republican, or Indipendent): ");
                party = input.next().charAt(0);

                if(party == 'D' || party == 'R' || party == 'I'){
                    this.party = party;
                    validParty = true;
                }
            }
        }
    }

    public String isHonest() {
        String result;

        if(honest){
            result = "I am Honest.";
        }else {
            result = "I am not Honest";
        }


        return result;
    }

    public void setHonest(boolean honest) {
        this.honest = honest;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position.toLowerCase();
    }

    @Override
    public String toString() {
        String result;
        result = super.toString();
        result += "Party\t\t\t: " + getParty();
        result += "\n\t\t\t\t: " + isHonest();
        result += "\n\t\t\t" + getPosition();

        return result;
    }

    public People returnPerson(){

        People person = new People(getName(), getAge());



        return person;
    }

    public static Politician makePolitician(){

        Politician politican;
        Scanner input = new Scanner(System.in);
        char tempParty;
        boolean tempIsHonest;
        String tempPosition;

        People tempPerson = People.makePerson();

        System.out.print("\nEnter the Politicians Party(Democrat, Republican, or Independent): ");
        tempParty = input.next().charAt(0);

        System.out.println("\nIs the Politician honest? ");
        tempIsHonest = input.nextBoolean();

        System.out.println("\nWhats the Politicians current position? ");
        tempPosition = input.next();

        politican = new Politician(tempPerson.getName(), tempPerson.getAge(),tempParty, tempIsHonest, tempPosition);

       return politican;
    }
}

