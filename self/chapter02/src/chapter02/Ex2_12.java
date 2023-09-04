package chapter02;

//타입 간의 변환방법
public class Ex2_12 {

	public static void main(String[] args) {
		String str = "3";

		// 숫자 -> 문자  - 숫자에 '0' 더함
		System.out.println(str.charAt(0) - '0');
		// 문자를 숫자로 변환 - '0'
		System.out.println('3'-'0'+1);  //4
		//문자열 숫자로 변환 -> Integer.parseInt() or Double.parseDouble()
		System.out.println(Integer.parseInt(str)+1);
		// 문자열 + 정수 = 문자열더하기
		System.out.println("3"+1);  //31
		//숫자를 문자로 변환 -> '0'을 더함
		System.out.println((char)(3+'0')); //3
		
	}

}

/*
 * 1. 숫자 -> 문자 ==숫자에 '0'을 더한다
 * 2. 숫자 -> 문자열 ==숫자에 빈 문자열("")을 더한다.

 * 3. 문자 -> 숫자 == 문자에서 '0'을 뺀다.
 * 4. 문자열 -> 숫자 == Integer.parseInt() 또는 Double.parseDouble()
 * 
 * 5. 문자열 -> 문자 == charAt(0)
 * 6. 문자 -> 문자열 == 빈 문자열 ("")더한다.
 * */
