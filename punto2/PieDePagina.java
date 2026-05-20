
package punto2;

import punto1.Reporte;

public class PieDePagina extends ReporteDecorador {

    public PieDePagina(Reporte reporteBase, String textoDetalle) {
        super(reporteBase, textoDetalle);
    }

    @Override
    public String getContenido() {
        return this.documentoEnvuelto.getContenido() + " + " + this.contenido;
    }

    @Override
    public void generarContenido(String data) {
        this.contenido = data;
    }

    @Override
    public String imprimir() {
        
        return this.documentoEnvuelto.imprimir() + "\n--- ANOTACIÓN INFERIOR: " + this.contenido + " ---";    
    }
}
