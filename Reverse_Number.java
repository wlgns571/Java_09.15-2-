package Iot_Java.day05;

import java.util.Scanner;

public class Reverse_Number {
	public static void main(String[] args) {
		//����: �Է¹��� ���ڸ� �Ųٷ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//�Է¿���: 2578
		//��¿���: 8752
		//������ 3���̻� �ʿ�
		//�Է¹��� ���ڸ� ������ ����
		//������� ������ ����
		//���������� ������ ����
		System.out.println("���ڸ� �Է����ּ���");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // �Է� ���� ���� ����
		int reversed = 0; //��� ���� ������ ����
		while(num != 0) {
			//1. ������ ������ ���� ��� ���ڸ� �ϳ��� ����
			int digit = num % 10;
			//2. 1���� ������ �ڸ����� ����(�̵� * 10)��Ű�鼭 ������� ����
			reversed = reversed * 10 + digit;
			//3. �����⸦ ���� ������ ���� ���� (����/10)
			num = num /10;
		}
		System.out.println(reversed);
		sc.close();
	}
}
