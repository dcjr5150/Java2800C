import java.util.Scanner;

public class Farmer extends People{

    private String farmType;
    private double noAcres;

    @Override
    public String toString() {
        return "Farmer{" +
                "farmType='" + farmType + '\'' +
                ", noAcres=" + noAcres +
                '}';
    }

    public Farmer(String name, int age, String farmType, double noAcres) {
        super(name, age);
        setFarmType(farmType);
        setNoAcres(noAcres);
    }



    public String getFarmType() {
        return farmType;
    }

    public void setFarmType(String farmType) {
        this.farmType = farmType;
    }

    public double getNoAcres() {
        return noAcres;
    }

    public void setNoAcres(double noAcres) {
        boolean validNoAcres;

        if(noAcres > 0 && noAcres < 1000){
            this.noAcres = noAcres;
        }else {
            validNoAcres = false;
            while(!validNoAcres){

                Scanner input = new Scanner(System.in);
                System.out.print("Error: Invalid Entry.\nNumber of Acres(Between 1 and 1000): ");
                noAcres = input.next().charAt(0);

                if(noAcres > 0 && noAcres < 1000){
                    this.noAcres = noAcres;
                    validNoAcres = true;
                }
            }
        }


        this.noAcres = noAcres;
    }

    public People returnPerson(){

        People person = new People(getName(), getAge());



        return person;
    }



    public static Farmer makeFarmer(){

        Farmer farmer;
        Scanner input = new Scanner(System.in);

        String farmType;
        double noAcres;

        People tempPerson = People.makePerson();

        System.out.println("\nWhats Type of farm do you/he have? ");
        farmType = input.next();

        System.out.print("\nHow many acres does the farmer own: ");
        noAcres = input.nextDouble();

        farmer = new Farmer(tempPerson.getName(), tempPerson.getAge(),farmType, noAcres);

        return farmer;
    }

}
