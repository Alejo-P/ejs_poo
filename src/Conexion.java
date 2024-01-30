import java.sql.*;

public class Conexion {
    // Atributos
    String host, usuario, password, mensaje;
    // Constructores
    public Conexion(String host, String usuario, String password) {
        this.host = host;
        this.usuario = usuario;
        this.password = password;
    }

    public Conexion() {}

    // Metodos

    public void conexion_local(String host, String usuario, String password){
        try (Connection conn=DriverManager.getConnection(host, usuario, password)){
            if (conn!=null)
            {
                mensaje="Acceso correcto";
            }
        }
        catch (Exception a){
            mensaje="No se pudo conectar a la base de datos";
            a.printStackTrace();
        }
    }
    public void Insertar_datos(int id,String nombre, String cedula, float calif1, float calif2){
        try (Connection conn=DriverManager.getConnection(this.host, this.usuario, this.password)){
            String query="INSERT INTO calificaciones (id, nombre, cedula, calif1, calif2) VALUES (?,?,?,?,?)";
        }
        catch (Exception b){

        }
    }

    public String Alerta()
    {
        return this.mensaje;
    }

}
