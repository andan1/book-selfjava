package Ch04.sec01.exam01;
// if문 (조건문)
public class IfExample {

	public static void main(String[] args) {
		int score = 93;
		
		if(score >= 90)	{
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		
		if(score < 90)	
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다."); // if문과는 상관없는 실행문, 중괄호로 안묶여있어서
		
	}

}
//if문 : 조건식의 결과에 따라 블록 실행 여부가 결정
//		 true면 블록 실행하고 false면 블록을 실행하지 않음