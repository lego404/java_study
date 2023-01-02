/*
 * MainStringArrayArgument.java
 * main() 메소드의 매개 변수
 */
public class MainStringArrayArgument {
	public static void main(String[] args) {
		if(args.length != 2) { //입력된 데이터 개수가 2개 아닐 경우
			System.out.println("값의 수가 부족함");
			System.exit(0);
		}
		
		String strNum1 = args[0];	//첫번째 데이터 얻기
		String strNum2 = args[1];	//두번째 데이터 얻기
		
		int num1 = Integer.parseInt(strNum1);	//문자열을 정수로 변환
		int num2 = Integer.parseInt(strNum2);	//"
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result );
	}
}
