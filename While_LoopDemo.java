package Iot_Java.day05;

import java.util.Scanner;

public class While_LoopDemo {
	public static void main(String[] args) {
		int dan;
		int cnt = 1;
		System.out.println("����� ���� �Է��� �ּ���: ");
		Scanner sc = new Scanner(System.in);
		dan = sc.nextInt();
		while(cnt < 10) { // while(expr){}
			System.out.printf("%d * %d = %d\n", dan, cnt, (dan * cnt));
			cnt++;
		} // \n = �ٹٲ�
		
		cnt = 0;
		while(cnt < 9) { // while(expr){}
			cnt++;
			System.out.printf("%d * %d = %d\n", dan, cnt, (dan * cnt));
		}
		sc.close();
		
	}
}