package Unit06_03_Ex3;

/* Board 클래스의 생성자가 다음과 같이 오버로딩되어 있음.
 * 생성자마다 중복 코딩된 부분이 있음
 * this() 활용해 중복 코드 제거하기 
 */

public class Board {
	String title;
	String content;
	String writer;
	String date;
	int hitcount;
	
	Board() {}
	
	Board(String title, String content){
		this(title, content, "로그인한 회원아이디", "현재 컴퓨터 날짜", 0);
	}
	
	Board(String title, String content, String writer){
		this(title, content, writer, "현재 컴퓨터 날짜", 0);
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
