package ex4;

public class ex15 {

	public static void main(String[] args) {
		int number = 12421;
		int tmp = number;
		int result = 0; // 변수 number를 거꾸로 변환해서 담을 변수

//		result = 1 :1
//		result = 1*10 +2  :12
//		result = 12 * 10 +3 : 123
//		
//		..
//		result = ((((1*10+2)*10+3)*10+2)*10 +1)

		while (tmp != 0) {
			result = result * 10 + tmp % 10;
			tmp /= 10; // 몫을 갱신하는 함수

			System.out.println("result : " + result);
		}
		System.out.println();
		if (number == result)
			System.out.println(number + "는 회문수 입니다.");
		else
			System.out.println(number + "는 회문수가 아닙니다.");
	}

}

//String.reverse()
