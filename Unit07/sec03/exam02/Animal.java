package sec03.exam02;
/*
 * �߻� �޼ҵ� ����
 * Animal.java
 */
public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("���� ���ϴ�.");
	}
	
	public abstract void sound();	//�߻� �޼ҵ�
}
