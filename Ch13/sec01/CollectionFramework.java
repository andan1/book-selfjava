package Ch13.sec01;

public class CollectionFramework {

}
// 컬렉션 프레임워크 : 객체들을 효율적으로 추가, 삭제, 검색할 수 있도록 인터페이스와 구현 클래스를 java.util패키지에서 제공
// 컬렉션 : 객체의 저장
// 프레임워크 : 사용 방법을 정해놓은 라이브러리
// 주요 인터페이스 : List, Set, Map
// List 컬렉션 : 배열과 비슷하게 객체를 인덱스로 관리, 객체의 저장 순서 유지
//				배열과의 차이점은 저장용량이 자동으로 증가, 객체를 저장할 때 자동 인덱스가 부여, 다양한 메소드 제공
// 				객체 자체를 저장하는 것이 아닌 객체의 번지를 참조
//				중복 저장 가능, null도 저장이 가능, 이경우 해당 인덱스는 객체를 참조하지 않음
// 객체 추가
// boolean add() : 주어진 객체를 맨 끝에 추가
// void add() : 주어진 인덱스에 객체를 추가
// E set() : 주어진 인덱스에 저장된 객체를 주어진 객체로 바꿈
// 객체 검색
// boolean contains() : 주어진 객체가 저장되어 있는지 조사
// E get() : 주어진 인덱스에 저장된 객체를 리턴
// boolean isEmpty() : 컬렉션이 비어 있는지 조사
// int size() : 저장되어 있는 전체 객체 수를 리턴
// 객체 삭제
// void clear() : 저장된 모든 객체를 삭제
// E remove() : 주어진 인덱스에 저장된 객체를 삭제
// boolean remove() : 주어진 객체를 삭제

// Set 컬렉션 : 객체의 저장 순서가 유지되지 않음, 중복 저장 불가능, 하나의 null만 저장 가능
// 객체 추가
// boolean add() : 주어진 객체 저장, 성공적으로 저장되면 true 리턴, 중복 객체면 false 리턴
// 객체 검색
// boolean contains() : 주어진 객체가 저장되어 있는지 조사
// boolean isEmpty() : 컬렉션이 비어 있는지 조사
// Iterator<E> iterator() : 저장된 객체를 한 번씩 가져오는 반복자 리턴
// int size() : 저장되어 있는 전체 객체 수를 리턴
// 객체 삭제
// void clear() : 저장된 모든 객체 삭제
// boolean remove() : 주어진 객체 삭제

// Map 컬렉션 : 키와 값으로 구성된 Map.Entry 객체를 저장하는 구조
//			   Entry는 Map 인터페이스 내부에 선언된 중첩 인터페이스
//			   키와 값은 모두 객체, 키는 중복 저장 불가능, 값은 중복 저장 가능
// 			   기존에 저장된 키와 동일한 키로 값을 저장하면 기존의 값은 없어지고 새로운 값으로 대체
// 객체 추가
// V put() : 주어진 키로 값을 저장, 새로운 키일 경우 null 리턴, 동일한 키가 있을 경우 값을 대체하고 이전 값을 리턴
// 객체 검색
// boolean containsKey() : 주어진 키가 있는지 여부를 확인
// boolean containsValue() : 주어진 값이 있는지 여부를 확인
// Set<Map.Entry<K,V>> entrySet() : 키와 값의 쌍으로 구성된 모든 Map.Entry 객체를 Set에 담아서 리턴
// V get() : 주어진 키가 있는 값을 리턴
// boolean isEmpty() : 컬렉션이 비어 있는지 여부를 확인
// Set<K> keySet() : 모든 키를 Set 객체에 담아서 리턴
// int size() : 저장된 키의 총 수를 리턴
// Collection<V> values() : 저장된 모든 값을 Collection에 담아서 리턴
// 객체 삭제
// void clear() : 모든 Map.Entry(키와 값)를 삭제
// V remote() : 주어진 키와 일치하는 Map.Entry를 삭제하고 값을 리턴