package Ch14.sec01.exam05;

import java.io.*;

// 배열 길이만큼 일기
public class ReadExample {

	public static void main(String[] args) throws Exception {
		// 데이터 출발지를 test2.db로 하는 바이트기반파일 입력스트림을 생성
		InputStream is = new FileInputStream("C:/Temp/test2.db");
		byte[] buffer = new byte[100];
		
		// 배열 길이만큼 일기
		while (true) {
			// 배열 길이만큼 읽기
			int readByteNum = is.read(buffer);
			// 파일 끝에 도달했을 경우
			if(readByteNum == -1) {
				break;
			}
			// 읽은 바이트 수만큼 반복하면서 배열에 저장된 바이트 출력
			for (int i = 0; i < readByteNum; i++) {
				System.out.println(i);
			}
		}
		is.close();
	}

}
// read(byte[] b) 메소드 :
// 		매개값으로 주어진 배열의 길이만큼 바이트를 읽고 해당 배열에 저장
// 		읽은 바이트 수를 리턴