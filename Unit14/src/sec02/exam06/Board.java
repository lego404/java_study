package sec02.exam06;
import java.io.Serializable;
import java.util.Date;
/*
 * 객체 입출력 보조 스트림
 */
public class Board implements Serializable{
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date date;
	
	public Board(int bno, String title, String content, String wirter, Date date) {
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
	}
	
	public int getBno() {return bno;}
	public void setBno(int bno) {this.bno = bno;}
	public String getTitle() { return title;}
	public void setTitle() {this.title = title;}
	public String getContent() {return content;}
	public void setContent() {this.content = content;}
	public String getWriter() {return content;}
	public void setWriter() {this.writer = writer;}
	public Date getDate() {return date;}
	public void setDate() {this.date = date;}
}
