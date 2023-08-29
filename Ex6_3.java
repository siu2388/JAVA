package chap6_0826;

public class Ex6_3 {

	public static void main(String[] args) {
		Student1 s = new Student1();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println("이름 : " + s.name);
		System.out.println("총점 : " + s.getTotal());
		System.out.println("평균 : " + s.getAverage());
	}
}

class Student1 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Student1() {
	} // 기본 생성자
	// 매개변수가 있는 생성자

	Student1(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// 메서드1
	int getTotal() {
		return kor + eng + math;
	}

	// 메서드2
	float getAverage() {
		return (int) (getTotal() / 3f * 10 + 0.5f) / 10f;

	}
}
/*
 * 총점의 타입이 int이기 때문에 3으로 나누면 int가 얻어진다. (소수점 이하 값 버려짐) 3f로 나눠서 소수점 이하 값들 얻음. 소수점
 * 둘째 자리에서 반올림 => 10을 곱하고 0.5를 더한 다음 다시 10f로 나눈다. (int)(236 / 3f * 10 + 0.5) /
 * 10 → 78 (int)(236 / 3f * 10 + 0.5) / 10f → 78.7
 */
