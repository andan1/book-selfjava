package Ch14.sec01.exam11;

import java.io.*;

// 한 문자씩 읽기
public class ReadExample {

	public static void main(String[] args) throws Exception {
		// 데이터 출발지를 test7.txt로 하는 문자 기반 파일 입력 스트림을 생성
		Reader reader = new FileReader("C:/Temp/test7.txt");
		while (true) {
			// 한 문자씩 읽기
			int data = reader.read();
			// 파일 끝에 도달했을 경우
			if (data == -1) break;
			System.out.println((char)data);
		}
		reader.close();
	}

}
// 문자 입력 스트림 Reader : 최상위 클래스, 추상 클래스
// read() : 1개의 문자를 읽고 리턴
// read(char[] cbuf) : 읽은 문자들을 매개값으로 주어진 문자 배열에 저장하고 읽은 문자 수를 리턴
// read(char[] cbuf, int off, int len) : 
// len개의 문자를 읽고 매개값으로 주어진 문자 배열에서 cbuf[off]부터 len개까지 저장, 읽은 문자 수를 리턴
// close() : 입력 스트림 닫음

// read() 메소드 : 1개의 문자(2byte)를 읽고 int(4byte)타입으로 리턴
// int값을 char 타입으로 변환하면 읽은 문자를 얻을 수 있다