package first;

public class ForTest5 {

	public static void main(String[] args) {
		int cnt = 5;
		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" "); // space
			}
			for (int j = 0; j < cnt - i; j++) {
				System.out.print("*"); // star
			}
			System.out.println();
		}

	}

}

//*****  i=0, sp:0,st5 (i,cnt-i)
// ****  i=1, sp:1,st4 
//  ***  i=2, sp:2,st3 
//   **  i=3, sp:3,st2 
//    *  i=4, sp:4,st1 