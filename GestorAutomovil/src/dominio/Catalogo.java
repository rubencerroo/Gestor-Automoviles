package dominio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class Catalogo implements Serializable {
    private ArrayList<Automovil> automoviles;

    public Catalogo() {
        this.automoviles = new ArrayList<>();
    }


    public void agregarAutomovil(Automovil automovil) {
        String referencia = UUID.randomUUID().toString();
        automovil.setReferencia(referencia);
        automoviles.add(automovil);
        saveCatalogo();
    }


    public void eliminarAutomovil(String referencia) {
        automoviles.removeIf(auto -> auto.getReferencia().equals(referencia));
        saveCatalogo();
    }


    public void listarCoches() {
        automoviles.stream()
                .filter(auto -> auto instanceof Coche)
                .forEach(System.out::println);
    }

    public void listarMotos() {
        automoviles.stream()
                .filter(auto -> auto instanceof Moto)
                .forEach(System.out::println);
    }

    public void listarCamiones() {
        automoviles.stream()
                .filter(auto -> auto instanceof Camion)
                .forEach(System.out::println);
    }
    
    public List<Automovil> getAutomoviles() {
        return automoviles;
    }
    private void saveCatalogo() {
        try (FileOutputStream fileOutputStream = new FileOutputStream("catalogo.ser");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(this);
            System.out.println("Catalogo saved successfully.");
        } catch (IOException e) {
            System.err.println("Error saving the catalog.");
        }
    }
}

