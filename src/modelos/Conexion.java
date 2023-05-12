
package modelos;

import java.sql.*;
import javax.swing.*;
/**
 *
 * @author diego
 */
public class Conexion {
    Connection conexion;
    
    public Connection Conectar(){
        try
        {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String nombre_servidor= "168.234.74.80";
            String puerto = "1521";
            String sid = "umg";
            String url ="jdbc:oracle:thin:@"+nombre_servidor+":"+puerto+":"+sid;
            
            String usuario = "HA20";
            String password= "Umg$2023";
            conexion = DriverManager.getConnection(url,usuario,password);
                
            JOptionPane.showMessageDialog(null, "Conexion Correcta");
            
            
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Conexion Incorrecta");
        }
        
        return conexion;
    
    }
}
