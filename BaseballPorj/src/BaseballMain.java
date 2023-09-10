import java.util.Scanner;

import service.BaseballService;

public class BaseballMain {
	
	public static void main(String[] args) {
		BaseballService baseball = new BaseballService();
		
		int selectMenu;
		while(true) {
			try {
				selectMenu =baseball.menu();
				if (selectMenu == 9) {
					break;
				}
				switch(selectMenu) {
					case 1:
						baseball.teamRegister();
						break;
					case 2:
						baseball.teamSearch();
						break;
					case 3:
						baseball.teamListSearch();
						break;
					case 4:
						baseball.playerEnroll();
						break;
						
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
