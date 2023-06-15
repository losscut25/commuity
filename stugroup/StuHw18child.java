package stugroup;

public class StuHw18child extends StuHw18{
	private String name;
	
	public StuHw18child() {
		this("홍길동");
		System.out.println("Child() call");
	}
	public StuHw18child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
