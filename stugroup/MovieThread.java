package stugroup;

public class MovieThread extends Thread {
	@Override
	public void run() {
		while(true) {
			System.out.println("동영상을 재생합니다.");
			if(this.isInterrupted()) {
				break;
			}
		}
	}
}
// Thread 클래스는 이미 Runnable 인터페이스를 구현하고 있으므로, Thread 클래스를 상속받아 새로운 스레드를 생성할 수 있습니다. 
//Thread 클래스는 Runnable 인터페이스의 추상 메서드인 run() 메서드를 구현하고 있기 때문에, 해당 메서드를 재정의하여 원하는 동작을 구현할 수 있습니다.
//MovieThread 클래스는 Thread 클래스를 상속받은 사용자 정의 스레드 클래스입니다.
//run 메서드를 오버라이딩하여 스레드가 실행될 때 수행할 작업을 정의합니다.
//해당 코드에서는 계속해서 "동영상을 재생합니다."라는 메시지를 출력하고, 스레드가 인터럽트되면 루프를 탈출합니다.