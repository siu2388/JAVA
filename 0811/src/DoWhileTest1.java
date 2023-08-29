<<<<<<< HEAD
import java.util.*;

public class DoWhileTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int in;
//		do {
//			in = sc.nextInt();
//			sum = sum + in;
//		} while (in != 0);
//		System.out.println("현재까지의 합 : " + sum);
		in = sc.nextInt();
		while (in != 0) {
			sum = sum + in;
			in = sc.nextInt();
		}
		System.out.println(sum);
	}

}
=======
import java.util.*;

public class DoWhileTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int in;
//		do {
//			in = sc.nextInt();
//			sum = sum + in;
//		} while (in != 0);
//		System.out.println("현재까지의 합 : " + sum);
		in = sc.nextInt();
		while (in != 0) {
			sum = sum + in;
			in = sc.nextInt();
		}
		System.out.println(sum);
	}

}
>>>>>>> branch 'main' of https://github.com/siu2388/JAVA.git
