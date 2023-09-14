package Ch03.sec02.exam04;
// 산술 연산자 (이항 연산자)
public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result : " + result1);
		
		int result2 = v1 - v2;
		System.out.println("result : " + result2);
		
		int result3 = v1 * v2;
		System.out.println("result : " + result3);
		
		int result4 = v1 / v2;
		System.out.println("result : " + result4);
		
		int result5 = v1 % v2;
		System.out.println("result : " + result5);
		
		double result6 = (double) v1 / v2;
		System.out.println("result : " + result6);
	}

}
// 산술 연산자 : 사칙연산자와 나머지 구하는 %
// 			   boolean 타입 제외한 모든 기본 타입에 사용 가능
// + : 덧셈
// - : 뺄셈
// * : 곱셈
// / : 나눗셈
// % : 나머지
// 피연산자들이 byte, short, char 타입일 경우 모두 int 타입으로 변환 후 연산 수행
// 피연산자들이 모두 정수 타입이고 long 타입이 포함되어 있을 경우, 모두 long 타입으로 변환 후 연산 수행
// 피연산자 중 실수타입이 있을 경우, 허용 범위가 큰 타입으로 변환 후 연산 수행



