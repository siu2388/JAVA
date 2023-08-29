<<<<<<< HEAD
package ex4;

public class ex4 {

	public static void main(String[] args) {
		int sum = 0;
//		for (int i = 1;; i++) {
//			if (i % 2 == 0)
//				sum = sum + (-i);
//			else {
//				sum = sum + i;
//			}
//			if (sum >= 100)
//				break;
//		}
//		System.out.println(sum);

		int j;
		for (j = 1;; j++) {
			sum = sum + ((j % 2 == 0) ? -j : j);
			if (sum >= 100) {
				break;
			}
		}
		System.out.println("sum :" + sum + " , j : " + j);
	}

}

=======
package ex4;

public class ex4 {

	public static void main(String[] args) {
		int sum = 0;
//		for (int i = 1;; i++) {
//			if (i % 2 == 0)
//				sum = sum + (-i);
//			else {
//				sum = sum + i;
//			}
//			if (sum >= 100)
//				break;
//		}
//		System.out.println(sum);

		int j;
		for (j = 1;; j++) {
			sum = sum + ((j % 2 == 0) ? -j : j);
			if (sum >= 100) {
				break;
			}
		}
		System.out.println("sum :" + sum + " , j : " + j);
	}

}

>>>>>>> branch 'main' of https://github.com/siu2388/JAVA.git
// 어디가 틀린것이냐.... => 삼항 조건문의 괄호를 잘 따져봐야되는 것!