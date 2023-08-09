package first;

public class MyInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//이름을 저장할 변수 선언하여 본인이름 할당
		String name = "Kimsiyou";
		//나이를 저장할 변수 선언하여 본인나이 할당
		int age=35;
			
		//키를 저장할 변수 선ㄴ언하여 본인 키 소숫점까지 할당
//		float height1 = 150.2f;
		double height = 150.2;
		//남여 구분을 저장할 변수를 선언하여 본인 성별 할당 'F' or 'M'
		char sex = 'F';
		System.out.println(String.format("%s, %d, %f, %c", name, age, height, sex));
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(height);
//		System.out.println(sex);

	}

}
