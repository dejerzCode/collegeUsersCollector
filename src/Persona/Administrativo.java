package Persona;

public class Administrativo extends Persona{
    
    private String cargo;
    
    public Administrativo (String cargo, String nombre, String apellido, String correo, String ID, String telefono){
        super( nombre,  apellido,  correo,  ID,  telefono);
        this.cargo=cargo;        
        
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString() +  "Administrativo{" + "cargo=" + cargo + '}';
    }
    
    
}