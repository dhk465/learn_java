package ex1_thread_sleep;

public class Ex_ThreadSleep extends Thread{
	
	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500); // 0.5초 딜레이
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // sleep은 무조건 try/catch로 잡아줘야한다.
			System.out.println(i);
		}
		
	}
	
}
