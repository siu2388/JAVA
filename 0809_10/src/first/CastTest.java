package first;

public class CastTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte bt = 10;
		int i = bt;
		// 자동 형변환

		int i1 = 11;
		// byte bt2 = i; 할당이 안됨
		byte bt2 = (byte) i; // 큰 -> 작은걸로 넣을 때는 형변환을 필수로 해야지

		float f = i; // int를 float으로 들어갈 때는 4byte라고 하더라도 float가 훨씬 큼
		int i2 = (int) f; // 소숫점 잘리면서 형변환 되어 들어감!

		double d = f;
		float f2 = (float) d; // 개발자가 손실되도 괜찮다고 인정할 때만 이렇게 해라.

		// long과 float운..? long이 float으로 자동 형변환이됨
		// byte -> short, char -> int -> long -> float -> double 은 자동 형변환
		// 반대방향은 수동형변환 필요

		// 팁
		// 변수명 네이밍할 때,타입과 변수명을 잘 설정하는 습관이 필요하다

	}

}
