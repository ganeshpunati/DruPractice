package Assignment18;

import java.util.Random;

public class ChaildThreadProgram implements Runnable {
public void run() {
	//Thread.currentThread().setName("ChaildThread");
	//System.out.println(Thread.currentThread().getName());
	Random r = new Random();
	for(int i=0;i<5;i++) {
		System.out.println("Chaild run Class : "+i);
		try {
			  Thread.sleep(r.nextInt(1000,2000));
				}catch(Exception e) {
					System.out.println("exle");
				}
	}	
}
public void start() {
	//Thread.currentThread().setName("ChaildThread");
	//System.out.println(Thread.currentThread().getName());
	for(int i=0;i<5;i++) {
		System.out.println("Chaild start Class : "+i);
	}
	
}
}
