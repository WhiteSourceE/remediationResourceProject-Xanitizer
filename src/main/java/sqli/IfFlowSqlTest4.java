package sqli;

import javax.servlet.http.HttpServletRequest;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;

public class IfFlowSqlTest4 {

    public void test(HttpServletRequest request) {
        String id = request.getParameter("id");
        String ip = request.getParameter("ip");
        String sql = "INSERT INTO banned_ip(id, ip) VALUE('" + id + "','";
        if (ip.length() > 3) {
            sql = sql + ip + "')";
        } else {
            sql =sql + "0.0.0.0')";
        }
        try {
            Statement statement = getJDBCConnection().createStatement();
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