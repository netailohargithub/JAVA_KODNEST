
import java.util.Scanner;

public class CheckTheTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        scanner.close();

        if (number%4==0 && number%3==0) {
            System.out.println(number + " is a  of divisible by 3 and multiple of 4");
        } else {
            System.out.println(number + " is not a divisible by 3 and multiple of 4");
        }
    }

}