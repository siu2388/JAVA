package ex4;

public class ex12 {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {
			for (int dan = 2; dan <= 4; dan++) {
				System.out.print(String.format("%d x %d = %2d\t", dan, i, dan * i));
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 1; i <= 3; i++) {
			for (int dan = 5; dan <= 7; dan++) {
				System.out.print(String.format("%d x %d = %2d\t", dan, i, dan * i));
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 1; i <= 3; i++) {
			for (int dan = 8; dan <= 9; dan++) {
				System.out.print(String.format("%d x %d = %2d\t", dan, i, dan * i));
			}
			System.out.println();
		}
	}

}
