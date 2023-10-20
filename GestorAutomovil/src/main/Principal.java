package main;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import dominio.Automovil;
import dominio.Catalogo;

/**
 * Esta clase representa el programa principal para gestionar un catálogo de automóviles.
 * Permite agregar, eliminar y listar automóviles, así como cargar y guardar el catálogo en un archivo.
 */
public class Principal {
    public static void main(String[] args) {
        Catalogo catalogo = cargarCatalogo(); // Cargar el catálogo al abrir el programa
        Scanner scanner = new Scanner(System.in);

        int opcion = -1;

        do {
            System.out.println("Gestion de Catalogo de Automoviles");
            System.out.println("1. Agregar Automovil");
            System.out.println("2. Eliminar Automovil");
            System.out.println("3. Listar Automoviles");
            System.out.println("0. Salir");
            System.out.print("Elija una opcion: ");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea después de nextInt()

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese la marca del automovil: ");
                        String marca = scanner.nextLine();
                        System.out.print("Ingrese el modelo del automovil: ");
                        String modelo = scanner.nextLine();
                        System.out.print("Ingrese el a\u00f1o del automovil: ");
                        int year = scanner.nextInt();
                        System.out.print("Ingrese el precio del automovil: ");
                        double precio = scanner.nextDouble();

                        Automovil automovil = new Automovil(null, marca, modelo, year, precio);
                        catalogo.agregarAutomovil(automovil);
                        System.out.println("Automovil agregado al catalogo con referencia: " + automovil.getReferencia());
                        break;
                    case 2:
                        System.out.print("Ingrese la referencia del automovil que desea eliminar: ");
                        String referenciaEliminar = scanner.next();
                        catalogo.eliminarAutomovil(referenciaEliminar);
                        System.out.println("Automovil con referencia " + referenciaEliminar + " eliminado del catalogo.");
                        break;
                    case 3:
                        catalogo.listarAutomoviles();
                        break;
                    case 0:
                        System.out.println("Saliendo del programa.");
                        guardarCatalogo(catalogo); // Guardar el catalogo al cerrar el programa
                        scanner.close();
                        break;
                    default:
                        System.out.println("Opción no válida. Inténtelo de nuevo.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese una opción válida.");
                scanner.nextLine(); // Limpia la entrada incorrecta
            }
        } while (opcion != 0);
    }

    /**
     * Carga el catálogo de automóviles desde un archivo serializado.
     *
     * @return El catálogo de automóviles cargado.
     */
    private static Catalogo cargarCatalogo() {
        Catalogo catalogo = null;
        try (FileInputStream fileInputStream = new FileInputStream("catalogo.ser");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            catalogo = (Catalogo) objectInputStream.readObject();
            System.out.println("Catalogo cargado exitosamente.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar el catalogo. Se creara un catalogo vacio.");
        }
        return catalogo != null ? catalogo : new Catalogo();
    }

    /**
     * Guarda el catálogo de automóviles en un archivo serializado.
     *
     * @param catalogo El catálogo de automóviles a guardar.
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