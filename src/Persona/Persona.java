
package Persona;


public abstract class Persona {
    
    private String nombre, apellido, correo, ID, telefono;
    
    public Persona (String nombre, String apellido, String correo, String ID, String telefono){
        
        this.nombre = nombre;
        this.apellido=apellido;
        this.correo=correo;
        this.ID=ID;
        this.telefono = telefono;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", ID=" + ID + '}';
    }
    
}

