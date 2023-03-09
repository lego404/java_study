package sec01.exam13;
import java.io.FileReader;
import java.io.Reader;
import java.io.Writer;
/*
 * 지정한 길이만큼 읽기
 */
public class ReadExample {
	public static void main(String[] args) throws Exception{
		//데이터 출발지를 test9.txt로 하는 문자 기반 파일 입력 스트림을 생성
		Reader reader = new FileReader("C:/Temp/test9.txt");
		
		char[] buffer = new char[5];
		
		int readCharNum = reader.read(buffer, 2, 3);
		if(readCharNum != -1) {	//읽을 문자가 있다면
			for(int i = 0; i<buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
		
		reader.close();
	}
}
