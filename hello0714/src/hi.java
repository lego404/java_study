import java.util.Scanner;

public class hi{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("ù��° ��:");
		String strNum1 = sc.nextLine();
		
		System.out.print("�ι�° ��:");
		String strNum2 = sc.nextLine();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("���� ���: "+ result);
		sc.close();
	}
}