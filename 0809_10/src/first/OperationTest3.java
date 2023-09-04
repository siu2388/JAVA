package first;

public class OperationTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10 / 4); // 2
//정수/정수 의 결과도 정수로 나와서 결과값이2
		System.out.println(10.0 / 4); // 2.5
		System.out.println((float) 10 / 4); // 2.5

		// int보다 크기가 작은 타입은 int로 변환한다!
		// 피연산자 중 표현범위가 큰 타입으로 형변환 한다.

		int kor = 90, eng = 88, math = 100;
		int total = kor + eng + math;
		double avg = total / 3;
		System.out.println("총점" + total + ", 평균:" + avg);

		int mod = 10 % 4; // 나머지 구하기
		System.out.println(mod);

		byte a = 10;
		byte b = 20;
		byte c = (byte) (a + b); // byte + byte = int 가 나오니까
		// byte로 형변환이 필요함
		System.out.println(c);

		int i1 = 100000;
		int i2 = 200000;
		long res = i1 * (long) i2; // i1*i2를 계산할 때 이미 int라서 overfolw가 나서 계산할 때 이미 오류가 난거
		System.out.println(res); // -1474836480 잉??

		long i3 = 100000 * 100000L;
		System.out.println(i3);

		int i4 = 100000 * 100000 / 100000;
		System.out.println(i4); // 14100 ;이미 곱하기를 할 때, overflow가 일어나기 때문에 오류가 나는거임

		int i5 = 100000 / 100000 * 100000;
		System.out.println(i5); // 14100 ;이미 곱하기를 할 때, overflow가 일어나기 때문에 오류가 나는거임

	}

}
