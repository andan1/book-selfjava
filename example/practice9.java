package 연습문제;

public class practice9 {

	public static void main(String[] args) {
		// 1. 피자토핑을 저장하는 변수 선언
		// 2. 초기화를 이용하여 피자 토핑값을 변수에 대입
		// 3. 피자토핑변수의 내용을 화면에 출력
		// 단, 루프를 사용하여 출력
		String[] toppings = { "Pepperoni", "Mushrooms", "Onions", 
				"Sausage", "Bacon" };
		
		for (int i = 0; i < toppings.length; i++) {
			System.out.print(toppings[i] + " ");
		}
	}

}
