package sec03.exam02;
/*
 * 추상 메소드 재정의
 * Cat.java
 */
public class Cat extends Animal{
	public Cat() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("야용");
	}
}
