package Ch12.sec02.exam04;
// 1초 후 출력 스레드를 중지
public class InterruptExample {

	public static void main(String[] args) {
		Thread thread = new PrintThread2();
		thread.start();
		
		try { Thread.sleep(1000); 
		} catch (InterruptedException e) {}
		
		// 스레드를 종료하기 위해 InterruptedException을 발생시킴
		thread.interrupt();
	}

}
// interrupt() 메소드 이용하는 방법
// 스레드가 일시 정지 상태에 있을 때 InterruptedException을 발생시키는 역할을 함
// 이를 이용하여 run() 메소드를 정상 종료할 수 있음
// 스레드가 실행 대기 도는 실행 상태에 있을 때 interrupt()메소드가 실행되면
// 즉시 InterruptedException이 발생하지 않고 스레드가 미래에 일시 정시 상태가되면 발생
// 따라서 스레드가 일시 정지 상태가 되지 않으면 interrupt()메소드 호출은 의미가 없음
