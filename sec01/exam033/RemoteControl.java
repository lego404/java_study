package sec01.exam033;
/*
 * �߻� �޼ҵ� ����
 * RemoteControl.java
 */
public interface RemoteControl {
	//constant
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//�߻� �޼ҵ�
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
