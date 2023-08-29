package ex5;

import java.util.*;

public class ArrayTest16 {
//파스칼 삼각형
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("행렬의 크기 : ");
		int size = sc.nextInt();
		int[][] matrix = new int[size][size];

		for (int i = 0; i < size; i++) {
			matrix[i][i] = 1;
		}
		for (int i = 1; i < size; i++) {
			for (int j = 0; j < i; j++) {
				matrix[i][j] = matrix[i - 1][j];
				if (j > 0) {
					matrix[i][j] += matrix[i - 1][j - 1];
				}
			}
		}
		for (int i = 0; i < size; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(String.format("%5d", matrix[i][j]));
			}
			System.out.println();
		}

//		Scanner sc = new Scanner(System.in);
//		int T = sc.nextInt();
//
//		for (int test_case = 1; test_case <= T; test_case++) {
//			int N = sc.nextInt();
//			int[][] pascal = new int[N][N];
//
//			for (int i = 0; i < N; i++) {
//				for (int j = 0; j <= i; j++) {
//					if (i == j) {
//						pascal[i][j] = 1;
//					} else if (j == 0) {
//						pascal[i][j] = 1;
//					} else {
//						pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
//					}
//				}
//			}
//
//			System.out.println("#" + test_case);
//
//			for (int i = 0; i < N; i++) {
//				for (int j = 0; j <= i; j++) {
//					System.out.print(pascal[i][j] + " ");
//				}
//				System.out.println();
//			}
//		}

	}

}
