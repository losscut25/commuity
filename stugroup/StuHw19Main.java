package stugroup;

public class StuHw19Main {
	public static void main(String[] args) {
		method(new LoginServlet());
		method(new FileDownloadServlet());
	}
	public static void method(StuHw19 servlet) {
		servlet.service();
	}
	
}
