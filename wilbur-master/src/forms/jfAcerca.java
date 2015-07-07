/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

/**
 *
 * @author Juan Pablo Serna
 */
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.swing.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.border.*;

public class jfAcerca extends JFrame implements ActionListener {

    JLabel jlAcerca, jlNombre1, jlNombre2, jlNombre3, jlCorreo1, jlCorreo2, jlCorreo3,jlNombres, jlCorreos;
    Image icon;

    public jfAcerca() {
        setTitle("Acerca de");
        
        icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/wilbur.png"));
        
        jlAcerca = new JLabel("ACERCA DE");
        jlNombre1 = new JLabel("Giovani Murillo");
        jlNombre2 = new JLabel("Santiago Zapata");
        jlNombre3 = new JLabel("Juan Pablo Serna");
        jlCorreo1 = new JLabel("giovani_murillo23141@elpoi.edu.co");
        jlCorreo2 = new JLabel("santiago_zapata23132@elpoli.edu.co");
        jlCorreo3 = new JLabel("Juan_serna23141@elpoli.edu.co");
        jlCorreos = new JLabel("Correos");
        jlNombres = new JLabel("Autores");
        Font fuente = new Font("Arial", 0, 12);
        jlAcerca.setFont(new Font("Arial", 1, 18));
        add(jlAcerca);
        add(jlCorreo1);
        add(jlCorreo2);
        add(jlCorreo3);
        add(jlCorreos);
        add(jlNombre1);
        add(jlNombre2);
        add(jlNombre3);
        add(jlNombres);
       
        
        jlNombre1.setBounds(90, 150, 200, 30);
        jlNombres.setBounds(75, 100, 200, 30);
        jlNombre2.setBounds(90, 170, 200, 30);
        jlNombre3.setBounds(90, 190, 200, 30);
        jlCorreos.setBounds(75, 240, 200, 30);
        jlCorreo1.setBounds(90, 280, 200, 30);
        jlCorreo2.setBounds(90, 300, 230, 30);
        jlCorreo3.setBounds(90, 320, 200, 30);
        

        
        this.add(jlAcerca);
        this.setSize(650, 650);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setIconImage(icon);
        jlCorreo1.setFont(fuente);
        jlCorreo2.setFont(fuente);
        jlCorreo3.setFont(fuente);
        jlNombre1.setFont(fuente);
        jlNombre2.setFont(fuente);
        jlNombre3.setFont(fuente);
        jlCorreos.setFont(new Font("Arial", 1, 14));
        jlNombres.setFont(new Font("Arial", 1, 14));
        jlAcerca.setBounds(216, 36, 211, 22);
        
        
        
    }

    public static void main(String[] args) {
        new jfAcerca();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
