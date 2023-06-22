package stugroup;

public class StuHw29 {
	public static void main(String[] args) {
		Thread thread = new MovieThread();
		thread.start();
		
		try {Thread.sleep(1000);} catch(InterruptedException e) {}
		
		thread.interrupt();
	}

}
//StuHw29 클래스는 main 메서드를 포함하는 클래스로, 스레드를 생성하고 실행하는 역할을 합니다. 
//코드에서는 MovieThread 객체를 생성하고 start 메서드를 호출하여 스레드를 시작합니다. 
//그 후 Thread.sleep(1000)을 호출하여 1초간 스레드 실행을 일시적으로 중단합니다. 마지막으로 thread.interrupt()를 호출하여 스레드를 인터럽트합니다.