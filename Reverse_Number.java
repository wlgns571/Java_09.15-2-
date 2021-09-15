package Iot_Java.day05;

import java.util.Scanner;

public class Reverse_Number {
	public static void main(String[] args) {
		//문제: 입력받은 숫자를 거꾸로 출력하는 프로그램을 작성하시오.
		//입력예시: 2578
		//출력예시: 8752
		//변수가 3개이상 필요
		//입력받은 숫자를 저장할 변수
		//결과값을 저장할 변수
		//나머지값을 저장할 변수
		System.out.println("숫자를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // 입력 숫자 저장 변수
		int reversed = 0; //결과 숫자 저장할 변수
		while(num != 0) {
			//1. 나머지 연산을 통해 결과 숫자를 하나씩 추출
			int digit = num % 10;
			//2. 1번의 값들을 자릿수를 변경(이동 * 10)시키면서 결과값을 구성
			reversed = reversed * 10 + digit;
			//3. 나누기를 통해 원래의 숫자 변경 (내림/10)
			num = num /10;
		}
		System.out.println(reversed);
		sc.close();
	}
}
