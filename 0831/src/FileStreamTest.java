import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		// 파일과 관련된 stream을 쓰는 방법
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		// fis에서 한 바이트씩 읽어서 fos로 복사하겠다!
		try {
//			fis = new FileInputStream("news.txt");
//			fos = new FileOutputStream("news2.txt");

//			int data;
//			while ((data = fis.read()) != -1) {
//				fos.write(data);

			// 파일과 관련된 stream을 쓰는 방법
			fis = new FileInputStream("cat.jpg");
			fos = new FileOutputStream("catcopy.jpg");
			// 1차 스트림의 보조스트림을 꽂음
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			// 보조스트림이 닫히면 꼽힌 1차스트림까지 닫힘
			// End

			// 채워져있는 바이트 만큼만 읽어와!
			byte[] buff = new byte[100];
			int len;
			while ((len = fis.read(buff)) > 0) {
				fos.write(buff, 0, len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
