package Ch02.sec04.exam02;
// 입력된 키코드를 변수에 저장
public class KeyCodeExample {

	public static void main(String[] args) throws Exception{
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);
	}

}
// throws Exception : 예외 처리 코드, 단순히 모니터에 예외 내용을 출력만 함
// 예외 처리 : 예외가 발생했을 때 어떻게 처리할 것인지