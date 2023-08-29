package chap6_0826;

public class Ex6_2 {

	public static void main(String[] args) {
		Student s = new Student("홍길동",1,1,100,60,76); 
		String str = s.info();
		System.out.println(str);
	}
	//실행결과
	//홍길동,1,1,100,60,76,236,78.7
}
class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	//생성자 - 인스턴스가 생성될 때 호출되는 '인스턴스 초기화 메서드'
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;    //this.ban = iv,  ban = lv
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	//info()메서드
	String info() {
		int tot = kor+eng+math;
		double avg = (double) (tot / 3); // Cast one operand to double for accurate division
		//((int)((kor+eng+math) / 3f * 10 + 0.5f) / 10f)

    return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + tot + "," + avg;
	}
}
//78.7 인데 78.0 이 나오잖아?
