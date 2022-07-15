import java.util.Scanner;

public class ex07 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner (System.in);
		
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택>> ");
			String c = sc.nextLine();
			
			switch (c) {
			case "1":
				System.out.print("예금액> " );
				String Plus = sc.nextLine();
				balance += Integer.parseInt(Plus);
				System.out.println();
				continue;
			case "2":
				System.out.print("출금액> ");
				String Min = sc.nextLine();
				balance -= Integer.parseInt(Min);
				System.out.println();
				continue;
			case "3":
				System.out.println("잔고> " + balance);
				System.out.println();
				continue;
			case "4":
				System.out.println();
				System.out.println("프로그램 종료");
				run = false;
			}
		}
		sc.close();
	}
}
