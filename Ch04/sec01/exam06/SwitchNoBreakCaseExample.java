package Ch04.sec01.exam06;
// break문이 없는 case (조건문)
public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		int time = (int) (Math.random() * 4) + 8;
		System.out.println("[현재 시각 : " + time + " 시]");
		
		switch (time) {
			case 8 :
				System.out.println("출근합니다.");
			case 9 :
				System.out.println("회의를 합니다.");
			case 10 : 
				System.out.println("업무를 봅니다.");
			default : 
				System.out.println("외근을 나갑니다.");
		}
	}

}
// break가 없을 때 : case 값과는 상관없이 실행