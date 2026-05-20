
package punto2;


import punto1.Reporte;

public class MarcaDeAguaDecorator extends ReporteDecorador {

    public MarcaDeAguaDecorator(Reporte reporteBase, String textoSello) {
        super(reporteBase, textoSello);
    }

    @Override
    public String getContenido() {
        return "[Sello: " + this.contenido + "] " + this.documentoEnvuelto.getContenido();
    }

    @Override
    public void generarContenido(String data) {
        this.contenido = data;
    }

    @Override
    public String imprimir() {
       
        return this.documentoEnvuelto.imprimir() + " >> SELLO GLOBAL: " + this.contenido + " <<";    
    }
}