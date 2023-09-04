package emp;

public abstract class Employee {
	int id;
	String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee() {
	} // 기본생성자

	public Employee(int id, String name) { // 생성자
		this.id = id;
		this.name = name;
	}

	public String info() { // 메서드
		return "사번:" + id + ",이름:" + name;
	}

	// 추상메서드 -> 추상메서드를 가진 클래스 ==추상클래스
	public abstract int getPay();
}
