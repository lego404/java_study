package sec01.exam04;
/*
 * NumberFormatException
 */
public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		
		int value1 = Integer.parseInt(data1);
		//int value2 = Integer.parseInt(data2);	//NuberFormatException 발생
		
		int result1 = value1; //+ value2;
		System.out.println(data1 + " + " + data2 + " = " + result1);
	}
}
