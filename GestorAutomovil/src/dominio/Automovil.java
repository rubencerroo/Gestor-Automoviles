package dominio;

import java.io.Serializable;
import java.util.UUID;

/**
 * Clase base que representa un automovil generico.
 */
public class Automovil implements Serializable {
    private String referencia;
    private String marca;
    private String modelo;
    private int year;
    private double precio;

    /**
     * Constructor de la clase Automovil que inicializa sus atributos y genera una referencia unica.
     *
     * @param marca  La marca del automovil.
     * @param modelo El modelo del automovil.
     * @param year   El año de fabricacion del automovil.
     * @param precio El precio del automovil en euros.
     */
    public Automovil(String marca, String modelo, int year, double precio) {
        this.referencia = generarReferenciaUnica();
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.precio = precio;
    }

    /**
     * Obtiene la referencia unica del automovil.
     *
     * @return La referencia unica del automovil.
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * Establece la referencia unica del automovil.
     *
     * @param referencia La referencia unica a establecer.
     */
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    /**
     * Obtiene la marca del automovil.
     *
     * @return La marca del automovil.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece la marca del automovil.
     *
     * @param marca La marca a establecer.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Obtiene el modelo del automovil.
     *
     * @return El modelo del automovil.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Establece el modelo del automovil.
     *
     * @param modelo El modelo a establecer.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Obtiene el año de fabricacion del automovil.
     *
     * @return El año de fabricacion del automovil.
     */
    public int getYear() {
        return year;
    }

    /**
     * Establece el año de fabricacion del automovil.
     *
     * @param year El año a establecer.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Obtiene el precio del automovil en euros.
     *
     * @return El precio del automovil en euros.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del automovil en euros.
     *
     * @param precio El precio a establecer.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Sobrescritura del metodo toString que proporciona una representacion en cadena del automovil.
     *
     * @return Una cadena que representa el automovil con su referencia, marca, modelo, año y precio.
     */
    @Override
    public String toString() {
        return "Referencia: " + referencia + ", Marca: " + marca + ", Modelo: " + modelo + ", Year: " + year + ", Precio: " + precio + " Euros";
    }

    /**
     * Metodo privado para generar una referencia unica basada en UUID.
     *
     * @return Una referencia unica generada a partir de UUID.
     */
    private String generarReferenciaUnica() {
        return UUID.randomUUID().toString();
    }
}
