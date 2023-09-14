package DiceGame;

public class DiceGame {

	public static void main(String[] args) {
		// 주사위 눈금을 얻을려면 난수를 이용
		// Math.random()을 이용 : 0 <= 눈금 <1 작은 실수
		// (int) 숫자 : 강제로 정수로 바꿈
		int num = (int) (Math.random() * 6) + 1;
		
		System.out.println("주사위 눈금 : " + num);
		
	}

}
