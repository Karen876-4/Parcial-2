
package punto1;

public abstract class Reporte {
    public String contenido;
    public abstract void generarContenido(String contenido);
    public String getContenido(){
        return contenido;
    }
    public abstract String imprimir();
}
