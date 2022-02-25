package Assignment17;

public class MyThread {

	public static void main(String[] args) {
		System.out.println("Thread Name: "+Thread.currentThread().getName());
		Thread t =new ThreadDemo();
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main class");
		}

	}

}
