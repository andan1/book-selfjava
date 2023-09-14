package Ch03.sec02.exam01;
// 부호 연산자 (단항 연산자)
public class SignOperatorExample {

	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		
		System.out.println("result1 = " + result1);
		System.out.println("result2 : " + result2);
		
		byte b = 100;
		//byte result3 = -b; 
		// -> byte 타입 값을 부호 연산하면 int 타입 값으로 바뀌므로 컴파일 에러
		int result3 = -b;
		System.out.println("result3 = " + result3);
	}

}
// + : 피연산자의 부호 유지
// - : 피연산자의 부호 변경
// 단항 연산자 : 피연산자가 단 하나뿐인 연산자, 
//			   부호(+, -), 증감(++, --), 논리 부정(!)
// 부호 연산자 : 양수 및 음수 표시, 
//		       boolean 타입과 char 타입 제외한 나머지 기본 타입에 사용