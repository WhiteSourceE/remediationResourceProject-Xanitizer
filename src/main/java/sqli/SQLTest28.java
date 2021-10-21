package sqli;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

public class SQLTest28 {

    public void sqlTest28(HttpServletRequest request) {
        String ip = request.getParameter("ip");
        String sql = "INSERT INTO banned_ip(id, ip) VALUE('" + UUID.randomUUID().toString() + "','" + ip + "')";
        JdbcTemplate template = getJDBCConnection();
        template.execute(sql);
    }

    JdbcTemplate getJDBCConnection() {
        return null;
    }
}