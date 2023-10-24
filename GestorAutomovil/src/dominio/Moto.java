package dominio;

public class Moto extends Automovil {
    private boolean tieneMarchas;

    public Moto(String marca, String modelo, int year, double precio, boolean tieneMarchas) {
        super(marca, modelo, year, precio);
        this.tieneMarchas = tieneMarchas;
    }

    public boolean isTieneMarchas() {
        return tieneMarchas;
    }

    public void setTieneMarchas(boolean tieneMarchas) {
        this.tieneMarchas = tieneMarchas;
    }
}
