/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto1;

public class ReporteFactory {
    
    public Reporte creaReporte(String tipoReporte){
       
        Reporte instanciaCreada = null;
        
        if (tipoReporte == null) {
            return null;
        }
        
        
        String formatoNormalizado = tipoReporte.toUpperCase().trim();
        
        
        if (formatoNormalizado.equals("PDF")) {
            instanciaCreada = new ReportePDF();
        } else if (formatoNormalizado.equals("HTML")) {
            instanciaCreada = new ReporteHTML();
        } else if (formatoNormalizado.equals("EXCEL")) {
            instanciaCreada = new ReporteExcel();
        }
        
        return instanciaCreada;
    }
}