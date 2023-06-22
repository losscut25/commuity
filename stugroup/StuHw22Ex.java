package stugroup;

public class StuHw22Ex {
	public static void main(String[] args) {
		Anonymous hw = new Anonymous();
		hw.field.start();
		hw.method1();
		hw.method2(
		new StuHw22() {
			@Override
			public void start() {
				System.out.println("트럭이 달립니다.");
			}
		}
				);
	}

}
