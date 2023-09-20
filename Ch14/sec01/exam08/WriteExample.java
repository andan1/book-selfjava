package Ch14.sec01.exam08;

import java.io.*;

// 배열 전체를 출력하기
public class WriteExample {

	public static void main(String[] args) throws Exception {
		// 데이터 도착지를 test8.txt로 하는 문자 기반 파일 출력 스트림을 생성
		Writer writer = new FileWriter("C:/Temp/test8.txt");
		
		char[] array = { 'A', 'B', 'C' };
		
		// 배열의 모든 문자를 출력
		writer.write(array);
		
		// 출력 버퍼에 잔류하는 모든 문자를 출력
		writer.flush();
		writer.close();
	}

}
// write(char[] cbuf) 메소드 : 매개값으로 주어진 char[] 배열의 모든 문자를 출력 스트림으로 보냄
