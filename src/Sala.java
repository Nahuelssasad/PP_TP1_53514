public class Sala {

    private int id; //Podriamos crear un static int id para  asegurarnos su unicidad
    private String nombre;

    public Sala (int id,String nombre)
    {
        this.id = id;
        this.nombre=nombre;

    }

    public String getNombre () {

        return nombre;
    }

}
