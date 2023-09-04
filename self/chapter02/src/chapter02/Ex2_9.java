package chapter02;

/*
 * printf를 이용한 출력 
 * */
public class Ex2_9 {

	public static void main(String[] args) {
		String url = "www.example.com";
		float f1 = 0.10f;
		float f2 = 1e1f;
		float f3 = 3.14e3f;
		double d = 1.23456789;

		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);

		System.out.printf("d=%f\n", d);
		System.out.printf("d=%14.10f\n", d); // 전체자리.소수점아래자리 (14.10)
		System.out.printf("[12345678901234567890]\n");
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]\n", url); // 공백 존재시 기본 오른쪽정렬
		System.out.printf("[%-20s]\n", url); // 왼쪽정렬
		System.out.printf("[%.8s]\n", url); // 왼쪽에서 8글자만 출력

	}
}

/*
 * 실행결과
 * f1=0.100000, 1.000000e-01, 0.100000
 * f2=10.000000, 1.000000e+01, 10.0000
 * f3=3140.000000, 3.140000e+03, 3140.00
 * d=1.234568
 * d= 1.2345678900
 * [12345678901234567890]
 * [www.example.com]
 * [ www.example.com]
 * [www.example.com ]
 * [www.exam]
 */

/*
 * %f -> 실수형 값의 출력. 소수점 6자리까지만 출력 (7자리에서 반올림
 * %e -> 지수형태로 출력
 * %g -> 값을 간략하게 표현할 떄
 */
