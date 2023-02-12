package sec02.exam04;
/*
 * 자식 클래스
 * Bus.java
 */
public class Bus extends Vehicle{
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
}
