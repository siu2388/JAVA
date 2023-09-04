package chapter03;

public class Ex3_2 {

	public static void main(String[] args) {
		int i=5,j=0;
		
		j=i++; //j에 5가 대입이 되고, i가 6이 됨
		
		System.out.println("j="+j);
		System.out.println("i="+i);
		
		i=5;
		j=0;
		
		j = ++i;  // i가 6으로 증가한 후에 j에 대입이 됨
		
		System.out.println("j="+j);
		System.out.println("i="+i);
		
		i=5;
		j=5;
		
		System.out.println(i++); //5
		System.out.println(++j); //6
		System.out.println("j="+j);
		System.out.println("i="+i);
	}

}
