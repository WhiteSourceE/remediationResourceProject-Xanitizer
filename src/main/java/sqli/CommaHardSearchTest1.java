package sqli;

import javax.servlet.http.HttpServletRequest;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;

public class CommaHardSearchTest1 {

	public void sqlTest1(HttpServletRequest request) {
		String ip = request.getParameter("ip");
		try {
			Statement statement = getJDBCConnection().createStatement();
			String sql = getPrefix() + ip + getSuffix();
			statement.execute(sql);
		} catch (SQLException exception) {
			exception.printStackTrace();
		}
		System.out.print("sdfsf");
	}

	Connection getJDBCConnection() {
		return null;
	}

	public String getPrefix(){
		return "INSERT INTO banned_ip(id, ip) VALUE('" + UUID.randomUUID().toString() + "','";
	}

	public String getSuffix(){
		return "'" + "blabla";
	}

}