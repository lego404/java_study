package Unit06_03_Ex3;

/* Board Ŭ������ �����ڰ� ������ ���� �����ε��Ǿ� ����.
 * �����ڸ��� �ߺ� �ڵ��� �κ��� ����
 * this() Ȱ���� �ߺ� �ڵ� �����ϱ� 
 */

public class Board {
	String title;
	String content;
	String writer;
	String date;
	int hitcount;
	
	Board() {}
	
	Board(String title, String content){
		this(title, content, "�α����� ȸ�����̵�", "���� ��ǻ�� ��¥", 0);
	}
	
	Board(String title, String content, String writer){
		this(title, content, writer, "���� ��ǻ�� ��¥", 0);
	}
	
	Board(String title, String content, String writer, String date){
		this(title, content, writer, date, 0);
	}
	
	Board(String title, String content, String writer, String date, int hitcount){
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
	}
}
