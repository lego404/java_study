package Unit13_01_Ex07;
import java.util.*;
/*
 * BoardDao 객체의 getBoardList() 메소드를 호출하면 List<Board> 타입의 컬렉션을 리턴함.
 * ListExample 클래스를 실행할 때 다음과 같이 출력될 수 있도록 
 * BoardDao의 getBoardList() 메소드를 작성해보세요.
 */
public class ListExample {
	public static void main(String[ ]args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		for(Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
	}
}
