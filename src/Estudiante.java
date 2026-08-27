public class Estudiante {

    private String legajo;
    private String nombre;


    public Estudiante(String nombre,String legajo){

        this.legajo=legajo;
        this.nombre=nombre;
    }

    public String getNombre () {

        return nombre;

    }

    public String getLegajo () {
        
        return legajo;
    }

}
