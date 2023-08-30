class Data<T> {
	T data; // 아직 미정

	void setData(T data) {
		this.data = data;
	}

	T getData() {
		return data;
	}
}

public class GenericTest {

	public static void main(String[] args) {
		// 실제 사용할 때 데이터타입 결정됨
		Data<String> d = new Data<>();
		d.setData("kim");
		String s = d.getData();
		System.out.println("d :" + s.toUpperCase());

		Data<Integer> d2 = new Data<>();
		d2.setData(200);
		int n = d2.getData();
		System.out.println("d2 :" + n);

		// d2!=d; 다른 타입으로 생성된 제네릭 객체는 동일한 클래스가 아니다.(상속관계도 아님)

		Data<Person> d3 = new Data<>();
		d3.setData(new Person("siyou", 30));
		Person p = d3.getData();
		System.out.println("d3 : " + p);

		Data<Person> d4 = new Data<>();
		// d3==d4; // 같은 타입으로 생성된 제네릭 객체는 동일한 클래스다.
	}

}
