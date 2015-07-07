/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodos;

/**
 *
 * @author user
 */
public class NodoDatosAnimal {

    String Idanimal,
            Sexo,
            Estado,
            Nacimiento,
            Destete,
            Fecha,
            Codigo,
            Edad,
            Idmadre;
    int Raza;
    NodoDatosAnimal Liga;

    public NodoDatosAnimal getLiga() {
        return Liga;
    }

    public void setLiga(NodoDatosAnimal Liga) {
        this.Liga = Liga;
    }

    public String getIdanimal() {
        return Idanimal;
    }

    public void setIdanimal(String Idanimal) {
        this.Idanimal = Idanimal;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getNacimiento() {
        return Nacimiento;
    }

    public void setNacimiento(String Nacimiento) {
        this.Nacimiento = Nacimiento;
    }

    public String getDestete() {
        return Destete;
    }

    public void setDestete(String Destete) {
        this.Destete = Destete;
    }

    public String getIdmadre() {
        return Idmadre;
    }

    public void setIdmadre(String Idmadre) {
        this.Idmadre = Idmadre;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public int getRaza() {
        return Raza;
    }

    public void setRaza(int Raza) {
        this.Raza = Raza;
    }
    
    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }


}
