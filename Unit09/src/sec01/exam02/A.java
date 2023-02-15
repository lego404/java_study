package sec01.exam02;
/*
 * 바깥 필드와 메소드에서 사용 제한
 * A.java
 */
public class A {
	//instance field 
	B field1= new B();
	C field2 = new C();
	
	//instance method
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	//정적 필드 초기화
	//static B field3 = new B();
	static C field4 = new C();
	
	//정적 메소드
	static void method2() {
		//B var1 = new B();
		C var2 = new C();
	}
	
	//instance member class
	class B {}
	
	//static member class
	static class C {}
}
