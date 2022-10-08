package Universidad;
import Persona.*;
import java.util.Arrays;
import java.util.Scanner;




public class MainUniversidad {
      static Persona listaInscripcion [] = new Persona [100]; 
      
    public static void main(String[] args) {
        

        int opcion = 0;
                      
        Scanner scan = new Scanner (System.in);
                      
  
        
                do{
            System.out.println("1. Registrar Alumno");
            System.out.println("2. Registrar Docente");
            System.out.println("3. Registrar Administrativo");
            System.out.println("4. Mostrar Lista");
            System.out.println("5. Borrar Registro");
            System.out.println("6. Modificar Registro");
            System.out.println("7. Buscar Registro");
            System.out.println("8. Salir\n");
            System.out.println("INGRESE UNA OPCION");
            opcion= scan.nextInt();
            switch (opcion) {
                case 1:
                    registrarAlumno ();
                    break;
                case 2:
                    registrarDocente ();
                    break;
                case 3:
                    registrarAdministrativo ();
                    break;
                case 4:
                    mostrarLista ();
                    break;
                case 5:
                    borrarRegistro  ();
                    break;
                case 6:
                    modificarRegistro();
                    break;
                case 7:
                    buscarRegistro();
                    break;
                case 8:
                    System.out.println("Adiós :)");
                    break;
                default:
                    System.out.println("Error, seleción incorrecta");
            }
        }while (opcion !=8);

    }
    public static int modificarATributo(int _getAtributo){
        return 0;
    }
    public static String modificarAtributo(String _getAtributo){
    Scanner scan = new Scanner (System.in);
    System.out.println(_getAtributo);
    String valor = "";
    valor = scan.nextLine();
    if (valor != ""){
        return valor;
    } else {
        return _getAtributo;
    }
}



    public static void modificarRegistro(){
        Scanner scan = new Scanner (System.in);
        int index = 0;
        System.out.println("Ingrese el índice a modificar");
        index = scan.nextInt();
        if(listaInscripcion[index] instanceof Object){
            System.out.println("Ingrese la modificacion de Nombre");
            listaInscripcion[index].setNombre(modificarAtributo(listaInscripcion[index].getNombre()));
            System.out.println("Ingrese la modificacion de Apellido");
            listaInscripcion[index].setApellido(modificarAtributo(listaInscripcion[index].getApellido()));
            System.out.println("Ingrese la modificacion de Correo");
            listaInscripcion[index].setCorreo(modificarAtributo(listaInscripcion[index].getCorreo()));
            System.out.println("Ingrese la modificacion de Telefono");
            listaInscripcion[index].setTelefono(modificarAtributo(listaInscripcion[index].getTelefono()));
        } else {
            System.out.println("Este objeto no existe");
        }

    }

    public static void buscarRegistro(){
        Scanner scan = new Scanner (System.in);
        System.out.println("Ingrese el índice a buscar");
        int index = scan.nextInt();
        if(listaInscripcion[index] instanceof Persona){
            System.out.println(index + ". " +listaInscripcion[index].toString());
            System.out.println("-----------------------------------------");
        } else {
            System.out.println("Este objeto no existe");
        }

    }

    public static void registrarAlumno(){
                  int opcion2=0;
            do{

          
            String nombre, apellido, correo, ID, telefono;
            String grado;
            
            Scanner scan = new Scanner (System.in);
            
            System.out.println("Ingrese el Nombre del Alumno");
            nombre=scan.next();
            System.out.println("Ingrese el Apellido del Alumno");
            apellido=scan.next();
            System.out.println("Ingrese el Correo del Alumno");
            correo=scan.next();
            System.out.println("Ingrese el ID del Alumno");
            ID=scan.next();
            System.out.println("Ingrese el Teléfono del Alumno");
            telefono=scan.next();
            System.out.println("Ingrese el Grado del Alumno");
            grado=scan.next();

            int indice = 0;
            
            Alumno nuevoAlumno = new Alumno (grado, nombre, apellido, correo, ID, telefono);
            //listaInscripcion [0] = nuevoAlumno;
            for (Object temporal: listaInscripcion){
                if (temporal instanceof Persona){
                    // este espacio está ocupado
                } else {
                    indice = Arrays.asList(listaInscripcion).indexOf(temporal);
                    listaInscripcion [indice] = nuevoAlumno;
                    break;
                }
            } 
           

            opcion2 = RepetirRegistro();
            
            }while(opcion2!=2);
        
    }

    public static int RepetirRegistro(){
        Scanner scan = new Scanner (System.in);
        System.out.println("1. Desea Registrar un Nuevo Personal");
        System.out.println("2. Regresar al Menu Anterior");
        System.out.println("Ingrese el Número de la Opción Deseada");
        return scan.nextInt();
    }

    public static void registrarDocente(){
                int opcion2=0;
            do{

          
            String nombre, apellido, correo, ID, telefono;
            String colegiado;
            
            Scanner scan = new Scanner (System.in);
            
            System.out.println("Ingrese el Nombre del Docente");
            nombre=scan.next();
            System.out.println("Ingrese el Apellido del Docente");
            apellido=scan.next();
            System.out.println("Ingrese el Correo del Docente");
            correo=scan.next();
            System.out.println("Ingrese el ID del Docente");
            ID=scan.next();
            System.out.println("Ingrese el Teléfono del Docente");
            telefono=scan.next();
            System.out.println("Ingrese el Numero de Colegiado del Docente");
            colegiado=scan.next();

            int indice = 0;
            
            Docente nuevoDocente = new Docente (colegiado, nombre, apellido, correo, ID, telefono);
            //listaInscripcion [0] = nuevoAlumno;
            for (Object temporal: listaInscripcion){
                if (temporal instanceof Persona){
                    // este espacio está ocupado
                } else {
                    indice = Arrays.asList(listaInscripcion).indexOf(temporal);
                    listaInscripcion [indice] = nuevoDocente;
                    break;
                }
            } 
           

            opcion2 =RepetirRegistro();
            
            }while(opcion2!=2);
    }
    public static void registrarAdministrativo(){
                       int opcion2=0;
            do{

          
            String nombre, apellido, correo, ID, telefono;
            String cargo;
            
            Scanner scan = new Scanner (System.in);
            
            System.out.println("Ingrese el Nombre del Personal");
            nombre=scan.next();
            System.out.println("Ingrese el Apellido del Personal");
            apellido=scan.next();
            System.out.println("Ingrese el Correo del Personal");
            correo=scan.next();
            System.out.println("Ingrese el ID del Personal");
            ID=scan.next();
            System.out.println("Ingrese el Teléfono del Personal");
            telefono=scan.next();
            System.out.println("Ingrese el Cargo del Personal");
            cargo=scan.next();

            int indice = 0;
            
            Administrativo nuevoAdministrativo = new Administrativo (cargo, nombre, apellido, correo, ID, telefono);
            //listaInscripcion [0] = nuevoAlumno;
            for (Object temporal: listaInscripcion){
                if (temporal instanceof Persona){
                    // este espacio está ocupado
                } else {
                    indice = Arrays.asList(listaInscripcion).indexOf(temporal);
                    listaInscripcion [indice] = nuevoAdministrativo;
                    break;
                }
            }
            opcion2 =RepetirRegistro();
            
            }while(opcion2!=2);
    }
    public static void mostrarLista(){
                if (listaInscripcion.length !=0){
                    imprirLista();
                }else{
                    System.out.println("Su lista está vacia");  
                }  

  }

  public static void imprirLista(){
      for(int x = 0; x < listaInscripcion.length; x++){
          if (listaInscripcion[x] == null){
              //no se imprime nada
          }else{
              System.out.println(x +". "+ listaInscripcion[x]);
          }
      }
      System.out.println("-----------------------------------------");
  }




    public static void borrarRegistro(){
       
        int eliminar;
        boolean option = true;
        int select;
        Scanner reader = new Scanner (System.in);
        imprirLista();
        
        System.out.println("Ingresa el número de la persona que quieras borrar: ");
        eliminar = reader.nextInt();
          
        while(option){
              
            Persona[] temp = new Persona[listaInscripcion.length - 1];
            int restar = listaInscripcion.length - (eliminar + 1 );
            System.arraycopy(listaInscripcion, 0, temp, 0, eliminar);
            System.arraycopy(listaInscripcion, eliminar + 1, temp, eliminar, restar);
            System.out.println("El elemento ha sido eliminado.");
            System.out.println("¿Desea eliminar otro elemento? \n1. Eliminar otro elemento. \n2. Mostrar la lista actualizada.");
            select = reader.nextInt();
              
            if (select == 1){
                option = true;
                  
            }else{

                for(int r = 0; r < temp.length; r++){
                    if (temp[r] == null){
                    }else{
                        System.out.println(temp[r]);
                    }
                }

                option = false;
            }

        }
    }

}

