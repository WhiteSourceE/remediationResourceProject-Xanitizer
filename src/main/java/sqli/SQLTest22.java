package sqli;

import javax.servlet.http.HttpServletRequest;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;

public class SQLTest22 {

    public void sqlTest22(HttpServletRequest request) {
        String ip_1 = request.getParameter("ip_1");
        String ip_2 = request.getParameter("ip_2");
        try {
            String sql = "INSERT INTO banned_ip(id, ip) VALUE('" + UUID.randomUUID().toString() + "'," + "?" + ",'" + ip_2 + "')";
            CallableStatement callableStatement = getJDBCConnection().prepareCall(sql);
            callableStatement.setString(1, ip_1);
            callableStatement.execute();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        System.out.print("sdfdsf");
    }

    Connection getJDBCConnection() {
        return null;
    }
}