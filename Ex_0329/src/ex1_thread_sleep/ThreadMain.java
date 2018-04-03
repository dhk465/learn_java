package ex1_thread_sleep;

public class ThreadMain {
	public static void main(String[] args) {
		
		Ex_ThreadSleep th = new Ex_ThreadSleep();
		
		th.start();
		
		try {
			Thread.sleep(2600);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main thread completed");
		
	}
}
