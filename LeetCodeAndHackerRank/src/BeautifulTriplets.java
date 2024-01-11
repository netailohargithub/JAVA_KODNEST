import java.util.Scanner;

public class BeautifulTriplets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int N = sc.nextInt();
		System.out.println("enter the diff count");
		int d = sc.nextInt();
		System.out.println("enter the elements of array");
		int a[] = new int[N];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		int count = 0;

		for (int i = 0; i < a.length - 2; i++)

		{
			for (int j = i + 1; j < a.length - 1; j++) {
				if (a[j] - a[i] == d) {
					for (int k = j + 1; k < a.length; k++) {
						if (a[k] - a[j] == d) {

							count++;
						}
					}
				}

			}

		}
		sc.close();
		System.out.println(count);

	}

}
