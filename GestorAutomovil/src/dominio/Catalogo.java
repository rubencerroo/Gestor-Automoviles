package dominio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Clase que representa un catalogo de automoviles y gestiona las operaciones relacionadas con ellos.
 */
public class Catalogo implements Serializable {
    private ArrayList<Automovil> automoviles;

    /**
     * Constructor de la clase Catalogo que inicializa la lista de automoviles.
     */
    public Catalogo() {
        this.automoviles = new ArrayList<>();
    }

    /**
     * Agrega un automovil al catalogo y le asigna una referencia única.
     *
     * @param automovil El automovil a agregar al catalogo.
     */
    public void agregarAutomovil(Automovil automovil) {
        String referencia = UUID.randomUUID().toString();
        automovil.setReferencia(referencia);
        automoviles.add(automovil);
        saveCatalogo();
    }

    /**
     * Elimina un automovil del catalogo mediante su referencia.
     *
     * @param referencia La referencia única del automovil a eliminar.
     */
    public void eliminarAutomovil(String referencia) {
        automoviles.removeIf(auto -> auto.getReferencia().equals(referencia));
        saveCatalogo();
    }

    /**
     * Lista todos los coches presentes en el catalogo.
     */
    public void listarCoches() {
        automoviles.stream()
                .filter(auto -> auto instanceof Coche)
                .forEach(System.out::println);
    }

    /**
     * Lista todas las motos presentes en el catalogo.
     */
    public void listarMotos() {
        automoviles.stream()
                .filter(auto -> auto instanceof Moto)
                .forEach(System.out::println);
    }

    /**
     * Lista todos los camiones presentes en el catalogo.
     */
    public void listarCamiones() {
        automoviles.stream()
                .filter(auto -> auto instanceof Camion)
                .forEach(System.out::println);
    }

    /**
     * Obtiene la lista de todos los automoviles en el catalogo.
     *
     * @return Una lista de automoviles en el catalogo.
     */
    public List<Automovil> getAutomoviles() {
        return automoviles;
    }

    /**
     * Metodo privado para guardar el catalogo en un archivo.
     */
    private void saveCatalogo() {
        try (FileOutputStream fileOutputStream = new FileOutputStream("catalogo.ser");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(this);
            System.out.println("Catalogo guardado con exito.");
        } catch (IOException e) {
            System.err.println("Error al guardar el catalogo.");
        }
    }
}
