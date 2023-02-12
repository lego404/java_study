package sec01.exam04;
/*
 * super 변수
 * SupersonicAirplane.java
 */
public class SupersonicAirplane extends Airplane{
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	public int flyMode = NORMAL;

	@Override 
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행함.");
		} else {
			super.fly();//Airplane 객체의 fly()메소드 호출 
		}
	}
}
