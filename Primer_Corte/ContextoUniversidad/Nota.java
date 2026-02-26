package Programacion_1_POO.Primer_Corte.ContextoUniversidad;

public class Nota {
    private String nombreNota;
    private double valorNota;

    public Nota(String nombreNota, double valorNota) {
        this.nombreNota = nombreNota;
        this.valorNota = valorNota;
    }

    public String getNombreNota() {
        return nombreNota;
    }

    public double getValorNota() {
        return valorNota;
    }

    public void setValorNota(double valorNota) {
        this.valorNota = valorNota;
    }

    public void setNombreNota(String nombreNota) {
        this.nombreNota = nombreNota;
    }
}
