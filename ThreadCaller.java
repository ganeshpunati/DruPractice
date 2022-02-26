package Assignment18;

public class ThreadCaller {

	public static void main(String[] args) {
		//System.out.println(Thread.currentThread().getName());
	  Runnable td =new ChaildThreadProgram();
		//System.out.println(t.getState());
		Thread r =new Thread(td);
		r.start();
		r.yield();
		r.getPriority();
		//System.out.println(Thread.currentThread().getName());
		for(int i=0;i<50;i++) {
			System.out.println("Main Class : "+i);
			try {
				  Thread.sleep(100);
					}catch(Exception e) {
						e.printStackTrace();
					}

		}
	//	System.out.println(t.getState());
	//	System.out.println(Thread.currentThread().getName());
	}

}
