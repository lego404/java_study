package sec01.exam07;

public class MovieThread extends Thread{
	@Override
	public void run() {
		for(int i = 0; i<3; i++) {
			System.out.println("동영상을 재생함.");
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
			}
		}
	}
}
