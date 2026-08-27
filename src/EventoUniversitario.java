import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
public class EventoUniversitario {

    private final String  ID;
    private String titulo ;
    private boolean gratuito ;
    private  double costoBase ;
    private static int CantidadEventos;
    private Sala sala=null;
    private List<Actividad> actividades;


    static {
        CantidadEventos = 0;
        System.out.println("Inicializador estático: se cargó la clase EventoUniversitario.");

    }
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
        double costoTotal=0.0;
        if (gratuito){
            return costoTotal;
        }
        for (Actividad actividad : actividades)
            costoTotal += actividad.calcularCostoMateriales();



        return  costoTotal*1.21;
    }

    public void asignarSala(Sala sala)
    {
        this.sala = sala;


    }
    public Sala getSala(){
        return sala;
    }

    Scanner scanner = new Scanner(System.in);
    public void crearActividad(int id,String titulo,int cupo,String tipoActividad){

            switch (tipoActividad){

                case "charla":

                    System.out.println("Ingrese el nombre del disertante: ");
                    String disertante = scanner.nextLine();
                    Actividad charla = new Charla(id,titulo,cupo,disertante);

                    this.actividades.add(charla);
                    break;
                case "taller":

                    System.out.print("El taller " + titulo + " requiere el uso de Notebook? : S/N  ");
                    String respuesta = scanner.nextLine().trim().toLowerCase();
                    boolean requiereNotebook = false;
                    if (respuesta.equals("s") || respuesta.equals("si") || respuesta.equals("sí")) {
                        requiereNotebook = true;
                    }
                    Actividad taller = new Taller(id,titulo,cupo,requiereNotebook);
                    this.actividades.add(taller);
                    break;
                default:
                    System.out.println("Error.Tipo de actividad no reconocido");



            }



    }

    public  void mostrarDatos () {


            System.out.println("----------------------------------------------------------------------------");
            System.out.println("Evento Codigo= " + ID);
            System.out.println("Titulo: " + titulo);
            System.out.println("Costo base : " + calcularCostoEstimado());
            System.out.println("Sala  : " + ( this.sala  != null ? this.sala.getNombre() : "Sin sala") );
            System.out.println("Actividades: ");
            System.out.println("____________");

            for ( Actividad actividad : actividades){

                actividad.mostrarIdentificacion();
                actividad.mostrarInscripciones();

            }


            System.out.println("----------------------------------------------------------------------------");



    }

    public static int  getCantidadEventos () {
            return CantidadEventos;
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
        return  Collections.unmodifiableList(actividades);
    }

    public void mostrarActividades (){

        for ( int i = 0 ; i < getActividades().size();i++){

            System.out.println( (i+1) + actividades.get(i).getTitulo());

        }
    }




}
