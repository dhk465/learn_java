package ex6_synchronized;

public class SyncMain {
	public static void main(String[] args) {
		
		SyncThread atm = new SyncThread();
		// mom 과 son 쓰레드가 atm 을 공유
		Thread mom = new Thread(atm, "엄마");
		Thread son = new Thread(atm, "아들");
		
		mom.start();
		son.start();
		
	}
}
