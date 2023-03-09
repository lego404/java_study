package sec01.exam10;
import java.io.FileWriter;
import java.io.Writer;
/*
 * 문자열 출력하기
 */
public class WriteExample {
	public static void main(String[] args)throws Exception{
		//데이터 도착지를 test10.text로 하는 문자 기반 파일 출력 스트림을 생성
		Writer writer = new FileWriter("C:/Temp/test10.txt");
		
		String str = "ABC";
		
		writer.write(str);
		
		writer.flush();
		writer.close();
	}
}
