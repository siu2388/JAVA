package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import dto.Player;
import dto.Team;

public class PlayerDao {
	
	public static int insertPlayer(Connection conn,Player player) {
		int count = 0;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO player (name,backnum,teamnum) values(?,?,?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, player.getName());
			pstmt.setInt(2, player.getBacknum());
			pstmt.setInt(3, player.getTeamnum());
		
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

//	public List<Player> selectPlayerByName(String name) {
//		List<Player> playerList = new ArrayList<>();
//		return playerList;
//		
//		public List<Player> selectPlayerByBackNum(Integer backnum) {
//			List<Player> playerListByBackNum = new ArrayList<>();
//			return playerListByBackNum;
//		}
//		
//		public Player selectPlayerByNum(Integer num) {
//			Player player = null;
//			return player;
//		}
//		
//		public List<Player> selectPlayerByTeamName(String teamName) {
//			List<Player> playerList = new ArrayList<>();
//			return playerList;
//		}

	}

