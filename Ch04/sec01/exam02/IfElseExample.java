package Ch04.sec01.exam02;
// if-else문 (조건문)
public class IfElseExample {

	public static void main(String[] args) {
		int score = 85;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		} else {
			System.out.println("점수가 90보다 작습니다."); //score < 90 인 경우
			System.out.println("등급은 B입니다.");
		}
	}	

}
// if-else문 : 조건식이 true이면 if문의 블록이 실행, 조건식이 false면 else 블록이 실행