package Iot_Java.day05;

public class Logical_Demo {
	public static void main(String[] args) {
		int min = 100;
		int max = 1000;
		int result = 0;
		result = (min > max) ? 100 : -100;
		// true이면 100이 저장 / false이면 -100이 저장.
		System.out.println("result = " + result);
		System.out.println((min == max) && (min < max));
		// && <- 양쪽에 있는 수식의 결과값이 트루일때 곱한다. [논리곱 - and]
		System.out.println((min != max) || (min < max));
		System.out.println((min == max) || (min < max));
		// || <- 또는, 이라고 생각. [논리합 - OR]
		
	}
}