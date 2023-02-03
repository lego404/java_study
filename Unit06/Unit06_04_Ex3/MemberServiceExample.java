package Unit06_04_Ex3;

public class MemberServiceExample {
	public static void main(String[] args) {
		MemberService mS = new MemberService();
		boolean result = mS.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			mS.logout("hong");
		}
		else {
			System.out.println("id 또는 pw가 올바르지 않습니다.");
		}
	}
}
