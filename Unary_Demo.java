package Iot_Java.day05;

public class Unary_Demo {
	public static void main(String[] args) {
		int result = 10;
			System.out.println(+result); // 10
			System.out.println(-result); // -10
			
		result++; // 후위(나중에 한다는 의미) 증가연산자 result = result +1 / 11
		
			System.out.println(result);
			
		result--; // 후위 감소연산자 result = result -1
		
			System.out.println(result); // 10
			// 현재의 result 값을 넘겨주고 증가연산을 나중 수행.
			
			System.out.println(result++); // 10
			System.out.println("result++(11) " + result);
		
			System.out.println(result--); // 11
			System.out.println("result--(10) " + result);
			// 현재의 result 값을 넘겨주고, 감소연산을 나중 수행.
			
			System.out.println(--result); // 9
			// 감소연산을 먼저 수행하고, 변경된 result 값을 넘겨줌. (전위연산)
			
			System.out.println(++result); // 10
			// 증가연산을 먼저 수행하고, 변경된 result 값을 넘겨줌.
	}
}