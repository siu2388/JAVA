package first;

public class WhileTest3 {

	public static void main(String[] args) {
//		int sum = 0, i = 0;
//		while (sum < 100) {
//			i++;
//			sum = sum + i;
//			if (sum > 100) {
//				System.out.println("처음 100보다 커지는 i :" + i);
//				System.out.println("그 때의 합 : " + sum);
//			}
//		}

		int sum = 0, i = 0;
		while (true) {
			sum = sum + i;
			if (sum > 100) {
				break;
			}
			i++;
		}
		System.out.println("처음 100보다 커지는 i :" + i);
		System.out.println("그 때의 합 : " + sum);

		// for문의 무한반복은?
		for (int k = 1;; k++) {
			sum = sum + k;
			if (sum >= 100)
				break;
		}
		System.out.println("처음 100보다 커지는 i :" + i);
		System.out.println("그 때의 합 : " + sum);
	}

}
