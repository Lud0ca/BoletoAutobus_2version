package lineaautobuses;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Boleto extends Autobuses {
    private String NombreComprador;
    private String Origen = "";
    private String Destino="";
    LocalDateTime Ahora = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String formatoFechaHora = Ahora.format(formatter);
    private int CantidadBoletos;
    boolean estudiante = false;

    public Boleto(int NumAutobus, int Asiento, String NombreComprador, String Origen, String Destino, LocalDateTime Ahora, int CantidadBoletos, boolean estudiante) {
        super(NumAutobus, Asiento);
        this.NombreComprador = NombreComprador;
        this.Origen = Origen;
        this.Destino = Destino;
        this.Ahora = Ahora;
        this.CantidadBoletos = CantidadBoletos;
        this.estudiante = estudiante;
    }

    public String getNombreComprador() {
        return NombreComprador;
    }

    public void setNombreComprador(String NombreComprador) {
        this.NombreComprador = NombreComprador;
    }

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String Origen) {
        this.Origen = Origen;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public String getAhora() {
        return formatoFechaHora;
    }

    public void setAhora(LocalDateTime Ahora) {
        this.Ahora = Ahora;
    }

    public int getCantidadBoletos() {
        return CantidadBoletos;
    }

    public void setCantidadBoletos(int CantidadBoletos) {
        this.CantidadBoletos = CantidadBoletos;
    }

    public boolean isEstudiante() {
        return estudiante;
    }

    public void setEstudiante(boolean estudiante) {
        this.estudiante = estudiante;
    }

    public double TotalBoleto(){
        double costo;
        if(estudiante == true){
            costo = 400.0 * CantidadBoletos;
        }else{
            costo = 800.0 * CantidadBoletos;
        }
        return costo;
    }
}
