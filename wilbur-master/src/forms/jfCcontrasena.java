/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import Listas.listaUsuarios;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author MI PC
 */
public class jfCcontrasena extends JFrame implements ActionListener {
    
    private String clave;
    
    public void setClave(String clave) {
        this.clave = clave;
    }

    JLabel jlbContrasena, jlbVcontrasena, jlbCcontrasena;
    JPasswordField jpsContrasena, jpsVcontrasena, jpsCcontrasena;
    JButton jbAceptar, jbCancelar;
    listaUsuarios lista = new listaUsuarios();
    

    public jfCcontrasena() {
        
        
        jlbContrasena = new JLabel("Contraseña Actual:");
        jpsContrasena = new JPasswordField();
        jlbVcontrasena = new JLabel("Contraseña Nueva:");
        jpsVcontrasena = new JPasswordField();
        jlbCcontrasena = new JLabel("Confirmar Contraseña:");
        jpsCcontrasena = new JPasswordField();
        jbAceptar = new JButton("Aceptar");
        jbCancelar = new JButton("Cancelar");
        
        setTitle("Cambiar Contraseña");
        setResizable(false);Font fuente = new Font("Arial", 0, 12);

        jlbContrasena.setFont(fuente);
        jlbContrasena.setBounds(40, 40, 130, 22);
        jpsContrasena.setBounds(225, 40, 180, 22);

        jlbVcontrasena.setFont(fuente);
        jlbVcontrasena.setBounds(40, 85, 130, 22);
        jpsVcontrasena.setBounds(225, 85, 180, 22);

        jlbCcontrasena.setFont(fuente);
        jlbCcontrasena.setBounds(40, 130, 130, 22);
        jpsCcontrasena.setBounds(225, 130, 180, 22);

        jbCancelar.setBounds(225, 185, 90, 22);

        jbAceptar.setBounds(125, 185, 90, 22);

        add(jlbContrasena);
        add(jpsContrasena);
        add(jlbVcontrasena);
        add(jpsVcontrasena);
        add(jlbCcontrasena);
        add(jpsCcontrasena);
        add(jbCancelar);
        add(jbAceptar);

//        jlImagen = new JLabel();
//        URL RUTA = this.getClass().getResource("/PPI.png");
//        ImageIcon ima = new ImageIcon(RUTA);
//        jlImagen.setIcon(ima);
       
        setLayout(null);
        setSize(450, 263);
        setLocationRelativeTo(null);
        setVisible(true);

        jbAceptar.addActionListener(this);
        jbCancelar.addActionListener(this);
      
        
      
    }

    public void actionPerformed(ActionEvent Accion) {
        if (Accion.getSource() == jbAceptar) {
            
            String vieja = new String(jpsContrasena.getPassword());
            String nueva = new String(jpsCcontrasena.getPassword());
            String confirmacion = new String(jpsVcontrasena.getPassword());
            
            if(vieja.equals("")){
                JOptionPane.showMessageDialog(rootPane, "Debe ingresar la contraseña actual");
                jpsContrasena.requestFocusInWindow();
                return;
            }
            
            if(nueva.equals("")){
                JOptionPane.showMessageDialog(rootPane, "Debe ingresar la contraseña nueva");
                jpsVcontrasena.requestFocusInWindow();
                return;
            }
            
            if(confirmacion.equals("")){
                JOptionPane.showMessageDialog(rootPane, "Debe ingresar la confirmacion de la contraseña");
                jpsCcontrasena.requestFocusInWindow();
                return;
            }
                 /*if (obtenerUsuario.getUsuario().equals(usuario)) {
            NodoUsuario A = funcionesUsr.buscar(usuario, "");
            if (A != null) {
                obtenerUsuario.setClave(A.getContraseña());
            }if(A == null){
                JOptionPane.showMessageDialog(null, "Registro no existe");
                return;
            } 
            
        }*/
             
             if(!nueva.equals(confirmacion)){
                JOptionPane.showMessageDialog(rootPane, "la contraseña nueva y la confirmacion no corresponden");
                jpsCcontrasena.requestFocusInWindow();
                return;
            }
             
            if(!clave.equals(vieja)){
              JOptionPane.showMessageDialog(rootPane, "la contraseña actual no coincide con la ingresada");
              jpsContrasena.requestFocusInWindow();
              return;
          }
            
    
       }
   }
            /*
            String contrasena = new String (jpContraseña.getPassword());
            String usuario = jtUsuario.getText(), constrasena, mensaje = "Debe digitar:\n";
            if (usuario.equals("")) {

                mensaje = mensaje + "*un nombre de usuario\n";

            }
            if (contrasena.equals("")) {

                mensaje = mensaje + "*una contraseña";

            }
            if (!(mensaje.equals("Debe digitar:\n"))) {
                JOptionPane.showMessageDialog(null, mensaje, "Error", 1);
                return;
            }
            NodoUsuario P = funcionesUsuario.buscar("", usuario);
            if (P == null) {
                JOptionPane.showMessageDialog(null, "Usuario no existe", "Error", 1);
                return;
            }
            if (!(P.getContraseña().equalsIgnoreCase(contrasena))) {
                JOptionPane.showMessageDialog(null, "Usuario o constraseña incorrectos", "Error", 1);
                return;
            }
            
            String perfil = "Empleado";
            if(P.getRol().equals(perfil)){
                MenuPrincipal menu = new MenuPrincipal();
                menu.setTitle("Menu principal - Empleado");
                this.dispose();
            }else{
                MenuPrincipal menu = new MenuPrincipal();
                this.dispose();
            }

        }

        if (Accion.getSource() == jbCancelar) {
            int n = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea salir de la aplicación?");
            if (n == 0) {
                dispose();
            }

        }

    }*/
 

    public static void main(String[] args) {
        new jfCcontrasena();
    }

  
}