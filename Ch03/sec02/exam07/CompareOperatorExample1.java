package Ch03.sec02.exam07;
// 비교 연산자 (이항 연산자)
public class CompareOperatorExample1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		System.out.println("result3 = " + result3);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2);
		System.out.println("result4 = " + result4);
	}

}
// 비교 연산자 : 피연산자의 대소나 동등을 비교해서 true/false 산출
// 			   boolean을 제외한 기본 타입에서 사용 가능
//			   동등 연산자는 모든 타입에 사용 가능
// == : 값이 같은지
// != : 값이 다른지
// > : 큰지
// >= : 크거나 같은지
// < : 작은지
// <= : 작거나 같은지
// char 타입이면 유니코드 값으로 비교 연산 수행