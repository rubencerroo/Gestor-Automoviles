package dominio;

import java.io.Serializable;

/**
 * Esta clase representa un automóvil y sus atributos.
 */
public class Automovil implements Serializable {
    private String referencia;
    private String marca;
    private String modelo;
    private int year;
    private double precio;

    public Automovil(String referencia, String marca, String modelo, int year, double precio) {
        this.referencia = referencia;
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.precio = precio;
    }

    /**
     * Obtiene la referencia única del automóvil.
     *
     * @return La referencia única del automóvil.
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * Establece la referencia única del automóvil.
     *
     * @param referencia La referencia única del automóvil.
     */
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    /**
     * Obtiene la marca del automóvil.
     *
     * @return La marca del automóvil.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece la marca del automóvil.
     *
     * @param marca La marca del automóvil.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Obtiene el modelo del automóvil.
     *
     * @return El modelo del automóvil.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Establece el modelo del automóvil.
     *
     * @param modelo El modelo del automóvil.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Obtiene el año del automóvil.
     *
     * @return El año del automóvil.
     */
    public int getYear() {
        return year;
    }

    /**
     * Establece el año del automóvil.
     *
     * @param year El año del automóvil.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Obtiene el precio del automóvil.
     *
     * @return El precio del automóvil.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del automóvil.
     *
     * @param precio El precio del automóvil.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Referencia: " + referencia + ", Marca: " + marca + ", Modelo: " + modelo + ", Year: " + year + ", Precio: " + precio + " Euros";
    }
}
