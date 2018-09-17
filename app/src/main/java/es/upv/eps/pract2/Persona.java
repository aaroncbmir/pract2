package es.upv.eps.pract2;
import es.upv.eps.pract2.Telefono

public class Persona {
    private long dni
    private String nombre;
    private String apellido;
    private ArrayList<Telefono> datos;


    public Persona (long dni, String nombre, String apellido)

    {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.datos = new ArrayList<Telefono>();
    }

    public void addDni (long dni){
        this.dni = dni;
    }

    public void addNombre (String n){
        this.nombre = n;
    }

    public void addApellido (String a){
        this.apellido = a;
    }

    public void addDatos (Telefono nuevo){
        this.datos.add(nuevo);
    }

    public String getNombre (){
        return this.nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public long getDatos(){
        return this.datos
    }

    public void GetDni (){
        return this.dni
    }

    public static Persona buscar (ArrayList<Persona> personas, String nombre){

    }

}
