package stugroup;
//메서드 구현 클래스
public class Anonymous2 {
	StuHw23 field = new StuHw23() {
	@Override
	public void run() {
		System.out.println("자전거가 달립니다.");
	}
};
	void method1() {
		StuHw23 localVar = new StuHw23() {
			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
			}
		};
				localVar.run();	
	}
	void method2(StuHw23 worker) {
	worker.run();
	}
}
