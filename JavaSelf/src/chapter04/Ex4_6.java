package chapter04;

import java.util.Scanner;

public class Ex4_6 {

	public static void main(String[] args) {
		System.out.println("현재 월을 입력하세요 :");
		
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();  // 화면을 통해 입력받은 숫자를 month에 저장
		
		switch (month) {
		case 3:
		case 4:
		case 5: 
			System.out.println("현재 계절은 봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println("현재 계절은 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println("현재 계절은 가을입니다.");
			break;
		default : 
		// case 12: case 1: case 2:
			System.out.println("현재 계쩔은 겨울입니다.");
		}

	}

}

/*
 * switch문은 조건식을 먼저 계산한 다음 
 * 조건식의 결과와 일치하는 case 문으로 간다.
 * 이후 문장들을 수행 
 * break 문이나 switch문의 끝을 만나면 switch문  전체를 빠져나간다.
 * 
 * 일치하는 case문이 하나도 없다면 default문으로 이동
 * 
 * switch문의 
 * 1. 조건식 결과는 정수 또는 문자열!
 * 2. case문의 값은 정수 상수(문자 포함), 문자열만 가능하고 중복도지 않는다.
 * 
 * */
 