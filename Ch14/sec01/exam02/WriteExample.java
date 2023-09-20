package Ch14.sec01.exam02;

import java.io.FileOutputStream;
import java.io.OutputStream;

// 배열 전체를 출력하기
public class WriteExample {

	public static void main(String[] args) throws Exception {
		// 데이터 도착지를 test2.db로 하는 바이트기반파일 출력스트림을 생성
		OutputStream os = new FileOutputStream("C:/Temp/test2.db");
		
		byte[] array = { 10, 20, 30 };
		
		// 배열의 모든 바이트 출력
		os.write(array);
		
		// 출력 버퍼에 잔류하는 모든 바이트 출력
		os.flush();
		os.close();
	}
}
// write(byte[] b) 메소드 : 매개값으로 주어진 배열의 모든 바이트를 출력 스트림으로 보냄