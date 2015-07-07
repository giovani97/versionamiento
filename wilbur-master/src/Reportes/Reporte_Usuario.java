/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;

import Listas.listaUsuarios;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Metodo para realizar el reporte de los usuarios
 * @author Giovani Murillo y Juan Pablo Serna
 */
public class Reporte_Usuario {

    public static String Reporte = System.getProperty("user.dir") +"/ReporteUsuario.pdf";

    public void createPdf() throws DocumentException {
        PdfWriter Escritor = null;

        Document ReporteUsuario = new Document(PageSize.LETTER);

        try {
            Escritor = PdfWriter.getInstance(ReporteUsuario, new FileOutputStream(Reporte));
        } catch (FileNotFoundException Error) {
            System.out.println("Error al inicializar el Escritor");

        }

        ReporteUsuario.addTitle("Reporte de usuarios");

        ReporteUsuario.open();

        Paragraph palabras = new Paragraph();

        palabras.add("Reporte de usuarios");

        palabras.setFont(FontFactory.getFont("Arial", 18, 1));

        palabras.setAlignment(palabras.ALIGN_CENTER);
        
        
        ReporteUsuario.add(palabras);
        
        ReporteUsuario.add(new Phrase(""));
        
        try{
            
            PdfPTable Tabla = new PdfPTable(5);
            Tabla.addCell("Usuario");
            Tabla.addCell("Nombre");
            Tabla.addCell("Correo");
            Tabla.addCell("Cedula");
            Tabla.addCell("Perfil");
            
            Listas.listaUsuarios L = new listaUsuarios();
            
            
            
            Nodos.NodoUsuario P = L.cabeza();
            
            while(P!= null){
                Tabla.addCell(P.getUsuario());
                Tabla.addCell(P.getNombre());
                Tabla.addCell(P.getCorreo());
                Tabla.addCell(P.getCedula());
                Tabla.addCell(P.getRol());
                
                P=P.getLiga();
            
            }
            ReporteUsuario.add(Tabla);
        }catch(DocumentException Error2){
            System.out.println("Error al agregar la tabla");
        }
        ReporteUsuario.close();
        Escritor.close();
    }


    public static void main(String[] args) throws DocumentException {
        //Llamamos por el método para generar el pdf
        new Reporte_Usuario().createPdf();
    }
}
