package Ch02.sec03.exam03;
// 정수 타입의 연산
public class ByteOperationExample {

	public static void main(String[] args) {
		byte result1 = 10 + 20;
		System.out.println(result1);
		
		byte x = 10;
		byte y = 20;
		//byte result = x + y; -> 컴파일 에러
		int result2 = x + y;
		System.out.println(result2);
	}

}
// 연산 결과는 피연산자보다 허용범위가 넓은 곳에 저장해야 함