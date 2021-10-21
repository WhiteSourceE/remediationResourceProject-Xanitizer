package sqli;

import javax.servlet.http.HttpServletRequest;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;

public class CreateStmtNotInScopeSqlTest {

    Statement statement;

    public CreateStmtNotInScopeSqlTest() throws SQLException {
        statement = getJDBCConnection().createStatement();
    }

    public void test(HttpServletRequest request) {
        String ip = request.getParameter("ip");
        try {
            String sql = "INSERT INTO banned_ip(id, ip) VALUE('" + UUID.randomUUID().toString() + "','" + ip + "')";
            statement.execute(sql, new String[]{"key"});
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        System.out.print("sdfdsf");
    }

    Connection getJDBCConnection() {
        return null;
    }
}