package oops;

public class Applicatio {
	public static void main(String[] args)
	{
		Student s = new Student();
		s.name = "John";
				s.age =29;
				System.out.println(s.name);
				System.out.println(s.age);
		s.study();
		s.sleep();
	}

}
