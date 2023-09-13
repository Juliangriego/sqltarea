package Clases;
import funciones.Generadores;
public class Clientes extends Personas{
    private String codigoCliente;
    private int credito;

    public Clientes(String n, String e, int d, int t){
        super(n, e, d, t);
        this.codigoCliente = funciones.Generadores.CodCliente();
        this.credito = 10000;
    }

    public String toString(){
        return "Codigo: " + this.codigoCliente + "\nNombre: "+ super.getNombre() + "\nDni: " + super.getDni() + "\nCredito: " + this.credito + "\n";
    }

    public String toArchivo(){
        return "{\n" + 
                super.getNombre() + "\n" + 
                super.getDni() + "\n" +
                super.getEmail() + "\n" +
                super.getTelefono() + "\n" +
                this.credito + "\n" +
                this.codigoCliente+ "\n}";
    }
}
