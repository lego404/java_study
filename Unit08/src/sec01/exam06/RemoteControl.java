package sec01.exam06;

public interface RemoteControl {
	//constant
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//�߻� �޼ҵ�
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}

