<<<<<<< HEAD
package ex4;

public class ex10 {

	public static void main(String[] args) {
		// int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.

		int num = 12345;
		int sum = 0;

//		sum = sum + num % 10; // 5  12345를 10으로 나누면 나머지가 5가 되고,
//		num = num / 10; // 1234  num을 10으로 나눈 몫만 구하면 1234가 되니까
//		sum = sum + num % 10; // 4
//		num = num / 10; // 123
//		sum = sum + num % 10; // 3
//		num = num / 10; // 12
//		sum = sum + num % 10; // 2
//		num = num / 10; // 1
//		sum = sum + num % 10; // 1
//		num = num / 10; // 0

		while (true) {
			if (num == 0) { // 처음부터 num가 0이 들어올 수도 있으니까 앞에 써주는게 좋다.
				break;
			}
			sum = sum + num % 10;
			num = num / 10;
		}
		System.out.println("sum=" + sum);
	}

}
=======
package ex4;

public class ex10 {

	public static void main(String[] args) {
		// int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.

		int num = 12345;
		int sum = 0;

//		sum = sum + num % 10; // 5  12345를 10으로 나누면 나머지가 5가 되고,
//		num = num / 10; // 1234  num을 10으로 나눈 몫만 구하면 1234가 되니까
//		sum = sum + num % 10; // 4
//		num = num / 10; // 123
//		sum = sum + num % 10; // 3
//		num = num / 10; // 12
//		sum = sum + num % 10; // 2
//		num = num / 10; // 1
//		sum = sum + num % 10; // 1
//		num = num / 10; // 0

		while (true) {
			if (num == 0) { // 처음부터 num가 0이 들어올 수도 있으니까 앞에 써주는게 좋다.
				break;
			}
			sum = sum + num % 10;
			num = num / 10;
		}
		System.out.println("sum=" + sum);
	}

}
>>>>>>> branch 'main' of https://github.com/siu2388/JAVA.git
