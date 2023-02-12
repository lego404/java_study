package sec01.exam033;
/*
 * 추상 메소드 선언
 * RemoteControl.java
 */
public interface RemoteControl {
	//constant
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//추상 메소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
