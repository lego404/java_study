package sec02.exam02;
/*
 * 자동 타입 변환 후의 멤버 접근
 * Child.java
 */
public class Child extends Parent {
	@Override
	public void method2() {
		System.out.println("Child-method2()");	//재정의
	}
	
	public void method3() {
		System.out.println("Child-method3()"); 
	}
}
