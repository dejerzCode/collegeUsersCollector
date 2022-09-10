
package Persona;

public class Docente extends Persona {
    
    private String colegiado;
    
    public Docente (String asignacion){
        
        this.colegiado=colegiado;
                
    }

    public String getAsignacion() {
        return colegiado;
    }

    public void setAsignacion(String asignacion) {
        this.colegiado = asignacion;
    }

    @Override
    public String toString() {
        return "Docente{" + "asignacion=" + colegiado + '}';
    }
    
    
    
}
