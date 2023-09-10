package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dto.Team;

public class TeamDao {
	
	// create team
	public static int insertTeam(Connection conn,Team team) {
		int count = 0;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO team (name,local) values(?,?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, team.getName());
			pstmt.setString(2, team.getLocal());
		
			count = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
			return count;
	}

	public static Team selectTeam(Connection conn, String teamName) {
		String sql = "select * from team where lower(name) = lower(?)";
		
		Team team = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,teamName);
			rs = pstmt.executeQuery();
			
			if(rs!=null && rs.next()) {
				Integer num = rs.getInt("num");
				String name = rs.getString("name");
				String local = rs.getNString("local");
				
				team = new Team(num,name,local);
			}
		}	catch(Exception e) {
			e.printStackTrace();
		} finally {
      try {
          if (rs != null) rs.close();
          if (pstmt != null) pstmt.close();
      } catch (SQLException e) {
          e.printStackTrace();
      }
  }
		return team;
	}

	public static List<Team> getTeamList(Connection conn) {
		String sql="select * from team";
		
		List<Team> teamList = new ArrayList<>();
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs !=null) {
				while(rs.next()) {
					Integer num = rs.getInt(1);
					String name = rs.getString(2);
					String local = rs.getString(3);
					
					teamList.add(new Team(num,name,local));
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return teamList;
	}

}
