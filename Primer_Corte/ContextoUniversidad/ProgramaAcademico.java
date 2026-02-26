package Programacion_1_POO.Primer_Corte.ContextoUniversidad;
import java.util.ArrayList;

public class ProgramaAcademico {
    //Atributos
    private String nombreProgramaAcademico;
    private String codigoProgramaAcademico;
    
    //Relaciones
    private ArrayList<Profesor> listaProfesores;
    private Curso curso;
    private ArrayList<Estudiante> listaEstudiantes;
    //Constructores
    public ProgramaAcademico(String nombreProgramaAcademico, String codigoProgramaAcademico) {
        this.nombreProgramaAcademico = nombreProgramaAcademico;
        this.codigoProgramaAcademico = codigoProgramaAcademico;
        this.listaProfesores = new ArrayList<Profesor>();
        this.curso = null;
        this.listaEstudiantes = new ArrayList<Estudiante>();

    }

    //Getters y Setters
    public String getNombreProgramaAcademico() {
        return nombreProgramaAcademico;
    }

    public void setNombreProgramaAcademico(String nombreProgramaAcademico) {
        this.nombreProgramaAcademico = nombreProgramaAcademico;
    }
    public String getCodigoProgramaAcademico() {
        return codigoProgramaAcademico;
    }

    public void setCodigoProgramaAcademico(String codigoProgramaAcademico) {
        this.codigoProgramaAcademico = codigoProgramaAcademico;
    }
    //Metodos
    
}
