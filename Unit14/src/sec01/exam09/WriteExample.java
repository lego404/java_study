package sec01.exam09;
import java.io.FileWriter;
import java.io.Writer;
/*
 * 배열 일부를 출력하기
 */
public class WriteExample {
	public static void main(String[ ]args) throws Exception {
		//데이터 도착지를 test9.txt로 하는 문자 기반 파일 출력 스트림 생성 
		Writer writer = new FileWriter("C:/Temp/test9.txt");
		
		char[] array = {'A', 'B', 'C', 'D', 'E' };
		
		//배열의 1번 인덱스부터 3개를 출력
		writer.write(array, 1, 3);
		
		writer.flush();
		writer.close();
	}
}
