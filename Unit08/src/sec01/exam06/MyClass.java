package sec01.exam06;
/*
 * �������̽� ���
 * MyClass.java
 */
public class MyClass {
	//field
	RemoteControl rc = new Television();
	
	//constructor
	MyClass(){
		
	}
	
	MyClass(RemoteControl rc){
		rc.turnOn();
		rc.setVolume(5);
	}
	
	//method
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodB (RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}
