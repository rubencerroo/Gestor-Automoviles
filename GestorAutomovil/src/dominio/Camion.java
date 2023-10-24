package dominio;

public class Camion extends Automovil {
    private double capacidadCarga;

    public Camion(String marca, String modelo, int year, double precio, double capacidadCarga) {
        super(marca, modelo, year, precio);
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
}
