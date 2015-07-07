package Nodos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *Metodo para Crear el nodo usuario
 * @author Juan Pablo Serna y Giovani Murillo 
 */
public class NodoUsuario {

    String Nombre,
            Cedula,
            Correo,
            Usuario,
            Contraseña,
            Respuesta,
            Estado,
            Rol;
    int Pregunta;
    NodoUsuario Liga;

    public NodoUsuario getLiga() {
        return Liga;
    }

    public void setLiga(NodoUsuario Liga) {
        this.Liga = Liga;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getRespuesta() {
        return Respuesta;
    }

    public void setRespuesta(String Respuesta) {
        this.Respuesta = Respuesta;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }

    public int getPregunta() {
        return Pregunta;
    }

    public void setPregunta(int Pregunta) {
        this.Pregunta = Pregunta;
    }

}
