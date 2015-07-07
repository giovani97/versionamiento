/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package forms;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author user
 */
public class jfPerfil extends JFrame implements ActionListener{

    JLabel GDP,jlIdP,jlNombre;
    JPanel jplPermisos;
    JButton jbGuardar, jbNuevo, jbModificar,jbConsultar,jbEliminar;
    JTextField jtIdP,jtNombre;
    JRadioButton ayuda, reportes, empleado, administrador;
    
    public jfPerfil(){
        
        Font fuente = new Font("Arial", 0, 12);
        jlIdP = new JLabel("ID Perfil");
        jlIdP.setFont(fuente);
        jlNombre = new JLabel("Nombre");
        jlNombre.setFont(fuente);
        jplPermisos = new JPanel();
        jplPermisos.setBorder(new TitledBorder(new LineBorder(Color.BLACK),"Permisos"));
        jplPermisos.setLayout(null);
        
        ayuda = new JRadioButton("Ayuda");
        ayuda.setFont(fuente);
        reportes = new JRadioButton("Reportes");
        reportes.setFont(fuente);
        empleado = new JRadioButton("Empleado");
        empleado.setFont(fuente);
        administrador= new JRadioButton("Administrador");
        administrador.setFont(fuente);
        GDP = new JLabel("GESTIÓN DE PEFILES");
        GDP.setFont(new Font("Arial",1,18));
        
        
        jtIdP = new JTextField();
        jtNombre = new JTextField();
        
        GDP.setBounds(216, 36, 211, 22);
        add(GDP);
        
        
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setSize(650,650);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        
        
        
    
    
    
    
    
    
    }
    
    
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args) {
        new jfPerfil();
    }
    
}
