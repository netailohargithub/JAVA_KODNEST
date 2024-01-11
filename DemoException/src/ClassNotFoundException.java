
public class ClassNotFoundException {
public static void main(String[] args) {
	try {
		Class.forName("Demo");
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
