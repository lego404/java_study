/*
 * 향상된 for문
 */
public class AdvancedForEx {
	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for(int score : scores) {
			sum = sum+score;
		}
		System.out.println("점수 총합 = " + sum);
		System.out.println("점수 평균 = " + (double)sum / scores.length);
		
	}
}
