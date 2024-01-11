
import java.util.Scanner;

public class CheckTheTwoMultiple {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        scanner.close();

        if (number%3==0 && number%5==0) {
            System.out.println(number + " is a  of multiple of 3 and 5");
        } else {
            System.out.println(number + " is not a multiple of 3 and 5");
        }
    }

}
