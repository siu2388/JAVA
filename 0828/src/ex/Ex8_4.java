package ex;

public class Ex8_4 {
	static void method(boolean b) {
		try {
			System.out.println(1);
			if (b)
				throw new ArithmeticException();
			System.out.println(2);
		} catch (RuntimeException r) {
			System.out.println(3);
			return;
		} catch (Exception e) {
			System.out.println(4);
			return;
		} finally {
			System.out.println(5);
		}
		System.out.println(6);
	}

	public static void main(String[] args) {
		method(true);
		System.out.println("-----------");
		method(false);
	}
}

/*
 * 왜 method(true);일 떄는 6이 안찍히나?
 * 3 찍고 return 을 만나면 finally까지만 찍고 호출당한 메서드로 감.
 *  그래서 6이 안나옴 */
