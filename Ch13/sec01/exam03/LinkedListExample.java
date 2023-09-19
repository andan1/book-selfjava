package Ch13.sec01.exam03;

import java.util.*;

// ArrayList와 LinkedList의 실행 성능 비교
public class LinkedListExample {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간 : " + (endTime - startTime) + " ns");
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간 : " + (endTime - startTime) + " ns");
	}

}
// ArrayList는 내부 배열에서 객체를 저장해서 관리하지만
// LinkedList는 인접 참조를 링크해서 체인처럼 관리
// LinkedList가 ArrayList보다 빠름
// List<E> list = new LinkedList<E>();
// List<E> list = new LinkedList<>();