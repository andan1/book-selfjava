package Ch02.sec02.exam06;
// 이스케이프 문자 출력
public class EscapeExample {

	public static void main(String[] args) {
		System.out.println("번호\t이름\t직업");
		System.out.println("행 단위 출력\n");
		System.out.println("행 단위 출력\n");
		System.out.println("우리는 \"개발자\" 입니다.");
		System.out.println("봄\\여름\\가을\\겨울");
	}

}
// \t : 탭만큼 띄움
// \n : 줄 바꿈
// \r : 캐리지리턴
// \" : " 출력
// \' : ' 출력
// \\ : \ 출력