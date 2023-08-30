import java.util.ArrayList;

class Person implements Comparable<Person> {
	String name;
	int age;

	Person() {
	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "(" + name + "," + age + ")";
	}

	@Override
	public int compareTo(Person o) {
		return name.compareTo(o.name); // 이름순
//		return age - o.age;  // 나이순 
	}

	// 기본적으로 quicksorting
	// HashSetTest add에서 중복 값 안들어가게 오버라이딩
	// equls hashcode비교해서 같으면 안들어가는걸로 구현해보렴
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person == false) {
			return false;
		}
		Person p = (Person) obj;
		return name.equals(p.name) && age == p.age;
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
}

public class ArrayListTest1 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100); // Object 타입이니까
		int n = (Integer) al.get(0); // 꺼내서 쓸 때 Object -> Integer로 downcasting

		Integer in = 200;
		int in2 = in;
		/*
		 * 2
		 * .*/
		ArrayList al2 = new ArrayList();
		al2.add(new Person());
		Person p = (Person) al2.get(0);

		/*
		 *3
		 * */
		// 훨씬 더 많이 사용하게 될 표현 (generic)
		// generic 안에는 class만 가능!! Integer class (o), int(x)
		// compile시점에 클래스를 만들어줌 -> 사용하기 편하겠쥐
		ArrayList<Person> al3 = new ArrayList<>();
		al3.add(new Person());
		Person p2 = al3.get(0); // 다운캐스팅 할 필요가 없어지게됨

	}

}
