package Programacion_1_POO.Primer_Corte.ContextoUniversidad;

public class Estudiante {
    private String nombreEstudiante;
    private String identificacionEstudiante;
    private double promedioEstudiante;

    public Estudiante(String nombreEstudiante, String identificacionEstudiante, double promedioEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
        this.identificacionEstudiante = identificacionEstudiante;
        this.promedioEstudiante = promedioEstudiante;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public String getIdentificacionEstudiante() {
        return identificacionEstudiante;
    }

    public double getPromedioEstudiante() {
        return promedioEstudiante;
    }
    
}
