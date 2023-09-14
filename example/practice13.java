package 연습문제;

public class practice13 {

	public static void main(String[] args) {
		// 원본 배열
		int[] list = { 10, 20, 30, 40, 50 };
		
		// 복사본 배열
		// 깊은 복사는 공간을 확보해야 함
		int[] numbers = new int[list.length];
		
		// 원본의 갯수만큼 복사
		for (int i = 0; i < list.length; i++) {
			numbers[i] = list[i];
		}
		// 원본배열 보여줌
		System.out.println(list.toString());
		// 복사본배열 보여줌
		System.out.println(numbers.toString());
		
		// 비교연산자로 비교
		if (list == numbers) {
			System.out.println("list == numbers");
		} else {
			System.out.println("list != numbers");
		}
		
		// 두 배열의 내용을 출력
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		// 복사본의 배열요소를 고치면 원본에 변화가 있는가
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = 0;
		}
		
		// 변경된 복사복내용 출력
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

}
