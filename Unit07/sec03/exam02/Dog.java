package sec03.exam02;
/*
 * 추상 메소드 재정의
 * Dog.java
 */
public class Dog extends Animal {
	public Dog() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
