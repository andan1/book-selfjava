package Ch14.sec01.exam04;

import java.io.*;

// 1byte씩 읽기
public class ReadExample {

	public static void main(String[] args) throws Exception {
		// 데이터 출발지를 test1.db로 하는 바이트기반파일 입력스트림을 생성
		InputStream is = new FileInputStream("C:/Temp/test1.db");
		while (true) {
			int data = is.read();
			// 파일 끝에 도달했을 경우
			if (data == -1) {
				break;
			}
			System.out.println(data);
		}
		is.close();
	}

}
// 바이트 입력 스트림 : 최상위 클래스, 추상 클래스
// read() : 1byte를 일고 읽은 바이트 리턴
// read(byte[] b) : 읽은 바이트를 매개값으로 주어진 배열에 저장하고 읽은 바이트 수를 리턴
// read(byte[] b, int off, int len) : len개의 바이트를 읽고 매개값으로 주어진 배열에서 b[off]부터 len개까지 저장, 읽은 바이트 수 리턴
// close() : 입력 스트림 닫음

// read() 메소드 : 1byte를 읽고 int(4byte) 타입으로 리턴