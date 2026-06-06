package model;

/**
 * Representa a un empleado de Llanquihue Tour.
 * Hereda los datos generales desde la clase Persona.
 */
public class Empleado extends Persona {

    private String cargo;

    /**
     * Constructor de la clase Empleado.
     *
     * @param nombre    nombre completo del empleado.
     * @param rut       rut del empleado.
     * @param telefono  teléfono de contacto.
     * @param correo    correo electrónico.
     * @param direccion dirección del empleado.
     * @param cargo     cargo que desempeña en la agencia.
     */
    public Empleado(String nombre, String rut, String telefono, String correo, Direccion direccion,
                    String cargo) {

        super(nombre, rut, telefono, correo, direccion);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado\n" +
                super.toString() +
                "\nCargo: " + cargo ;
    }
}