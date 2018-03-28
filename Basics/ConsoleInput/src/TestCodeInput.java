import java.util.*;

public class TestCodeInput {
    public static void main(String[] args){
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.printf("Hello " + input + ".");
    }
}
