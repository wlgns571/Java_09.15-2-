package Iot_Java.day05;

public class Unary_Demo {
	public static void main(String[] args) {
		int result = 10;
			System.out.println(+result); // 10
			System.out.println(-result); // -10
			
		result++; // ����(���߿� �Ѵٴ� �ǹ�) ���������� result = result +1 / 11
		
			System.out.println(result);
			
		result--; // ���� ���ҿ����� result = result -1
		
			System.out.println(result); // 10
			// ������ result ���� �Ѱ��ְ� ���������� ���� ����.
			
			System.out.println(result++); // 10
			System.out.println("result++(11) " + result);
		
			System.out.println(result--); // 11
			System.out.println("result--(10) " + result);
			// ������ result ���� �Ѱ��ְ�, ���ҿ����� ���� ����.
			
			System.out.println(--result); // 9
			// ���ҿ����� ���� �����ϰ�, ����� result ���� �Ѱ���. (��������)
			
			System.out.println(++result); // 10
			// ���������� ���� �����ϰ�, ����� result ���� �Ѱ���.
	}
}