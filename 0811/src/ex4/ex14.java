package ex4;

import java.util.*;

public class ex14 {

	public static void main(String[] args) {
	// 1~100사이의 임의의 값을 얻어서 answer에 저장한다. 
		int answer = (int)(Math.random()*100)+1; 
		int input = 0; // 사용자입력을 저장할 공간 
		int count = 0; // 시도횟수를 세기위한 변수 
		// 화면으로 부터 사용자입력을 받기 위해서 Scanner클래스 사용
		Scanner s = new java.util.Scanner(System.in);
		do {
			if(count==0) {
				System.out.println("1과 100사이의 값을 입력하세요. : ");
			} else {
				if(input > answer) {
				System.out.println("입력한 값보다 작습니다.");
			} else {
				System.out.println("입력한 값보다 큽니다.");
			}}
		count++;
		input = s.nextInt(); // 입력받은 값을 변수 input에 저장한다.
		if(answer==input) {
			System.out.println("정답! "+count+ "만에 맞췄어요!");
			break;
		} while(true); // 무한반복문
}