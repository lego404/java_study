package Unit06_04_Ex3;

/* MemberService 클래스에 login() 메소드와 logout() 메소드를 선언하려고 함.
 * login() 메소드를 호출할 때에는 매개값으로 id와 pw를 제공하고,
 * logout() 메소드는 id만 매개값으로 제공함.
 * 
 * 1. login() 메소드는 매개값 id가 "hong", 매개값 pw가 "12345"일 경우에만 true로 리턴하고
 * 그 외의 값일 경우에는 false를 리턴하도록 함.
 *  
 * 2. logout() 메소드의 내용은 "로그아웃 되었습니다"가 출력되도록 함.
 */

public class MemberService {
	boolean login(String id, String pw) {
		if(id.equals("hong") && pw.equals("12345"))
			return true;
		else
			return false;
	}
	
	void logout(String id) {
		if(id.equals("hong"))
			System.out.println("로그아웃 되었습니다.");
	}
}
