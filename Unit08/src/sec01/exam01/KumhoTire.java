package sec02.exam01;
/*
 * 구현 클래스
 * KumhoTire.java
 */
public class KumhoTire implements Tire{
	@Override 
	public void roll() {
		System.out.println("금호 타이어가 굴러갑니다.");	//Tire 인터페이스 구현
	}
}
