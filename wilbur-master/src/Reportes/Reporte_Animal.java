/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;

import Listas.ListaDatosAnimal;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 *
 * @author user
 */
public class Reporte_Animal {

    public static String Reporte = System.getProperty("user.dir") +"/ReporteAnimal.pdf";

    public void createPdf() throws DocumentException {
        PdfWriter Escritor = null;

        Document ReporteAnimal = new Document(PageSize.LETTER);

        try {
            Escritor = PdfWriter.getInstance(ReporteAnimal, new FileOutputStream(Reporte));
        } catch (FileNotFoundException Error) {
            System.out.println("Error al inicializar el Escritor");

        }

        ReporteAnimal.addTitle("Reporte de animal");

        ReporteAnimal.open();

        Paragraph palabras = new Paragraph();

        palabras.add("Reporte de animal");

        palabras.setFont(FontFactory.getFont("Arial", 18, 1));

        palabras.setAlignment(palabras.ALIGN_CENTER);
        
        
        ReporteAnimal.add(palabras);
        
        ReporteAnimal.add(new Phrase(""));
        
        try{
            
            PdfPTable Tabla = new PdfPTable(10);
            Tabla.addCell("Codigo");
            Tabla.addCell("Raza");
            Tabla.addCell("Sexo");
            Tabla.addCell("Estado");
            Tabla.addCell("Peso Nacimiento");
            Tabla.addCell("Peso destete");
            Tabla.addCell("Codigo parto");
            Tabla.addCell("Codigo madrte");
            Tabla.addCell("fecha del parto");
            Tabla.addCell("edad(Semanas)");
            
            Listas.ListaDatosAnimal L = new ListaDatosAnimal();
            
            
            
            Nodos.NodoDatosAnimal P = L.cabeza();
            
            while(P!= null){
                Tabla.addCell(P.getIdanimal());
                Tabla.addCell("" + P.getRaza());
                Tabla.addCell(P.getSexo());
                Tabla.addCell(P.getEstado());
                Tabla.addCell(P.getNacimiento());
                Tabla.addCell(P.getDestete());
                Tabla.addCell(P.getCodigo());
                Tabla.addCell(P.getIdmadre());
                Tabla.addCell(P.getFecha());
                Tabla.addCell(P.getEdad());
                
                P=P.getLiga();
            
            }
            ReporteAnimal.add(Tabla);
        }catch(DocumentException Error2){
            System.out.println("Error al agregar la tabla");
        }
        ReporteAnimal.close();
        Escritor.close();
    }


    public static void main(String[] args) throws DocumentException {
        //Llamamos por el método para generar el pdf
        new Reporte_Animal().createPdf();
    }
}
