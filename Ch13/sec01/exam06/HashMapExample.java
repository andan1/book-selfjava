package Ch13.sec01.exam06;

import java.util.*;

// 이름을 키로 점수를 값으로 저장하기
public class HashMapExample {

	public static void main(String[] args) {
		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 객체 저장
		// 홍길동 키가 같기 때문에 제일 마지막에 저장한 값으로 대체
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println("총 Entry 수 : " + map.size());
		
		// 객체 찾기
		System.out.println("\t홍길동 : " + map.get("홍길동"));
		System.out.println();
		
		// 객체를 하나씩 처리
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		// 객체 삭제
		map.remove("홍길동");
		System.out.println(" 총 Entry 수 : " + map.size());
		
		// 객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		// 객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수 : " + map.size());
	}

}
// HashMap
// 키로 사용할 객체는 hashCode()와 equals() 메소드를 재정의해서 동등 객체가 될 조건을 정해야 함
// 객체가 달라도 동등 객체라면 같은 키로 간주하고 중복저장 방지하기 위해
// 동등 객체 조건은 hashCode()리턴값이 같고 equals()가 true를 리턴해야 함
// Map<K, V> map = new HashMap<K, V>();
// Map<K, V> map = new HashMap<>();