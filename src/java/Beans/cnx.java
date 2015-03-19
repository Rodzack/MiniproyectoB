package Beans;
import java.sql.*;
public class cnx {
    protected Connection con;
    protected Statement sql;
    private final String host = "localhost";
    private final String port = "3306";
    private final String db = "miniproyecto";
    private final String url = "jdbc:mysql://localhost:3306/"+db;
    private final String user = "root";
    private final String pass = "";
    
    public cnx(){

    }
    private String getcnxUrl(){
        return url;
    }
    
    public Connection cnx(){
        con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(getcnxUrl(),user,pass);
            sql = con.createStatement();
            System.out.print("Conexion!");
        }catch(Exception e){
           System.out.print("Error en la conexion"+e);
           return null;
        }
        return con;
    }
    
    public Statement getSql(){
        return this.sql;
    }
}
