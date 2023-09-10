package service;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

import dao.Dao;
import dao.PlayerDao;
import dao.TeamDao;
import dto.Player;
import dto.Team;

public class BaseballService {
	Scanner sc = new Scanner(System.in);
/*************
 * 메뉴 선택
 ************** */
	public int menu() {
		System.out.println("[야구 팀/선수 등록 및 조회]");
		System.out.println("1.팀등록");
		System.out.println("2.특정 팀 조회");
		System.out.println("3.팀 목록 조회");
		System.out.println("==========================");
		System.out.println("4.선수등록");
		System.out.println("5.특정선수조회 (by.이름)");
		System.out.println("6.특정선수조회 (by.등번호)");
		System.out.println("7.특정선수조회(by.등록된 선수번호)");
		System.out.println("8.특정팀 소속 선수 목록 조회");
		System.out.println("==========================");
		System.out.println("9.이제 그만 종료 빠잉~");
		System.out.println();
		System.out.print("선택 >>>>>> ");
		return Integer.parseInt(sc.nextLine());
	}

	//1. 팀등록
	public void teamRegister() {
		System.out.println("[팀등록]을 시작합니다.");
		
		Connection conn = Dao.getConnection();
		
		System.out.print("팀 명 : ");
		String teamName = sc.nextLine();
		System.out.print("연고지 : ");
		String local = sc.nextLine();
		
		// 팀명 중복 체크 후 없으면 새로운 팀으로 등록
		Team registeredTeam = TeamDao.selectTeam(conn, teamName);
		if(registeredTeam != null) {
			System.out.println("이미 등록된 팀입니다.");
			System.out.println();
		} else {
			int insertedTeam = TeamDao.insertTeam(conn, new Team(null,teamName,local));
			if(insertedTeam >0) {
				System.out.println(insertedTeam+"개의 팀이 등록되었습니다.");
				System.out.println();
			}
		Dao.close(conn);
		}
		
	}
	//2. 특정팀조회
	public void teamSearch() {
		Connection conn = Dao.getConnection();
		
		System.out.print("팀 명 : ");
		String teamName = sc.nextLine();
		
		Team team = TeamDao.selectTeam(conn, teamName);
		if(team == null) {
			System.out.println("등록된 팀이 없습니다. 먼저 팀 등록을 해주세요.");
			System.out.println();
			Dao.close(conn);
		}
		System.out.println(team);
		Dao.close(conn);
		
		System.out.println();
	}
	//3. 팀전체목록조회
	public void teamListSearch() {
		Connection conn = Dao.getConnection();
		
		System.out.println("팀 목록 :");
		List<Team> teamList = TeamDao.getTeamList(conn);
		for(Team team : teamList) {
			System.out.println(team);
		}
		Dao.close(conn);
	}

	//4. 선수등록
	public void playerEnroll() {
		Connection conn = Dao.getConnection();
		
		System.out.println("[선수등록]");
		System.out.print("선수명: ");
		String playerName = sc.nextLine();
		System.out.print("등번호: ");
		Integer backnum = Integer.parseInt(sc.nextLine());
		
		System.out.println("<팀선택>");
		List<Team> teamList = TeamDao.getTeamList(conn);
		for(Team team : teamList) {
			System.out.println(team);
		}
		Integer teamnum = Integer.parseInt(sc.nextLine());
		String teamname = PlayerDao.getTeamName(conn)
		
		int enrolledPlayer = PlayerDao.insertPlayer(conn, new Player(null,playerName,backnum,teamnum,));
		if(enrolledPlayer >0) {
			System.out.println(enrolledPlayer+"명의 선수를 등록했습니다.");
			System.out.println();
	
	}

	// 특정선수조회 (by.이름)
	// 특정선수조회 (by.등번호)
	// 특정선수조회(by.디비등록된 선수번호)
	// 특정팀 소속 선수 목록 조회

	// ㅋㅋㅋ
	// 선수이적, 탈퇴

	
}
