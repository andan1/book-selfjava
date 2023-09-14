package Ch02.sec01.exam03;
// 변수값 교환
public class VariableExchangeExample {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		
		System.out.println("x : " + x + ", y : " + y);
		
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("x : " + x + ", y : " + y);
	}

}
// 변수 x 값 3을 변수 temp에 저장
// 변수 y 값 5를 변수 x에 저장
// 변수 temp 값 3을 변수 y에 저장