/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import Listas.listaUsuarios;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class listarUsuario extends JFrame {

    JTable Tabla = new JTable();
    DefaultTableModel ModeloTabla;
    JScrollPane Scroll = new JScrollPane();

    public listarUsuario() {
        Listas.listaUsuarios lista = new listaUsuarios();
        
        Nodos.NodoUsuario P = lista.cabeza();
        String filas[] = new String[5];
        String prFila[] = new String[]{"Usuario", "Nombre", "Correo", "Cedula","Perfil"};
        ModeloTabla = new DefaultTableModel(null, prFila);
        while (P != null) {
            filas[0] = P.getUsuario();
            filas[1] = P.getNombre();
            filas[2] = P.getCorreo();
            filas[3] = P.getCedula();
            filas[4] = P.getRol();
            
            ModeloTabla.addRow(filas);
            P = P.getLiga();

        }
        Tabla.setModel(ModeloTabla);
        Scroll.add(Tabla);
        add(Scroll);
        //add(Tabla);

        setSize(400, 200);
        Scroll.setViewportView(Tabla);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new listarUsuario();
    }

}
