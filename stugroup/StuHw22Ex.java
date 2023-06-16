package stugroup;

public class StuHw22Ex {
	public static void main(String[] args) {
		Anonymous2 hw = new Anonymous2();
		hw.field.run();
		hw.method1();
		hw.method2(
		new StuHw23() {
			@Override
			public void run() {
				System.out.println("트럭이 달립니다.");
			}
		}
				);
	}

}
