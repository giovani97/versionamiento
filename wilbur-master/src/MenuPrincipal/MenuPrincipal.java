/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuPrincipal;

import Reportes.Reporte_Animal;
import Reportes.Reporte_Usuario;
import com.itextpdf.text.DocumentException;
import forms.jfUsuario;
import forms.jfDatosAnimal;
import java.awt.Desktop;
import java.awt.Font;
import forms.jfAcerca;
import forms.jfCcontrasena;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.*;

/**
 *
 * @author user
 */
/*public class MenuPrincipal extends JFrame implements ActionListener {

    JMenuBar jbrMenuPrincipal;
    JMenu jiGestiones, jmGestiones, jmReportes, jmAyuda, jmEmpleado, jmAnimal,
            jmProcesos, jmHerramientas;

    JMenuItem jiGestionUsuarios, jiAcercade, jiGestionAnimales, jiReporteUsuarios,
            jiAcerca;
    ImageIcon fondo;
   
    JLabel jlFondo;
    
    Image icon;

    public MenuPrincipal() {
        
        setLayout(null);
        
        icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/wilbur.png"));
       
        jbrMenuPrincipal = new JMenuBar();
        setJMenuBar(jbrMenuPrincipal);
        jmGestiones = new JMenu("Gestiones");
        jmEmpleado = new JMenu("Empleado");
        jmAnimal = new JMenu("Animal");
        jmReportes = new JMenu("Salidas");
        jmProcesos = new JMenu("Procesos");
        jmHerramientas = new JMenu("Herramientas");
        jiReporteUsuarios = new JMenuItem("Reporte de usuarios");
        jmReportes.add(jiReporteUsuarios);
        jmAyuda = new JMenu("Ayuda");
        jiGestiones = new JMenu("Gestiones");

        jiGestionUsuarios = new JMenuItem("Gestion Usuarios");
        jiAcercade = new JMenuItem("Acerca de");
        jiGestionAnimales = new JMenuItem("Datos Animal");
        Font fuente = new Font("Arial", 0, 12);
        jbrMenuPrincipal.add(jmGestiones);
        jbrMenuPrincipal.add(jmAnimal);
        jbrMenuPrincipal.add(jmReportes);
        jbrMenuPrincipal.add(jmProcesos);
        jbrMenuPrincipal.add(jmHerramientas);
        jbrMenuPrincipal.add(jmAyuda);
        jmGestiones.add(jiGestionUsuarios);
        jmGestiones.add(jiAcercade);
        jmGestiones.add(jiGestionAnimales);
        jmAyuda.add(jiAcercade);

        jmAnimal.add(jiGestionAnimales);
        jmReportes.add(jiReporteUsuarios);
        jiGestionUsuarios.setFont(fuente);
        jiAcercade.setFont(fuente);
        jiGestionAnimales.setFont(fuente);
        jmGestiones.setFont(fuente);
        jmAnimal.setFont(fuente);
        jmEmpleado.setFont(fuente);
        jmReportes.setFont(fuente);
        jiReporteUsuarios.setFont(fuente);
        jmProcesos.setFont(fuente);
        jmAyuda.setFont(fuente);
        jmHerramientas.setFont(fuente);

        jiGestionUsuarios.addActionListener(this);
        jiAcercade.addActionListener(this);
        jiGestionAnimales.addActionListener(this);
        jiReporteUsuarios.addActionListener(this);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(true);
        setVisible(true);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setTitle("Menu principal - Administrador");
        setIconImage(icon);
        

    }

    @Override
    public void actionPerformed(ActionEvent Accion) {

        if (Accion.getSource() == jiGestionAnimales) {
            new jfDatosAnimal();
        }
        if (Accion.getSource() == jiAcercade) {
            new jfAcerca();
        }

        if (Accion.getSource() == jiReporteUsuarios) {
            try {
                new Reporte_Usuario().createPdf();
                try {
                    String Reporte = System.getProperty("user.dir") + "/ReporteUsuario.pdf";
                    File Report = new File(Reporte);
                    Desktop.getDesktop().open(Report);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            } catch (DocumentException error) {
            }
        }
        if (Accion.getSource() == jiAcerca) {
            new jfAcerca();
        }
        if (Accion.getSource() == jiGestionUsuarios) {
            new jfUsuario();
        }
    }

    public static void main(String[] args) {
        new MenuPrincipal();
    }

}*/



public class MenuPrincipal extends JFrame implements ActionListener {

    JMenuBar jmbBarra;
    JMenu jmAUsuarios, jmReportes, jmAyuda, jmAanimal, jmCerdos, jmEtapas, jmJaulas, jmRazas;

    JMenuItem jmiUsuarios, jiAcercade, jmiAnimales, jiReporteUsuarios,
              jiAcerca, jmiCcontrasena, jmiGdusuario, jmiPartos, jmiMortalidad, jmiPanimal, jmiRanimal,
              jmiRpartos, jmiRmortalidad, jmiRPeso, jmiMusuario;
    ImageIcon fondo;
   
    JLabel jlFondo;
    
    Image icon;

    public MenuPrincipal() {
        
        setLayout(null);
        
        icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/wilbur.png"));
       
        jmbBarra = new JMenuBar();
        setJMenuBar(jmbBarra);
        jmAUsuarios = new JMenu("Usuarios");
        jmAanimal = new JMenu("Animales");
        jmReportes = new JMenu("Salidas");
        jmAyuda = new JMenu("Ayuda");
        jmCerdos = new JMenu("Cerdos");
        jmEtapas = new JMenu("Etapas");
        jmJaulas = new JMenu("Jaulas");
        jmRazas = new JMenu("Razas");
        

        jmiUsuarios = new JMenuItem("Registro Usuarios");
        jmiRanimal = new JMenuItem("Reporte Animales");
        jmiRpartos = new JMenuItem("Reporte Partos");
        jmiRmortalidad = new JMenuItem("Reporte Mortalidad");
        jiReporteUsuarios = new JMenuItem("Reporte Usuarios");
        jmiRPeso = new JMenuItem("Reporte Peso");
        jiAcercade = new JMenuItem("Acerca de");
        jmiMusuario = new JMenuItem("Manual de usuario");
        jmiAnimales = new JMenuItem("Datos Animales");
        jmiPartos = new JMenuItem("Partos");
        jmiMortalidad = new JMenuItem("Mortalidad");
        jmiPanimal = new JMenuItem("Peso animal");
        jmiCcontrasena = new JMenuItem("Cambiar Contraseña");
        jmiGdusuario = new JMenuItem("Datos Usuario");
        Font fuente = new Font("Arial", 0, 12);
        
        jmbBarra.add(jmAUsuarios);
        jmbBarra.add(jmAanimal);
        jmbBarra.add(jmReportes);
        jmbBarra.add(jmAyuda);
        jmAUsuarios.add(jmiUsuarios);
        jmAUsuarios.add(jmiGdusuario);
        jmReportes.add(jiReporteUsuarios);
        jmAUsuarios.add(jmiCcontrasena);
        jmAyuda.add(jmiMusuario);
        jmAyuda.add(jiAcercade);
        jmAanimal.add(jmCerdos);
        jmAanimal.add(jmEtapas);
        jmAanimal.add(jmJaulas);
        jmAanimal.add(jmRazas);
        jmCerdos.add(jmiAnimales);
        jmCerdos.add(jmiPartos);
        jmCerdos.add(jmiMortalidad);
        jmCerdos.add(jmiPanimal);
        jmReportes.add(jmiRanimal);
        jmReportes.add(jmiRpartos);
        jmReportes.add(jmiRmortalidad);
        jmReportes.add(jmiRPeso);
        
        jmiUsuarios.setFont(fuente);
        jiAcercade.setFont(fuente);
        jmiAnimales.setFont(fuente);
        jmAUsuarios.setFont(fuente);
        jmAanimal.setFont(fuente);
        jmiPartos.setFont(fuente);
        jmiMortalidad.setFont(fuente);
        jmReportes.setFont(fuente);
        jmiPanimal.setFont(fuente);
        jmCerdos.setFont(fuente);
        jmEtapas.setFont(fuente);
        jmJaulas.setFont(fuente);
        jmRazas.setFont(fuente);
        jmReportes.setFont(fuente);
        jmiMusuario.setFont(fuente);
        jmiRanimal.setFont(fuente);
        jmiRpartos.setFont(fuente);
        jiReporteUsuarios.setFont(fuente);
        jmiRmortalidad.setFont(fuente);
        jmiRPeso.setFont(fuente);
        jmReportes.setFont(fuente);
        jmAyuda.setFont(fuente);
        jmiCcontrasena.setFont(fuente);
        jmiGdusuario.setFont(fuente);

        jmiUsuarios.addActionListener(this);
        jiAcercade.addActionListener(this);
        jmiAnimales.addActionListener(this);
        jiReporteUsuarios.addActionListener(this);
        jmiCcontrasena.addActionListener(this);
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(true);
        setVisible(true);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setTitle("Menu principal - Administrador");
        setIconImage(icon);
        
        

    }
    
     
    private String clave;
    
    public void setClave(String clave) {
        this.clave = clave;
    }
    
    private String usuario;
    
    public void setusuario(String usuario) {
        this.usuario = usuario;
    }
    
    
    
    

    @Override
    public void actionPerformed(ActionEvent Accion) {

        if (Accion.getSource() == jmiAnimales) {
            new jfDatosAnimal();
        }
        if (Accion.getSource() == jiAcercade) {
            new jfAcerca();
        }

        if (Accion.getSource() == jiReporteUsuarios) {
            try {
                new Reporte_Usuario().createPdf();
                try {
                    String ReporteUsu = System.getProperty("user.dir") + "/ReporteUsuario.pdf";
                    File ReportUsu = new File(ReporteUsu);
                    Desktop.getDesktop().open(ReportUsu);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            } catch (DocumentException error) {
            }
        }
        
        if (Accion.getSource() == jmiRanimal) {
            try {
                new Reporte_Animal().createPdf();
                try {
                    String ReporteAni = System.getProperty("user.dir") + "/ReporteAnimal.pdf";
                    File ReportAni = new File(ReporteAni);
                    Desktop.getDesktop().open(ReportAni);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            } catch (DocumentException error) {
            }
        }
        
        if (Accion.getSource() == jiAcerca) {
            new jfAcerca();
        }
        if (Accion.getSource() == jmiUsuarios) {
            new jfUsuario();
        }
         if (Accion.getSource() == jmiCcontrasena) {
           jfCcontrasena contrasena = new jfCcontrasena();
           contrasena.setClave(clave);
           contrasena.setClave(usuario);
           contrasena.setVisible(true);
        }
    }

    public static void main(String[] args) {
        new MenuPrincipal();
    }

}