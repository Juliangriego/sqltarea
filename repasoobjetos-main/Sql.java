import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sql {
    private static String MYSQLJDBCDRIVERCLASS="com.mysql.cj.jdbc.Driver";
    private static String MYSQLDBURL = "jdbc:mysql://localhost:3306/javaescuela";
    private static String MYSQLDBUSER = "empresa";
    private static String MYSQLDBUSERPASSWORD = "admin123456";
    private static String MYSQLQUERY = "select * from alumnos";

    public static void main(String[] args){
        try(Connection connection = DriverManager.getConnection(MYSQLDBURL,MYSQLDBUSER,MYSQLDBUSERPASSWORD)){
            Class.forName(MYSQLJDBCDRIVERCLASS);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(MYSQLQUERY);

            while(resultSet.next()){
                System.out.println(resultSet.getString("nombre") + " " + resultSet.getString("email") + " " + resultSet.getInt("nota"));
            }
        }catch(ClassNotFoundException e){
            System.out.println("Driver no encontrado");
            e.printStackTrace();
        }catch (SQLException e){
            System.out.println("Error en la consulta " + MYSQLQUERY);
            e.printStackTrace();
        }
    }
}
