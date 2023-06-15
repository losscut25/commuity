package stugroup;

public class StuHw20main {
	private static void printSound(StuHw20 soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}

}
