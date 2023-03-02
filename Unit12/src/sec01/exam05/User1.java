package sec01.exam05;

public class User1 extends Thread {
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User1");	//스레드 이름을 User1로 설정 
		this.calculator = calculator;	//공유 객체인 Calculator를 필드에 저장 
	}
	
	public void run() {
		calculator.setMemory(100);
	}
}
