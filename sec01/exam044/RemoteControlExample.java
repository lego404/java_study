package sec01.exam044;
/*
 * 인터페이스 변수에 구현 객체 대입
 */
public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc = new Audio();
	}
}
