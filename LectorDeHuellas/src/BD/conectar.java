/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author diaz
 */
public class conectar {
   Connection con=null;
   public Connection conexion(){
       try {
           //cargar nuestro driver
              String url = "jdbc:mysql://localhost:3306/unab";
        String user = "root";
        String pass = "root";
            
        con = DriverManager.getConnection(url,user,pass);
        
       } catch (Exception e) {
           System.out.println("error de conexion");
           JOptionPane.showMessageDialog(null, "error de conexion "+e);
       }
       return con;
   }
        public Connection cerrarConexion(){
        try {
            con.close();
             System.out.println("Cerrando conexion a ");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        con=null;
        return con;
    }
}
