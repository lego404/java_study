/*
 * 키보드로부터 학생 수와 학생들의 점수 입력받아서
 * 최고 점수 및 평균 점수 구하는 프로그램
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
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) {	//학생 수 
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];
				continue;
			}
			else if(selectNo == 2) { //점수입력
				for(int i = 0; i<scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = Integer.parseInt(sc.nextLine());
				}
			}
			else if(selectNo == 3) { //점수리스트
				for(int i = 0; i<scores.length; i++) {
					System.out.println("scores[" + i + "]> " + scores[i]);
				}
			}
			else if(selectNo == 4) { //분석
				int sum = 0;
				int max = 0;
				for(int i = 0; i<scores.length; i++) {
					if(max < scores[i])
						max = scores[i];
					sum += scores[i];
				}
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + (double)sum / scores.length);
			}
			else if(selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
		sc.close();
	}
}
