
public class DemoException {
	public static void main(String[] args) {
		System.out.println("main-start");
		method1();
		System.out.println("main-stop");
		method2();
	}

	static void method1() {
		System.out.println("method1 start");
		method2();
		System.out.println("method2 stop");
	}

	static void method2() {
		System.out.println("method2 start");
		try {

			method3();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception cought");
		}
		System.out.println("method2 stop");
	}

	static void method3() {
		System.out.println("method3 start");

		System.out.println(3 / 0);

		System.out.println("method3 stop");
	}
}
