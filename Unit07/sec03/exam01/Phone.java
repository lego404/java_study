package sec03.exam01;
/*
 * �߻� Ŭ����
 * Phone.java
 */
public abstract class Phone {
	//field
	public String owner;
	
	//Constructor
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//method
	public void turnOn() {
		System.out.println("�� ������ �մϴ�.");
	}
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�.");
	}
	
}
