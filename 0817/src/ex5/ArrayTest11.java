package ex5;

import java.util.*;

public class ArrayTest11 {

	public static void main(String[] args) {
		/*
		 * 100미만의 양의 정수들이 주어진다. 입력받다가 0이 입력되면 마지막에 입력된 0을 제외하고 그 떄까지 입력된 정수의 십의 자리 숫자가
		 * 각각 몇 개인지 작은 수부터 출력하는 프로그램을 작성하시오.(0개인 숫자는 출력하지 않는다.)
		 */
		System.out.print("1~100 사이의 숫자를 입력 :");
//배열 생성
		int[] cnt = new int[10]; // 배열의 길이 설정
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int num = n / 10; // 10의 자리 추출

			cnt[num]++;

			for (int i = 0; i < cnt.length; i++) {
				if (cnt[i] > 0) {
					System.out.println(String.format("%d : %d", i, cnt[i]));
				}
			}
		}

	}
}