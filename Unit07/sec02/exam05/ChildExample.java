package sec02.exam05;
/*
 * ���� Ÿ�� ��ȯ
 * ChildExample.java
 */
public class ChildExample {
	public static void main (String[] args) {
		Parent parent = new Child();	//promotion
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*(�Ұ���)
		parent.field2 = "data2";
		parent.method2();
		 */
		
		Child child = (Child) parent; //casting
		child.field2 = "yyy";
		child.method3();
	}
}
