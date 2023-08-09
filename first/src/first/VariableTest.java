package first;

public class VariableTest {

	public static void main(String[] args) {
		char ch='A'; // char: 자료형 , 'A':리터럴데이터
		char up7;
		up7='7';
		byte b = -128;// -128 ~ 127
		int score = 100; //4bytes
		float f = 1.25f;
		double d = 3.14;
		boolean boo = true; //false;
		// 기본 자료형

		String str = "abc"; // 반드시 큰따옴표 , String(클래스임)이 있으면 객체지향 언어 
		
		final double pi = 3.14;
		//pi = 3.141; //final 변수는 변경 불가능한 상수  
		System.out.println(ch);
		System.out.println(up7);
		/*
		 * Naming Convention 
		 * 
		 * 1. 대소문자 구분! 길이 제한 없음
		 * 2. 예약어 사용금지  True 는 가능 (true불가)
		 * 3. 숫자로 시작은 안됨
		 * 4. 특수문자는 _ $ 만 허용
		 * 
		 * 권장사항 
		 * 1. 클래스 이름의 첫 글자는 항상 대문자 System = 클래스구나!
		 * 2. 변수와 메서드 이름의 첫 글자는 항상 소문자
		 * 3. CamelCase 
		 * 4. 상수 이름은 대문자! & 단어는 '_'로 구분 PI, MAX_NUMBER
		 * 
		 * 참조형 
		 * 기본형을 제외한 나머지 String, System 등...
		 * 실제 메모리에 주소값이 저장이 되는것!
		 * */
		
	}

}