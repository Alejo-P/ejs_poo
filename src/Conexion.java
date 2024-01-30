import java.sql.*;

public class Conexion {
    // Atributos
    String host, usuario, password, mensaje;
    String nombre, cedula;
    int id;
    float calif1, calif2;
    // Constructores
    public Conexion(String host, String usuario, String password) {
        this.host = host;
        this.usuario = usuario;
        this.password = password;
    }

    public Conexion() {}

    // Metodos

    public void conexion_local(String host, String usuario, String password){
        this.host=host;
        this.usuario=usuario;
        this.password=password;
        try (Connection conn=DriverManager.getConnection(this.host, this.usuario, this.password)){
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
        this.id=id;
        this.nombre=nombre;
        this.cedula=cedula;
        this.calif1=calif1;
        this.calif2=calif2;
        try (Connection conn=DriverManager.getConnection(this.host, this.usuario, this.password)){
            String query="INSERT INTO calificaciones (id, nombre, cedula, calificacion1, calificacion2) VALUES (?,?,?,?,?)";
            try (PreparedStatement cursor =conn.prepareStatement(query)) {
                cursor.setInt(1, this.id);
                cursor.setString(2, this.nombre);
                cursor.setString(3, this.cedula);
                cursor.setFloat(4, this.calif1);
                cursor.setFloat(5, this.calif2);
                int filas_afectadas=cursor.executeUpdate();
                if (filas_afectadas>0)
                {
                    System.out.println("Insercion exitosa!");
                }
                else {
                    System.out.println("Insercion fallida!");
                }
            }
            catch (Exception c){
                c.printStackTrace();
            }
        }
        catch (Exception b){
            b.printStackTrace();
        }
    }

    public String Alerta()
    {
        return this.mensaje;
    }

}
