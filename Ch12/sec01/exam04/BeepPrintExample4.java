package Ch12.sec01.exam04;
// 메인 스레드와 작업 스레드가 동시에 실행
public class BeepPrintExample4 {

	public static void main(String[] args) {
		Thread thread = new Thread();
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); 
			} catch (Exception e) {}
		}
	}

}
// Thread 하위 클래스로부터 생성
// 작업 스레드가 실행할 작업을 Runnable로 만들지 않고
// Thread의 하위 클래스로 작업 스레드를 정의하면서 작업 내용을 포함시킬 수도 있음
// 작업 스레드 클래스 저으이하는 방법
// Thread 클래스를 상속한 후 run() 메소드를 오버라이딩을 해서 코드 작성