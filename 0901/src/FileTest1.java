import java.io.File;

public class FileTest1 {

	public static void main(String[] args) {
		File f = new File("C:\\seeu\\downloads\\chapter_03.pdf");
		System.out.println(f.getName());
		System.out.println(f.getPath());
		System.out.println(f.getParent());
		// OS에서 사용하는 경로 구분자 윈도우';', 유닉스':'
		System.out.println(f.pathSeparator);

		System.out.println(f.pathSeparatorChar);

	}

}
