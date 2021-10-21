package sqli;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;
import org.jooq.DSLContext;


public class SQLTest29 {

	public void sqlTest29(HttpServletRequest request) {
		String ip = request.getParameter("ip");
		String sql = "INSERT INTO banned_ip(id, ip) VALUE('" + UUID.randomUUID().toString() + "','" + ip + "')";
		DSLContext dslContext = getDSLContextConnection();
		dslContext.resultQuery(sql).fetch();
		System.out.print("sdfsf");
	}

	DSLContext getDSLContextConnection() {
		return null;
	}
}