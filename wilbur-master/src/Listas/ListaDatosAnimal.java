/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Nodos.NodoDatosAnimal;

/**
 *
 * @author Giovani Murillo y Juan Pablo Serna
 */
public class ListaDatosAnimal {

    public static NodoDatosAnimal cabeza;
    public static NodoDatosAnimal ultimo;

    
 /**
  * Metodo para  agregar animales a la lista
  * @param N 
  */
    public void agregar(NodoDatosAnimal N) {
        if (cabeza == null) {
            cabeza = new NodoDatosAnimal();
            cabeza = ultimo = N;
            return;
        } else {
            ultimo.setLiga(N);
            ultimo = ultimo.getLiga();
        }

    }

    /**
     * 
     * Metodo para avisar si existe o no el animal a ingresar
     * @param ID Código para identificar al animal
     * @return 
     */
    public boolean existe(String ID) {
        if (cabeza == null) {
            return false;
        } else {
            NodoDatosAnimal P = cabeza;
            while (P != null) {
                if (P.getIDAnimal().equals(ID)) {
                    return true;
                }
                P = P.getLiga();
            }
            return false;

        }

    }

    /**
     * 
     * Metodo para buscar el animal en la lista con su ID
     * @param ID Código para identificar al animal
     * @return 
     */
    public NodoDatosAnimal buscar(String ID) {
        if (cabeza == null) {
            return null;
        } else {
            NodoDatosAnimal P = cabeza;
            while (P != null) {
                if (P.getIDAnimal().equals(ID)) {
                    return P;
                }
                P = P.getLiga();

            }
            return null;
        }

    }

    /**
     * Metodo para eliminar el animal en la lista
     * @param ID Código por el cual se identifica al animal para elimnarlo
     */
    public void Eliminar(String ID) {
        if (cabeza.getIDAnimal().equals(ID)) {
            cabeza = cabeza.getLiga();
            return;
        } else {
            if (ultimo.getIDAnimal().equals(ID)) {
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
                    if (P.getIDAnimal().equals(ID)) {
                        
                        
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
    
    

}
