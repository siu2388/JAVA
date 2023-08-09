package first;

public class StringPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1=10; // int v1=10, v2=20; 로 쓰는것도 가능
		int v2=20;
		
		int result = v1 + v2;
		System.out.println(result); // 30 숫자끼리 연산에는 + 연산 쓸 수 있어
		
		String str1 = "abc";
		String str2 = "def";
		//숫자가 하나라도 아닌 연산자의 덧셈 연결은
		String strResult = str1 + str2;
		System.out.println(strResult); //abcdef
		
		System.out.println(str1 + result); //abc30
		
		String seven = "7";
		char seven1 = '7';
		int seven2 = 7;
		System.out.println(seven+seven1+seven2); //777 seven이 문자열이기 때문에
		System.out.println(seven1+seven2); //62 '7'이 아스키코드로 55라서 
		System.out.println(seven1+seven2+seven); //62와 seven=7이 더해진거지
		//덧셈은 왼쪽에서부터 순서대로 연산이 된단다.
		System.out.println("7"+7+7);  //777
		System.out.println(7+7+"7");  //147
		
		
	}

}
