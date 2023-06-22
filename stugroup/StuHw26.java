package stugroup;
// Object의 toString() 메소드를 재정의해서 결과값이 나오도록 해라
public class StuHw26 {
	private String id;
	private String name;
	
	public StuHw26(String id, String name) {
		this.id=id;
		this.name=name;
	}
//객체 문자 정보를 리턴하는 메서드임
	@Override
	public String toString() {
		return id + ": " + name;
	}

}
