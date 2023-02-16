package sec01.exam05;
/*
 * 실행 클래스
 * OutterExample.java
 */
public class OutterExample {
	public static void main(String[] args) {
		Outter outter =new Outter();
		Outter.Nested nested = outter.new Nested();
		nested.print();
	}
}
