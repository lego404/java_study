package sec02.exam02;
/*
 * 자동 타입 변환 후의 멤버 접근
 * ChildExample.java
 */
public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;	//promotion
		parent.method1();
		parent.method2();	//재정의된 메소드가 호출됨
		//parent.method3();	//호출 불가능
	} 
}
