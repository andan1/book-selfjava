package Ch03.sec02.exam03;
// 논리 부정 연산자 (단항 연산자)
public class DenyLogicOperatorExample {

	public static void main(String[] args) {
		boolean play = true;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
	}

}
// 논리 부정 연산자 : true를 false로, false를 true로 변경
//				   boolean 타입에만 사용 가능