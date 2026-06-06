package model;

/**
 * Representa a un cliente de Llanquihue Tour.
 * Hereda los datos generales desde la clase Persona.
 */
public class Cliente extends Persona {

    private String tipoCliente;
    private int cantidadReservas;

    /**
     * Constructor de la clase Cliente.
     *
     * @param nombre nombre completo del cliente.
     * @param rut rut del cliente.
     * @param telefono telefono de contacto.
     * @param correo correo electronico.
     * @param direccion direccion del cliente.
     * @param tipoCliente tipo de cliente, por ejemplo nacional, extranjero o frecuente.
     * @param cantidadReservas cantidad de reservas realizadas.
     */
    public Cliente(String nombre, String rut, String telefono, String correo, Direccion direccion,
                   String tipoCliente, int cantidadReservas) {

        super(nombre, rut, telefono, correo, direccion);
        this.tipoCliente = tipoCliente;
        this.cantidadReservas = cantidadReservas;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public int getCantidadReservas() {
        return cantidadReservas;
    }

    public void setCantidadReservas(int cantidadReservas) {
        this.cantidadReservas = cantidadReservas;
    }

    @Override
    public String toString() {
        return "Cliente\n" +
                super.toString() +
                "\nTipo de cliente: " + tipoCliente +
                "\nCantidad de reservas: " + cantidadReservas;
    }
}