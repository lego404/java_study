package sec02.exam02;
/*
 * �ڵ� Ÿ�� ��ȯ ���� ��� ����
 * ChildExample.java
 */
public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;	//promotion
		parent.method1();
		parent.method2();	//�����ǵ� �޼ҵ尡 ȣ���
		//parent.method3();	//ȣ�� �Ұ���
	} 
}