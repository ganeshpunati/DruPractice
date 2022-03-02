package Assignment19;
public interface StaticInteface {
	static void  show(){
		System.out.println("static show method");
	}
	static void demo() {
		show();
		System.out.println("Static demo method");
	}
}
