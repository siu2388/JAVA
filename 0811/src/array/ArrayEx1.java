package array;

public class ArrayEx1 {

	public static void main(String[] args) {
		// 1. 이건 2차원 배열인데 이렇게 잘 안씀 //int[][] arr1;
		int[] arr1[];
		// 2.
		int[] arr2 = { 1, 2, 3 };
		// 3.
		int[] arr3 = new int[5];
		// 4.에러 ; 배열안에 숫자와 초기화 동시에 하면 안됨
		int[] arr4 = new int[5] { 1, 2, 3, 4, 5 };
		// 5.
		int[] arr5[];// 원래 이렇게 쓰면 안됨int[] arr5[5];
		// 6.2차원 배열
		int[] arr6[] = new int[3][];
	}

}
