
package punto3;

import punto1.ReporteFactory;
import punto1.Reporte;
import punto1.ReporteSender;
import punto2.MarcaDeAguaDecorator;

public class ConfiguracionSistema {
    
    private static ConfiguracionSistema unificadorAjustes;

    
    private String selloAgua;
    private String formatoElegido;
    private String directorioDestino;
    
    private ReporteFactory fabricaReportes;
    private ReporteSender despachadorReportes;
    
    
    private ConfiguracionSistema(String sello, String ruta, String formato) {
        this.selloAgua = sello;
        this.directorioDestino = ruta;
        this.formatoElegido = formato;
        
        
        this.fabricaReportes = new ReporteFactory();
        this.despachadorReportes = new ReporteSender(this.fabricaReportes);
    }

    
    public static ConfiguracionSistema obtenerConfiguracion(String sello, String ruta, String formato) {
        if (unificadorAjustes == null) {
            unificadorAjustes = new ConfiguracionSistema(sello, ruta, formato);
        } else {
            
            System.out.println("[Alerta Sistema]: El entorno ya cuenta con parámetros establecidos. Denegando nueva inicialización.\n");
        }
        return unificadorAjustes;
    }

    
    public void cambiarFormatoBase(String nuevoFormato) {
        this.formatoElegido = nuevoFormato;
    }

    public String getSelloAgua() {
        return selloAgua;
    }

    public void setSelloAgua(String selloAgua) {
        this.selloAgua = selloAgua;
    }

    public String getFormatoElegido() {
        return formatoElegido;
    }

    public String getDirectorioDestino() {
        return directorioDestino;
    }

    public void setDirectorioDestino(String directorioDestino) {
        this.directorioDestino = directorioDestino;
    }

    
    public void procesarReportePredeterminado() {
        String mensajeBase = "Procesando documento bajo los parámetros globales del sistema.";
        Reporte documentoBase = despachadorReportes.enviarReporte(formatoElegido, mensajeBase);
        
        if (documentoBase != null) {
            System.out.println(documentoBase.imprimir());
            
            
            Reporte documentoDecorado = new MarcaDeAguaDecorator(documentoBase, directorioDestino);
            System.out.println(documentoDecorado.imprimir());
        }
    }
}