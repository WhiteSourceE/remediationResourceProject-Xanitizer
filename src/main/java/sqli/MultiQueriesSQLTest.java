package sqli;

import javax.servlet.http.HttpServletRequest;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;

public class MultiQueriesSQLTest {

    public void test(HttpServletRequest request) {
        String ip = request.getParameter("ip");
        try {
            String sql = "INSERT INTO banned_ip(id, ip) VALUE('" + UUID.randomUUID().toString() + "','" + ip + "')";
            Statement statement = getJDBCConnection().createStatement();
            statement.execute(sql);
            sql = "INSERT INTO records(id, ip) VALUE('" + UUID.randomUUID().toString() + "','" + ip + "')";
            statement.execute(sql);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        System.out.print("sdfdsf");
    }

    Connection getJDBCConnection() {
        return null;
    }
}