package forms;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
import Listas.listaUsuarios;
import Nodos.NodoUsuario;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.swing.*;
import javax.swing.border.*;
public class jfUsuario extends JFrame implements ActionListener {

    listaUsuarios funcionesUsr = new listaUsuarios();

    JLabel jlNombre, jlCedula, jlCorreo, jlUsuario, jlContraseña, jlConfirmacion, jlPregunta,
            jlRespuesta, jlGDU;
    JTextField jtNombre, jtCedula, jtCorreo, jtUsuario, jtRespuesta;
    JPasswordField jpContraseña, jpConfirmacion;
    JComboBox jcPregunta;
    JRadioButton jrAdministrador, jrEmpleado, jrActivo, jrInactivo;
    JButton jbInsertar, jbModificar, jbCOnsultar, jbInhabilitar, jbGuardar, jbGuardarCambios,
            jbCancelar, jbListar;
    JPanel jpllIdentificacion, jplDatosU, jplEstado, jplRol;
    ButtonGroup jbgGrupo, jbgGrupoR;
    Image icono;
    String preguntas[] = new String[4];

    /**
     * Diseño de la ventana usuario
     */
    public jfUsuario() {
        
        
        
        setTitle("Gestión de Usuarios");
        
        

        preguntas[0] = "Seleccione";
        preguntas[1] = "¿Cual es el nombre de su madre?";
        preguntas[2] = "Nombre de su artista favorito";
        preguntas[3] = "Nombre de su mascota";

        jlGDU = new JLabel("GESTIÓN DE USUARIOS");
        jlNombre = new JLabel("Nombre");
        jlCedula = new JLabel("Cedula");
        jlCorreo = new JLabel("Correo");
        jlUsuario = new JLabel("Usuario");
        jlContraseña = new JLabel("Contraseña");
        jlConfirmacion = new JLabel("Confirmacion");
        jlPregunta = new JLabel("Pregunta");
        jlRespuesta = new JLabel("Respuesta");
        jpConfirmacion = new JPasswordField();
        jpContraseña = new JPasswordField();
        jcPregunta = new JComboBox(preguntas);

        jpllIdentificacion = new JPanel();
        jpllIdentificacion.setLayout(null);
        jpllIdentificacion.setBorder(new TitledBorder(new LineBorder(Color.black), "Identificación"));

        jtCedula = new JTextField();
        jtCorreo = new JTextField();
        jtNombre = new JTextField();
        jtRespuesta = new JTextField();
        jtUsuario = new JTextField();

        jplDatosU = new JPanel();
        jplDatosU.setLayout(null);
        jplDatosU.setBorder(new TitledBorder(new LineBorder(Color.black), "Datos de usuario"));

        jplRol = new JPanel();
        jplRol.setLayout(null);
        jplRol.setBorder(new TitledBorder(new LineBorder(Color.black), "Rol"));
        jplRol.setFont(new Font("Arial", 0, 12));
        jplEstado = new JPanel();
        jplEstado.setLayout(null);
        jplEstado.setBorder(new TitledBorder(new LineBorder(Color.black), "Estado"));

        Font fuente = new Font("Arial", 0, 12);

        jlCedula.setFont(fuente);
        jlConfirmacion.setFont(fuente);
        jlContraseña.setFont(fuente);
        jlCorreo.setFont(fuente);

        jlNombre.setFont(fuente);
        jlPregunta.setFont(fuente);
        jlRespuesta.setFont(fuente);
        jlUsuario.setFont(fuente);
        jlGDU.setFont(new Font("Arial", 1, 18));

        jbCOnsultar = new JButton("Consultar");
        jbCancelar = new JButton("Cancelar");
        jbGuardar = new JButton("Guardar");
        jbGuardarCambios = new JButton("Guardar");
        jbInhabilitar = new JButton("Inhabilitar");
        jbInsertar = new JButton("Insertar");
        jbListar = new JButton("Listar");
        jbModificar = new JButton("Modificar");
        jbModificar = new JButton("Modificar");

        jrActivo = new JRadioButton("Activo");
        jrInactivo = new JRadioButton("Inacctivo");
        jrAdministrador = new JRadioButton("Administrador");
        jrEmpleado = new JRadioButton("Empleado");

        jbgGrupo = new ButtonGroup();
        jbgGrupo.add(jrActivo);
        jbgGrupo.add(jrInactivo);
        jbgGrupoR = new ButtonGroup();
        jbgGrupoR.add(jrAdministrador);
        jbgGrupoR.add(jrEmpleado);

        jlGDU.reshape(216, 36, 211, 22);
        jpllIdentificacion.reshape(25, 74, 585, 100);
        jlNombre.reshape(55, 99, 100, 22);
        jtNombre.reshape(55, 123, 250, 22);
        jlCedula.reshape(325, 99, 250, 22);
        jtCedula.reshape(325, 123, 250, 22);

        jplDatosU.reshape(25, 199, 585, 280);

        jlCorreo.reshape(55, 224, 100, 22);
        jtCorreo.reshape(55, 248, 250, 22);

        jlUsuario.reshape(325, 224, 100, 22);
        jtUsuario.reshape(325, 248, 250, 22);

        jlContraseña.reshape(55, 282, 100, 22);
        jpContraseña.reshape(55, 306, 250, 22);

        jlConfirmacion.reshape(325, 282, 100, 22);
        jpConfirmacion.reshape(325, 306, 250, 22);

        jlPregunta.reshape(55, 340, 100, 22);
        jcPregunta.reshape(55, 364, 250, 22);

        jlRespuesta.reshape(325, 340, 100, 22);
        jtRespuesta.reshape(325, 364, 250, 22);

        jplRol.reshape(55, 408, 250, 46);

        jrAdministrador.reshape(65, 422, 120, 22);
        jrEmpleado.reshape(215, 422, 85, 22);

        jplEstado.reshape(325, 408, 250, 46);
        jrActivo.reshape(335, 422, 100, 22);
        jrInactivo.reshape(485, 422, 85, 22);

        jbInsertar.setFont(fuente);
        jbInsertar.reshape(23, 505, 90, 22);

        jbModificar.setFont(fuente);
        jbModificar.reshape(123, 505, 90, 22);

        jbCOnsultar.setFont(fuente);
        jbCOnsultar.reshape(223, 505, 90, 22);

        jbListar.setFont(fuente);
        jbListar.reshape(273, 552, 90, 22);

        add(jbListar);
        jbInhabilitar.setFont(fuente);
        jbInhabilitar.reshape(323, 505, 90, 22);

        jbGuardar.setFont(fuente);
        jbGuardar.reshape(423, 505, 90, 22);

        jbGuardarCambios.setFont(fuente);
        jbGuardarCambios.reshape(423, 505, 90, 22);

        jbCancelar.setFont(fuente);
        jbCancelar.reshape(523, 505, 90, 22);

        jbListar.setFont(fuente);

        add(jbCancelar);
        add(jbGuardar);
        add(jbGuardarCambios);
        add(jbInhabilitar);
        add(jbCOnsultar);
        add(jbModificar);
        add(jbInsertar);
        add(jrInactivo);
        add(jrActivo);
        add(jplEstado);

        add(jrEmpleado);
        add(jrAdministrador);
        add(jplRol);
        add(jlRespuesta);
        add(jtRespuesta);
        jcPregunta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                if (jcPregunta.getSelectedIndex() == 0) {

                    jtRespuesta.setEditable(false);
                } else {

                    jtRespuesta.setEditable(true);

                }
            }
        });
        add(jcPregunta);
        add(jlCedula);
        add(jtNombre);
        add(jlNombre);
        Numeros(jtCedula);
        add(jtCedula);
        add(jlPregunta);
        add(jlUsuario);
        add(jlCorreo);
        add(jlContraseña);
        add(jlConfirmacion);
        add(jtUsuario);
        add(jtCorreo);
        add(jpConfirmacion);
        add(jpContraseña);
        add(jpllIdentificacion);

        add(jplDatosU);

        jbListar.addActionListener(this);
        jbInsertar.addActionListener(this);
        jbModificar.addActionListener(this);
        jbGuardar.addActionListener(this);
        jbGuardarCambios.addActionListener(this);
        jbCancelar.addActionListener(this);
        jbCOnsultar.addActionListener(this);
        jbInhabilitar.addActionListener(this);
//        funcionesUsr.CargarArchivo();

        Inhabilitar();
        this.add(jlGDU);
        this.resize(650, 650);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.show();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }
/**
 * Habilita los cammpos
 */
    public void habilitar() {

        jtNombre.setText("");
        jtCedula.setText("");
        jtCorreo.setText("");
        jtUsuario.setText("");
        jpContraseña.setText("");
        jpConfirmacion.setText("");
        jcPregunta.setSelectedIndex(0);
        jtRespuesta.setText("");
        jrAdministrador.setSelected(false);
        jrEmpleado.setSelected(false);
        jrActivo.setSelected(false);
        jrInactivo.setSelected(false);


        jtNombre.setEditable(true);
        jtCedula.setEditable(true);
        jtCorreo.setEditable(true);
        jtUsuario.setEditable(true);
        jpContraseña.setEditable(true);
        jpConfirmacion.setEditable(true);
        jcPregunta.setEnabled(true);
        jtRespuesta.setEnabled(true);
        jrAdministrador.setEnabled(true);
        jrEmpleado.setEnabled(true);
        jrActivo.setEnabled(true);
        jrInactivo.setEnabled(true);
        jbInsertar.setEnabled(false);
        jbModificar.setEnabled(false);
        jbCOnsultar.setEnabled(false);
        jbInhabilitar.setEnabled(false);
        jbGuardar.setEnabled(true);
        jbCancelar.setEnabled(true);

    }
/**
 * Inhabilita los campos
 */
    public void Inhabilitar() {

        jtNombre.setText("");
        jtCedula.setText("");
        jtCorreo.setText("");
        jtUsuario.setText("");
        jpContraseña.setText("");
        jpConfirmacion.setText("");
        jcPregunta.setSelectedIndex(0);
        jtRespuesta.setText("");
        jrAdministrador.setSelected(false);
        jrEmpleado.setSelected(false);
        jrActivo.setSelected(false);
        jrInactivo.setSelected(false);

        jtNombre.setEditable(false);
        jtCedula.setEditable(false);
        jtCorreo.setEditable(false);
        jtUsuario.setEditable(false);
        jpContraseña.setEditable(false);
        jpConfirmacion.setEditable(false);
        jcPregunta.setEnabled(false);
        jtRespuesta.setEnabled(false);
        jrAdministrador.setEnabled(false);
        jrEmpleado.setEnabled(false);
        jrActivo.setEnabled(false);
        jrInactivo.setEnabled(false);
        jbInsertar.setEnabled(true);
        jbModificar.setEnabled(true);
        jbCOnsultar.setEnabled(true);
        jbInhabilitar.setEnabled(true);
        jbGuardar.setEnabled(false);
        jbCancelar.setEnabled(false);

    }

    public void Numeros(JTextField Numeros) {
        Numeros.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {

                char c = e.getKeyChar();

                if (!(Character.isDigit(c))) {
                    getToolkit().beep();
                    e.consume();
                }
            }
        });
    }

    public void actionPerformed(ActionEvent Accion) {

        if (Accion.getSource() == jbInsertar) {
            habilitar();
            
            return;
        }
        if (Accion.getSource() == jbModificar) {

            String Documento = JOptionPane.showInputDialog("Ingrese el numero de documento del"
                    + " \n usuario que desea modificar");
            if (Documento == "") {
            } else {
                NodoUsuario A = funcionesUsr.buscar(Documento, "");
                {

                }
                if (A != null) {
                    habilitar();
                    jtCedula.setEditable(true);
                    jtNombre.setText(A.getNombre());
                    jtCedula.setText(A.getCedula());
                    jtCorreo.setText(A.getCorreo());
                    jtUsuario.setText(A.getUsuario());
                    jpContraseña.setText(A.getContraseña());
                    jpConfirmacion.setText(A.getContraseña());
                    jcPregunta.setSelectedIndex(A.getPregunta());
                    jtRespuesta.setText(A.getRespuesta());
                    if (A.getRol() == jrInactivo.getText()) {
                        jrInactivo.setSelected(true);
                    } else {
                        jrActivo.setSelected(true);
                    }
                    if (A.getEstado() == jrEmpleado.getText()) {
                        jrEmpleado.setSelected(true);
                    } else {
                        jrAdministrador.setSelected(true);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Registro no existe");
                }

                jbGuardarCambios.setVisible(true);
                jbGuardar.setVisible(false);

                return;
            }
        }
        if (Accion.getSource() == jbGuardarCambios) {

            NodoUsuario N = funcionesUsr.buscar(jtCedula.getText(), "");
            if (jrEmpleado.isSelected() == false) {
                N.setRol(jrAdministrador.getText());
            } else {
                N.setRol(jrEmpleado.getText());
            }
            if (jrInactivo.isSelected() == false) {
                N.setEstado(jrActivo.getText());
            } else {
                N.setEstado(jrInactivo.getText());
            }
            N.setCorreo(jtCorreo.getText());
            N.setNombre(jtNombre.getText());
            N.setRespuesta(jtRespuesta.getText());
            N.setUsuario(jtUsuario.getText());
            N.setPregunta(jcPregunta.getSelectedIndex());

            jbGuardar.setVisible(true);
            jbGuardarCambios.setVisible(true);

            funcionesUsr.ArchUsr();
            Inhabilitar();

        }

        if (Accion.getSource()
                == jbGuardar) {

            String Nombre = jtNombre.getText(), Cedula = jtCedula.getText(), 
                    Correo = jtCorreo.getText(),
                    Usuario = jtUsuario.getText(), Contraseña = (String) 
                    jpContraseña.getText(), Respuesta = jtRespuesta.getText(), 
                    Mensaje = "Faltan campos por ingresar.\n";

            int Pregunta = jcPregunta.getSelectedIndex();
            boolean Estado, Rol;

            if (Nombre.equals("")) {
                JOptionPane.showMessageDialog(null, Mensaje, "Error", 0);
                jtNombre.grabFocus();
                return;
            }
            if (Cedula.equals("")) {
                JOptionPane.showMessageDialog(null, Mensaje, "Error", 0);
                jtCedula.grabFocus();
                return;

            }
            if (Correo.equals("")) {
                JOptionPane.showMessageDialog(null, Mensaje, "Error", 0);
                jtCorreo.grabFocus();
                return;
            }
            if (Usuario.equals("")) {
                JOptionPane.showMessageDialog(null, Mensaje, "Error", 0);
                jtUsuario.grabFocus();
                return;
            }
            if (Contraseña.equals("")) {
                JOptionPane.showMessageDialog(null, Mensaje, "Error", 0);
                jpContraseña.grabFocus();
                return;
            }
            if ((jpConfirmacion.equals(""))) {
                JOptionPane.showMessageDialog(null, Mensaje, "Error", 0);
                jpConfirmacion.grabFocus();
                return;

            }
            if (!(jpConfirmacion.getText().equalsIgnoreCase(Contraseña))) {
                JOptionPane.showMessageDialog(null, "La contraseña y la confirmación \n deben ser iguales.", "Error", 0);
                jpConfirmacion.setText("");
                jpContraseña.setText("");
                jpContraseña.grabFocus();
                return;
            }

            if (Pregunta == 0) {
                JOptionPane.showMessageDialog(null, Mensaje, "Error", 0);
                jplRol.grabFocus();
                return;
            }
            if (Pregunta != 0 && Respuesta.equals("")) {
                JOptionPane.showMessageDialog(null, Mensaje, "Error", 0);
                jtRespuesta.grabFocus();
                return;
            }
            if (jrAdministrador.isSelected() == false && jrEmpleado.isSelected() == false) {

            }

            if (jrActivo.isSelected() == false && jrInactivo.isSelected() == false) {
                JOptionPane.showMessageDialog(null, Mensaje, "Error", 0);
                jplEstado.grabFocus();
                return;
            }
            NodoUsuario N = new NodoUsuario();
            N.setNombre(Nombre);
            N.setCedula(Cedula);
            N.setCorreo(Correo);
            N.setUsuario(Usuario);
            N.setContraseña(Contraseña);
            N.setPregunta(Pregunta);
            N.setRespuesta(Respuesta);
            if (jrEmpleado.isSelected() == false) {
                N.setRol(jrAdministrador.getText());
            } else {
                N.setRol(jrEmpleado.getText());
            }
            if (jrInactivo.isSelected() == false) {
                N.setEstado(jrActivo.getText());
            } else {
                N.setEstado(jrInactivo.getText());
            }

            boolean E = funcionesUsr.existe(N.getCedula(), N.getUsuario());
            if (E == true) {
                JOptionPane.showMessageDialog(null, 
                        "Ya existe un usuario con este nro de documento o usuario");
                return;
            }
            funcionesUsr.Agregar(N);
            Inhabilitar();
            N = funcionesUsr.cabeza();
            funcionesUsr.ArchUsr();
            return;

        }

        if (Accion.getSource()
                == jbCOnsultar) {
            String Documento = JOptionPane.showInputDialog("Ingrese un numero de documento");
            NodoUsuario A = funcionesUsr.buscar(Documento, "");
            if (A != null) {
                jtNombre.setText(A.getNombre());
                jtCedula.setText(A.getCedula());
                jtCorreo.setText(A.getCorreo());
                jtUsuario.setText(A.getUsuario());
                jpContraseña.setText(A.getContraseña());
                jpConfirmacion.setText(A.getContraseña());
                jcPregunta.setSelectedIndex(A.getPregunta());
                jtRespuesta.setText(A.getRespuesta());
                if (A.getEstado() == jrInactivo.getText()) {
                    jrInactivo.setSelected(true);
                } else {
                    jrActivo.setSelected(true);
                }
                if (A.getRol().equalsIgnoreCase(jrAdministrador.getText())) {
                    jrAdministrador.setSelected(true);
                } else {
                    jrEmpleado.setSelected(true);
                }

            } else {
                JOptionPane.showMessageDialog(this, "Registro no existe");
            }
        }

        if (Accion.getSource()
                == jbCancelar) {
            Inhabilitar();
            return;
        }
        if (Accion.getSource() == jbListar) {
            listarUsuario lUsuario = new listarUsuario();
            lUsuario.setLocationRelativeTo(null);
            lUsuario.setVisible(true);
        }

        if (Accion.getSource()
                == jbInhabilitar) {
            String documento = JOptionPane.showInputDialog("¿Cual usuario desea eliminar?");
            boolean p = funcionesUsr.existe(documento, "");
            if (p != false) {
                int i = JOptionPane.showConfirmDialog(null, "Esta seguro que desea eliminar a el usuario con documento" + documento);
                if (i != 1) {
                    funcionesUsr.Eliminar(documento);
                    funcionesUsr.ArchUsr();

                }
                return;
            }
            JOptionPane.showMessageDialog(null, "Usuario no existe");
        }

    }

    public static void main(String[] args) {
        new jfUsuario();
    }

}
