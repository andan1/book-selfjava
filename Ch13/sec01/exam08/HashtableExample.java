package Ch13.sec01.exam08;

import java.util.*;

// 아이디와 비밀번호 검사하기
public class HashtableExample {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<>();
		
		// 아이디와 비밀번호를 미리 저장
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("아이디와 비밀번호를 인력해주세요.");
			System.out.println("아이디 : ");
			String id = scanner.nextLine();
			System.out.println("비밀번호 : ");
			String password = scanner.nextLine();
			System.out.println();
				
		if (map.containsKey(id)) {
			if(map.get(id).equals(password)) {
				System.out.println("로그인되었습니다.");
				break;
			} else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}
		}
		}
	}

}
// 동기화된 메소드로 구성되어 있기 때문에 멀티 스레드가 동시에 Hashtable의 메소드들을 실행할 수 없고
// 하나의 스레드가 실행을 완료해야만 다른 스레드를 실행할 수 있다
// 그래서 멀티 스레드 환경에서 안전하게 객체를 추가, 삭제할 수 있기 때문에 안전함