package Unit11_02_Ex01;
import java.util.*;
import java.text.*;

public class DateExample {
	public static void main(String[] args) {
		Date now = new Date();
		String strNow = now.toString();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 EEE요일 hh시 mm분");
		
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}
}
