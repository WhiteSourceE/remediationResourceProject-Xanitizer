package sqli;

import javax.servlet.http.HttpServletRequest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;

public class SQLTest33 {

	public void sqlTest33(HttpServletRequest request) {
		String ip = request.getParameter("ip");
		try {
      String sql =
          new StringBuilder("INSERT INTO banned_table VALUE('")
              .append(UUID.randomUUID().toString())
              .append("','")
              .append(ip)
              .append("')")
              .toString();
			Statement statement = getJDBCConnection().createStatement();
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