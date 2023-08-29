package ex9;

public class Ex9_4 {
	static void printGraph(int[] dataArr, char ch) {
		/*
		(1) printGraph메서드를 작성하시오.
		*/
		// 향상된 for문
		for (int n : dataArr) {
			for (int i = 0; i < n; i++) {
				System.out.print(ch);
			}
			System.out.println(n);
		}

		// 틀렸어임마 ㅋㅋ
//		for (int i = 0; i < dataArr.length; i++) {
//			for (int j = 0; j <= dataArr[i]; j++) {
//				System.out.print(ch + dataArr[i]);
//			}
//		}
	}

	public static void main(String[] args) {
		printGraph(new int[] { 3, 7, 1, 4 }, '*');
	}

}
