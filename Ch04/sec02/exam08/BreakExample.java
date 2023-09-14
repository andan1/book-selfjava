package Ch04.sec02.exam08;
// break로 while문 종료 (반복문)
public class BreakExample {

	public static void main(String[] args) {
		while (true) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
			
			if (num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
// break문 : 반복문의 실행을 중지할 때 사용
// 중첩 반복문일 경우 break문 : 가장 가까운 반복문만 종료
// break 이름 : 바깥쪽 반복문까지 종료