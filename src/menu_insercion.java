import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu_insercion {
    private JButton btnConexion;
    public JPanel Pantalla1;
    private JLabel Texto1;
    private JLabel entry_;
    private JTextField entry_id;
    private JTextField entry_usr;
    private JTextField entry_pass;
    private JTextField entry_calf1;
    private JTextField entry_calf2;
    private JLabel calf2;
    private JLabel calf1;
    private JLabel cedula;
    private JLabel nombre;
    private JButton btninsertar;

    public menu_insercion() {
        Conexion BDD = new Conexion();
        btnConexion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BDD.conexion_local("jdbc:mysql://localhost:3306/poo_bdd","root","");
                Texto1.setText(BDD.Alerta());
            }
        });
        btninsertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ID=Integer.parseInt(entry_id.getText());
                String Nombre=entry_usr.getText();
                String Cedula=entry_pass.getText();
                float Calif1=Float.parseFloat(entry_calf1.getText());
                float Calif2=Float.parseFloat(entry_calf2.getText());
                BDD.Insertar_datos(ID, Nombre, Cedula, Calif1, Calif2);
                Texto1.setText(BDD.Alerta());
            }
        });
    }
}
