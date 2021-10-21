package sqli;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

public class SQLTest30 {

    public void sqlTest30(HttpServletRequest request) {
        String id = request.getParameter("id");
        JdbcTemplate template = getJDBCConnection();
        String result = template.query((conn) ->
                        conn.prepareStatement(
                                "select * from cars where id='" + id + "'"),
                (resultSet, i) -> {
            return resultSet.getString("name");
        }).get(0);
        System.out.print(result);
    }

    JdbcTemplate getJDBCConnection() {
        return null;
    }
}