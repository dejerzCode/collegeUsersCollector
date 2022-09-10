
package Persona;

public class Administrativo extends Persona{
    
    private String cargo;
    
    public Administrativo (String cargo){
        
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
        return "Administrativo{" + "cargo=" + cargo + '}';
    }
    
    
}
