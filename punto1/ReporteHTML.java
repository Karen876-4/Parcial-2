
package punto1;

public class ReporteHTML extends Reporte {
    @Override
    public void generarContenido(String estructuraWeb) {
        this.contenido = estructuraWeb;
        imprimir();
    }
    
    @Override
    public String imprimir() {
       
        return ">> [Estructura Web (HTML)] Código y texto embebido: " + contenido;
    }
}