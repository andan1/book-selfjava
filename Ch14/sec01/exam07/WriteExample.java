package Ch14.sec01.exam07;

import java.io.*;

// 한 문자씩 출력하기
public class WriteExample {

	public static void main(String[] args) throws Exception {
		// 데이터 도착지를 test7.txt로 하는 문자 기반 파일 출력 스트림을 생성
		Writer writer = new FileWriter("C:/Temp/test7.txt");
		
		char a = 'A';
		char b = 'B';
		char c = 'C';
		
		// 한 문자씩 출력
		writer.write(a);
		writer.write(b);
		writer.write(c); 
		
		// 출력 버퍼에 잔류하는 모든 문자를 출력
		writer.flush();
		writer.close();
	}

}
// 문자 출력 스트림 Writer : 최상위 클래스, 추상 클래스
// write(int c) : 매개값으로 주어진 한 문자를 보냄
// write(char[] cbuf) : 매개값으로 주어진 배열의 모든 문자를 보냄
// write(char[] cbuf, int off, int len) : 매개값으로 주어진 배열에서 cbuf[off]부터 len개까지의 문자를 보냄
// write(String str) : 매개값으로 주어진 문자열을 보냄
// write(String str, int off, in len) : 매개값으로 주어진 문자열에서 off 순번부터 len개까지의 문자를 보냄
// flush() : 버퍼에 잔류하는 모든 문자를 출력
// close() : 출력 스트림을 닫음

// write(int c) 메소드 : 매개 변수로 주어지는 int(4byte)에서 끝 2byte(1개 문자)만 출력 스트림으로 보냄