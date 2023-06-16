package stugroup;

public class StuHw23Ex {
	public static void main(String[] args) {
		Anonymous2 hw = new Anonymous2();
		hw.field.run();
		hw.method1();
		hw.method2(
		new StuHw23() {
			@Override
			public void run() {
				System.out.println("테스트를 합니다.");
			}
		}
				);
	}

}
