package first;

public class OperationTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		n++; // n=n+1;
		System.out.println(n);

		++n; // n=n+1;
		int m = 100;

		System.out.println(m++); // 100 찍히고 +1해서 101이 m에 저장
		System.out.println(++m); // 102 101에서 +1한 값이 m에 저장되고 찍힘

	}

}
