package sec06.exam04.package1;
/*
 * �������� ���� ����(1)
 * A.java
 */
public class A {
	//�ʵ�
	A a1 = new A(true);	//(O)
	A a2 = new A(1);	//(O)
	A a3 = new A("���ڿ�");	//(O)
	
	//������ 
	public A(boolean b) {}	//public ���� ����
	A(int b) {}	//default ���� ����
	private A(String s) {}	//private ���� ����
}
