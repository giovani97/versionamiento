/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Nodos.NodoDatosAnimal;
import Nodos.NodoUsuario;
import java.io.*;
import java.sql.Date;

/**
 *
 * @author user
 */
public class ListaDatosAnimal {

    public static NodoDatosAnimal cabeza;
    public static NodoDatosAnimal ultimo;
    
      DataOutputStream salida = null;
      DataInputStream entrada = null;
    
    
    public void ArchAnl() {

        NodoDatosAnimal P = cabeza();
        try {
            salida = new DataOutputStream(new FileOutputStream("Archanl.dad"));
        } catch (FileNotFoundException error) {
            System.out.println("Error al abrir el archivo:" + error.getMessage());
            System.exit(1);
        }
        try {
            while (P != null) {
                salida.writeUTF(P.getIdanimal());
                salida.writeInt(P.getRaza());
                salida.writeUTF(P.getSexo());
                salida.writeUTF(P.getEstado());
                salida.writeUTF(P.getNacimiento());
                salida.writeUTF(P.getDestete());
                salida.writeUTF(P.getCodigo());
                salida.writeUTF(P.getIdmadre());
                salida.writeUTF(P.getFecha());
                salida.writeUTF(P.getEdad());
               
                P = P.getLiga();
            }
        } catch (IOException error) {
            System.out.println("Ocurrio un error al guardar los datos en el archivo: " + error.getMessage());
            System.exit(1);
        }
    }
    
    
     public void cargar() {
        NodoDatosAnimal N = new NodoDatosAnimal();
        N.setIdanimal("0000");
        N.setSexo("David Castro");
        N.setEstado("DavidCastro@gmail.com");
        N.setNacimiento("David");
        N.setDestete("J4|<E.D06");
        N.setIdmadre("0000");
        N.setFecha("1995/07/01)");
        N.setEdad("Administrador");
        N.setRaza(1);
        N.setCodigo("0000");
        agregar(N);
        /*
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
        Agregar(N);*/

    }

    public void agregar(NodoDatosAnimal N) {
        if (cabeza == null) {
            cabeza = new NodoDatosAnimal();
            cabeza = N;
        } else {
            NodoDatosAnimal P = cabeza;
            while (P.getLiga() != null) {

                P = P.getLiga();

            }
            
                P.setLiga(N);
            
        }


    }

    public boolean existe(String ID) {
        if (cabeza == null) {
            return false;
        } else {
            NodoDatosAnimal P = cabeza;
            while (P != null) {
                if (P.getIdanimal().equals(ID)) {
                    return true;
                }
                P = P.getLiga();
            }
            return false;

        }

    }

    public NodoDatosAnimal buscar(String ID) {
        if (cabeza == null) {
            return null;
        } else {
            NodoDatosAnimal P = cabeza;
            while (P != null) {
                if (P.getIdanimal().equals(ID)) {
                    return P;
                }
                P = P.getLiga();

            }
            return null;
        }

    }
    
      public NodoDatosAnimal cabeza() {
        return cabeza;
    }

    public void Eliminar(String ID) {
        if (cabeza.getIdanimal().equals(ID)) {
            cabeza = cabeza.getLiga();
            return;
        } else {
            if (ultimo.getIdanimal().equals(ID)) {
                NodoDatosAnimal e = cabeza;
                while (e.getLiga() != ultimo) {
                    e.getLiga();
                }
                ultimo = ultimo.getLiga();
                ultimo = e;
                return;
            } else {

                NodoDatosAnimal P = cabeza;
                while (P != null) {
                    if (P.getIdanimal().equals(ID)) {
                        
                        
                        NodoDatosAnimal e = cabeza;
                        
                        while (e.getLiga() != ultimo) {
                        
                            e.getLiga();
                        }
                        e.setLiga(P.getLiga());
                        return;
                        
                    }

                    P=P.getLiga();
                }return;

            }

        }
        

    }
    
     public void CargarArchivo() {
        try {

            entrada = new DataInputStream(new FileInputStream("ArchAnl.dad"));
        } catch (IOException e) {
            System.out.println("error al abrir el archivo de lectura");
            System.exit(1);
        }
        try {

            while (true) {

                NodoDatosAnimal N = new NodoDatosAnimal();

                N.setIdanimal(entrada.readUTF());
                N.setRaza(entrada.readInt());
                N.setSexo(entrada.readUTF());
                N.setEstado(entrada.readUTF());
                N.setNacimiento(entrada.readUTF());
                N.setDestete(entrada.readUTF());
                N.setCodigo(entrada.readUTF());
                N.setIdmadre(entrada.readUTF());
                N.setFecha(entrada.readUTF());
                N.setEdad(entrada.readUTF());
                agregar(N);
            }
        } catch (EOFException e) {
            System.out.println("Se terminó el archivo");

        } catch (IOException e) {
            System.out.println("error al listar el archivo");
            System.exit(1);
        }

    }
    
    

}
