/*
 * CalculatorExample.java
 * 메소드 오버로딩
 */
package sec04.exam06;

public class CalculatorExample{
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		
		//정사각형 넓이 구하기
		double result1 = myCalc.areaRectangle(10);
		
		//직사각형 넓이 구하기
		double result2 = myCalc.areaRectangle(10, 20);
		
		//결과출력
		System.out.println("정사각형 넓이 = " + result1);
		System.out.println("직사각형 넓이 = " + result2);
	}
}