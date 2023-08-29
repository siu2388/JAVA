/* 
 * 멤버변수의 초기화 2
 * */
class Ex6_15 {
	static int[] arr = new int[10]; // 명시적 초기화를 통해 배열 생성

	// 클래스 초기화 블럭을 이용해서 배열의 각 요소들을 임의의 값으로 채움
	static {
		for (int i = 0; i < 10; i++) { // 1~10사이의 임의의 값을 배열 arr에 저장
			arr[i] = (int) (Math.random() * 10) + 1;
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
	}
}
