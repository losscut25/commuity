package stugroup;

import java.util.Scanner;

public class StuHw3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 수 :");
		float a = sc.nextFloat();
		System.out.println("두 번째 수 :");
		float b = sc.nextFloat();
		float divide = a/b;
		if(b==0 || b==0.0) {
			System.out.println("결과: 무한대");
		}
		else {
			System.out.println("결과:"+divide);
		}
	}

}
