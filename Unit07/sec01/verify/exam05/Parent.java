package sec01.verify.exam05;

public class Parent {
	public String nation;
	
	public Parent() {
		// 3. super()�� ȣ��ǰ� Parent()������ this("���ѹα�");�� ȣ��
		this("���ѹα�");
		// 5. ���� "Parent() call"�� ���
		System.out.println("Parent() call");
	}
	
	public Parent(String nation) {
		this.nation = nation;
		// 4. �ᱹ ���⼭ ���� ���� "Parent(String nation) call"�� ���
		System.out.println("Parent(String nation) call");
	}
}
