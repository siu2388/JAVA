import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnect {

	// DB connection
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver"); // driver 설정
			// db연결
			conn = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/kosta", "root", "1234");
			System.out.println("😎😎DB연결 성공!😎😎");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	// DB Close
	public static void close(Connection conn) {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// insertUser 메서드로 분리
	public static void insertUser(String id, String name) {
		Connection conn = getConnection();
		Statement stmt = null;

		String sql = String.format("INSERT INTO user (id, name) values('%s','%s')", id, name);

		try {
			stmt = conn.createStatement();
			int insertedCount = stmt.executeUpdate(sql);
			System.out.println(insertedCount + "개 데이터 삽입");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			close(conn);
		}
	}

	// update
	public static void updateUserName(String id, String name) {
		Connection conn = getConnection();
		Statement stmt = null;

		String sql = String.format("update user set name='%s' where id='%s'", name, id);

		try {
			stmt = conn.createStatement();
			int updatedCount = stmt.executeUpdate(sql);
			System.out.println(updatedCount + "개 데이터 업뎃완료");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			close(conn);
		}
	}

	// delete
	public static void deleteUser(String id) {
		Connection conn = getConnection();
		Statement stmt = null;

		String sql = String.format("delete from user where id='%s'", id);

		try {
			stmt = conn.createStatement();
			int deletedCount = stmt.executeUpdate(sql);
			System.out.println(deletedCount + "개 데이터삭제 빠잉~");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			close(conn);
		}
	}

	// read - select 한명의 유저
	public static void userInfo(String id) {
		Connection conn = getConnection();
		Statement stmt = null;

		ResultSet rs = null;
		try {
			String sql = String.format("select * from user where id='%s'", id);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs != null && rs.next()) {
				String resultId = rs.getString("id");
				String resultName = rs.getString("name");
				System.out.println(resultId + "의 이름은 " + resultName + "입니둉.");
			}
		} catch (Exception e) {
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
			close(conn);
		}
	}

	// read --전체 user 조회
	public static void allUserInfo() {
		Connection conn = getConnection();
		Statement stmt = null;

		ResultSet rs = null;
		try {
			String sql = String.format("select * from user");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			// point!!========================================
			if (rs != null) {
				while (rs.next()) {
					String resultId = rs.getString(1);
					String resultName = rs.getString(2);
					System.out.println("id:" + resultId + "의 이름은 " + resultName + "입니둉.");
				}
			}
		} catch (Exception e) {
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
			close(conn);
		}
	}

	public static void main(String[] args) {
		// insertUser("song", "송지훈");
		// updateUserName("song", "송글이");
		// deleteUser("song");
//		userInfo("kim");
		allUserInfo();
	}
}
