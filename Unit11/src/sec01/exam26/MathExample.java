package sec01.exam26;
/*
 * Math의 수학 메소드
 */
public class MathExample {
	public static void main(String[] args) {
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.println("v1= " + v1);
		System.out.println("v2= " + v2);
		
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3);
		System.out.println("v3= " + v3);
		System.out.println("v4= " + v4);
		
		double v5 = Math.floor(5.3);
		double v6 = Math.floor(-5.3);
		System.out.println("v5= " + v5);
		System.out.println("v6= " + v6);
		
		int v7 = Math.max(5, 9);
		double v8 = Math.min(5.3, 2.5);
		System.out.println("v7= " + v7);
		System.out.println("v8= " + v8);
		
		double v9 = Math.random();
		System.out.println("v9= " + v9);
		
		double v10 = Math.rint(5.3);
		double v11 = Math.rint(5.7);
		System.out.println("v10= " + v10);
		System.out.println("v11= " + v11);
		
		long v12 = Math.round(5.3);
		long v13 = Math.round(5.7);
		System.out.println("v12= " + v12);
		System.out.println("v13= " + v13);
		
		double value = 12.3456;
		double temp1 = value *100;
		long temp2 = Math.round(temp1);
		double v14 = temp2/100.0;
		System.out.println("v14= " + v14);
		
	}
}
