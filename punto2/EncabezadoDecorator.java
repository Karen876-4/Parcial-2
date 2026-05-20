
package punto2;


import punto1.Reporte;

public class EncabezadoDecorator extends ReporteDecorador {
    
    public EncabezadoDecorator(Reporte reporteBase, String texto) {
        super(reporteBase, texto);
    }

    @Override
    public String getContenido() {
       
        return String.format("%s | %s", this.documentoEnvuelto.getContenido(), this.contenido);
    }

    @Override
    public void generarContenido(String data) {
        this.contenido = data;
    }

    @Override
    public String imprimir() {
        
        return "*** ENCABEZADO INFORMATIVO: " + this.contenido + " ***\n" + this.documentoEnvuelto.imprimir();    
    }
}