package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.UUID;

/**
 * Esta clase representa un catálogo de automóviles.
 */
public class Catalogo implements Serializable {
    private ArrayList<Automovil> automoviles;

    public Catalogo() {
        this.automoviles = new ArrayList<>();
    }

    /**
     * Agrega un automóvil al catálogo generando una referencia única.
     *
     * @param automovil El automóvil a agregar.
     */
    public void agregarAutomovil(Automovil automovil) {
        String referencia = UUID.randomUUID().toString();
        automovil.setReferencia(referencia);
        automoviles.add(automovil);
    }

    /**
     * Elimina un automóvil del catálogo por su referencia única.
     *
     * @param referencia La referencia única del automóvil a eliminar.
     */
    public void eliminarAutomovil(String referencia) {
        automoviles.removeIf(auto -> auto.getReferencia().equals(referencia));
    }

    /**
     * Lista los automóviles en el catálogo.
     */
    public void listarAutomoviles() {
        System.out.println("Catalogo de Automoviles:");
        for (Automovil auto : automoviles) {
            System.out.println(auto);
        }
    }
}
