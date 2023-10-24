package interfaz;

import dominio.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Esta clase representa la interfaz de usuario para gestionar un catálogo de automóviles.
 */
public class Interfaz {
    private Catalogo catalogo;
    private Scanner scanner;

    public Interfaz(Catalogo catalogo) {
        this.catalogo = catalogo;
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        int opcion = -1;

        do {
            System.out.println("Gestion de Catalogo de Automoviles");
            System.out.println("1. Agregar Coche");
            System.out.println("2. Agregar Moto");
            System.out.println("3. Agregar Camion");
            System.out.println("4. Eliminar Automovil");
            System.out.println("5. Listar Automoviles");
            System.out.println("0. Salir");
            System.out.print("Elija una opcion: ");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (opcion) {
                    case 1:
                        agregarCoche();
                        break;
                    case 2:
                        agregarMoto();
                        break;
                    case 3:
                        agregarCamion();
                        break;
                    case 4:
                        eliminarAutomovil();
                        break;
                    case 5:
                        listarAutomoviles();
                        break;
                    case 0:
                        System.out.println("Saliendo del programa.");
                        break;
                    default:
                        System.out.println("Opción no válida. Inténtelo de nuevo.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese una opción válida.");
                scanner.nextLine(); // Clear invalid input
            }
        } while (opcion != 0);
    }

    private void agregarCoche() {
        System.out.print("Ingrese la marca del coche: ");
        String marca = scanner.nextLine();
        System.out.print("Ingrese el modelo del coche: ");
        String modelo = scanner.nextLine();
        System.out.print("Ingrese el año del coche: ");
        int year = scanner.nextInt();
        System.out.print("Ingrese el precio del coche: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese el número de puertas del coche: ");
        int numeroPuertas = scanner.nextInt();

        Coche coche = new Coche(marca, modelo, year, precio, numeroPuertas);
        catalogo.agregarAutomovil(coche);
        System.out.println("Coche agregado al catálogo con referencia: " + coche.getReferencia());
    }

    private void agregarMoto() {
        System.out.print("Ingrese la marca de la moto: ");
        String marca = scanner.nextLine();
        System.out.print("Ingrese el modelo de la moto: ");
        String modelo = scanner.nextLine();
        System.out.print("Ingrese el año de la moto: ");
        int year = scanner.nextInt();
        System.out.print("Ingrese el precio de la moto: ");
        double precio = scanner.nextDouble();
        System.out.print("La moto tiene marchas (true/false): ");
        boolean tieneMarchas = scanner.nextBoolean();

        Moto moto = new Moto(marca, modelo, year, precio, tieneMarchas);
        catalogo.agregarAutomovil(moto);
        System.out.println("Moto agregada al catálogo con referencia: " + moto.getReferencia());
    }

    private void agregarCamion() {
        System.out.print("Ingrese la marca del camión: ");
        String marca = scanner.nextLine();
        System.out.print("Ingrese el modelo del camión: ");
        String modelo = scanner.nextLine();
        System.out.print("Ingrese el año del camión: ");
        int year = scanner.nextInt();
        System.out.print("Ingrese el precio del camión: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese la capacidad de carga del camión: ");
        double capacidadCarga = scanner.nextDouble();

        Camion camion = new Camion(marca, modelo, year, precio, capacidadCarga);
        catalogo.agregarAutomovil(camion);
        System.out.println("Camión agregado al catálogo con referencia: " + camion.getReferencia());
    }

    private void eliminarAutomovil() {
        System.out.print("Ingrese la referencia del automóvil que desea eliminar: ");
        String referenciaEliminar = scanner.next();
        catalogo.eliminarAutomovil(referenciaEliminar);
        System.out.println("Automóvil con referencia " + referenciaEliminar + " eliminado del catálogo.");
    }

    private void listarAutomoviles() {
        System.out.println("Coches:");
        catalogo.listarCoches();
        System.out.println("\nMotos:");
        catalogo.listarMotos();
        System.out.println("\nCamiones:");
        catalogo.listarCamiones();
    }

}
