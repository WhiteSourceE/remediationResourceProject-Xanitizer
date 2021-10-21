package sqli;

import javax.servlet.http.HttpServletRequest;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;

public class SQLTest32 {

	public void sqlTest32(HttpServletRequest request) {
		String ip = request.getParameter("ip");
		try {
			StringBuilder sql = new StringBuilder("INSERT INTO banned_table VALUE('")
              .append(UUID.randomUUID().toString())
              .append("','")
              .append(ip)
              .append("')");
			Statement statement = getJDBCConnection().createStatement();
			statement.execute(String.valueOf(sql));
		} catch (SQLException exception) {
			exception.printStackTrace();
		}
		System.out.print("sdfsf");
	}

	Connection getJDBCConnection() {
		return null;
	}
}