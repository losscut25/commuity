package stugroup;
//메서드 구현 클래스
public class Anonymous {
	StuHw22 field = new StuHw22() {
	@Override
	public void start() {
		System.out.println("디자인을 시작합니다");
	}
};	
	void method1() {
		StuHw22 localVar = new StuHw22() {
			@Override
			public void start() {
				System.out.println("개발을 합니다.");
			}
		};			
				localVar.start();	
	}	
	void method2(StuHw22 worker) {
	worker.start();
	}
//	void method2() {
//	StuHw22 worker = new StuHw22() {
//		@Override
//		public void start() {
//			System.out.println("테스트를 합니다.");
//		}
//	};
////	worker.start();
//}
}
	
