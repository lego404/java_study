package Unit12_02_Ex04;

public class MovieThread extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println("동영상을 재생함.");
			try {Thread.sleep(1000); } catch(InterruptedException e) {}
		}
	}
}
