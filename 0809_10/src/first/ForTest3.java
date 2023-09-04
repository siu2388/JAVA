package first;

public class ForTest3 {

	public static void main(String[] args) {
//		char star = '*';
//		int i;
//		for (i = 1; i < 6; i++) {
//			System.out.print(star);
//		}
//		System.out.println();

//		int cnt = 5;
//		int j;
//		for (j = 1; j <= cnt; j++) {
//			for (i = 1; i < 6; i++) {
//				System.out.print(star);
//			}
//			System.out.println();
//		}

		int cnt = 5;
		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
