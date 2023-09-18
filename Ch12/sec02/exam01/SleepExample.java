package Ch12.sec02.exam01;

import java.awt.Toolkit;

// 3초 주기로 10번 비프음 발생
public class SleepExample {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 10; i++) {
			toolkit.beep();
			try {
				// 3초 동안 메인 스레드를 일시 정지 상태로 만듦
				Thread.sleep(3000);
			} catch (InterruptedException e) {}
		}
	}

}
// 주어진 시간 동안 일시 정지