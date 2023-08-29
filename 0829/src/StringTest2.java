
public class StringTest2 {

	public static void main(String[] args) {
		String fruitStr = "apple,banana,pineapple,melon,strawberry";
		String[] fruitList = fruitStr.split(",");
		for (int i = 0; i < fruitList.length; i++) {
			System.out.println(fruitList[i]);

		}
		System.out.println(fruitList.length);
		System.out.println(fruitList.getClass().getName());
		System.out.println(fruitStr.indexOf("pine")); // 13
		System.out.println(fruitStr.substring(13, 22));
	}

}
