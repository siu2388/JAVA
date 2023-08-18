/*
		 * 학생 3명의 국어, 영어, 수학 점수를 입력받아 학생별 총점과 과목별 합계를 
		 * 아래와 같이 출력하는 프로그램을 작성하시오.
		 * 입력:
		 * <1번째 학생의 점수>
		 * 국어:95
		 * 영어:100
		 * 수학:88
		 * <2번째 학생의 점수>
		 * 국어:85
		 * 영어:60
		 * 수학:93
		 * <3번째 학생의 점수>
		 * 국어:66
		 * 영어:99
		 * 수학:88
		 * 
		 * 출력: 
		 *    국어 영어 수학 총점 평균
		 * 1번 95 100 88 283
		 * 2번
		 * 3번
		 * 합계 246 259 269 774
		 * 평균 
		 */
package ex5;

import java.util.*;

public class ArrayTest12 {

	public static void main(String[] args) {

		int[][] scores = new int[5][5];
		int[] score = new int[3];
		String[] lecture = { "국어", "영어", "수학" };

		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 3; i++) {
			System.out.println(String.format("<%d번째 학생의 점수>", i));
			for (int j = 0; j < lecture.length; j++) {
				System.out.print(String.format("%s :", lecture[j]));
				score[j] = sc.nextInt();
			}
		}
		System.out.println("\t 국어 영어 수학 총점 평균");
		for (int i = 0; i < scores.length - 2; i++) {
			System.out.println(String.format("%d번 %d %d %d", i + 1, score[0], score[1], score[2]));

		}

	}

}
