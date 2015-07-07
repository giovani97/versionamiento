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

import Reportes.Reporte_Usuario;
import com.itextpdf.text.DocumentException;
import forms.jfUsuario;
import forms.jfDatosAnimal;
import java.awt.Desktop;
import java.awt.Font;
import forms.jfAcerca;
import java.awt.MenuBar;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.*;

/**
 *
 * @author Giovani Murillo y Juan Pablo Serna
 */
public class MenuPrincipal extends JFrame implements ActionListener {

    JMenuBar jbrMenuPrincipal;
    JMenu jiGestiones, jmGestiones, jmReportes, jmAyuda, jmEmpleado, jmAnimal,
            jmProcesos, jmHerramientas;

    JMenuItem jiGestionUsuarios, jiAcercade, jiGestionAnimales, jiReporteUsuarios,
            jiAcerca;
    ImageIcon fondo;
    JLabel jlFondo;
/**
 * Diseño de la ventana menu principal
 */
    public MenuPrincipal() {
        setLayout(null);

        jbrMenuPrincipal = new JMenuBar();
        setJMenuBar(jbrMenuPrincipal);
        jmGestiones = new JMenu("Gestiones");
        jmEmpleado = new JMenu("Empleado");
        jmAnimal = new JMenu("Animal");
        jmReportes = new JMenu("Salidas");
        jmProcesos = new JMenu("Procesos");
        jmHerramientas = new JMenu("Herramientas");
        jiReporteUsuarios = new JMenuItem("Reporte de usuarios");
        jiAcerca = new JMenuItem("Acerca de");
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
        jiAcerca.setFont(fuente);
        jmHerramientas.setFont(fuente);

        jiGestionUsuarios.addActionListener(this);
        jiAcercade.addActionListener(this);
        jiGestionAnimales.addActionListener(this);
        jiReporteUsuarios.addActionListener(this);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        setSize(800, 600);

        setTitle("Menu principal");

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

}
