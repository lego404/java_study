package sec02.exam03;
/*
 * 구현 클래스
 * Bus.java
 */
public class Bus implements Vehicle{
	@Override
	public void run() {
		System.out.println("버스가 옵니다.");
	}
	public void checkFare() {
		System.out.println("승차요금을 계산합니다.");
	}
}
