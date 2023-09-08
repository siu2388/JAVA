package service;

import java.util.Scanner;

public class BaseballService {

	// 팀등록
	public void teamRegister() {
		System.out.println("[팀등록]");
		System.out.println("팀 명 : ");
		String teamName = sc.nextLine();
		System.out.println("연고지 : ");
		String local = sc.nextLine();

		System.out.println();

	}
	// 특정팀조회
	// 팀전체목록조회

	// 선수등록
	public void playerRegister() {
		System.out.println("[선수등록]");
		System.out.println("선수명");
		String teamName = sc.nextLine();
		System.out.println("등번호");
		Integer backnum = Integer.parseInt(sc.nextLine());
		System.out.println("<팀선택>");
		// 1:SSG랜더스
		// 2:키움히어로즈
		// 처럼 팀 목록 조회를 한 번 더해서 보여주기. 그러면 그 번호를 보고 사용자가 선택할 수 있도록

	}

	// 특정선수조회 (by.이름)
	// 특정선수조회 (by.등번호)
	// 특정선수조회(by.디비등록된 선수번호)
	// 특정팀 소속 선수 목록 조회

	// ㅋㅋㅋ
	// 선수이적, 탈퇴

	Scanner sc = new Scanner(System.in);

	public int menu() {
		System.out.println("[야구 팀/선수 등록 및 조회");
		System.out.println("1.팀등록");
		System.out.println("2.특정 팀 조회");
		System.out.println("3.팀 목록 조회");
		System.out.println("==========================");
		System.out.println("4.선수등록");
		System.out.println("5.특정선수조회 (by.이름)");
		System.out.println("6.특정선수조회 (by.등번호)");
		System.out.println("7.특정선수조회(by.등록된 선수번호)");
		System.out.println("8.특정팀 소속 선수 목록 조회");
		System.out.println("선택 >>>");
		return Integer.parseInt(sc.nextLine());
	}
}
