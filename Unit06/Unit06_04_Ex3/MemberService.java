package Unit06_04_Ex3;

/* MemberService Ŭ������ login() �޼ҵ�� logout() �޼ҵ带 �����Ϸ��� ��.
 * login() �޼ҵ带 ȣ���� ������ �Ű������� id�� pw�� �����ϰ�,
 * logout() �޼ҵ�� id�� �Ű������� ������.
 * 
 * 1. login() �޼ҵ�� �Ű��� id�� "hong", �Ű��� pw�� "12345"�� ��쿡�� true�� �����ϰ�
 * �� ���� ���� ��쿡�� false�� �����ϵ��� ��.
 *  
 * 2. logout() �޼ҵ��� ������ "�α׾ƿ� �Ǿ����ϴ�"�� ��µǵ��� ��.
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
			System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
}
