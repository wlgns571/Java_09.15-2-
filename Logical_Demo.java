package Iot_Java.day05;

public class Logical_Demo {
	public static void main(String[] args) {
		int min = 100;
		int max = 1000;
		int result = 0;
		result = (min > max) ? 100 : -100;
		// true�̸� 100�� ���� / false�̸� -100�� ����.
		System.out.println("result = " + result);
		System.out.println((min == max) && (min < max));
		// && <- ���ʿ� �ִ� ������ ������� Ʈ���϶� ���Ѵ�. [���� - and]
		System.out.println((min != max) || (min < max));
		System.out.println((min == max) || (min < max));
		// || <- �Ǵ�, �̶�� ����. [���� - OR]
		
	}
}