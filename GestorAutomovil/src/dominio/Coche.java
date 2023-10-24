package dominio;

/**
 * Clase que representa un coche, que es un tipo de automovil.
 */
public class Coche extends Automovil {
    private int numeroPuertas;

    /**
     * Constructor de la clase Coche que inicializa sus atributos.
     *
     * @param marca        La marca del coche.
     * @param modelo       El modelo del coche.
     * @param year         El año de fabricacion del coche.
     * @param precio       El precio del coche en euros.
     * @param numeroPuertas El numero de puertas del coche.
     */
    public Coche(String marca, String modelo, int year, double precio, int numeroPuertas) {
        super(marca, modelo, year, precio);
        this.numeroPuertas = numeroPuertas;
    }

    /**
     * Obtiene el numero de puertas del coche.
     *
     * @return El numero de puertas del coche.
     */
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    /**
     * Establece el numero de puertas del coche.
     *
     * @param numeroPuertas El numero de puertas a establecer.
     */
    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
}