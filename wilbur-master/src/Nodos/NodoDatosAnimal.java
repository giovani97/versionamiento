/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodos;

/**
 *
 * @author Giovani Murillo y Juan Pablo Serna
 */
public class NodoDatosAnimal {

    String IDAnimal, PesNa, Pesde, IDParto, Raza;
    Boolean Sexo, Estado;
    NodoDatosAnimal Liga;

    public NodoDatosAnimal getLiga() {
        return Liga;
    }

    public void setLiga(NodoDatosAnimal Liga) {
        this.Liga = Liga;
    }

    public void setID(String newID) {
        this.IDAnimal = newID;
    }

    public void setPesNa(String newPesNa) {

        this.PesNa = newPesNa;

    }

    public String getIDAnimal() {
        
        return IDAnimal;
        
    }

    public void setIDAnimal(String IDAnimal) {
    
        this.IDAnimal = IDAnimal;
    
    }

    public String getPesde() {
        
        return Pesde;
    
    }

    public void setPesde(String Pesde) {
    
        this.Pesde = Pesde;
    
    }

    public String getIDParto() {
    
        return IDParto;
    
    }

    public void setIDParto(String IDParto) {
    
        this.IDParto = IDParto;
    
    }

    public String getRaza() {
    
        return Raza;
    
    }

    public void setRaza(String Raza) {
    
        this.Raza = Raza;
    
    }

    public Boolean isSexo() {
    
        return Sexo;
    
    }

    public void setSexo(Boolean Sexo) {
    
        this.Sexo = Sexo;
    
    }

    public Boolean isEstado() {
    
        return Estado;
    
    }

    public void setEstado(Boolean Estado) {
    
        this.Estado = Estado;
    
    }

}
