package sec01.exam04;
/*
 * super ����
 * SupersonicAirplane.java
 */
public class SupersonicAirplane extends Airplane{
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	public int flyMode = NORMAL;

	@Override 
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("�����Ӻ�����.");
		} else {
			super.fly();//Airplane ��ü�� fly()�޼ҵ� ȣ�� 
		}
	}
}
