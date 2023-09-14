package Ch02.sec04.exam04;
// q를 입력하면 반복 종료
public class QStopExample {

	public static void main(String[] args) throws Exception {
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode : " + keyCode);
			if (keyCode == 113) {
				break;
			}
		}
		
		System.out.println("종료");
	}

}
// System.in.read() : 키코드를 하나씩 읽기 때문에 2개 이상의 키가 조합된 한글을 읽을 수 없음
//					  키보드로부터 입력된 내용을 통 문자열로 읽지 못함 
// -> Scanner 클래스 제공