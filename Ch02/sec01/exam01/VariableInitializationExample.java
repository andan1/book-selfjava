package Ch02.sec01.exam01;
// 변수 초기화
public class VariableInitializationExample {

	public static void main(String[] args)  {
		// 변수 value 선언
		int value;
		
		// 변수 value의 값을 읽고 10을 더하는 산술연산을 수행
		// 연산의 결과값을 변수 result의 초기값으로 저장
		int result = value + 10;
		
		// 변수 result 값을 읽고 콘솔에 출력
		System.out.println(result);
		
	}
}
// 변수 value가 선언되었지만 초기화되지 않아서 에러
// 변수에 최초로 값이 저장되는 것을 변수 초기화
// 그 값을 초기화라고 함