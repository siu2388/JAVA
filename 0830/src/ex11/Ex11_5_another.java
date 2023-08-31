package ex11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Person implements Comparable<Person> {
	String id;
	String name;
	int age;
	String address;

	Person(String id, String name, int age, String address) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	@Override
	public String toString() {
		return String.format("id:%s,이름:%s,나이:%d,주소:%s", id, name, age, address);
	}

	public int compareTo(Person p) {
//		if (p == null) {
//			return -1;
//		}
//		return this.id.compareTo(p.id);

		// 이름이 같으면 나이로 정렬
		int result = name.compareTo(p.name);
		if (result == 0) {
			result = p.age - age;
		}
		return result;
	}
}

public class Ex11_5_another {

	public static void main(String[] args) {
		ArrayList<Person> person = new ArrayList<>();
		person.add(new Person("870905", "김시유", 30, "경기도 김포시"));
		person.add(new Person("930119", "고영권", 31, "경기도 김포시"));
		person.add(new Person("900515", "김현준", 33, "인천시 남동구"));

		Collections.sort(person);
		Iterator<Person> it = person.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
