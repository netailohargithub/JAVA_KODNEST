
public class Demo1 {
public static void main(String[] args) {
	method1();
}
static void method1() {
	method2();
}
static void method2() throws ArithmeticException{
	System.out.println(3/0);
}
}
