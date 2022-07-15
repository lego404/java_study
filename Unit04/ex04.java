
public class ex04 {
	public static void main(String[] args) {
		int x, y;
		for(x = 0; x<=10; x++) {
			for(y= 0; y<= 10; y++) {
				if((4*x) + (5*y) == 60)
					System.out.println("("+x+", " + y+")");
			}
		}
	}
}
