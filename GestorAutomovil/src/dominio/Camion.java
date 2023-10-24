package dominio;

/**
 * Clase que representa un camion, que es un tipo de automovil.
 */
public class Camion extends Automovil {
    private double capacidadCarga;

    /**
     * Constructor de la clase Camion que inicializa sus atributos.
     *
     * @param marca          La marca del camion.
     * @param modelo         El modelo del camion.
     * @param year           El año de fabricacion del camion.
     * @param precio         El precio del camion en euros.
     * @param capacidadCarga La capacidad de carga del camion.
     */
    public Camion(String marca, String modelo, int year, double precio, double capacidadCarga) {
        super(marca, modelo, year, precio);
        this.capacidadCarga = capacidadCarga;
    }

    /**
     * Obtiene la capacidad de carga del camion.
     *
     * @return La capacidad de carga del camion.
     */
    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    /**
     * Establece la capacidad de carga del camion.
     *
     * @param capacidadCarga La capacidad de carga a establecer.
     */
    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
}
