class MyArray { // singleton object
	private int[] arr = new int[10];
	private static MyArray myArray; // static 이유 :

	private MyArray() {
	}

	public static MyArray getMyArrayReference() {
		// static 이유 :
		if (myArray == null) {
			myArray = new MyArray();
		}
		return myArray;
	}
	// private생성자는 내부에서 인스턴스 생성한다.

	public void setData(int idx, int data) {
		arr[idx] = data;
	}

	public int getData(int idx) {
		return arr[idx];
	}
}

/**
 * private생성자를 사용하는 이유 싱글톤 객체 만들때 외부에서 생성불가. 하나의 객체만 생성해서 공유하는 경우 하나 생성해서 외부에서
 * 가져다가만 쓸 수 있음
 * 
 */

public class PrivateConstructor {

	public static void main(String[] args) {
		MyArray ma1 = MyArray.getMyArrayReference();
		MyArray ma2 = MyArray.getMyArrayReference();
		System.out.println(ma1 == ma2);
		ma1.setData(0, 100);
		System.out.println(ma2.getData(0));

	}

}
