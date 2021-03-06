package ex6_synchronized;

public class SyncThread implements Runnable {
	
	private int money = 10000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	// 1000원 씩 출금하는 메서드
	public void withdraw(int howMuch) {
		
		// 현재 구동중인 쓰레드의 이름을 가져온다
		String name = Thread.currentThread().getName();
		
		if (getMoney() > 0) { // 잔액이 0 이상일때
			money -= howMuch;
			System.out.println(name + " - 잔액: " + getMoney());
		} else {
			System.out.println(name + " - 잔액이 없습니다.");
		}
		
	} // withdraw()

	@Override
	public void run() {
		
		synchronized (SyncThread.this) {
			for (int i = 0; i < 10; i++) {

				try {
					Thread.sleep(1000);
					withdraw(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} // try-catch

			} // for
			
		} // synchronized: 영역 안에서의 작업은 해당 영역이 마무리 될때까지 다른 쓰레드에서의 접근을 막는다.
		
	} // run()
	
}
