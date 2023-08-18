<<<<<<< HEAD

public class ContinueTest2 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) { // 4의 배수 ||7의 배수는 포함시키지 말자!
			if (i % 4 == 0 || i % 7 == 0)
				continue;
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
=======

public class ContinueTest2 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) { // 4의 배수 ||7의 배수는 포함시키지 말자!
			if (i % 4 == 0 || i % 7 == 0)
				continue;
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
>>>>>>> branch 'main' of https://github.com/siu2388/JAVA.git
