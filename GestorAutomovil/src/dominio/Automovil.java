package dominio;

import java.io.Serializable;
import java.util.UUID;

public class Automovil implements Serializable {
    private String referencia;
    private String marca;
    private String modelo;
    private int year;
    private double precio;

    public Automovil(String marca, String modelo, int year, double precio) {
        this.referencia = generarReferenciaUnica();
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.precio = precio;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Referencia: " + referencia + ", Marca: " + marca + ", Modelo: " + modelo + ", Year: " + year + ", Precio: " + precio + " Euros";
    }

    private String generarReferenciaUnica() {
        return UUID.randomUUID().toString();
    }
}
