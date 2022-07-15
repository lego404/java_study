
public class ex03 {
	public static void main(String[] args) {
		int num1, num2;
		while(true) {
			num1 = (int)(Math.random()*6) +1;
			num2 = (int)(Math.random()*6) +1;
			if(num1 + num2 == 5) {
				System.out.println("(" + num1 + ", " + num2 + ")");
				break;
			}
			else continue;
		}
	}
}
