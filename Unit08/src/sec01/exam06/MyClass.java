package sec01.exam06;
/*
 * 인터페이스 사용
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
