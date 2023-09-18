package Ch11.sec01.exam01;
// 객체 동등 비교(equals() 메소드)
public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		// 매개값이 Member 타입인지 확인
		if (obj instanceof Member) {
			// Member 타입으로 강제 타입 변환하고 동일한지 검사 후 리턴
			Member member = (Member) obj;
			if (id.equals(member.id)) {
				return true;
			}
		}
		// 매개값이 Member 타입이 아니거나 id 필드값이 다른 경우 false를 리턴
		return false;
	}
}
