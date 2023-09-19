package Ch13.sec01.exam04;

import java.util.*;

// String 객체를중복 없이 저장하는 HashSet
public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		// "Java"는 한 번만 저장됨
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
		// 저장된 객체 수 얻기
		int size = set.size();
		System.out.println("총 객체 수 : " + size);
		
		// 반복자 얻기
		Iterator<String> iterator = set.iterator();
		// 객체 수만큼 루핑
		while (iterator.hasNext()) {
			// 1개의 객체를 가져옴
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		// 1개의 객체 삭제
		set.remove("JDBC");
		// 1개의 객체 삭제
		set.remove("iBATIS");
		
		// 저장된 객체 수 얻기
		System.out.println("총 객체 수 : " + set.size());
		
		// 반복자 얻기
		iterator = set.iterator();
		// 객체 수만큼 루핑
		for (String element : set) {
			System.out.println("\t" + element);
		}
		
		// 모든 객체를 제거하고 비움
		set.clear();
		if (set.isEmpty()) {
			System.out.println("비어 있음");
		}
	}

}
// 객체들을 순서 없이 저장하고 동일한 객체는 중복 저장하지 않음
// Set<E> set = new HashSet<E>();