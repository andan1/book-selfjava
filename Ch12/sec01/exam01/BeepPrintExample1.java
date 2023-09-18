package Ch12.sec01.exam01;

import java.awt.Toolkit;

// 메인 스레드만 이용한 경우
public class BeepPrintExample1 {

	public static void main(String[] args) {
		// Toolkit 객체 얻기
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			// 비프음 발생
			toolkit.beep();
			try { Thread.sleep(500); // 0.5초간 일시 정지
			} catch (Exception e) {}
		}	
			
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); // 0.5초간 일시 정지
			} catch (Exception e) {}
			
		}
		
	}

}
// Thread 클래스로부터 직접 생성
// 작업 스레드 객체를 직접 생성하려면 다음과 같이 Runnable을 매개값으로 갖는 생성자를 호출해야 함
// Thread thread = new Thread(Runnable target);
// Runnable task = new Task();
// Thread thread = new Thread(task);
// thread.start();