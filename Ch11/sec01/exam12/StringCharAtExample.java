package Ch11.sec01.exam12;
// 주민등록번호에서 남자와 여자를 구분하는 방법
public class StringCharAtExample {

	public static void main(String[] args) {
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7);
		switch (sex) {
		case '1' :
		case '3' :
			System.out.println("남자 입니다.");
			break;
		case '2' :
		case '4' :
			System.out.println("여자 입니다.");
			break;
		}
	}

}
// char
// charAt(int index) : 특정 위치의 문자를 리턴

// boolean
// equals(Object anObject) : 두 문자열을 비교

// byte[]
// getBytes() : byte[]로 리턴
// getBytes(Charset charset) : 주어진 문자셋으로 인코딩한 byte[]로 리턴

// int
// indexOf(String str) : 문자열 내에서 주어진 문자열의 위치를 리턴
// length() : 총 문자의 수를 리턴

// String
// replace(CharSequence target, CharSequence replacement) : target 부분을 replacement로 대치한 새로운 문자열을 리턴
// substring(int beginIndex) : beginIndex 위치에서 끝까지 잘라낸 새로운 문자열을 리턴
// substring(int beginIndex, int endIndex) : beginIndex 위치에서 endIndex 전까지 잘라낸 새로운 문자열을 리턴
// toLowerCase() : 알파벳 소문자로 변환한 새로운 문자열을 리턴
// toUpperCase() : 알파벳 대문자로 변환한 새로운 문자열을 리턴
// trim() : 앞뒤 공백을 제거한 새로운 문자열을 리턴
// valueOf(int i) : 기본 타입 값을 문자열로 리턴