package sqli;

import javax.servlet.http.HttpServletRequest;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;

public class IfFlowSqlTest3 {

    public void test(HttpServletRequest request) {
        String it = request.getParameter("it");
        String id = request.getParameter("id");
        String ip = request.getParameter("ip");
        String name = request.getParameter("name");
        String sql = "INSERT INTO " + it + "VALUES";
        if (ip.length() > 3) {
            sql = sql + "banned_ip(id, ip) VALUE('" + id + "','" + ip + "') ";
        }
        sql = sql + "order by '" + name + "';";
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