/*
 * Ű����κ��� �л� ���� �л����� ���� �Է¹޾Ƽ�
 * �ְ� ���� �� ��� ���� ���ϴ� ���α׷�
 */
import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("----------------------------------------------------");
			System.out.print("����> ");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) {	//�л� �� 
				System.out.print("�л���> ");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];
				continue;
			}
			else if(selectNo == 2) { //�����Է�
				for(int i = 0; i<scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = Integer.parseInt(sc.nextLine());
				}
			}
			else if(selectNo == 3) { //��������Ʈ
				for(int i = 0; i<scores.length; i++) {
					System.out.println("scores[" + i + "]> " + scores[i]);
				}
			}
			else if(selectNo == 4) { //�м�
				int sum = 0;
				int max = 0;
				for(int i = 0; i<scores.length; i++) {
					if(max < scores[i])
						max = scores[i];
					sum += scores[i];
				}
				System.out.println("�ְ� ����: " + max);
				System.out.println("��� ����: " + (double)sum / scores.length);
			}
			else if(selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("���α׷� ����");
		sc.close();
	}
}
