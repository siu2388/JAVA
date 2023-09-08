package dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import acc.Account;
import acc.SpecialAccount;

public class AccountDao {
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
				if (rgrade == null) {
					account = new Account(rid, rname, rbalance);
				} else {
					account = new SpecialAccount(rid, rname, rbalance, rgrade);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return account;
	}

	public static List<Account> selectAccountList(Connection conn) {
		List<Account> accounts = new ArrayList<>();
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
					if (grade == null) {
						accounts.add(new Account(id, name, balance));
					} else {
						accounts.add(new SpecialAccount(id, name, balance, grade));
					}
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
		return accounts;
	}

	public static int insertAccount(Connection conn, Account account) {

		PreparedStatement pstmt = null;
		String sql = "INSERT INTO account values (?,?,?,?)";
		int count = 0;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, account.getId());
			pstmt.setString(2, account.getName());
			pstmt.setInt(3, account.getBalance());
			if (account instanceof SpecialAccount) {
				pstmt.setString(4, ((SpecialAccount) account).getGrade());

			} else {
				pstmt.setString(4, null);
			}
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

	public static int updateAccount(Connection conn, Account account) {
		int count = 0;
		PreparedStatement pstmt = null;
		String sql = "update account set balance=? where id=?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, account.getBalance());
			pstmt.setString(2, account.getId());
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
