package sec01.exam04;
/*
 * 메인 스레드 이름 출력 및 UserThread 생성 및 시작 
 */
public class ThreadNameExample {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();		//이 코드를 실행하는 스레드 객체 얻기
		System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName());
		
		ThreadA threadA = new ThreadA();	//ThreadA 생성
		System.out.println("작업 스레드 이름: " + threadA.getName());	//스레드 이름 얻기
		threadA.start();
		
		ThreadB threadB = new ThreadB();	//ThreadB 생성
		System.out.println("작업 스레드 이름 " + threadB.getName());	//스레드 이름 얻기
		threadB.start();
	}
}
