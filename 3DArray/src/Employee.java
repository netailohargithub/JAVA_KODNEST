import java.util.Scanner;
public class Employee {
	String name;
	int age;

	//constructor with 2 parameters
	public Employee(String name, int age) {
		this.name =name;
		this.age = age;
	}
}
class kodnest{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Employee a[]= new Employee[3];
		System.out.println("Enter the employee details");
		System.out.println("---------------------------");

		int j = 1;
		for(int i = 0; i<=a.length-1;i++) {
			System.out.println("enter employee-"+(j)+"name");
			String name = scan.nextLine();
			System.out.println("enter employee-"+(j)+"age");
			int age = scan.nextInt();
			a[i] = new Employee(name,age);
			j++;
		}

		System.out.println("Employee details are:");
		for(int i = 0;i<=a.length-1;i++) {
			System.out.println(a[i].name+"-"+a[i].age);
			System.out.println();
		}

	}

}
