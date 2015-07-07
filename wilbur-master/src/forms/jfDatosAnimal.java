/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import Listas.ListaDatosAnimal;
import Listas.listaUsuarios;
import Nodos.NodoDatosAnimal;
import Nodos.NodoUsuario;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
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
 * @author user
 */
public class jfDatosAnimal extends JFrame implements ActionListener {
    
     ListaDatosAnimal funcionesAnl = new ListaDatosAnimal();

    JLabel jlCodigo, jlRaza, jlEstado, jlPeso, jlPesoaN, jlPesoD, jlSexo, jlCodigoP, jlCodigoM, jlFechaP,
            jlEdad, jlRazaP, jlGDA, jlRazaM;
    JTextField jtCodigo, jtPeso, jtPesoN, jtPesoD, jtCodigoP, jtCodigoM,
            jtEdad, jtDia, jtMes, jtAño;
    JComboBox jcbRaza, jcbEstado, jcbRazaP, jcbRazaM;
    JPanel jplIdAnimal, jplDtP, jplPeso, jplEstado, jplSexo;
    JRadioButton jrbMacho, jrbHembra, jrbVivo, jrbMuerto;
    ButtonGroup jbgEstado, jbgSexo;
    JDateChooser jfcFechaP;
    JButton jbInsertar, jbModificar, jbCOnsultar, jbInhabilitar, jbGuardar, jbGuardarCambios,
            jbCancelar, jbListar, jbOtro;
    Image icon;
    int sw = 0;

    public jfDatosAnimal() {
        
        icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/wilbur.png"));
        
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
        jplIdAnimal.setBorder(new TitledBorder(new LineBorder(Color.BLACK), "Identificación del animal"));

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
      

        jplIdAnimal.setBounds(25, 74, 585, 253);

        jlCodigo.setBounds(55, 99, 53, 22);
        jtCodigo.setBounds(55, 123, 250, 22);

        jlRaza.setBounds(325, 99, 40, 22);
        jcbRaza.setBounds(325, 123, 250, 22);

        jplSexo.setBounds(55, 159, 250, 46);
        jrbMacho.setBounds(65, 173, 70, 22);
        jrbHembra.setBounds(225, 173, 70, 22);

        jplEstado.setBounds(325, 159, 253, 46);
        jrbVivo.setBounds(335, 173, 70, 22);
        jrbMuerto.setBounds(498, 173, 70, 22);

        jplPeso.setBounds(55, 219, 523, 83);
        jlPesoaN.setBounds(65, 238, 70, 22);
        jtPesoN.setBounds(65, 262, 240, 22);
        jlPesoD.setBounds(325, 238, 70, 22);
        jtPesoD.setBounds(325, 262, 240, 22);

        jplDtP.setBounds(25, 367, 585, 150);

        jlCodigoP.setBounds(55, 392, 70, 22);
        jtCodigoP.setBounds(55, 416, 247, 22);
        jbOtro.setBounds(282, 416, 20, 22);

        jlCodigoM.setBounds(325, 392, 100, 22);
        jtCodigoM.setBounds(325, 416, 250, 22);

        jlFechaP.setBounds(55, 452, 100, 22);
        jfcFechaP.setBounds(55, 476, 250, 22);

        jlEdad.setBounds(325, 452, 100, 22);
        jtEdad.setBounds(325, 476, 250, 22);

        jbInsertar.setFont(fuente);
        jbInsertar.setBounds(23, 525, 90, 22);

        jbModificar.setFont(fuente);
        jbModificar.setBounds(123, 525, 90, 22);

        jbCOnsultar.setFont(fuente);
        jbCOnsultar.setBounds(223, 525, 90, 22);

        jbListar.setFont(fuente);
        jbListar.setBounds(273, 572, 90, 22);

        add(jbListar);
        jbInhabilitar.setFont(fuente);
        jbInhabilitar.setBounds(323, 525, 90, 22);

        jbGuardar.setFont(fuente);
        jbGuardar.setBounds(423, 525, 90, 22);

        jbGuardarCambios.setFont(fuente);
        jbGuardarCambios.setBounds(423, 525, 90, 22);

        jbCancelar.setFont(fuente);
        jbCancelar.setBounds(523, 525, 90, 22);

        jlGDA.setFont(new Font("Arial", 1, 18));

        jlGDA.setBounds(206, 36, 226, 22);

        jbListar.setFont(fuente);

        jfcFechaP.setDate(new Date());

     
        jtCodigoP.setEditable(false);
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
        
        jbInsertar.setEnabled(true);
        jbModificar.setEnabled(true);
        jbCOnsultar.setEnabled(true);
        jbInhabilitar.setEnabled(true);
        jbGuardar.setEnabled(false);
        jbCancelar.setEnabled(false);

        //add(jbOtro);
        add(jlGDA);
        add(jtEdad);
        add(jlEdad);
        add(jfcFechaP);
        add(jlFechaP);
        add(jtCodigoM);
        add(jlCodigoM);
        add(jlCodigoP);
        add(jtCodigoP);
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

        jbListar.addActionListener(this);
        jbInsertar.addActionListener(this);
        jbModificar.addActionListener(this);
        jbGuardar.addActionListener(this);
        jbGuardarCambios.addActionListener(this);
        jbCancelar.addActionListener(this);
        jbCOnsultar.addActionListener(this);
        jbInhabilitar.addActionListener(this);

        setLayout(null);
        setTitle("Gestión Datos Animal");
        setVisible(true);
        setResizable(false);
        setSize(650, 650);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setIconImage(icon);
    }
    public void habilitar() {

        jtAño.setText("");
        jtCodigo.setText("");
        jtCodigoM.setText("");
        jtCodigoP.setText("");
        jtDia.setText("");
        jtEdad.setText("");
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
        jtMes.setEditable(true);
        jtPeso.setEditable(true);
        jtPesoD.setEditable(true);
        jtPesoN.setEditable(true);
        jtCodigoP.setEditable(true);
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
        
        jbInsertar.setEnabled(true);
        jbModificar.setEnabled(false);
        jbCOnsultar.setEnabled(false);
        jbInhabilitar.setEnabled(false);
        jbGuardar.setEnabled(true);
        jbCancelar.setEnabled(true);

    }
    
    
    public void Inhabilitar() {
        
        jtAño.setText("");
        jtCodigo.setText("");
        jtCodigoM.setText("");
        jtCodigoP.setText("");
        jtDia.setText("");
        jtEdad.setText("");
        jtMes.setText("");
        jtPeso.setText("");
        jtPesoD.setText("");
        jtPesoN.setText("");
        jtAño.setEditable(false);
        jtCodigo.setEditable(false);
        jtCodigoM.setEditable(false);
        jtCodigoP.setEditable(false);
        jtDia.setEditable(false);
        jtEdad.setEditable(false);
        jtMes.setEditable(false);
        jtPeso.setEditable(false);
        jtPesoD.setEditable(false);
        jtPesoN.setEditable(false);
        jbgSexo.setSelected(null, false);
        jbgEstado.setSelected(null, false);
        jtPesoN.setEditable(false);
        jtPeso.setEditable(false);
        jtPesoD.setEditable(false); 
        jtCodigoM.setEditable(false);
        jtCodigo.setEditable(false);
        jcbRaza.setEnabled(false);
        jtCodigoM.setEditable(false);
        jtEdad.setEditable(false);
        jfcFechaP.setEnabled(false);

     
        jbInsertar.setEnabled(true);
        jbModificar.setEnabled(true);
        jbCOnsultar.setEnabled(true);
        jbInhabilitar.setEnabled(true);
        jbGuardar.setEnabled(false);
        jbCancelar.setEnabled(false);

    }

    public void actionPerformed(ActionEvent Accion) {
        if (Accion.getSource() == jbInsertar) {
            habilitar();

            return;
        }

        if (Accion.getSource() == jbCOnsultar) {
            String Documento = JOptionPane.showInputDialog(null, "Ingrese un número de documento");
            NodoDatosAnimal A = funcionesAnl.buscar(Documento);
            if(Documento == null){
                return;
            }
            if (A != null) {
                jtCodigo.setText(A.getIdanimal());
                jcbRaza.setSelectedItem(A.getRaza());
                jtPeso.setText(A.getNacimiento());
                jtPesoD.setText(A.getDestete());
                jtCodigoP.setText(A.getCodigo());
                jtCodigoM.setText(A.getIdmadre());
                jfcFechaP.setDateFormatString(A.getFecha());
                jtEdad.setText(A.getEdad());
                if (A.getEstado() == jrbVivo.getText()) {
                    jrbVivo.setSelected(true);
                } else {
                    jrbMuerto.setSelected(true);
                }
                
                if (A.getSexo().equals(jrbHembra)) {
                    jrbHembra.setSelected(true);
                } else {
                    jrbMacho.setSelected(true);
                }

            }if(A == null){
                JOptionPane.showMessageDialog(null, "Registro no existe");
            } 
        }

        if (Accion.getSource() == jbCancelar) {
             Inhabilitar();
            return;
        }
       
        if (Accion.getSource() == jbGuardar) {
              String codigo = jtCodigo.getText(), sexoH = jrbMacho.getText(),
                    sexoM = jrbHembra.getText(), vivo = jrbVivo.getText(), muerto = jrbMuerto.getText(),
                    pesoN = jtPesoN.getText(), pesoD = jtPesoD.getText(), codigoP = jtCodigoP.getText(),
                    codigoM = jtCodigoM.getText(), fechaP = jfcFechaP.getDateFormatString(), edad = jtEdad.getText(), Mensaje = "Faltan campos por ingresar.\n";
            int raza = jcbRaza.getSelectedIndex();
            
            if (codigo.equals("")) {
                JOptionPane.showMessageDialog(null, Mensaje, "Error", 0);
                jtCodigo.grabFocus();
                return;
            }
            
            if (raza == 0) {
                JOptionPane.showMessageDialog(null, Mensaje, "Error", 0);
                jcbRaza.grabFocus();
                return;
            }
            

            if (jrbMacho.isSelected() == false && jrbHembra.isSelected() == false) {
                JOptionPane.showMessageDialog(null, Mensaje, "Error", 0);
                jrbMacho.grabFocus();
                return;
            }

            if (jrbVivo.isSelected() == false && jrbMuerto.isSelected() == false) {
                JOptionPane.showMessageDialog(null, Mensaje, "Error", 0);
                jrbVivo.grabFocus();
                return;
            }

            if ((pesoN.equals(""))) {
                JOptionPane.showMessageDialog(null, Mensaje, "Error", 0);
                jtPesoN.grabFocus();
                return;
            }

            if ((pesoD.equals(""))) {
                JOptionPane.showMessageDialog(null, Mensaje, "Error", 0);
                jtPesoD.grabFocus();
                return;
            }

            if (codigoP.equals("")) {
                JOptionPane.showMessageDialog(null, Mensaje, "Error", 0);
                jtCodigoP.grabFocus();
                return;
            }
            
            if (codigoM.equals("")) {
                JOptionPane.showMessageDialog(null, Mensaje, "Error", 0);
                jtCodigoM.grabFocus();
                return;
            }
            
            if (fechaP.equals("")) {
                JOptionPane.showMessageDialog(null, Mensaje, "Error", 0);
                jfcFechaP.grabFocus();
                return;
            }
            
              if (edad.equals("")) {
                JOptionPane.showMessageDialog(null, Mensaje, "Error", 0);
                jtEdad.grabFocus();
                return;
            }
            
            NodoDatosAnimal N = new NodoDatosAnimal();
            N.setIdanimal(codigo);
            N.setRaza(raza);
            N.setNacimiento(pesoN);
            N.setDestete(pesoD);
            N.setCodigo(codigoP);
            N.setIdmadre(codigoM);
            N.setFecha(fechaP);
            N.setEdad(edad);
            
            if (jrbMacho.isSelected() == false) {
                N.setSexo(jrbMacho.getText());
            } else {
                N.setSexo(jrbHembra.getText());
            }
            if (jrbMuerto.isSelected() == false) {
                N.setEstado(jrbMuerto.getText());
            } else {
                N.setEstado(jrbVivo.getText());
            }

            boolean E = funcionesAnl.existe(N.getCodigo());
            if (E == true) {
                JOptionPane.showMessageDialog(null, "Ya existe un usuario con este nro de documento o usuario");
                return;
            }
            funcionesAnl.agregar(N);
            Inhabilitar();
            N = funcionesAnl.cabeza();
            funcionesAnl.ArchAnl();
            return;

        }

        if (Accion.getSource() == jbGuardarCambios) {
              NodoDatosAnimal N = funcionesAnl.buscar(jtCodigo.getText());
            if (jrbHembra.isSelected() == false) {
                N.setSexo(jrbHembra.getText());
            } else {
                N.setSexo(jrbMacho.getText());
            }
            if (jrbMuerto.isSelected() == false) {
                N.setEstado(jrbMuerto.getText());
            } else {
                N.setEstado(jrbVivo.getText());
            }
            N.setIdanimal(jtCodigo.getText());
            N.setRaza(jcbRaza.getSelectedIndex());
            N.setNacimiento(jtPeso.getText());
            N.setDestete(jtPesoD.getText());
            N.setCodigo(jtCodigoP.getText());
            N.setIdmadre(jtCodigoM.getText());
            N.setFecha(jfcFechaP.getDateFormatString());
            N.setEdad(jtEdad.getText());

            jbGuardar.setVisible(true);
            jbGuardarCambios.setVisible(true);

            funcionesAnl.ArchAnl();
            Inhabilitar();

        }
        if (Accion.getSource() == jbInhabilitar) {
            String documento = JOptionPane.showInputDialog(null, "Ingrese número de cédula del usuario a eliminar");
            boolean p = funcionesAnl.existe(documento);
            if(documento == null){
                return;
            }
            if (p != false) {
                int i = JOptionPane.showConfirmDialog(null, "Esta seguro que desea eliminar el usuario con documento: " + documento);
                if (i != 0) {
                    funcionesAnl.Eliminar(documento);
                    funcionesAnl.ArchAnl();

                }
                return;
            }
            if(p == false){
            JOptionPane.showMessageDialog(null, "Usuario no existe");
            return;
        }
        
       }
        
        if (Accion.getSource() == jbListar) {
            listarAnimales1 lAnimales = new listarAnimales1();
            lAnimales.setLocationRelativeTo(null);
        }

        if (Accion.getSource()
                == jbInhabilitar) {
            String id = JOptionPane.showInputDialog("Ingrese número de cédula del usuario a eliminar");
            boolean p = funcionesAnl.existe(id);
            if(id.equals("")){
                JOptionPane.showMessageDialog(null, "debe de ingresar un número de cédula");
                return;
            }
            if (p != false) {
                int i = JOptionPane.showConfirmDialog(null, "Esta seguro que desea eliminar el usuario con documento: " + id);
                if (i != 1) {
                    funcionesAnl.Eliminar(id);
                    funcionesAnl.ArchAnl();

                }
                return;
            }
            if(p == false){
            JOptionPane.showMessageDialog(null, "Usuario no existe");
        }
        
       }

        

        if (Accion.getSource() == jbModificar) {
            String Documento = JOptionPane.showInputDialog("Ingrese el numero de documento del"
                    + " \n usuario que desea modificar");
            if (Documento == null) {
                return;
            } 
            if (Documento == null) {
                return;
            }else {
                NodoDatosAnimal A = funcionesAnl.buscar(Documento);
                {

                }
          
                if (A != null) {
                    habilitar();
                    jtCodigo.setText(A.getIdanimal());
                    jcbRaza.setSelectedItem(A.getRaza());
                    jtPeso.setText(A.getNacimiento());
                    jtPesoD.setText(A.getDestete());
                    jtCodigoP.setText(A.getCodigo());
                    jtCodigoM.setText(A.getIdmadre());
                    jfcFechaP.setDateFormatString(A.getFecha());
                    jtEdad.setText(A.getEdad());
                if (A.getEstado() == jrbVivo.getText()) {
                    jrbVivo.setSelected(true);
                } else {
                    jrbMuerto.setSelected(true);
                }
                
                if (A.getSexo().equals(jrbHembra)) {
                    jrbHembra.setSelected(true);
                } else {
                    jrbMacho.setSelected(true);
                }
                } else {
                    JOptionPane.showMessageDialog(null, "Registro no existe");
                    return;
                }

                jbGuardarCambios.setVisible(true);
                jbGuardar.setVisible(false);

                return;
            }

        }

    }
        
     public static void main(String[] args) {
        new jfDatosAnimal();
    }

}

