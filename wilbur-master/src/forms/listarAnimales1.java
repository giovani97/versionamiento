/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import Listas.ListaDatosAnimal;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class listarAnimales1 extends JFrame {

    JTable Tabla = new JTable();
    DefaultTableModel ModeloTabla;
    JScrollPane Scroll = new JScrollPane();
    Image icon;

    public listarAnimales1() {
        
        icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/wilbur.png"));
        
        Listas.ListaDatosAnimal lista = new ListaDatosAnimal();
        
        Nodos.NodoDatosAnimal P = lista.cabeza();
        String filas[] = new String[10];
        String prFila[] = new String[]{"Codigo Animal", "Raza", "Sexo", "Estado","Nacimiento", "Destete",
            "Codigo Parto", "Codigo Madre","Fecha de parto","Edad"};
        ModeloTabla = new DefaultTableModel(null, prFila);
        while (P != null) {
            filas[0] = P.getIdanimal();
            filas[1] = "" + P.getRaza();
            filas[2] = P.getSexo();
            filas[3] = P.getEstado();
            filas[4] = P.getNacimiento();
            filas[5] = P.getDestete();
            filas[6] = P.getCodigo();
            filas[7] = P.getIdmadre();
            filas[8] = P.getFecha();
            filas[9] = P.getEdad();
            
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
        setIconImage(icon);
    }

    public static void main(String[] args) {
        new listarAnimales1();
    }

}
