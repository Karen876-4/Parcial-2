
package punto1;


public class ReporteExcel extends Reporte {
    @Override
    public void generarContenido(String infoMatriz) {
     
        this.contenido = infoMatriz;
        imprimir();
    }
    
    @Override
    public String imprimir() {
        return ">> [Formato de Hoja de Cálculo (Excel)] Contenido registrado: " + contenido;       
    }
}
