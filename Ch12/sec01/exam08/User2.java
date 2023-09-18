package Ch12.sec01.exam08;
// User2 스레드
public class User2 extends Thread {
	private Calculator calculator;
	
	public void setCalculator (Calculator calculator) {
		this.setName("User2");
		// 공유 객체인 Calculator를 필드에 저장
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(50);
	}
}
