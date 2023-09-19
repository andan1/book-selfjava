package Ch13.sec01.exam01;

import java.util.*;

// String 객체를 저장하는ArrayList
public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		// String 객체를 저장
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		// 저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println("총 객체 수 : " + size);
		System.out.println();
		
		// 2번 인덱스의 객체 얻기
		String skill = list.get(2);
		System.out.println("2 : " + skill);
		System.out.println();
		
		// 저장된 총 객체 수만큼 루핑
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();
		
		// 2번 인덱스 객체(Database) 삭제
		list.remove(2);
		// 2번 인덱스 객체(Servlet/JSP) 삭제
		list.remove(2);
		list.remove("iBATIS");
		
		// 저장된 총 객체 수만큼 루핑
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
	}
}
// 인덱스를 이용해서 객체를 찾거나 맨 마지막에 객체를 추가하는 경우
// List<String> list = new ArrayList<String>();
// List<String> list = new ArrayList<>();