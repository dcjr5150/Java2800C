public class Methods {
    public static void main(String[] args) {
/*

        double aye;
        String line;

        aye = Methods2.getADouble();

        Methods2.displayMenu();

        line = "Aye is a stupid name\n";
        line += "The value is: " + aye;
        line += " Cason this is how you do it";

        System.out.println(line);
*/
    int choice;

    System.out.println("This is a test quote");

    do {
        choice = Methods2.getChoice();



        switch (choice){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                System.out.println("Invalid Selection");
                break;

        }//end switch

    }while (choice != 5);


    }// end of main


}// end of class Methods
