package Iot_Java.day05;

import java.util.Scanner;

public class MinMax {
	public static void main(String[] args) {
		/*
		 * ����: �ΰ��� ������ �Է¹޾�(Ű�����Է�-scan) �񱳰���� ����ϴ� 
		 * ���α׷��� �ۼ��Ͻÿ�.
		 * �Է¿���1: num1 num2
		 *          100   24
		 * ��¿���1: ū ���ڴ� 100�̰�, ���� ���ڴ� 24�Դϴ�.
		 * 
		 * �Է¿���2: num1 num2
		 *          100  100
		 * ��¿���2: �ΰ��� ���� 100�� �����ϴ�.
		 */
		int min;
		int max;
		// ������ ��Ģ�� ����...���� ���ʿ� ����ȴ�. (������ ù ���ڴ� �ҹ���)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ���ڸ� �Է����ּ���");
		min = sc.nextInt(); // nextInt()�� �ؽ�Ʈ �Է��� �����ϰ� ���ִ� ���
		
		System.out.println("�ι�° ���ڸ� �Է����ּ���");
		max = sc.nextInt();
		
		if(min == max) {
			System.out.println("�ΰ��� ���� " + min + " ��(��) �����ϴ�.");
		} else if (min > max) {
			System.out.println("ū ���ڴ� " + min + " �̰�, ���� ���ڴ� " + max + " �Դϴ�.");
		} else {
			System.out.println("ū ���ڴ� " + max + " �̰�, ���� ���ڴ� " + min + " �Դϴ�.");
		}
		sc.close();
		
		System.out.println(min + " " + max);
	}
}
