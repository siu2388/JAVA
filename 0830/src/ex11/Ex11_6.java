package ex11;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

class Student implements Comparable<Student> {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
	}

	public int compareTo(Student s) { // default: 이름 기본정렬
		if (s instanceof Student) {
			return name.compareTo(s.name);
		} else {
			return -1;
		}
	}
} // End class Student

public class Ex11_6 {

	static int getGroupCount(TreeSet<Student> tset, int from, int to) {
		// SortedSet extends Set -> subset 60<=x<70
		SortedSet<Student> ss = tset.subSet(new Student("", 0, 0, from, from, from), new Student("", 0, 0, to, to, to));
		return ss.size();

	}

	public static void main(String[] args) {
		TreeSet<Student> set = new TreeSet<Student>(new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) { // 국,영,수 평균
				// #1.평균으로 대소비교하면 소수점이 발생할 수 있어서 if - elseif 사용해서 1,0,-1로 나눔
//				if (s1.getAverage() - s2.getAverage() > 0) {
//					return 1;
//				} else if (s1.getAverage() - s2.getAverage() == 0) {
//					return 0;
//				} else
//					return -1;

				// #2.getTotal로 대소비교할 수 도 있음
				return s1.getTotal() - s2.getTotal();
			}
		});
		// TreeSet<Student> set = new TreeSet<>();
		set.add(new Student("홍길동", 1, 1, 100, 100, 100));
		set.add(new Student("남궁성", 1, 2, 90, 70, 80));
		set.add(new Student("김자바", 1, 3, 80, 80, 90));
		set.add(new Student("이자바", 1, 4, 70, 90, 70));
		set.add(new Student("안자바", 1, 5, 60, 100, 80));

		Iterator<Student> it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());

		System.out.println("[60~69] :" + getGroupCount(set, 60, 70));
		System.out.println("[70~79] :" + getGroupCount(set, 70, 80));
		System.out.println("[80~89] :" + getGroupCount(set, 80, 90));
		System.out.println("[90~100] :" + getGroupCount(set, 90, 101));
	}

}
