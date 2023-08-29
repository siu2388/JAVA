<<<<<<< HEAD
package ex4;

public class ex6 {

	public static void main(String[] args) {
		// 두 개의 주사위를 던졌을 떄, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 출력하라.

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i + j == 6) {
					System.out.println(String.format("(%d,%d)", i, j));
				}
			}
		}

	}

}
=======
package ex4;

public class ex6 {

	public static void main(String[] args) {
		// 두 개의 주사위를 던졌을 떄, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 출력하라.

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i + j == 6) {
					System.out.println(String.format("(%d,%d)", i, j));
				}
			}
		}

	}

}
>>>>>>> branch 'main' of https://github.com/siu2388/JAVA.git
