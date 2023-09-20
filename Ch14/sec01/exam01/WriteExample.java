package Ch14.sec01.exam01;

import java.io.FileOutputStream;
import java.io.OutputStream;

// 1byte씩 출력하기
public class WriteExample {

	public static void main(String[] args) throws Exception {
		// 데이터 도착지를 test1.db로 하는 바이트기반파일 출력스트림을 생성
		OutputStream os = new FileOutputStream("C:/Temp/test1.db");
		
		// 1 byte씩 출력
		byte a =10;
		byte b =20;
		byte c =30;
		
		os.write(a);
		os.write(b);
		os.write(c);
		
		os.flush();
		os.close();
	}

}
// 바이트 출력 스트림 : 최상위 클래스, 추상 클래스
// write() : 1 byte를 출력
// write(byte[] b) : 매개값으로 주어진 배열 b의 모든 바이트를 출력
// write(byte[] b, int off, int len) : 매개값으로 주어진 배열 b[off]부터 len개까지의 바이트 출력
// flush() : 출력 버퍼에 잔류하는 모든 바이트 출력
// close() : 출력 스트림 닫기

// write() : 매개변수로 주어지는 int(4byte)에서 끝 1byte만 출력 스트림으로 보냄