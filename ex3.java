import java.util.Scanner;

public class ex3 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 수: ");
		String strNum1 = sc.nextLine();
		
		System.out.print("두 번째 수: ");
		String strNum2 = sc.nextLine();
		
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
		double num3 = num1 / num2;
		System.out.println("----------------------------");
		if(num2 == 0 || num2 == 0.0)
			System.out.println("결과:무한대");
		else
			System.out.println("결과: " +num3);
		
		
	}
}
