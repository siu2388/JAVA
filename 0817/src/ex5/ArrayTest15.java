package ex5;

import java.util.*;

public class ArrayTest15 {

	public static void main(String[] args) {
// 입력 데이터 수 : 5 받아서 
		/*
		 * 출력 최소값: x 최대값: y
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("입력 데이터 수 : ");

		int cnt = sc.nextInt();
		int[] arr = new int[cnt];

		for (int i = 0; i < cnt; i++) {
			arr[i] = sc.nextInt();
		}
		int min = arr[0];
		int max = arr[0];

		for (int i = 1; i < cnt; i++) {
			// 최소값 비교하기
			if (min > arr[i]) {
				min = arr[i];
			}
			// 최대값 비교하기
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("최소값 : " + min);
		System.out.println("최대값 : " + max);
	}

}
