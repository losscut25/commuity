package stugroup;

import java.util.Scanner;

public class StuHw9 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		int max = 0;
		int min = 0;
		String Num = null;
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			Num = sc.nextLine();
			switch (Num) {
			case "1":
				System.out.print("예금액 >");
				balance = sc.nextInt();
				max = balance;
				System.out.println("예금액 >" + balance);
				break;
			case "2":
				System.out.print("출금액 >");
				balance = sc.nextInt();
				System.out.println("출금액>" + balance);
				break;
			case "3":
				min = max - balance;
				System.out.println("잔고>" + min);
				break;

			case "4":
				run = false;
				System.out.println("종료");
				break;
			}
		}
	}

}
