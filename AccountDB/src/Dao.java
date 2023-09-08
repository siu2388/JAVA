import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

//data accessing object
public class Dao {
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Properties db = new Properties();
			db.load(new FileInputStream("db.properties"));
			Class.forName(db.getProperty("driver")); // getProperty("driver")는 키값으로 value를 리턴해주는 겁니당.

			conn = DriverManager.getConnection(db.getProperty("url"), db.getProperty("user"), db.getProperty("pwd"));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static Account selectAccount(Connection conn, String id) {
		Account account = null;
		String sql = "select * from account where id=?";

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery(); // 디비에 있는 계좌를 불러와
			if (rs != null && rs.next()) {
				String rid = rs.getString("id");
				String rname = rs.getString("name");
				Integer rbalance = rs.getInt("balance");
				String rgrade = rs.getString("grade");
				account = new Account(rid, rname, rbalance, rgrade);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return account;
	}

	public static List<Account> selectAccountList(Connection conn) {
		List<Account> accountList = new ArrayList<>();
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from account";

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			if (rs != null) {
				while (rs.next()) {
					String id = rs.getString(1);
					String name = rs.getString(2);
					Integer balance = rs.getInt(3);
					String grade = rs.getString(4);

					accountList.add(new Account(id, name, balance, grade));
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
		}

		return accountList;
	}

	public static int insertAccount(Connection conn, Account account) {
		int insertedCount = 0;
		PreparedStatement pstmt = null;
		String sql = "insert into account values(?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, account.getId());
			pstmt.setString(2, account.getName());
			pstmt.setInt(3, account.getBalance());
			pstmt.setString(4, account.getGrade());
			insertedCount = pstmt.executeUpdate(); // 디비에 반영
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
		return insertedCount;
	}

	public static int updateAccount(Connection conn, Account account) {
		PreparedStatement pstmt = null;
		int updatedCount = 0;
		String sql = "UPDATE account set balance=? where id=?";
		try {
			pstmt = conn.prepareStatement(sql); // 디비에서 불러옴
			pstmt.setInt(1, account.getBalance());
			pstmt.setString(2, account.getId());
			updatedCount = pstmt.executeUpdate(); // 디비에 반영
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
		return updatedCount;
	}

	public static void close(Connection conn) {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
