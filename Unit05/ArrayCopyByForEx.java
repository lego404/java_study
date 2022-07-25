/*
 * for문으로 배열 복사
 */
public class ArrayCopyByForEx {
	public static void main(String[] args) {
		int[] oldIntArray = {1,2,3};
		int[] newintArray = new int[5];
		
		for(int i = 0; i<oldIntArray.length; i++) {
			newintArray[i] = oldIntArray[i];
		}
		
		for(int i = 0; i<newintArray.length; i++) {
			System.out.print(newintArray[i] + ", ");
		}
	}
}
