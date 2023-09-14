package Ch02.sec04.exam03;
// 입력된 키의 개수와 상관없이 키코드 읽기
public class ContinueKeyCodeReadExample {

	public static void main(String[] args) throws Exception {
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode : " + keyCode);
		}
	}

}
