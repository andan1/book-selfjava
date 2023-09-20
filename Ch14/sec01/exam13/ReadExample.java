package Ch14.sec01.exam13;

import java.io.*;

// 지정한 길이만큼 읽기
public class ReadExample {

	public static void main(String[] args) throws Exception {
		// 데이터 출발지를 test9.txt로 하는 문자 기반 파일 입력 스트림을 생성
		Reader reader = new FileReader("C:/Temp/test9.txt");
		
		char[] buffer = new char[5];
		
		// 입력 스트림으로부터 3개의 문자를 읽고 buffer[2], buffer[3], buffer[4]에 각각 저장
		int readCharNum = reader.read(buffer, 2, 3);
		// 읽은 문자가 있다면
		if (readCharNum != -1) {
			// 배열 전체를 읽고 출력
			for (int i = 0; i < buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
		reader.close();
	}

}
// read(char[] cbuf, int off, int len) 메소드 :
// len개의 문자만큼 읽고 매개값으로 주어진 문자 배열에서 cbuf[off]부터 len개까지 저장