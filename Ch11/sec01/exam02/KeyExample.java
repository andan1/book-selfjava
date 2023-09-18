package Ch11.sec01.exam02;

import java.util.HashMap;

// 다른 키로 인식
public class KeyExample {

	public static void main(String[] args) {
		// Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key, String> hashMap = new HashMap <Key, String>();
		
		// 식별키 new Key(1)로 홍길동을 저장함
		hashMap.put(new Key(1), "홍길동");
		
		// 식별키 new Key(1)로 홍길동을 읽어옴
		String value = hashMap.get(new Key(1));
		System.out.println(value);
	}

}
