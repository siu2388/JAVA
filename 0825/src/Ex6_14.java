/*
 * 멤버변수의 초기화 1
 * iv & cv
 * 
 * 1. cv -> iv 초기화
 * 2.자동 초기화 -> 명시적 초기화 -> 초기화블럭, 생성자(복잡)*/
class Ex6_14 {
	//클래스 초기화 블럭
	static {
		System.out.println("static { }");
	}
	//인스턴스 초기화 블럭 
	{
		System.out.println("{ } ");
	}
	//Ex6_14 생성자
	public Ex6_14() {
		System.out.println("생성자");
	}

	public static void main(String[] args) {
		System.out.println("Ex6_14 bt = new Ex6_14();");
		Ex6_14 bt = new Ex6_14();
		
		System.out.println("Ex6_14 bt2 = new Ex6_14();");
		Ex6_14 bt2 = new Ex6_14();

	}
}
/*
 * Ex6_14가 메모리에 로딩될 떄, 클래스 초기화블럭이 가장 먼저 수행 
 * 그 다음에 main메서드가 수행되어 Ex6_14의 인스턴스가 생성되면서 인스턴스 초기화블럭이 수행 
 * 끝으로 생성자가 수행 .
 * 클래스 초기화 블럭은 처음 메모리에 로딩될 때 한번만 수행되었지만, 
 * 인스턴스 초기화 블럭은 인스턴스가 생성될 때 마다 수행되었음 */
