package sec02.exam03;
/*
 * Tire Ŭ����
 * Tire.java
 */
public class Tire {
	//field
	public int maxRotation;		//�ִ� ȸ����(Ÿ�̾� ����)
	public int accumulatedRotation;		//���� ȸ����
	public String location;		//Ÿ�̾� ��ġ
	
	//constructor
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//method
	public boolean roll() {
		++accumulatedRotation;	//���� ȸ���� 1 ����
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " Tire ����: " + (maxRotation - accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + " Tire ��ũ ***");
			return false;
		}
	}
}
