
package principal;

import punto1.*;
import punto2.EncabezadoDecorator;
import punto2.MarcaDeAguaDecorator;
import punto2.PieDePagina;
import punto3.ConfiguracionSistema;

public class Main {
    public static void main(String[] args) {
        ConfiguracionSistema gestorAjustes = ConfiguracionSistema.obtenerConfiguracion(" Confidencial", "Oficina Nacional", "PDF");  
        
        ReporteFactory fabrica = new ReporteFactory();
        ReporteSender despachador = new ReporteSender(fabrica);
        
        Reporte docHTML = new ReporteHTML();
        Reporte docExcel = new ReporteExcel();
        Reporte docPDF = new ReportePDF();

        
        System.out.println("\n[MÓDULO 1] - Generación de Formatos Base:");
        
        
        
        docHTML = despachador.enviarReporte("HTML", "Análisis de patrones en el desarrollo de software moderno");
        System.out.println(docHTML.imprimir());
        
       
        docExcel = despachador.enviarReporte("Excel", "Monitoreo de indicadores financieros y estadísticos");
        System.out.println(docExcel.imprimir());
        
        
        docPDF = despachador.enviarReporte("PDF", "Auditoría interna de documentos gubernamentales");
        System.out.println(docPDF.imprimir());

       
        System.out.println("\n[MÓDULO 2] - Inyección de Capas Decoradoras:");
        
        
        
        docHTML = new EncabezadoDecorator(docHTML, " Consulte el catálogo completo en nuestra intranet");
        System.out.println(docHTML.imprimir());
        
        
        docExcel = new PieDePagina(docExcel, " Información contable registrada el: 20/05/26");
        System.out.println(docExcel.imprimir());
        
        
        docPDF = new MarcaDeAguaDecorator(docPDF, " Sello de restricción: Propiedad Intelectual");
        System.out.println(docPDF.imprimir());
        
       
        System.out.println("\n[MÓDULO 3] - Pruebas del Entorno Centralizado:");
        
        
       
        gestorAjustes.procesarReportePredeterminado();
        
        
        ConfiguracionSistema intentoClon = ConfiguracionSistema.obtenerConfiguracion(null, null, null);
    } 
} 