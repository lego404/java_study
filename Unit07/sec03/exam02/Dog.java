package sec03.exam02;
/*
 * �߻� �޼ҵ� ������
 * Dog.java
 */
public class Dog extends Animal {
	public Dog() {
		this.kind = "������";
	}
	
	@Override
	public void sound() {
		System.out.println("�۸�");
	}
}
