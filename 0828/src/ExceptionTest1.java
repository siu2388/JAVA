
public class ExceptionTest1 {

	public static void main(String[] args) {
		String str = "hong";
		int[] arr = new int[5];
		try {
			System.out.println(str.toString()); // null인경우 에러~! NullPointerExceprion
			for (int i = 0; i < arr.length; i++) {
				arr[i] = i * 10;
			}
		} catch (NullPointerException e) {
			System.out.println("null 입니다.");
			System.out.println("예외메세지 : " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("종료");
		// ""이면 아무것도 안찍힘
		// String은 기본값을 null로 주지말고 "" 로 줘야에러가 안남.
	}

}

/*
 * null vs ""
 * 'A' 는 A가 하나 들어감
 * "A"는 A\null이 들어감
 * null 은 참조변수가 null 이 들어감
 * "" 데이터 저장영역에 \0이 들어감 주소는 str에 참조변수가 저장*/