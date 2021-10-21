package sqli;

import javax.servlet.http.HttpServletRequest;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;

public class SqlWithRegexTest {

	public void sqlWithRegexTest(HttpServletRequest request) {
		String ip = request.getParameter("ip");
		try {
			Statement statement = getJDBCConnection().createStatement();
			String sql = "FROM users WHERE name='nadav' and ip LIKE '" + ip + ".%'";
			statement.execute(sql);
		} catch (SQLException exception) {
			exception.printStackTrace();
		}
		System.out.print("sdfsf");
	}

	Connection getJDBCConnection() {
		return null;
	}
}