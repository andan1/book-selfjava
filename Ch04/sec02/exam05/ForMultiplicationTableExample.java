package Ch04.sec02.exam05;
// 구구단 출력하기 (중첩 for문) (반복문)
public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		for (int m = 2; m <= 9; m++) {
			System.out.println("***" + m + "단 ***");
		for (int n = 1; n <= 9; n++) {
			System.out.println(m + " x " + n + " = " + (m * n));
		}
	  }
	}
}
// 중첩 for문 : for 안에 for문을 내포 가능
//			   바깥쪽 for문이 한 번 실행할 때마다 중첩된 for문을 지정된 횟수만큼 실행