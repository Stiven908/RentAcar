/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection conectarBd(){
        Connection con = null;
        String user = "root";
        String database = "rentacarbd";
        String password = "";
        int port = 3306;
        String url = "";
        String host  = "localhost";
        try{
             url = String.format("jdbc:mysql://%s:%d/%s", host,port,database);
            System.out.println("URL: " + url);
            con = DriverManager.getConnection(url,user,password);
            System.out.println("conexion a la BD es ok");
        }
        catch(SQLException ex){
             System.out.println("Error SQL" + ex);
        }
        return con;
    }
}
