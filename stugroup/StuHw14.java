package stugroup;
//생성자마다 중복 코딩된 부분이 있는데 this()를 활용해서 중복 코드를 제거해봐라. 무슨말임???
public class StuHw14 {
	String title;
	String content;
	String writer;
	String date;
	int hitcount;
	
	StuHw14(String title, String content) {
		this(title, content, "로그인한 회원아이디", "현재 컴퓨터 날짜", 0); // 정답
//		this.title = title;
//		this.content = content;
//		this.writer = "로그인한 회원아이디";
//		this.date = "현재 컴퓨터 날짜";
//		this.hitcount = 0;
	}
	
	StuHw14(String title, String content, String writer, String date) {
		this(title, content, "writer", "date", 0); // 정답
//		this.title = title;
//		this.content = content;
//		this.writer = "writer";
//		this.date = "date";
//		this.hitcount = 0;
	}
	StuHw14(String title, String content, String writer, String date, int hitcount) {
		this.title = title;
		this.content = content;
		this.writer = "writer";
		this.date = "date";
		this.hitcount = hitcount;
	}
}
