package sec01.exam05;
/*
 * 메인 스레드가 실행하는 코드
 */
public class MainThreadExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();	//User1 스레드 생성
		user1.setCalculator(calculator);	//공유객체설정  
		user1.start();
		
		User2 user2 = new User2();	//User2 스레드 생성
		user2.setCalculator(calculator);	//공유객체설정
		user2.start();
	}
}
