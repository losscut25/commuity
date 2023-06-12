package stugroup;

import java.util.Scanner;

public class StuHw2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("[필수 정보 입력]");
		System.out.println("1. 이름 : --------");
		String name = sc.next();
		System.out.println("2. 주민번호 앞 6자리 : ---------");
		String bn = sc.next();
		System.out.println("3. 전화번호 : -------");
		String call = sc.next();
		
		System.out.println();
		System.out.println("[필수 정보 입력]");
		System.out.println("1. 이름 : --------" + name);
		System.out.println("2. 주민번호 앞 6자리 : ---------" + bn);
		System.out.println("3. 전화번호 : -------" + call);
	}
}
