/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto1;

public class ReportePDF extends Reporte {
    @Override
    public void generarContenido(String documentoFijo) {
        this.contenido = documentoFijo;
        imprimir();
    }
    
    @Override
    public String imprimir() {
      
        return ">> [Documento Portable (PDF)] Archivo generado: " + contenido;
    }
}