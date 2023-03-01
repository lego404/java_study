package sec01.exam03;
import java.awt.Toolkit;
/*
 * Thread 익명 자식 객체 이용하기 
 */
public class BeepPrintExample3 extends Thread{
	public static void main(String[] args) {
		Thread thread = new Thread () {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0; i<5; i++) {
					toolkit.beep();
					try {Thread.sleep(500);} catch(Exception e) {}
				}
			}
		};
		thread.start();
		
		for(int i = 0; i<5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	}
}
