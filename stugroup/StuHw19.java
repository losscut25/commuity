package stugroup;

public abstract class StuHw19 {
	public abstract void service();
}

class LoginServlet extends StuHw19{

	@Override
	public void service() {
		System.out.println("로그인합니다.");
	}

}

class FileDownloadServlet extends StuHw19 {

	@Override
	public void service() {
		System.out.println("파일 다운로드 합니다.");
		
	}
	
}