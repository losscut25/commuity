package stugroup;

public class StuHw18 {
	public String nation;
	
	public StuHw18() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	
	public StuHw18(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
