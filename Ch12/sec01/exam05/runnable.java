package Ch12.sec01.exam05;

import java.awt.Toolkit;

// Thread 익명 자식 객체 이용하기
public class runnable {

	public static void main(String[] args) {
		Thread thread = new Thread() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try { Thread.sleep(500); 
					} catch (Exception e) {}
				}
			}
		};
		thread.start();
		
		for (int i =0; i < 5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); 
			} catch (Exception e) {} 
		}
	}

}
// Thread 익명 자식 객체를 이용해서 작업 스레드를 만들 수 있는 또 다른 방법