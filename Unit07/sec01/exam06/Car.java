package sec01.exam06;
/*
 * �������� �� ���� final �޼ҵ�
 * Car.java
 */
public class Car {
	//field
	public int speed;
	
	//method
	public void speedUp() { speed += 1;}
	
	//final method
	public final void stop() {
		System.out.println("���� ����");
		speed = 0;
	}
}
