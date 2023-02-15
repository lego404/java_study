package sec02.exam05;

/*
 * 호출 가능 메소드
 * Example.java
 */
public class Example {
	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();	//InterfaceA 변수는 methodA()만 호출 가능
		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();	//InterfaceB 변수는 methodB()만 호출 가능
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		System.out.println();
		//InterfaceC 변수는 methodA(), methodB(), methodC() 모두 호출 가능
		
	}
}
