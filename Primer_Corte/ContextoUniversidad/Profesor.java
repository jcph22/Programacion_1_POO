package Programacion_1_POO.Primer_Corte.ContextoUniversidad;

public class Profesor {
    private String nombrePreofesor;
    private String identificacionProfesor;

    public Profesor(String nombrePreofesor, String identificacionProfesor) {
        this.nombrePreofesor = nombrePreofesor;
        this.identificacionProfesor = identificacionProfesor;
    }

    public String getNombrePreofesor() {
        return nombrePreofesor;
    }

    public String getIdentificacionProfesor() {
        return identificacionProfesor;
    }

}
