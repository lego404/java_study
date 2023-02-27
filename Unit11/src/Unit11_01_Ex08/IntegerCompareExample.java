package Unit11_01_Ex08;
/*
 * 박싱된 Integer 객체를 == 연산자로 비교함.
 * 100을 박싱한 Integer 객체는 true가 나오는데,
 * 300을 박싱한 Integer 객체는 false가 나오는 이유 설명하삼 
 */
public class IntegerCompareExample {
	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		System.out.println(obj1 == obj2);
		System.out.println(obj3 == obj4);
		/* Integer 값은 -128~127까지는 ==연산으로 박싱된 객체의 내부 값을 바로 비교 가능하지만
		 * 그 이상의 값은 포장 객체를 비교함.
		 * 그렇기에 언박싱한 값을 얻어 비교해야 함.
		 */
	}
}
