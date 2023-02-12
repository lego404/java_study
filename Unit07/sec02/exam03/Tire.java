package sec02.exam03;
/*
 * Tire 클래스
 * Tire.java
 */
public class Tire {
	//field
	public int maxRotation;		//최대 회전수(타이어 수명)
	public int accumulatedRotation;		//누적 회전수
	public String location;		//타이어 위치
	
	//constructor
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//method
	public boolean roll() {
		++accumulatedRotation;	//누적 회전수 1 증가
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " Tire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
}
