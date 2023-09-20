package Ch14.sec01.exam10;

import java.io.*;

// 문자열 출력하기
public class WriteExample {

	public static void main(String[] args) throws Exception {
		// 데이터 도착지를 test10.txt로 하는 문자 기반 파일 출력 스트림을 생성
		Writer writer = new FileWriter("C:/Temp/test10.txt");
		
		String str = "ABC";
		
		// 문자열 전체를 출력
		writer.write(str);
		
		// 출력 버퍼에 잔류하는 모든 문자열을 출력
		writer.flush();
		writer.close();
	}

}
//문자열을 좀 더 쉽게 보내기 위해 
// write(String str) 메소드 : 문자열 전체를 출력 스트림으로 보냄
// write(String str, int off, int len) :
// 		주어진 문자열 off 순번부터 len개까지의 문자를 보냄