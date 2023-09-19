package Ch13.sec01.exam02;

import java.util.*;

// Board 객체를 저장하는 Vector
public class VectorExample {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		
		// Board 객체를 저장
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		// 2번 인덱스 객체(제목3) 삭제(뒤의 인덱스는 1씩 앞으로 당겨짐)
		list.remove(2);
		// 3번 인덱스 객체(제목5) 삭제
		list.remove(3);
		
		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
	}
}
// 동기화된 메소드로 구성되어 있기 때문에 멀티 스레드가 동시에 Vector의 메소드들을 실행할 수 없고
// 하나의 스레드가 메소드를 실행완료해야만 다른 스레드가 메소드를 실행할 수 있음
// 그래서 멀티 스레드 환경에서 안전하게 객체를 추가, 삭제할 수 있음
// List<E> list = new Vector<E>();
// List<E> list = new Vector<>();