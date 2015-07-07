/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import Listas.ListaDatosAnimal;
import Nodos.NodoDatosAnimal;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Date;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Juan Pablo Serna y Giovani Murillo
 */

/**
 * 
 * @author Juan Pablo Serna
 */

public class jfDatosAnimal extends JFrame implements ActionListener {

    JLabel jlCodigo, jlRaza, jlEstado, jlPeso, jlPesoaN, jlPesoD, jlSexo, jlCodigoP, jlCodigoM, jlFechaP,
            jlEdad, jlRazaP, jlGDA, jlRazaM;
    JTextField jtCodigo, jtPeso, jtPesoN, jtPesoD, jtCodigoP, jtCodigoM, jtFechaP,
            jtEdad, jtDia, jtMes, jtAño;
    JComboBox jcbRaza, jcbEstado, jcbRazaP, jcbRazaM, jcbCodigoP;
    JPanel jplIdAnimal, jplDtP, jplPeso, jplEstado, jplSexo;
    JRadioButton jrbMacho, jrbHembra, jrbVivo, jrbMuerto;
    ButtonGroup jbgEstado, jbgSexo;
    JDateChooser jfcFechaP;
    JButton jbInsertar, jbModificar, jbCOnsultar, jbInhabilitar, jbGuardar, jbGuardarCambios,
            jbCancelar, jbListar, jbOtro;
    int sw = 0;
/**
 * Diseño de la ventana gestion datos de animal
 */
    public jfDatosAnimal() {
        jlGDA = new JLabel("GESTIÓN DATOS ANIMAL");
        jplIdAnimal = new JPanel();
        jlCodigo = new JLabel("ID Animal");
        jtCodigo = new JTextField();
        jlRaza = new JLabel("Raza");
        jcbRaza = new JComboBox();
        jlPesoaN = new JLabel("Nacimiento");
        jlPesoD = new JLabel("Destete");
        jlCodigoP = new JLabel("Código");
        jlCodigoM = new JLabel("ID de la madre");
        jlFechaP = new JLabel("Fecha del parto");
        jlEdad = new JLabel("Edad (semanas)");
        jlRazaP = new JLabel("Raza padre");
        jlRazaM = new JLabel("Raza madre");
        jrbVivo = new JRadioButton("Vivo");
        jrbMuerto = new JRadioButton("Muerto");
        jrbHembra = new JRadioButton("Hembra");
        jrbMacho = new JRadioButton("Macho");
        jfcFechaP = new JDateChooser();
        jtAño = new JTextField();
        jtMes = new JTextField();
        jtDia = new JTextField();
        jtEdad = new JTextField();
        jtPeso = new JTextField();
        jtPesoD = new JTextField();
        jtPesoN = new JTextField();
        jtCodigoM = new JTextField();
        jtCodigoP = new JTextField();
        jcbCodigoP = new JComboBox();

        jbCOnsultar = new JButton("Consultar");
        jbCancelar = new JButton("Cancelar");
        jbGuardar = new JButton("Guardar");
        jbGuardarCambios = new JButton("Guardar");
        jbInhabilitar = new JButton("Inhabilitar");
        jbInsertar = new JButton("Insertar");
        jbListar = new JButton("Listar");
        jbModificar = new JButton("Modificar");
        jbModificar = new JButton("Modificar");
        jbOtro = new JButton("--");

        jplDtP = new JPanel();
        jplDtP.setLayout(null);
        jplDtP.setBorder(new TitledBorder(new LineBorder(Color.BLACK), "Datos del Parto"));

        jplPeso = new JPanel();
        jplPeso.setLayout(null);
        jplPeso.setBorder(new TitledBorder(new LineBorder(Color.BLACK), "Peso"));

        jplEstado = new JPanel();
        jplEstado.setLayout(null);
        jplEstado.setBorder(new TitledBorder(new LineBorder(Color.BLACK), "Estado"));

        jbgEstado = new ButtonGroup();
        jbgEstado.add(jrbVivo);
        jbgEstado.add(jrbMuerto);

        jplSexo = new JPanel();
        jplSexo.setLayout(null);
        jplSexo.setBorder(new TitledBorder(new LineBorder(Color.BLACK), "Sexo"));

        jbgSexo = new ButtonGroup();
        jbgSexo.add(jrbMacho);
        jbgSexo.add(jrbHembra);

        jplIdAnimal.setLayout(null);
        jplIdAnimal.setBorder(new TitledBorder(new LineBorder(Color.BLACK), 
                              "Identificación del animal"));

        Font fuente = new Font("Arial", 0, 12);
        jlCodigo.setFont(fuente);
        jlCodigoM.setFont(fuente);
        jlCodigoP.setFont(fuente);
        jlEdad.setFont(fuente);
        jlFechaP.setFont(fuente);
        jlPesoaN.setFont(fuente);
        jlPesoD.setFont(fuente);
        jlRaza.setFont(fuente);
        jlRazaM.setFont(fuente);
        jlRazaP.setFont(fuente);
        jlRazaP.setFont(fuente);
        
        jcbRaza.addItem("Seleccione raza");
        jcbRaza.addItem("Berkshire");
        jcbRaza.addItem("Chester white");
        jcbRaza.addItem("Duroc");
        jcbRaza.addItem("Hampshire");
        jcbRaza.addItem("Landrace");
        jcbRaza.addItem("Large black");
        jcbRaza.addItem("Pietrain");
        jcbRaza.addItem("Poland china");
        jcbRaza.addItem("Yorkshire");
        jcbCodigoP.addItem("Seleccione");
        jcbCodigoP.addItem("Exterior");

        jplIdAnimal.reshape(25, 74, 585, 253);

        jlCodigo.reshape(55, 99, 53, 22);
        jtCodigo.reshape(55, 123, 250, 22);

        jlRaza.reshape(325, 99, 40, 22);
        jcbRaza.reshape(325, 123, 250, 22);

        jplSexo.reshape(55, 159, 250, 46);
        jrbMacho.reshape(65, 173, 70, 22);
        jrbHembra.reshape(225, 173, 70, 22);

        jplEstado.reshape(325, 159, 253, 46);
        jrbVivo.reshape(335, 173, 70, 22);
        jrbMuerto.reshape(498, 173, 70, 22);

        jplPeso.reshape(55, 219, 523, 83);
        jlPesoaN.reshape(65, 238, 70, 22);
        jtPesoN.reshape(65, 262, 240, 22);
        jlPesoD.reshape(325, 238, 70, 22);
        jtPesoD.reshape(325, 262, 240, 22);

        jplDtP.reshape(25, 367, 585, 150);

        jlCodigoP.reshape(55, 392, 70, 22);
        jcbCodigoP.reshape(55, 416, 247, 22);
        jbOtro.reshape(282, 416, 20, 22);

        jlCodigoM.reshape(325, 392, 100, 22);
        jtCodigoM.reshape(325, 416, 250, 22);

        jlFechaP.reshape(55, 452, 100, 22);
        jfcFechaP.reshape(55, 476, 250, 22);

        jlEdad.reshape(325, 452, 100, 22);
        jtEdad.reshape(325, 476, 250, 22);

        jbInsertar.setFont(fuente);
        jbInsertar.reshape(23, 525, 90, 22);

        jbModificar.setFont(fuente);
        jbModificar.reshape(123, 525, 90, 22);

        jbCOnsultar.setFont(fuente);
        jbCOnsultar.reshape(223, 525, 90, 22);

        jbListar.setFont(fuente);
        jbListar.reshape(273, 572, 90, 22);

        add(jbListar);
        jbInhabilitar.setFont(fuente);
        jbInhabilitar.reshape(323, 525, 90, 22);

        jbGuardar.setFont(fuente);
        jbGuardar.reshape(423, 525, 90, 22);

        jbGuardarCambios.setFont(fuente);
        jbGuardarCambios.reshape(423, 525, 90, 22);

        jbCancelar.setFont(fuente);
        jbCancelar.reshape(523, 525, 90, 22);

        jlGDA.setFont(new Font("Arial", 1, 18));

        jlGDA.reshape(206, 36, 226, 22);

        jbListar.setFont(fuente);

        jfcFechaP.setDate(new Date());

        jcbCodigoP.addItemListener(new ItemListener() {

            public void itemStateChanged(ItemEvent e) {
                if (jcbCodigoP.getSelectedIndex() == 1) {

                    jtCodigoM.setEditable(false);
                    jtEdad.setEditable(false);
                    jfcFechaP.setEnabled(false);
                    return;

                }
                jtCodigoM.setEditable(false);
                jtEdad.setEditable(false);
                jfcFechaP.setEnabled(false);
            }
        });
        
          
         
        jcbCodigoP.setEditable(false);
        jbgSexo.setSelected(null, false);
        jbgEstado.setSelected(null, false);
        jtPesoN.setEditable(false);
        jtPeso.setEditable(false);
        jtPesoD.setEditable(false);
        jtCodigoP.setEditable(false);
        jtCodigoM.setEditable(false);
        jtCodigo.setEditable(false);
        jcbRaza.setEnabled(false);
        jtCodigoM.setEditable(false);
        jtEdad.setEditable(false);
        jfcFechaP.setEnabled(false);
/**
 * Agrega campos de texto
 */
        //add(jbOtro);
        add(jlGDA);
        add(jtEdad);
        add(jlEdad);
        add(jfcFechaP);
        add(jlFechaP);
        add(jtCodigoM);
        add(jlCodigoM);
        add(jlCodigoP);
        add(jcbCodigoP);
        add(jtPesoD);
        add(jtPesoN);
        add(jlPesoD);
        add(jlPesoaN);
        add(jplPeso);
        add(jrbMacho);
        add(jrbHembra);
        add(jplSexo);

        add(jrbVivo);
        add(jrbMuerto);
        add(jplEstado);

        add(jlRaza);
        add(jcbRaza);
        add(jtCodigo);
        add(jlCodigo);

        add(jplIdAnimal);
        add(jplDtP);

        add(jbCancelar);
        add(jbGuardar);
        add(jbGuardarCambios);
        add(jbInhabilitar);
        add(jbCOnsultar);
        add(jbModificar);
        add(jbInsertar);

        jbOtro.addActionListener(this);

        setLayout(null);
        setTitle("Gestión Datos Animal");
        setVisible(true);
        setResizable(false);
        resize(650, 650);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    /**
     * Habilita los campos
     */
    public void habilitar() {

        jtAño.setText("");
        jtCodigo.setText("");
        jtCodigoM.setText("");
        jtCodigoP.setText("");
        jtDia.setText("");
        jtEdad.setText("");
        jtFechaP.setText("");
        jtMes.setText("");
        jtPeso.setText("");
        jtPesoD.setText("");
        jtPesoN.setText("");
        jtAño.setEditable(true);
        jtCodigo.setEditable(true);
        jtCodigoM.setEditable(true);
        jtCodigoP.setEditable(true);
        jtDia.setEditable(true);
        jtEdad.setEditable(true);
        jtFechaP.setEditable(true);
        jtMes.setEditable(true);
        jtPeso.setEditable(true);
        jtPesoD.setEditable(true);
        jtPesoN.setEditable(true);
        jcbCodigoP.setEditable(true);
        jbgSexo.setSelected(null, true);
        jbgEstado.setSelected(null, true);
        jtPesoN.setEditable(true);
        jtPeso.setEditable(true);
        jtPesoD.setEditable(true);
        jtCodigoP.setEditable(true);
        jtCodigoM.setEditable(true);
        jtCodigo.setEditable(true);
        jcbRaza.setEnabled(true);
        jtCodigoM.setEditable(true);
        jtEdad.setEditable(true);
        jfcFechaP.setEnabled(true);

    }

    public static void main(String[] args) {
        new jfDatosAnimal();
    }

/**
 * 
 * @param Accion Habilita los campos 
 */
    public void actionPerformed(ActionEvent Accion) {
        if (Accion.getSource() == jbInsertar) {
            habilitar();

            return;
        }

        if (Accion.getSource() == jbCOnsultar) {

        }
        


        if (Accion.getSource() == jbCancelar) {

        }

        if (Accion.getSource() == jbGuardar) {
            if (jtCodigo.equals("")) {
                //Valida que se ingrese el ID del aniimal.
                JOptionPane.showMessageDialog(null, "Debe ingresar un ID de animal");
                jtCodigo.grabFocus();
            }
            //Valida que se ingrese el sexo del animal.
            if (jrbMacho.isSelected() == false && jrbHembra.isSelected() == false) {
                JOptionPane.showMessageDialog(null, "Debe elegir un sexo");
            }
            
            //Valida que sea seleccionado el estado. 
            if (jrbVivo.isSelected() == false && jrbMuerto.isSelected() == false) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar un estado");
            }
            //Valida que se ingrese un peso al nacer.
            if ((jtPesoN.equals("") || Integer.parseInt(jtPesoN.getText()) == 0)) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un peso de nacimiento");
            }
            //Valida que se ingrese un peso al destete.
            if ((jtPesoD.equals("") || Integer.parseInt(jtPesoD.getText()) == 0)) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un peso de destete");
            }
            //Valida que sea seleccionado un codigo de parto.
            if (jcbCodigoP.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar un codigo de parto");
            }

        }

        if (Accion.getSource() == jbGuardarCambios) {

        }
        if (Accion.getSource() == jbInhabilitar) {

        }


        if (Accion.getSource() == jbListar) {

        }

        if (Accion.getSource() == jbModificar) {

        }

    }
}
