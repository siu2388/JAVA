package ex5;

import java.util.*;

public class ArrayTest14 {

	public static void main(String[] args) {
		// 입력 데이터 수 : 5 를 입력받아서
		// 출력을 배열의 올림차순으로 정렬해서 보여주기
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 데이터 수 : ");
		int cnt = sc.nextInt();

		// 1차원 배열 생성
		int[] arr = new int[cnt];
		int size = arr.length;
		// 개수만큼 받아서 1차원 배열로 넣어주기
		for (int i = 0; i < cnt; i++) {
			arr[i] = sc.nextInt();
		}

		// 정렬 알고리즘이 나와 있으니 나와있는 정렬알고리즘을 사용 - quick sort, 버블정렬,삽입정렬,선택정렬...
		// 그 중 버블정렬 사용할 것
		// sorting은 원본을 바꾸는 것
		for (int i = 0; i < size - 1; i++) { // 마지막보다 하나 덜 가야 마지막꺼랑 비교하는게 되서
			for (int j = 0; j < size - -1 - i; j++) { // 옆자리 숫자와 비교
				int a = arr[j];
				int b = arr[j + 1];
				if (a > b) { // > 오름차순
					int tmp = a;
					a = b;
					b = tmp;
				}
			}
		}
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");

		}

	}

}
