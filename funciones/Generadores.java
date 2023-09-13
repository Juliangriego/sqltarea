package funciones;

public class Generadores {
    public static String CodCliente(){
        int rand;
        double rand1;
        String cod;
        rand = (int)((Math.random()*101) + 100);
        cod = "EMP" + rand;
        return cod;
    }
}
