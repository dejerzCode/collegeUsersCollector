
package Persona;

public class Docente extends Persona {
    
    private String colegiado;
    
    public Docente (String asignacion, String nombre, String apellido, String correo, String ID, String telefono){
        super( nombre,  apellido,  correo,  ID,  telefono);
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
