package stugroup;

public class StuHw5 {

	public static void main(String[] args) {
		while(true) {
			int a = (int)(Math.random()*6) +1;
			int b = (int)(Math.random()*6) +1;
			System.out.print(a + " ");
			System.out.print(b + " ");
			int sum = a+b;
			if(sum==5) {
				break;
			}
		}
	}

}
