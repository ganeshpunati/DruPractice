package Assignment19;
public class StaticIntefaceProgram implements StaticInteface{
	public static void main(String[] args) {
		StaticInteface.demo();
		test();
	}
	static void test() {
		System.out.println("Static test method");
	}
}
