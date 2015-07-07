package Listas;

import Nodos.NodoUsuario;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class listaUsuarios {

    private static NodoUsuario cabeza;
    DataOutputStream salida = null;
    DataInputStream entrada = null;

    public void ArchUsr() {

        NodoUsuario P = cabeza();
        try {
            salida = new DataOutputStream(new FileOutputStream("ArchUsr.dad"));
        } catch (FileNotFoundException error) {
            System.out.println("Error al abrir el archivo:" + error.getMessage());
            System.exit(1);
        }
        try {
            while (P != null) {
                salida.writeUTF(P.getCedula());
                salida.writeUTF(P.getNombre());
                salida.writeUTF(P.getCorreo());
                salida.writeUTF(P.getUsuario());
                salida.writeUTF(P.getContraseña());
                salida.writeInt(P.getPregunta());
                salida.writeUTF(P.getRespuesta());
                salida.writeUTF("" + P.getEstado());
                salida.writeUTF("" + P.getRol());
                P = P.getLiga();
            }
        } catch (IOException error) {
            System.out.println("Ocurrio un error al guardar los datos en el archivo: " + error.getMessage());
            System.exit(1);
        }
    }

    public void cargar() {
        NodoUsuario N = new NodoUsuario();
        N.setCedula("1026787455");
        N.setNombre("David Castro");
        N.setCorreo("DavidCastro@gmail.com");
        N.setUsuario("David");
        N.setContraseña("J4|<E.D06");
        N.setPregunta(2);
        N.setRespuesta("Slayer");
        N.setRol("Administrador");
        N.setEstado("Activo");
        Agregar(N);
        N = new NodoUsuario();
        N.setCedula("1045678554");
        N.setNombre("Juan Pablo Serna");
        N.setCorreo("JuanSerna@gmail.com");
        N.setUsuario("Juan");
        N.setContraseña("juan123");
        N.setPregunta(4);
        N.setRespuesta("perro");
        N.setRol("Empleado");
        N.setEstado("Inactivo");
        Agregar(N);

    }

    public void Agregar(NodoUsuario usr) {

        if (cabeza == null) {
            cabeza = new NodoUsuario();
            cabeza = usr;
        } else {
            
            NodoUsuario P = cabeza;
            while (P.getLiga() != null) {

                P = P.getLiga();

            }
            
                P.setLiga(usr);
            
        }

    }

    public NodoUsuario cabeza() {
        return cabeza;
    }

    public boolean existe(String Documento, String usr) {
        if (cabeza == null) {
            return false;

        } else {
            NodoUsuario P;
            P = cabeza;
            while (P != null) {
                if (P.getCedula().equals(Documento) || P.getUsuario().equals(usr)) {

                    return true;
                }
                P = P.getLiga();
            }
            return false;

        }

    
    
    }
    //Busca un nodo usuario
    public NodoUsuario buscar(String Documento, String Usuario) {
        if (cabeza == null) {
            return null;

        } else {
            NodoUsuario P;
            P = cabeza;
            while (P != null) {
                if (P.getCedula().equals(Documento) || P.getUsuario().equals(Usuario)) {

                    return P;
                }
                P = P.getLiga();
            }
            return null;

        }

    }
    
    

    public void Eliminar(String Documento) {
        if (cabeza.getCedula().equals(Documento)) {
            cabeza = cabeza.getLiga();
            return;
        } else {
            NodoUsuario P = cabeza;
            while (P != null) {
                if (P.getCedula().equals(Documento)) {
                    NodoUsuario E = cabeza;
                    while (E.getLiga() != P) {
                        E = E.getLiga();

                    }
                    E.setLiga(P.getLiga());
                    JOptionPane.showMessageDialog(null, "Usuario eliminado con exito");
                    return;
                }
                P = P.getLiga();
            }
            JOptionPane.showMessageDialog(null, "no se ha podido eliminar el usuario");
            return;

        }
    }

    public void CargarArchivo() {
        try {

            entrada = new DataInputStream(new FileInputStream("ArchUsr.dad"));
        } catch (IOException e) {
            System.out.println("error al abrir el archivo de lectura");
            System.exit(1);
        }
        try {

            while (true) {

                NodoUsuario N = new NodoUsuario();

                N.setCedula(entrada.readUTF());
                N.setNombre(entrada.readUTF());
                N.setCorreo(entrada.readUTF());
                N.setUsuario(entrada.readUTF());
                N.setContraseña(entrada.readUTF());
                N.setPregunta(entrada.readInt());
                N.setRespuesta(entrada.readUTF());
                N.setEstado(entrada.readUTF());
                N.setRol(entrada.readUTF());
                Agregar(N);
            }
        } catch (EOFException e) {
            System.out.println("Se terminó el archivo");

        } catch (IOException e) {
            System.out.println("error al listar el archivo");
            System.exit(1);
        }

    }
}