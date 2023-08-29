import java.util.Scanner;

public class StringTest3 {

	public static void main(String[] args) {

		System.out.println("Y/N를 선택하세요. :");
		Scanner scanner = new Scanner(System.in);

		String answer = scanner.nextLine();

		if (answer.toLowerCase().equals("y")) {
			System.out.println("Yes를 선택하셨네요");
		} else if (answer.toUpperCase().equals("N")) {
			System.out.println("No를 선택함");
		}

		String str1 = " Hello World ".trim();
		// trim 문자열 앞 뒤 공백 제거한 결과 반환. 중간 공백은 제거되지 않는다.
		System.out.println(str1);

		Point p = new Point(10, 10);
		// 지정된 값을 문자열로 변환하여 반환
		// 참조변수의 경우 , toString()을 호출한 결과를 반환
		String str2 = String.valueOf(p); // 이것보다는 아래꺼를 더 선호한대 쌤은
		String str3 = "" + p;
		System.out.println(str2);
		System.out.println(str3);
	}

}
