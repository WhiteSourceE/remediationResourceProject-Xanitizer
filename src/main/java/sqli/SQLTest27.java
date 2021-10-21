package sqli;

import javax.servlet.http.HttpServletRequest;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;
import org.springframework.jdbc.core.JdbcTemplate;

public class SQLTest27 {

    public void sqlTest27(HttpServletRequest request) {
        String ip = request.getParameter("ip");
        String sql = "INSERT INTO banned_ip(id, ip) VALUE('" + UUID.randomUUID().toString() + "','" + ip + "')";
        JdbcTemplate template = getJDBCConnection();
        String result = template.query(sql, (resultSet, i) -> {
            return resultSet.getString("name");
        }).get(0);
        System.out.print(result);
    }

    JdbcTemplate getJDBCConnection() {
        return null;
    }
}