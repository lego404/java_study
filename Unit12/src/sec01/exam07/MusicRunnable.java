package sec01.exam07;

public class MusicRunnable implements Runnable{
	@Override
	public void run() {
		for(int i =0; i<3; i++) {
			System.out.println("음악을 재생함.");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
		} 
	}
}
