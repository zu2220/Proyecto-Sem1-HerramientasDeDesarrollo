package conexionDB;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author oscar
 */
public class ConexionDB {
    private static Connection conn;
    
    public static Connection DataSource(){
    
        SQLServerDataSource ds = new SQLServerDataSource();
        
        try{
            ds.setServerName("OscarZari");
            ds.setDatabaseName("BoletaElectronica");
        
            ds.setUser("sa");
            ds.setPassword("camote");
            ds.setEncrypt(false);
            conn = ds.getConnection();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return conn;
    }
    
}
