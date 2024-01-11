
import java.util.Scanner;
public class PositiveEvenPrime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        scanner.close();

        if (number%2==0) {
            System.out.println(number + " is a  even");
        } else {
            System.out.println(number + " is not even");
        }
        if (number > 0) {
            System.out.println(number + " is a  Positive");
        } else {
            System.out.println(number + " is not Positive");
        }
        for (int i = 2; i <=2;i++) 
        {
        if (number%i==0) {
            System.out.println(number + " is not  Prime");
        } else {
            System.out.println(number + " is a Prime");
        }
        }
    }

}