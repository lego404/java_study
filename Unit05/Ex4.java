
public class Ex4 {
	public static void main(String[] args) {
		int max= 0;
		int[] array = {1,5,3,8,2};
		
		for(int arr : array) {
			if(max < arr)
				max = arr;
		}
		System.out.println("max: " + max);
	}
}
