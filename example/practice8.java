package 연습문제;

public class practice8 {

	public static void main(String[] args) {
		// 1. 크기가 10인 정수형 배열을 생성
		int[] s = new int[10];
		
		// 2. 각 배열에는 0부터 9까지의 값으로 채움
		for (int i = 0; i < s.length; i++) {
			s[i] = i;
		}
		
		// 3. 배열의 내용을 출력
		int count = 0;
		while (count < s.length) {
			System.out.print(s[count] + ", ");
			count++;
		}
		// 배열의 인덱스는 배열의 크기보다 -1 작다
		// 그런데 배열에 크기값과 같은 인덱스를 사용하려 하면 인덱스 예외가 발생
		// s[s.length] = 10;
		// System.out.println("s[" + s.length + "] = " + s[s.length]);
		
		// 이런 방식을 MVC 디자인 패턴이라고 함
	}

}
