package Persona;

public class Alumno extends Persona {
    
    private String grado;
    
    public Alumno(String grado){
        
        this.grado=grado;
        
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    @Override
    public String toString() {
        return "Alumno{" + "grado=" + grado + '}';
    }
    
    
    
    
}
