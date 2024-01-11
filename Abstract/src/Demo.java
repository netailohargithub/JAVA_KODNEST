
public class Demo {

	public static void main(String[] args) {

		StudentActivity s;
		s = new CivilStudent();
		s.study();
		s.sleep();
		s = new AgriStudent();
		s.study();
		s.sleep();
		
		 Vehicle v;
		 v = new BMW();
		 v.stop();
		 v.start();

	}

}
