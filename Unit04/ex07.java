import java.util.Scanner;

public class ex07 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner (System.in);
		
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-------------------------------------------");
			System.out.print("����>> ");
			String c = sc.nextLine();
			
			switch (c) {
			case "1":
				System.out.print("���ݾ�> " );
				String Plus = sc.nextLine();
				balance += Integer.parseInt(Plus);
				System.out.println();
				continue;
			case "2":
				System.out.print("��ݾ�> ");
				String Min = sc.nextLine();
				balance -= Integer.parseInt(Min);
				System.out.println();
				continue;
			case "3":
				System.out.println("�ܰ�> " + balance);
				System.out.println();
				continue;
			case "4":
				System.out.println();
				System.out.println("���α׷� ����");
				run = false;
			}
		}
		sc.close();
	}
}
