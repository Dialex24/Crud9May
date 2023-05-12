
package modelos;

import java.sql.*;
import javax.swing.*;
/**
 *
 * @author diego
 */
public class Conexion {
    Connection conexion;
    
    public Connection Conectar(String user, String pass){
        try
        {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String nombre_servidor= "127.0.0.1";
            String puerto = "1521";
            String sid = "xe";
            String url ="jdbc:oracle:thin:@"+nombre_servidor+":"+puerto+":"+sid;
            
            conexion = DriverManager.getConnection(url,user,pass);
                
            JOptionPane.showMessageDialog(null, "Conexion Correcta");
            
            
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Conexion Incorrecta");
        }
        
        return conexion;
    
    }
}
