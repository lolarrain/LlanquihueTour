package model;

/**
 * Clase base que representa a una persona vinculada a Llanquihue Tour.
 * Puede ser usada como base para clientes, empleados, guias u otros roles.
 */
public class Persona {

    private String nombre;
    private String rut;
    private String telefono;
    private String correo;
    private Direccion direccion;

    /**
     * Constructor de la clase Persona.
     *
     * @param nombre nombre completo de la persona.
     * @param rut rut de la persona.
     * @param telefono telefono de contacto.
     * @param correo correo electronico.
     * @param direccion direccion asociada a la persona.
     */
    public Persona(String nombre, String rut, String telefono, String correo, Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nRUT: " + rut +
                "\nTelefono: " + telefono +
                "\nCorreo: " + correo +
                "\nDireccion: " + direccion;
    }
}