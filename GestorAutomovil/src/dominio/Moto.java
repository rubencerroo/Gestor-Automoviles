package dominio;

/**
 * Clase que representa una moto, que es un tipo de automovil.
 */
public class Moto extends Automovil {
    private boolean tieneMarchas;

    /**
     * Constructor de la clase Moto que inicializa sus atributos.
     *
     * @param marca         La marca de la moto.
     * @param modelo        El modelo de la moto.
     * @param year          El año de fabricacion de la moto.
     * @param precio        El precio de la moto en euros.
     * @param tieneMarchas  Indica si la moto tiene marchas (true/false).
     */
    public Moto(String marca, String modelo, int year, double precio, boolean tieneMarchas) {
        super(marca, modelo, year, precio);
        this.tieneMarchas = tieneMarchas;
    }

    /**
     * Comprueba si la moto tiene marchas.
     *
     * @return true si la moto tiene marchas, false en caso contrario.
     */
    public boolean isTieneMarchas() {
        return tieneMarchas;
    }

    /**
     * Establece si la moto tiene marchas.
     *
     * @param tieneMarchas true si la moto tiene marchas, false en caso contrario.
     */
    public void setTieneMarchas(boolean tieneMarchas) {
        this.tieneMarchas = tieneMarchas;
    }
}
