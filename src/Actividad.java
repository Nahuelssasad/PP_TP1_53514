import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Actividad {

    private  int id;
    private String titulo;
    private  int cupoMaximo;
    private final int CupoMinimo = 5;
    private List<Inscripcion> inscripciones;
    private List<Estudiante> estudiantes; //la lista de estudiantes pertenece a la activividades realmente?



    public Actividad(int id,String titulo, int cupoMaximo )
    {
        this.id = id;
        this.titulo=this.setTitulo(titulo);
        this.cupoMaximo=cupoMaximo > CupoMinimo ? cupoMaximo : CupoMinimo ;
        this.inscripciones=new ArrayList<>();
        this.estudiantes=new ArrayList<>();

    }

    public  Inscripcion InscribirEstudiante(Estudiante estudiante)
    {
        Inscripcion inscripcion= new Inscripcion(LocalDate.now(),"Inscripto",this,estudiante);
        this.inscripciones.add(inscripcion);
        this.estudiantes.add(estudiante);
        return  inscripcion;
    }

    public void mostrarInscripciones(){

        for ( Inscripcion inscripcion:inscripciones)
        {
            System.out.println("Estudiante: " + inscripcion.getEstudiante().getNombre() + "Legajo" + inscripcion.getEstudiante().getLegajo()  + " Inscripcion: " +  inscripcion.getFecha());
        }

    }

    public String getTitulo () {
        
            return titulo;

    }
    private String setTitulo ( String nombre) {
        
        if ( nombre != null && !nombre.isBlank() )

            return nombre;
        
        return "No tiene nombre" ;

    }
    
    public int getCupoMaximo () {
        
            return cupoMaximo;

    }


    public void setCupoMaximo ( int cupo) {

        if ( cupo > CupoMinimo )
                cupoMaximo = cupo;
                
    }

   
    public int getCupoMinimo () {

        return CupoMinimo;
    }
    


}
