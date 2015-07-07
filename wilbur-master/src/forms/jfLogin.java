package forms;

import Listas.listaUsuarios;
import MenuPrincipal.MenuPrincipal;
import Nodos.NodoUsuario;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class jfLogin extends JFrame implements ActionListener {
    
     private String clave;
    
    public void setClave(String clave) {
        this.clave = clave;
    }
    
      private String usuario;
    
    public void setusuario(String usuario) {
        this.usuario = usuario;
    }
    

    JLabel jlUsuario, jlContraseña, jlImagen, jlAAS;
    JTextField jtUsuario;
    JPasswordField jpContraseña;
    JButton jbAceptar, jbCancelar;
    listaUsuarios lista = new listaUsuarios();
    ImageIcon imagen;
    listaUsuarios funcionesUsuario = new listaUsuarios();
    ImageIcon icono;
    Image icon;

    public jfLogin() {
        jlUsuario = new JLabel("Usuario");
        jtUsuario = new JTextField();
        jlContraseña = new JLabel("Contraseña");
        jpContraseña = new JPasswordField();
        jbAceptar = new JButton("Aceptar");
        jbCancelar = new JButton("Cancelar");
        jlAAS = new JLabel("ACCESO AL SISTEMA");
        setTitle("Porcicola WILBUR");
        
        
       
       
        setResizable(false);
        
        jlImagen = new JLabel( new ImageIcon(this.getClass().getResource("/Imagenes/cerdo.png")));
        icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/wilbur.png"));
        

        Font fuente = new Font("Arial", 0, 12);

        jlAAS.setFont(new Font("Arial", 1, 14));
        jlAAS.setBounds(24, 20, 191, 22);

        jlUsuario.setFont(fuente);
        jlUsuario.setBounds(225, 50, 100, 22);

        jtUsuario.setBounds(225, 75, 180, 22);

        jlContraseña.setFont(fuente);
        jlContraseña.setBounds(225, 105, 100, 22);

        jpContraseña.setBounds(225, 130, 180, 22);

        jbCancelar.setBounds(225, 185, 90, 22);

        jbAceptar.setBounds(125, 185, 90, 22);

        add(jlAAS);
        add(jlUsuario);
        add(jtUsuario);
        add(jlContraseña);
        add(jpContraseña);
        add(jbCancelar);
        add(jbAceptar);

//        jlImagen = new JLabel();
//        URL RUTA = this.getClass().getResource("/PPI.png");
//        ImageIcon ima = new ImageIcon(RUTA);
//        jlImagen.setIcon(ima);
        jlImagen.setBounds(15, 40, 155, 155);

        this.add(jlImagen);
        setIconImage(icon);
        funcionesUsuario.CargarArchivo();

        setLayout(null);
        setSize(450, 263);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        

        jbAceptar.addActionListener(this);
        jbCancelar.addActionListener(this);

    }
    

    public void actionPerformed(ActionEvent Accion) {
        if (Accion.getSource() == jbAceptar) {
            String contrasena = new String (jpContraseña.getPassword());
            String usuario = jtUsuario.getText(), constrasena, mensaje = "Debe digitar:\n";
            if (usuario.equals("")) {

                mensaje = mensaje + "*un nombre de usuario\n";
                jtUsuario.grabFocus();

            }
            if (contrasena.equals("")) {

                mensaje = mensaje + "*una contraseña";
                jpContraseña.grabFocus();

            }
            if (!(mensaje.equals("Debe digitar:\n"))) {
                JOptionPane.showMessageDialog(null, mensaje, "Error", 1); 
                return;
            }
            NodoUsuario P = funcionesUsuario.buscar("", usuario);
            if (P == null) {
                JOptionPane.showMessageDialog(null, "Usuario no existe", "Error", 1);
                jtUsuario.setText("");
                jpContraseña.setText("");
                jtUsuario.grabFocus();
                return;
            }
            if (!(P.getContraseña().equalsIgnoreCase(contrasena))) {
                JOptionPane.showMessageDialog(null, "Usuario o constraseña incorrectos", "Error", 1);
                jtUsuario.setText("");
                jpContraseña.setText("");
                jtUsuario.grabFocus();
                return;
            }
            
            String perfil = "Empleado";
            if(P.getRol().equals(perfil)){
                MenuPrincipal menu = new MenuPrincipal();
                menu.setClave(new String(jpContraseña.getPassword()));
                menu.setusuario(jtUsuario.getText());
                menu.setTitle("Menu principal - Empleado");
                this.dispose();
            }else{
                MenuPrincipal menu = new MenuPrincipal();
                menu.setClave(new String(jpContraseña.getPassword()));
                menu.setusuario(jtUsuario.getText());
                this.dispose();
            }

        }

        if (Accion.getSource() == jbCancelar) {
            int n = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea salir de la aplicación?");
            if (n == 0) {
                dispose();
            }

        }

    }
    
  

    public static void main(String[] args) {
        new jfLogin();
    }

}
