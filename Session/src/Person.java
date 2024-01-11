
public class Person {
	    private String name;
	    private int age;
	    private String address;

	    // Constructor
	    public Person(String name, int age, String address) {
	        this.name = name;
	        this.age = age;
	        this.address = address;
	    }

	    // Method to print person's information
	    public void printInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Address: " + address);
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        // Create objects for two persons
	        Person person1 = new Person("Netai", 21, "1234 Main St, City1");
	        Person person2 = new Person("Shiraj", 30, "5678 Elm St, City2");

	        // Print information for both persons
	        System.out.println("Information for Person 1:");
	        person1.printInfo();

	        System.out.println("Information for Person 2:");
	        person2.printInfo();
	    }
	}


