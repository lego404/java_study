package sec01.verify.exam05;

public class Child extends Parent{
	private String name;
		
	public Child() {
		// 2. ������ �Ǿ����� ���⼭ super()�� ȣ���Ѵ�.
		// super(); // �⺻������ ȣ��Ǳ� ������ �����ص� �ȴ�.
		// 6. this("ȫ�浿")�� ȣ��
		this("ȫ�浿");
		// 8. ���� "Child() call"�� ���
		System.out.println("Child() call");
	}
	public Child(String name) {
		this.name = name;
		// 7. "Child(String name) call"�� ���
		System.out.println("CHild(Stirng name) call");
	}
}
