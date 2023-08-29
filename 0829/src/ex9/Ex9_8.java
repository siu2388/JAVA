package ex9;

public class Ex9_8 {
	static double round(double d, int n) {
		// round는 첫째자리에서 반올림하여 long을 반환한다.
		// Math.pow() :

		return (double) Math.round(d * Math.pow(10, n)) / Math.pow(10, n);

	}

	public static void main(String[] args) {
		System.out.println(round(3.1415, 1));
		System.out.println(round(3.1415, 2));
		System.out.println(round(3.1415, 3));
		System.out.println(round(3.1415, 4));
		System.out.println(round(3.1415, 5));

		System.out.println(String.format("%.2f", 3.158));
	}

}
/*
 * 반올림 하는법 (예 2자리까지 표시하는 반올림)
 * 1. Math.round
 * a*100
 * (double)Math.round(a*100)
 * (double)Math.round(a*100)/100
 *
 * 
 * 2. String.format
 * String.format("%.2f", a);
 * String.format("%2f", a); ->3.280000으로 나옴
 * 
 * 
 * */
