package sec01.exam03;
/*
 * hashCode() 메소드 재정의 추가
 */
public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {	//id가 동일한 문자열인 경우 같은 해시코드를 리턴 
		return id.hashCode();
	}
}
