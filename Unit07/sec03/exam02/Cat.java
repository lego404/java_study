package sec03.exam02;
/*
 * �߻� �޼ҵ� ������
 * Cat.java
 */
public class Cat extends Animal{
	public Cat() {
		this.kind = "������";
	}
	
	@Override
	public void sound() {
		System.out.println("�߿�");
	}
}
