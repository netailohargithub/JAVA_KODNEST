import java.util.Scanner;

public class Area {
    public static void calculateArea(double r) {
        System.out.println("The Area of Circle is: " + (3.14 * r * r));
    }

    public static void calculateArea(int a) {
        System.out.println("The Area of Square is: " + (a * a));
    }

    public static void calculateArea(int l, int b) {
        System.out.println("The Area of Rectangle is: " + (l * b));
    }

    public static void calculateArea(double base, double slant) {
        System.out.println("The Area of Pyramid is: " + ((2*base*slant)+((base*base))));
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the Circle: ");
        double radius = scanner.nextDouble();
        calculateArea(radius);

        System.out.println("Enter the side of the Square: ");
        int side = scanner.nextInt();
        calculateArea(side);

        System.out.println("Enter the length and breadth of the Rectangle: ");
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        calculateArea(length, width);

        System.out.println("Enter the base, height and slant height of the Pyramid: ");
        double base = scanner.nextDouble();
        double slant = scanner.nextDouble();
        calculateArea(base,slant);
    }
}
