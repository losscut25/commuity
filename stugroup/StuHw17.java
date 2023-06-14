package stugroup;

public class StuHw17 {
	private static StuHw17 singleton = new StuHw17();
	
	private StuHw17() {}
	
	static StuHw17 getInstance() {
		return singleton;
	}

}
