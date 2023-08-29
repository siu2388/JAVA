
public class ExceptionTest4 {

	public static void method1() throws Exception { // 호출한 메서드에게 런타임예외가 아닌 예외를 던질 떄 throws 사용
		String str = null;
		try {
			System.out.println(str.toString());

		} catch (NullPointerException e) {
			System.out.println("method1에서 처리 ");
			// throw e;
			throw new Exception("예외 다시 생성");
		}
	}

	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("main의 나머지부분 처리");
		// e.printStackTrace();예외발생 당시의 콜스택에 있었던 메서드의 정보 & 예외메시지 출력
	}

}
