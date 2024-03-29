package sec02.exam01;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
/*
 * 문자 변환 보조 소트림
 */
public class CharacterConvertStreamExample {
	public static void main(String[] args) throws Exception{
		write("문자 변환 스트림을 사용함.");
		String data = read();
		System.out.println(data);
	}
	
	public static void write(String str) throws Exception {
		//FileOutputStream에 OutputStreamWriter 보조 스트림을 연결
		FileOutputStream fos = new FileOutputStream("C:/Temp/test1.txt");
		Writer writer = new OutputStreamWriter(fos);
		//OutputStreamWriter를 이용해 문자 출력 
		writer.write(str);
		writer.flush();
		writer.close();
	}
	
	public static String read() throws Exception{
		//FileInputStream에 InputStreamReader 보조 스트림 연결
		FileInputStream fis = new FileInputStream("C:/Temp/test1.txt");
		Reader reader = new InputStreamReader(fis);
		char[] buffer = new char[100];
		//InputStreamReader 보조 스트림을 이용해서 문자 입력
		int readCharNum = reader.read(buffer);
		reader.close();
		String data = new String(buffer, 0, readCharNum);//char 배열에서 읽은 수만큼 문자열로 변환
		return data;
	}
}


