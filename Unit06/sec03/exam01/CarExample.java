/*
 * 생성자를 호출해서 객체 생성
 * CarExample.java
 */
package sec03.exam01;

public class CarExample{
	public static void main(String[] args) {
		Car myCar = new Car("검정", 3000);
		//Car myCar = new Car(); <-X. 기본 생성자를 호출할 수 없음 
	}
}