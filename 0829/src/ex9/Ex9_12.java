package ex9;

public class Ex9_12 {

	public static void main(String[] args) {
		// 2~8 정수형 랜덤값 구하기
		int r = (int) Math.random() * (8 - 2 + 1) + 2;
		// (최대값-최소값 +1) +최소값 : 구간 사이에서 min 구하는 공식
		System.out.println(r); // 2
	}

}
