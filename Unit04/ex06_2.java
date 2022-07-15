
public class ex06_2 {
	public static void main(String[] args) {
		for(int i = 1; i<5; i++) {
			for(int j = 0; j<4-i; j++) {	//°ø¹é
				System.out.print(" ");
			}
			for(int a = 0; a< i; a++) {	//º°
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
