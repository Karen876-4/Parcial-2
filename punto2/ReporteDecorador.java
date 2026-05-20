
package punto2;


import punto1.Reporte;

public abstract class ReporteDecorador extends Reporte {
    protected Reporte documentoEnvuelto;    
    
    public ReporteDecorador(Reporte reporteBase, String textoExtra) {
        this.documentoEnvuelto = reporteBase;
        this.contenido = textoExtra; 
    }
    
    @Override
    public abstract String getContenido();
    
    @Override
    public abstract String imprimir();
}