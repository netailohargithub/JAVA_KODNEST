
import java.util.Scanner;
public class CheckDivisableByThree {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        scanner.close();

        if (number%3==0) {
            System.out.println(number + " is a divisible by 3");
        } else {
            System.out.println(number + " is not divisible by 3");
        }
    }


}
