package Unit14_02_Ex02;
import java.io.BufferedReader;
import java.io.FileReader;

/* 라인 변호 출력
 * FileRader와 BufferedReader를 이용해서 source.txt 내용을 읽고, 
 * 각 라인 번호를 추가해 모니터로 출력하는 프로그램을 작성해보세요.  
 */
public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		String filePath = "src/Unit14_02_Ex02/AddLineNumberExample.java";
		FileReader reader = new FileReader(filePath);
		BufferedReader br = new BufferedReader(reader);
		
		int num = 1;
		while(true) {
			String data = br.readLine();	//라인 단위 문자열을 읽고 리턴
			if(data == null) break;	//파일 끝에 도달했을 경우
			System.out.println(num + ": " + data);
			num++;
		}
		br.close();
	}
}
