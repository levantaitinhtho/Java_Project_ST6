package connect;


import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectSQL {
    
    public static java.sql.Connection getConnection(){
        java.sql.Connection conn = null;
        String url = "net.sourceforge.jtds.jdbc.Driver";
        try {
            Class.forName(url);
            String dbUrl = "jdbc:jtds:sqlserver://LAPTOP-EAG0B02R:1433/ManagementKTX;user=sa;password=sa123";
            try {
                conn = DriverManager.getConnection(dbUrl);
            } catch (SQLException ex) {
                Logger.getLogger(ConnectSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
//    public static void main(String[] args) {
//        Connection con = ConnectSQL.getConnection();
//        if (con!=null)
//            System.out.println("1");
//        else
//            System.out.println("0");
//    }
}