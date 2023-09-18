package Ch11.sec01.exam11;
// 바이트 배열을 문자열로 변환
import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException {
		// 읽은 바이트를 저장하기 위한 배열 생성
		byte[] bytes = new byte[100];
		
		System.out.println("입력 : ");
		//배열에 읽은 바이트를 저장하고 읽은 바이트 수를 리턴
		int readByteNo = System.in.read(bytes);
		
		// 배열을 문자열로 변환
		String str = new String(bytes, 0, readByteNo-2);
		System.out.println(str);
	}

}
