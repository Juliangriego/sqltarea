    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.sql.Statement;
    import java.util.ArrayList;

import Clases.productos;
public class sql {
    private static String MYSQLJDBCDRIVERCLASS="com.mysql.cj.jdbc.Driver";
    private static String MYSQLDBURL = "jdbc:mysql://127.0.0.1:3306/sqljava";
    private static String MYSQLDBUSER = "jose";
    private static String MYSQLDBUSERPASSWORD = "2233";
    private static String MYSQLQUERY = "select * from productos";

    public static ArrayList<productos> Consulta(){
        ArrayList<productos> lista = new ArrayList<productos> ();

        try(Connection con = DriverManager.getConnection(MYSQLDBURL,MYSQLDBUSER,MYSQLDBUSERPASSWORD)){
            Class.forName(MYSQLJDBCDRIVERCLASS);
            Statement consulta = con.createStatement();
            ResultSet rs = consulta.executeQuery(MYSQLQUERY);
            



            while(rs.next()){
            lista.add(new productos (rs.getString("cod"),
            rs.getString("nombre"),
            rs.getString("descripcion"),
            rs.getInt("precio")));    
            }
            
            return lista;

        }catch(ClassNotFoundException e){
            System.out.println("Driver no encontrado");
            e.printStackTrace();
        }catch (SQLException e){
            System.out.println("Error en la consulta " + MYSQLQUERY);
            e.printStackTrace();
        }

        return lista;

    }
}