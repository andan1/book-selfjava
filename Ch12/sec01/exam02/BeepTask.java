package Ch12.sec01.exam02;

import java.awt.Toolkit;

// 비프음을 들려주는 작업 정의
public class BeepTask implements Runnable {
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try { Thread.sleep(500); 
			} catch (Exception e) {}
		}
	}
}
