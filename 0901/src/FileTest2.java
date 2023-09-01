import java.io.File;

public class FileTest2 {

	public static void main(String[] args) {
		File f = new File("C:\\seeu\\downloads\\chapter_03.pdf");
		if (!f.exists() || !f.isDirectory()) {
			return;
		}
//		String[] files = f.list();
//		for (String file : files) {
//			System.out.println(file);
//		}

		File[] files1 = f.listFiles();
		int totLength = 0;
		totLength = ??
		for (File file : files1) {
			System.out.println(file.isDirectory() ? "[" + file.getName() + "]" : file.getName());

		}
		System.out.println(totLength);

	}

}
