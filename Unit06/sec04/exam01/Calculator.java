/*
 * Calculator.java
 * 메소드 선언
*/
package sec04.exam01;

public class Calculator{
	//method
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	int plus(int x, int y) {
		return x+y;
	}
	
	double divide(int x, int y) {
		return (double)x/y;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}
