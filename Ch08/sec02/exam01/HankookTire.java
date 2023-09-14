package Ch08.sec02.exam01;
// 구현 클래스
public class HankookTire implements Tire{
	// Tire 인터페이스 구현
	@Override
	public void roll() {
		System.out.println("한국 타이어가 굴러갑니다.");
	}
}
