package Ch13.sec01.exam07;

import java.util.*;

// 학번과 이름이 동일한 경우 같은 키로 인식
public class HashMapExample {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		
		// 학번과 이름이 동일한 student를 키로 저장
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 95);
		
		// 저장된 총 Map.Entry 수 얻기
		System.out.println("총 Entry 수 : " + map.size());
	}

}
