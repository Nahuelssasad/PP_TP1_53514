import java.time.LocalDate;
import java.util.ArrayList;


public class Inscripcion {

    private  LocalDate fecha;
    private String estado;
    private Actividad actividad;
    private  Estudiante estudiante;

    public Inscripcion(LocalDate fecha,String estado,Actividad actividad,Estudiante estudiante)
    {
        this.fecha=fecha;
        this.estado=estado;
        this.actividad = actividad;
        this.estudiante=estudiante ;

    }

    public  Estudiante getEstudiante () {

        return estudiante ;
    }
    
    public Actividad getActividad () {

        return actividad;
    }

    public LocalDate getFecha() {

        return fecha;
    }

    public  String getEstado(){

        return estado;
    }








}
