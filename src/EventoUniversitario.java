import java.util.ArrayList;
import java.util.List;
//import java.util.ArrayList;

public class EventoUniversitario {

    private final String  ID;
    private String titulo ;
    private boolean gratuito ;
    private  double costoBase ;
    private static int CantidadEventos;
    private Sala sala=null;
    private List<Actividad> actividades;



    public  EventoUniversitario(String id ,String titulo , double costoBase ,boolean gratuito)
    {
        this.ID=id;
        this.titulo=titulo;
        this.costoBase= gratuito ? 0:costoBase ;
        this.gratuito=gratuito;
        this.actividades = new ArrayList<>(); //Tiene en el diagrama clase 1 actividad por lo menos,eso como lo modelamos??
        ++CantidadEventos;


    }

    public   EventoUniversitario (EventoUniversitario  copia)
    {
        this.titulo=copia.titulo;
        this.ID=copia.ID + "-COPIA";
        this.costoBase=copia.costoBase;
        this.gratuito=copia.gratuito;
        this.actividades = copia.actividades;
        ++CantidadEventos;


    }


    public double calcularCostoEstimado(){
        if (gratuito){
            return 0;
        }
        return  costoBase*1.21;
    }

    public void asignarSala(Sala sala)
    {
        this.sala = sala;


    }

    public void crearActividad(int id,String titulo,int cupo){

            Actividad actividad =  new Actividad(id,titulo,cupo);

            this.actividades.add(actividad); //Sumo una actividad a la lista de actividades



    }

    public  void mostrarDatos () {


            System.out.println("----------------------------------------------------------------------------");
            System.out.println("Evento Codigo= " + ID);
            System.out.println("Titulo: " + titulo);
            System.out.println("Costo base : " + this.calcularCostoEstimado());
            System.out.println("Sala  : " + sala.getNombre());
            System.out.println("Actividades: ");


            for ( Actividad actividad : actividades){

                System.out.println("Titulo: " +actividad.getTitulo());
                System.out.println("Cupo minimo: " + actividad.getCupoMinimo());
                System.out.println("Cupo máximo: " + actividad.getCupoMaximo());
                System.out.println("Inscripciones: " + actividad.getTitulo());

                actividad.mostrarInscripciones();
                System.out.println("");
            }




            System.out.println("----------------------------------------------------------------------------");



    }

    public static int  getCantidadEventos () {
            return CantidadEventos;
    }

    



    static {
        CantidadEventos = 0;
        System.out.println("Inicializador estático: se cargó la clase EventoUniversitario.");

    }
   

    public String  getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String nombre)
    {

        if ( nombre != null && !nombre.isBlank() )

            this.titulo = nombre;
    }

    public String getId ()
    {

        return ID;
    }


    public List<Actividad> getActividades(){
        return  actividades;
    }






}
