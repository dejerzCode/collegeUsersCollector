package Persona;

public class Docente extends Persona {
    
    private String colegiado;
    
    public Docente (String colegiado, String nombre, String apellido, String correo, String ID, String telefono){
        super( nombre,  apellido,  correo,  ID,  telefono);
        this.colegiado=colegiado;
                
    }

    public String getColegiado() {
        return colegiado;
    }

    public void setColegiado(String Colegiado) {
        this.colegiado = colegiado;
    }

    @Override
    public String toString() {
        return super.toString() +  "Docente" + "colegiado=" + colegiado;
    }
    
    
    
}