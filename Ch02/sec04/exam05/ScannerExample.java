package Ch02.sec04.exam05;
// 키보드에서 입력된 내용을 문자열로 얻기

import java.util.Scanner; // Scanner가 java.util 패키지에 있다는 것을 컴파일러에게 알려주는 역할

public class ScannerExample {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in); // 시스템의 입력 장치로부터 읽는 Scanner를 생성하는 코드
		String inputData;
		
		while (true)	{
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열 : \"" + inputData + "\"");
			if (inputData.equals("q")) {
				break;
			}
		}
		
		System.out.println("종료");
		
		scanner.close();
	}

}
// equals() : 문자열이 동일한지 비교할 때
// == : 기본 타입의 값이 동일한지 비교할 때