package Assignment17;
public class ThreadDemo extends Thread{
	public void run() {
		Thread.currentThread().setName("Chaild Name");
		System.out.println("This class Name :"+Thread.currentThread().getName());
		for(int i=0;i<10;i++) {
			System.out.println("Chaild class");
		}
	}
}
