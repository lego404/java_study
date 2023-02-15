package sec02.exam03;
/*
 * 강제 타입 변환
 * VehicleExample.java
 */
public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();	//자동 타입 변환
		vehicle.run();
		Bus bus = (Bus)vehicle;	//강제 타입 변환
		bus.run();
		bus.checkFare();	//Bus 클래스에는 checkFare()가 있음 
	}
}
