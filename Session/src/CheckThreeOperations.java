
import java.util.Scanner;
public class CheckThreeOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        scanner.close();

        if (number%3==0 && number%5==0 && number%7==0) {
            System.out.println(number + " is pass all the cond");
        } else {
            System.out.println(number + " is not pass all the cond");
        }
    }

}