package Universidad;

import java.util.Scanner;

public class MainUniversidad {
      static Docente Maestro []=new String [1];
      static Docente CopiaMaestro []=new String [1];
      static Alumno student []=new String [1];
      static Alumno CopiaStudent []=new String [1];
      static Administrativo admin []=new String [1];
      static Administrativo CopiaAdmin []=new String [1];
 
    public static void main(String[] args) {
        
       
        String test;
        String besos;
        int opcion = 0;
                      
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
                case 1 -> registrarAlumno ();
                case 2 -> registrarDocente ();
                case 3 -> registrarAdministrativo ();
                case 4 -> mostrarLista ();
                case 5 -> borrarRegistro  ();
            }
        }while (opcion !=5);

    }
    
    public static void registrarAlumno(){
    }
    public static void registrarDocente(){
    }
    public static void registrarAdministrativo(){
    }
    public static void mostrarLista(){
    }
    public static void borrarRegistro(){
    }
    
}
