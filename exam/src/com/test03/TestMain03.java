package com.test03;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TestMain03 {

	public static void main(String[] args) {
		String str = "1.22,4.12,5.93,8.71,9.34";

		List<String> list = new ArrayList<>();
		// 초기화
		double sum = 0.0;
		double avg = 0.0;

		StringTokenizer st = new StringTokenizer(str, ",");
		while (st.hasMoreTokens()) {
			list.add(st.nextToken());
		}
		for (String i : list) {
			double d = Double.parseDouble(i);
			sum += d;
		}
		avg = sum / (double) list.size();

		// 합계 평균 -> 소수점 4자리에서 반올림 -> 3자리 까지 표현
		sum = Math.round(sum * 10000.0) / 10000.0;
		avg = Math.round(avg * 10000.0) / 10000.0;

		// 합계 평균 -> 소수점 4자리에서 반올림 -> 3자리 까지 표현
		System.out.println("합 계: " + sum);
		System.out.println("평 균: " + avg);
	}
}
