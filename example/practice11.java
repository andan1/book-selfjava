package 연습문제;

public class practice11 {

	public static void main(String[] args) {
		// 1. 5명의 학생의 이름을 변수(배열)에 저장
		// 2. 저장된 학생의 이름을 출력 
		String[] names = { "김1", "김2", "김3", "김4", "김5" };
		
		for (String name : names) {
			System.out.print(name + " ");
		}
	}
}
