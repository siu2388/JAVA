package chapter02;

import java.util.Scanner;

// 화면으로부터 입력받기 

public class Ex2_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 입력받기 Scanner class

		System.out.println("두자리 정수를 하나 입력해주세요 >> ");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input); // 문자열을 숫자로 반드시 반환해야 숫자형으로 쓸 수 있다.

		System.out.println("입력내용:" + input);
		System.out.printf("num = %d\n", num);

		System.out.println("한자리 정수를 하나 입력해주세요 >> ");
		int inputInt = scanner.nextInt();
		System.out.println("입력된 숫자 : " + inputInt);
		System.out.println(inputInt + 30);
	}

}

// nextLine() -> 입력대기 상태에서 사용자가 입력 후 엔터키를 누르면 입력한 내용이 문자열로 반환된다.

//nextInt() or nextFloat() 처럼 변환없이 숫자로 바로 입력받을 수 있는 메서드들도 있다. 