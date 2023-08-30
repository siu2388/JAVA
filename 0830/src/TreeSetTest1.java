import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest1 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(1);
		ts.add(7);
		ts.add(5);
		ts.add(3);

		System.out.println(ts); // 자동 정렬이 되있음

		TreeSet<Person> pts = new TreeSet<Person>(new Comparator<Person>() {
			// 비교하는 것 둘 다 있으면 우선순위 Comparator > compareTo
			@Override
			public int compare(Person p1, Person p2) {
				return p1.age - p2.age; // 양수 or 음수로 리턴 내림차순
			}
		});
		pts.add(new Person("kim", 20));
		pts.add(new Person("lee", 10));
		pts.add(new Person("hong", 15));
		pts.add(new Person("park", 30));
		pts.add(new Person("park", 30)); // 중복데이터 삽입안됨
		System.out.println(pts);

		// 비교를 쓰기 때문에 compareTo를 override 정의를 해야됨
		System.out.println("======= subset(20~30대만) ");
		SortedSet<Person> subsetPerson = pts.subSet(new Person("", 20), new Person("", 40));
		System.out.println(subsetPerson);
	}

}
