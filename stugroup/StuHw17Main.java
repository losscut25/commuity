package stugroup;

public class StuHw17Main {
	public static void main(String[] args) {
		StuHw17 obj1 = StuHw17.getInstance();
		StuHw17 obj2 = StuHw17.getInstance();
		
		if(obj1==obj2) {
			System.out.println("같은 ShopService 객체입니다.");
		}else {
			System.out.println("다른 ShopService 객체입니다.");
		}
	}
}
