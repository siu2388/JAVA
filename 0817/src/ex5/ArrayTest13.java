//1 1 1 1 1
//1 2 3 4 5
//1 3 6 10 15
//1 4 10 20 35
//1 5 15 35 70
package ex5;

public class ArrayTest13 {

	public static void main(String[] args) {
		int[][] arr = new int[5][6];

		// 2. 첫 행을 1로 초기화
		for (int i = 0; i < arr[0].length; i++) {
			arr[0][i] = 1;
		}

		// 3. i=행,j=열
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[0].length; j++) {
				arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
			}
		}
		// 4. 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
