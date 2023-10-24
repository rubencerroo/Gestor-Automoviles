package main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import dominio.Catalogo;
import interfaz.Interfaz;

/**
 * Clase principal que inicia la aplicacion y gestiona la carga y guardado del catalogo.
 */
public class Principal {
    /**
     * Metodo principal para iniciar la aplicacion.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        Catalogo catalogo = cargarCatalogo();
        new Interfaz(catalogo);
        guardarCatalogo(catalogo);
    }

    /**
     * Carga el catalogo desde un archivo si existe, o crea un catalogo vacío si no se encuentra el archivo.
     *
     * @return El catalogo cargado o un catalogo vacío.
     */
    private static Catalogo cargarCatalogo() {
        Catalogo catalogo = null;
        try (FileInputStream fileInputStream = new FileInputStream("catalogo.ser");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            catalogo = (Catalogo) objectInputStream.readObject();
            System.out.println("Catalogo cargado exitosamente.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar el catalogo. Se creara un catalogo vacío.");
        }
        return catalogo != null ? catalogo : new Catalogo();
    }

    /**
     * Guarda el catalogo en un archivo.
     *
     * @param catalogo El catalogo a ser guardado.
     */
    private static void guardarCatalogo(Catalogo catalogo) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("catalogo.ser");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(catalogo);
            System.out.println("Catalogo guardado exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar el catalogo.");
        }
    }
}
