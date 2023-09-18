package Ch11.sec01.exam10;
// 바이트 배열을 문자열로 반환
public class ByteToStringExample {

	public static void main(String[] args) {
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
	}

}
// 배열 전체를 String 객체로 생성
// String str = new String(byte[] bytes);
// 지정한 문자셋으로 디코딩
// String str = new String(byte[] bytes, String charsetName);
// 배열의 offset 인덱스 위치부터 length만큼 String 객체로 생성
// String str = new String(byte[] bytes, int offset, int length);
// 지정한 문자셋으로 디코딩
// String str = new String(byte[] bytes, int offset, int length, String charsetName);