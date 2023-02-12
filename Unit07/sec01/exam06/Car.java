package sec01.exam06;
/*
 * 재정의할 수 없는 final 메소드
 * Car.java
 */
public class Car {
	//field
	public int speed;
	
	//method
	public void speedUp() { speed += 1;}
	
	//final method
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
