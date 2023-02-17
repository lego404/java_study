package sec02.exam03;
/*
 * UI 클래스
 * Button.java
 */
public class Button {
	OnClickListener listener;	//interface type field
	
	//매개 변수의 다형성
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	//구현 객체의 onClick() 메소드 호출
	void touch() {
		listener.onClick();
	}
	
	
	//중첩 인터페이스
	static interface OnClickListener {
		void onClick();
	}
}
