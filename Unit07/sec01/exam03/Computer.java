package sec01.exam03;
/*
 * 자식 클래스
 * Computer.java
 */
public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
