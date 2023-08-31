import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest1 {

	public static void main(String[] args) {
		FileReader fis = null;
		// 성능을 좋게하기 위해서
		BufferedReader br = null;
		try {
			fis = new FileReader("news.txt");
			br = new BufferedReader(fis);
			int data;
			while ((data = fis.read()) != -1) {// read 해온 값을 data에 담은 뒤 그게 -1이 아니면
				System.out.print((char) data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
