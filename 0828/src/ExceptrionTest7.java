import java.io.*;

/*
 * 예제 8-10 발전
 * */
public class ExceptrionTest7 {

	public static void main(String[] args) {
		File f = createFile(args[0]);
		System.out.println(f.getName() + "파일 이름이 유효하지 않습니다. ");
	}

	static File createFile(String fileName) {
		try {
			if (fileName == null || fileName.length() == 0) {
				throw new Exception("파일 이름이 유효하지 않습니다. ");
			}
		} catch (Exception e) {
			fileName = "temp.txt";
		} finally {
			File f = new File(fileName);
			// file객체의 createNewFile메서드를 이용해서 실제 파일을 생성한다.
			createNewFile(f);
			return f;
		}
	}

	static void createNewFile(File f) {
		try {
			f.createNewFile();
		} catch (Exception e) {
		}
	}
}
