package Universidad;

import java.util.Scanner;

public class MainUniversidad {
 
    public static void main(String[] args) {
        
        String RegistroDeUniversidad[]=new String [1];
        String guardado []=new String [1];

        int opcion;
                      
        Scanner scan = new Scanner (System.in);
        
        do{
            System.out.println("1. Registrar Alumno");
            System.out.println("2. Registrar Docente");
            System.out.println("3. Registrar Administrativo");
            System.out.println("4. Mostrar Lista");
            System.out.println("5. Borrar Registro");
            System.out.println("5. Salir\n");
            System.out.println("INGRESE UNA OPCION");
            opcion= scan.nextInt();
            switch (opcion) {
                case 1 -> ();
                case 2 -> ();
                case 3 -> ();
                case 4 -> ();
            }
        }while (opcion !=5);

    }
}
