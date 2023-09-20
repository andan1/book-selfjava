package Ch14.sec01.exam12;

import java.io.*;

// 배열 길이만큼 읽기
public class ReadExample {

	public static void main(String[] args) throws Exception {
		// 데이터 출발지를 test8.txt로 하는 문자 기반 파일 입력 스트림을 생성
		Reader reader = new FileReader("C:/Temp/test8.txt");
		
		// 길이 100인 배열 생성
		char[] buffer = new char[100];
		
		while(true) {
			// 배열 길이만큼 읽기
			int readCharNum = reader.read(buffer);
			// 파일 끝에 도달했을 경우
			if (readCharNum == -1) break;
			// 읽은 문자 수만큼 반복하면서 배열에 저장된 문자를 출력
			for (int i = 0; i < readCharNum; i++) {
				System.out.println(buffer[i]);
			}
		}
		reader.close();
	}

}
// read(char[] cbuf) 메소드 : 
// 매개값으로 주어진 문자 배열의 길이만큼 문자를 읽고 배열에 저장, 읽은 문자 수 리턴
// 많은 양을 문자를 읽을 때 좋음