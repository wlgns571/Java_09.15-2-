package Iot_Java.day05;

import java.util.Scanner;

public class MinMax {
	public static void main(String[] args) {
		/*
		 * 문제: 두개의 정수를 입력받아(키보드입력-scan) 비교결과를 출력하는 
		 * 프로그램을 작성하시오.
		 * 입력예시1: num1 num2
		 *          100   24
		 * 출력예시1: 큰 숫자는 100이고, 작은 숫자는 24입니다.
		 * 
		 * 입력예시2: num1 num2
		 *          100  100
		 * 출력예시2: 두개의 숫자 100은 같습니다.
		 */
		int min;
		int max;
		// 변수명 규칙이 존재...보통 관례에 적용된다. (변수명 첫 글자는 소문자)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력해주세요");
		min = sc.nextInt(); // nextInt()는 텍스트 입력이 가능하게 해주는 명령
		
		System.out.println("두번째 숫자를 입력해주세요");
		max = sc.nextInt();
		
		if(min == max) {
			System.out.println("두개의 숫자 " + min + " 은(는) 같습니다.");
		} else if (min > max) {
			System.out.println("큰 숫자는 " + min + " 이고, 작은 숫자는 " + max + " 입니다.");
		} else {
			System.out.println("큰 숫자는 " + max + " 이고, 작은 숫자는 " + min + " 입니다.");
		}
		sc.close();
		
		System.out.println(min + " " + max);
	}
}
