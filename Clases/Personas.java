package Clases;

public abstract class Personas {
    private String nombre;
    private int dni;
    private String email;
    private int telefono;

    public Personas(){
        
    }

    public Personas(String n, String e, int d, int t){
        this.nombre = n;
        this.dni = d;
        this.email = e;
        this.telefono = t;
    }
    // GETTERS //////////////////////////////////////////////////
    public String getNombre(){
        return this.nombre;
    }
    public String getEmail(){
        return this.email;
    }
    public int getDni(){
        return this.dni;
    }
    public int getTelefono(){
        return this.telefono;
    }
}
