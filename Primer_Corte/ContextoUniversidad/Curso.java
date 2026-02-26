package Programacion_1_POO.Primer_Corte.ContextoUniversidad;

public class Curso {
    private String nombreCurso;
    private String codigoCurso;
    private double promedio;
    private byte numeroEvaluaciones;

    public Curso(String nombreCurso, String codigoCurso, double promedio, byte numeroEvaluaciones) {
        this.nombreCurso = nombreCurso;
        this.codigoCurso = codigoCurso;
        this.promedio = promedio;
        this.numeroEvaluaciones = numeroEvaluaciones;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public byte getNumeroEvaluaciones() {
        return numeroEvaluaciones;
    }

    public void setNumeroEvaluaciones(byte numeroEvaluaciones) {
        this.numeroEvaluaciones = numeroEvaluaciones;
    }
    
}
