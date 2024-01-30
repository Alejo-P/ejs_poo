import javax.swing.*;
import java.awt.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        JFrame ventana1= new JFrame("Ingreso de notas");
        ventana1.setContentPane(new menu_insercion().Pantalla1);
        ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana1.setSize(100, 300);
        ventana1.pack();
        ventana1.setVisible(true);
    }
}