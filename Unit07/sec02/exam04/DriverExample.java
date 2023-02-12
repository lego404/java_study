package sec02.exam04;
/*
 * 실행 클래스
 * DriverExample.java
 */
public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);	//Vehicle vehicle = bus
		driver.drive(taxi);	//Vehicle vehicle = taxi
	}
}
