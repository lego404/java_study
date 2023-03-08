package sec01.exam08;
import java.io.FileWriter;
import java.io.Writer;
/*
 * 배열 전체를 출력하기 
 */
public class WriteExample {
	public static void main(String[]args) throws Exception{
		//데이터 도착지를 test8.txt로 하는 문자 기반 파일 출력 스트림을 생성 
		Writer writer = new FileWriter("C:/Temp/test8.txt");
		
		char[] array = {'A', 'B', 'C'};
		
		writer.write(array);	//배열의 모든 문자를 출력
		
		writer.flush();
		writer.close();
	}
}
