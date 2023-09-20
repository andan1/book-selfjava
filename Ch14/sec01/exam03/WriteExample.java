package Ch14.sec01.exam03;

import java.io.FileOutputStream;
import java.io.OutputStream;

// 배열 일부를 출력하기
public class WriteExample {

	public static void main(String[] args) throws Exception {
		// 데이터 도착지를 test3.db로 하는 바이트기반파일 출력스트림을 생성
		OutputStream os = new FileOutputStream("C:/Temp/test3.db");
		
		byte[] array = { 10, 20, 30, 40, 50 };
		
		// 배열의 1번 인덱스부터 3개를 출력
		os.write(array, 1, 3);
		
		os.flush();
		os.close();
	}

}
// write(byte[] b, int off, int len) :
// 			b[off]부터 len개의 바이트를 출력 스트림으로 보냄