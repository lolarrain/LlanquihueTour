package model;

/**
 * Representa la dirección de una persona vinculada a Llanquihue Tour.
 * Esta clase se usará por composición dentro de la clase Persona.
 */
public class Direccion {

    private String calle;
    private String numero;
    private String comuna;
    private String region;

    /**
     * Constructor de la clase Direccion.
     *
     * @param calle nombre de la calle.
     * @param numero número de la direccion.
     * @param comuna comuna de residencia.
     * @param region región de residencia.
     */
    public Direccion(String calle, String numero, String comuna, String region) {
        this.calle = calle;
        this.numero = numero;
        this.comuna = comuna;
        this.region = region;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return calle + " " + numero + ", " + comuna + ", " + region;
    }
}