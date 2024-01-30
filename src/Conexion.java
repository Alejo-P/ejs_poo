import java.sql.*;

public class Conexion {
    String host, usuario, password;

    public Conexion(String host, String usuario, String password) {
        this.host = host;
        this.usuario = usuario;
        this.password = password;
    }

    public Conexion() {}

    public void conexion_local(String host, String usuario, String password){
        try (Connection conn= DriverManager.getConnection(host, usuario, password)){
            if (conn!=null)
            {
                System.out.println("Acceso correcto!");
            }
        }
        catch (Exception a){
            System.out.println("No se pudo conectar a la base de datos");
        }
    }
}
