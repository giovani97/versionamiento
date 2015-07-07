package forms;

import Listas.listaUsuarios;
import MenuPrincipal.MenuPrincipal;
import Nodos.NodoUsuario;
import java.awt.Font;
import java.awt.Image;
import java.awt.Menu;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Juan Pablo Serna Alzate, Giovani Murillo
 */
public class jfLogin extends JFrame implements ActionListener {

    JLabel jlUsuario, jlContraseña, jlImagen, jlAAS;
    JTextField jtUsuario;
    JPasswordField jpContraseña;
    JButton jbAceptar, jbCancelar;
    listaUsuarios lista = new listaUsuarios();
    ImageIcon imagen;
    listaUsuarios funcionesUsuario = new listaUsuarios();
    Image icono;
/**
 * Diseño de la ventana
 */
    public jfLogin() {
        jlUsuario = new JLabel("Usuario");
        jtUsuario = new JTextField();
        jlContraseña = new JLabel("Contraseña");
        jpContraseña = new JPasswordField();
        jbAceptar = new JButton("Aceptar");
        jbCancelar = new JButton("Cancelar");
        jlAAS = new JLabel("ACCESO AL SISTEMA");
        setTitle("Acceso al sistema");

        setResizable(false);

        jlImagen = new JLabel(new ImageIcon(this.getClass()
                               .getResource("/Imagenes/pig-01.png")));

        Font fuente = new Font("Arial", 0, 12);

        jlAAS.setFont(new Font("Arial", 1, 14));
        jlAAS.reshape(24, 20, 191, 22);

        jlUsuario.setFont(fuente);
        jlUsuario.reshape(225, 50, 100, 22);

        jtUsuario.reshape(225, 75, 180, 22);

        jlContraseña.setFont(fuente);
        jlContraseña.reshape(225, 105, 100, 22);

        jpContraseña.reshape(225, 130, 180, 22);

        jbCancelar.reshape(225, 172, 90, 22);

        jbAceptar.reshape(125, 172, 90, 22);

        add(jlAAS);
        add(jlUsuario);
        add(jtUsuario);
        add(jlContraseña);
        add(jpContraseña);
        add(jbCancelar);
        add(jbAceptar);

        jlImagen.reshape(25, 40, 155, 155);

        this.add(jlImagen);
        funcionesUsuario.CargarArchivo();

        setLayout(null);
        resize(450, 263);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        jbAceptar.addActionListener(this);
        jbCancelar.addActionListener(this);

    }

    /**
     * Validacion del login
     *
     * @param Accion
     */
    //Se valida si la persona no ha ingresado el nombre de usuario.
    public void actionPerformed(ActionEvent Accion) {
        if (Accion.getSource() == jbAceptar) {
            String usuario = jtUsuario.getText(), constraseña = (String)
                             jpContraseña.getText(), mensaje = "Debe digitar:\n";

            if (usuario.equals("")) {

                mensaje = mensaje + "*un nombre de usuario\n";

            }
            //Se valida si la persona  no ha ingresado la contraseña
            if (constraseña.equals("")) {
                mensaje = mensaje + "*una contraseña";

            }
            if (!(mensaje.equals("Debe digitar:\n"))) {
                JOptionPane.showMessageDialog(null, mensaje, "Error", 1);
                return;
            }
            NodoUsuario P = funcionesUsuario.buscar("", usuario);
            //Se valida que el usuario exista.
            if (P == null) {
                JOptionPane.showMessageDialog(null, "Usuario no existe",
                        "Error", 1);
                return;
            }
            //Se valida que el usuario y contraseña sean correctos
            if (!(P.getContraseña().equalsIgnoreCase(constraseña))) {
                JOptionPane.showMessageDialog(null, "Usuario o constraseña incorrectos",
                        "Error", 1);
                return;
            }
            MenuPrincipal menu = new MenuPrincipal();
            //Se cierra la ventana de login 
            this.dispose();

        }
            //Se valida que al darle click en cancelar, se cierre la ventana
        if (Accion.getSource() == jbCancelar) {
            int n = JOptionPane.showConfirmDialog(null,
                    "¿Esta seguro que desea salir de la aplicación?");
            if (n == 0) {
                dispose();
            }

        }

    }

    public static void main(String[] args) {
        new jfLogin();
    }

}
