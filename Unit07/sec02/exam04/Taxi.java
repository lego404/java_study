package sec02.exam04;
/*
 * 자식클래스
 * Taxi.java
 */
public class Taxi extends Vehicle{
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}
