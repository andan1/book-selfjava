package Ch04.sec02.exam10;
// continue를 사용한 for문 (반복문)
public class ContinueExample {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i ++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
// continue문 : 반복문에서 사용
//				continue문이 실행되면 조건식으로 이동