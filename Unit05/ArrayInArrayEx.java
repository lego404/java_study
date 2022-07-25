/*
 * 배열 속의 배열
 */
public class ArrayInArrayEx {
	public static void main(String[] args) {
		int [][] mathScores = new int[2][3];
		for(int i = 0; i<mathScores.length; i++) {
			for(int j = 0; j<mathScores[i].length; j++) {
				System.out.println("mathScores[" + i + "][" + j + "] = " + mathScores[i][j]);
			}
		}
		System.out.println();
		
		int[][] engScores = new int[2][];
		engScores[0] = new int[2];
		engScores[1] = new int[3];
		for(int i = 0; i<engScores.length; i++) {
			for(int j =0; j<engScores[i].length; j++) {
				System.out.println("engScores[" + i + "][" + j + "] = " + engScores[i][j]);
			}
		}
		System.out.println();
		
		int [][]javaScores = {{95,80}, {92,96,80}};
		for(int i = 0; i<javaScores.length; i++) {
			for(int j = 0; j<javaScores[i].length; j++) {
				System.out.println("javaScores[" + i + "][" + j + "] = " + javaScores[i][j]);
			}
		}
		
	}
}
