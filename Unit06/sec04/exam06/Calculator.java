/*
 * Calculator.java
 * 메소드 오버로딩
 */
package sec04.exam06;

public class Calculator {
	//정사각형의 넓이
	double areaRectangle(double width) {
		return width*width;
	}
	
	//직사각형 넓이
	double areaRectangle(double width, double height) {
		return width*height;
	}
}