package sec02.exam04;
/*
 * 객체 타입 확인
 * DriverExample.java
 */
public class DiverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
	}
}
