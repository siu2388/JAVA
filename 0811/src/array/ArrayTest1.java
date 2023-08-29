package array;

public class ArrayTest1 {

	public static void main(String[] args) {
		int[] arr1; // 레퍼런스만 잡은거임 (레퍼런스에는 시작주소가 저장) 더미값 들어가있음!

		int[] arr2 = new int[5]; // 배열의 값 은 0으로 자동 초기화 됩니당
		double[] darr1 = new double[5];
		// int 배열의 주소는 기본 4바이트( Byte)
		// double 배열의 레퍼런스주소는 4byte, 데이터 저장되있는 기본 8byte

		// 따라서 배열명의 주소 크기는 같다.
		// 버스가 32비트 = > 4바이트

		// 데이터의 사용
		arr2[0] = 1;
		arr2[1] = 2;
		// arr2[5] = 6; // java.lang.ArrayIndexOutOfBoundsException

		int sum = 0;
		for (int i = 0; i < arr2.length; i++) {
			sum = sum + arr2[i];
			System.out.println("1 : " + sum);
		}
		System.out.println(sum);
	}

}
