package Ch12.sec01.exam03;
// Runnable 익명 구현 객체 이용
import java.awt.Toolkit;

public class runnable {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try { Thread.sleep(500); 
					} catch (Exception e) {}
				}
			}
		});
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); 
			} catch (Exception e) {}
		}
	}

}
// Runnable 익명 구현 객체로 대체하여 작업 스레드를 만들 수 있는 방법