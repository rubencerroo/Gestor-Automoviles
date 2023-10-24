package dominio;

public class Coche extends Automovil {
    private int numeroPuertas;

    public Coche(String marca, String modelo, int year, double precio, int numeroPuertas) {
        super(marca, modelo, year, precio);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
}
