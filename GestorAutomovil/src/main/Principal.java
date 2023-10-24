package main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import dominio.Catalogo;
import interfaz.Interfaz;

public class Principal {
    public static void main(String[] args) {
        Catalogo catalogo = cargarCatalogo();
        new Interfaz(catalogo);
        
        guardarCatalogo(catalogo);
    }

    private static Catalogo cargarCatalogo() {
        Catalogo catalogo = null;
        try (FileInputStream fileInputStream = new FileInputStream("catalogo.ser");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            catalogo = (Catalogo) objectInputStream.readObject();
            System.out.println("Catalogo cargado exitosamente.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar el catalogo. Se creará un catálogo vacío.");
        }
        return catalogo != null ? catalogo : new Catalogo();
    }

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
