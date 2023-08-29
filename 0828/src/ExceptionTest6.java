import java.io.*;

public class ExceptionTest6 {
	static void method1() throws IOException, Exception {
		boolean flag = false; // true or false 따라 출력되는 예제 다름
		if (flag) {
			throw new IOException("입출력 예외	");
		} else {
			throw new Exception("모든 예외");
		}
	}

	public static void main(String[] args) {
//		try {
//			method1();
//		} catch (IOException e) {
//			e.printStackTrace(); // java.io.IOException: 입출력 예외
//			System.out.println(e.getMessage()); // "안에 적힌 메시지가 찍히고," -> 입출력 예외
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
