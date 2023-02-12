package Unit07_03_Ex03;
/*
 * 다음 클래스 실행하면 "로그인 합니다.", "파일 다운로드 합니다."가 차례대로 출력되도록
 * LoginServlet과 FileDownloadServlet 클래스 선언하삼 
 */
public class HttpServletExample {
	public static void main(String[] args) {
		method(new LoginServlet());	//로그인 함.
		method(new FileDownloadServlet());	//파일 다운로드합니다.
	}
	
	public static void method (HttpServlet servlet) {
		servlet.service();
	}
}
