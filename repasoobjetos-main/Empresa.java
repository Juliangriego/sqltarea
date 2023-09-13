import java.util.ArrayList;
import java.util.Scanner;
import Clases.Clientes;
import funciones.*;
public class Empresa {
    public static void main(String[] args){
        ArrayList<Clientes> lista = new ArrayList<Clientes>();
        Scanner s = new Scanner(System.in);
        boolean flag = true;
        String nombre;
        String email;
        int dni;
        int telefono;
        String op;
        do{
            funciones.Menues.MenuPrincipal();
            switch(s.nextLine()){
                case "1":
                    do{
                        System.out.println("Ingrese datos de la persona");
                        System.out.print("Dni: ");
                        dni = Integer.parseInt(s.nextLine());
                        System.out.print("Nombre: ");
                        nombre = s.nextLine();
                        System.out.print("Telefono: ");
                        telefono = Integer.parseInt(s.nextLine());                        
                        System.out.print("Email: ");
                        email = s.nextLine();
                        lista.add(new Clientes(nombre, email, dni, telefono));
                        op = funciones.Validaciones.SiNo(s.nextLine());
                    }while(op.equals("s"));
                    break;
                case "2":
                    for(Clientes aux : lista){
                        /*System.out.println("DNI: " + aux.getDni());
                        System.out.println("Nombre: " + aux.getNombre());
                        System.out.println("email: " + aux.getEmail());*/
                        System.out.println(aux.toArchivo());
                    }
                    break;
                case "3":
                    flag = false;
                    break;
                case "debug":
                    for (int i = 0; i < 10; i++){
                        System.out.println("Codigo generado: " + funciones.Generadores.CodCliente());
                    }
                    break;
            }    
        }while(flag);
    }
}
