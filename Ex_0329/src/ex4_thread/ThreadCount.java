package ex4_thread;

public class ThreadCount implements Runnable {
	
	private int num;
	
	public ThreadCount(int num) {
		this.num = num;
	}
	
	@Override
	public void run() {
		
		for (int i = num; i >= 0; i--) {
			System.out.println(i);
		}
		
		System.out.println("����");
		
	}
	
}
