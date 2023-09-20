package Ch14.sec03.exam01;

import java.io.*;

// 키보드로부터 라인 단위 문자열 얻기
public class GetLineStringFromKeyboard {

	public static void main(String[] args) throws Exception {
		// InputStream을 Reader로 변환하고 다시 BufferedReader를 연결
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		while (true) {
			System.out.println("입력하세요 : ");
			// 라인 단위로 문자열을 읽음
			String lineStr = br.readLine();
			if (lineStr.equals("q") || lineStr.equals("quit")) break;
			System.out.println("입력된 내용 : " + lineStr);
			System.out.println();
		}
		br.close();
	}
}
// System.in : 데이터를 입력받을 때
// System.out : 데이터를 출력할 때
// System.err : 에러를 출력할 때

// System.in : System 클래스의 in 정적 필드