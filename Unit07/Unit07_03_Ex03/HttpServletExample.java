package Unit07_03_Ex03;
/*
 * ���� Ŭ���� �����ϸ� "�α��� �մϴ�.", "���� �ٿ�ε� �մϴ�."�� ���ʴ�� ��µǵ���
 * LoginServlet�� FileDownloadServlet Ŭ���� �����ϻ� 
 */
public class HttpServletExample {
	public static void main(String[] args) {
		method(new LoginServlet());	//�α��� ��.
		method(new FileDownloadServlet());	//���� �ٿ�ε��մϴ�.
	}
	
	public static void method (HttpServlet servlet) {
		servlet.service();
	}
}
