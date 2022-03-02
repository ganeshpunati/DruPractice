package Assignment19;
public interface DefultInterface {
	private void test() {
		System.out.println("Private Intece");
	}
	default void show(){
		test();
		System.out.println("Default method ");
	}
}
