package first;

public class ForTest2 {

	public static void main(String[] args) {
		int i = 1;
		for (i = 1; i < 10; i++) {
			System.out.println(String.format("2 x %d = %2d", i, 2 * i));
			// System.out.println("2 * " + i + " = " + (2 * i));
		}
		int dan1 = 4;
		for (int j = 1; j < 10; j++) {
			System.out.println(String.format("%d x %d = %2d", dan1, j, dan1 * j));
		}

//		int dan;
//		for (dan = 2; dan <= 9; dan++) {
//			for (int k = 1; k < 10; k++) {
//
//				System.out.println(String.format("%d x %d = %2d", dan, k, dan * k));
//			}
//			System.out.println();
//		}
		int dan;
		for (int k = 1; k < 10; k++) {
			for (dan = 2; dan <= 9; dan++) {

				System.out.print(String.format("%d x %d = %2d\t", dan, k, dan * k));
			}
			System.out.println();
		}
	}
}
