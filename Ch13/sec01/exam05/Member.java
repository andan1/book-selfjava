package Ch13.sec01.exam05;
// hashCode()와 equals() 메소드 재정의
public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	// name과 age 값이 같으면 true를 리턴
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age);
		} else {
			return false;
		}
	}
	@Override
	// name과 age 값이 같으면 동일한 hashCode를 리턴
	public int hashCode() {
		return name.hashCode() + age;
	}
}
