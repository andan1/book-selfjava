package Ch12.sec01.exam04;

import java.awt.Toolkit;

// 비프음을 들려주는 스레드
public class BeepThread extends Thread {
	@Override
	public void run() {
		// 스레드 실행 내용
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try { Thread.sleep(500); 
			} catch (Exception e) {}
		}
	}
}
