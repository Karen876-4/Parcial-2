
package punto1;

public class ReporteSender {
  
    ReporteFactory proveedorDeFabrica;

    public ReporteSender(ReporteFactory proveedorDeFabrica){
        this.proveedorDeFabrica = proveedorDeFabrica;
    }

    public Reporte enviarReporte(String formatoRequerido, String datosCuerpo){
        
        Reporte documentoProcesado = proveedorDeFabrica.creaReporte(formatoRequerido);
        
       
        if (documentoProcesado == null) {
            return null;
        }
        
        documentoProcesado.generarContenido(datosCuerpo);
        return documentoProcesado;
    }
}
