package Ch07_sec02.exam03;
// Tire 클래스
public class Tire {
	// 필드
	public int maxRotation;			// 최대 회전수
	public int accumulatedRotation;	// 누적 회전수
	public String location;			// 타이어 위치
	
	// 생성자
	public Tire(String location, int maxRotation) {
		this.location = location;		// 초기화
		this.maxRotation = maxRotation;	// 초기화
	}
	
	// 메소드
	public boolean roll() {
		++accumulatedRotation;		// 누적 회전수 1 증가
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire 수명 : " + 
					(maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + " Tire 펑크 ***");
			return false;
		}
	}
}
