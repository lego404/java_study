package sec01.exam14;
import java.io.UnsupportedEncodingException;

/*
 * 바이트 배열로 변환 
 */
public class StringGetBytesExample {
	public static void main(String[] args) {
		String str = "안녕하세요";
		
		byte[] bytes1 = str.getBytes();	//인코딩
		System.out.println("bytes1.length: " + bytes1.length);
		String str1 = new String(bytes1);	//디코딩
		System.out.println("bytes1 -> String: " + str1);
		
		try {
			byte[] bytes2 = str.getBytes("EUC-KR");	//인코딩
			System.out.println("bytes2.length: " + bytes2.length);
			String str2 = new String(bytes2, "EUC-KR");	//디코딩
			System.out.println("bytes2 -> String: " + str2);
			
			byte[] bytes3 = str.getBytes("UTF-8");	//인코딩
			System.out.println("bytes3.length: " + bytes3.length);
			String str3 = new String (bytes3, "UTF-8");	//디코딩
			System.out.println("bytes3 -> String: " + str3);
		} catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		} 
	}
}
