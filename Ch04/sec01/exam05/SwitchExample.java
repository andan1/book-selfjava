package Ch04.sec01.exam05;
// switch문 (조건문)
public class SwitchExample {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 6) + 1;
		
		switch(num) {
			case 1 :
				System.out.println("1번이 나왔습니다.");
				break;
			case 2 :
				System.out.println("2번이 나왔습니다.");
				break;
			case 3 :
				System.out.println("3번이 나왔습니다.");
				break;
			case 4 :
				System.out.println("4번이 나왔습니다.");
				break;
			case 5 :
				System.out.println("5번이 나왔습니다.");
				break;
			default :
				System.out.println("6번이 나왔습니다.");
				break;
		}
	}

}
// switch문 : 변수가 어떤 값을 갖느냐에 따라 실행문이 선택
// break : 다음 case를 실행하지 않고 switch문을 빠져나가기 위해