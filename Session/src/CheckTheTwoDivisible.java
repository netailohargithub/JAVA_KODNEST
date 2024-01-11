
import java.util.Scanner;
public class CheckTheTwoDivisible {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        scanner.close();

        if (number%2==0 || number%3==0) {
            System.out.println(number + " is a  of divisible of 2 or 3");
        } else {
            System.out.println(number + " is not a divisible of 2 and 3");
        }
    }

}