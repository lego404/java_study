package Unit06_04_Ex3;

public class MemberServiceExample {
	public static void main(String[] args) {
		MemberService mS = new MemberService();
		boolean result = mS.login("hong", "12345");
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			mS.logout("hong");
		}
		else {
			System.out.println("id �Ǵ� pw�� �ùٸ��� �ʽ��ϴ�.");
		}
	}
}
