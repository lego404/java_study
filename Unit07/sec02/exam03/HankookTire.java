package sec02.exam03;
/*
 * Tire�� �ڽ� Ŭ����
 * HankookTire.java
 */
public class HankookTire extends Tire{
	//field
	//constructor
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//method
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire ����: " + (maxRotation - accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire ��ũ ***");
			return false;
		}
	}
}
