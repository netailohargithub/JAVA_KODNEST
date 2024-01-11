
import java.util.Scanner;

public class GenderIdentification {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your gender (male/female): ");
        String gender = scanner.next();  

        if (gender.equals("male")) {
            System.out.println("You are male.");
        } else if (gender.equals("female")) {
            System.out.println("You are female.");
        } else {
            System.out.println("Invalid input. Please enter either 'male' or 'female'.");
        }

        scanner.close();
    }
}
