package interfaz;

import dominio.Automovil;
import dominio.Camion;
import dominio.Catalogo;
import dominio.Coche;
import dominio.Moto;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Clase que representa la interfaz grafica para gestionar un catalogo de automoviles.
 */
public class Interfaz {
    private JFrame frame;
    private Catalogo catalogo;
    private DefaultListModel<Coche> cocheListModel;
    private DefaultListModel<Moto> motoListModel;
    private DefaultListModel<Camion> camionListModel;
    private JTextField searchField;

    /**
     * Constructor de la clase Interfaz.
     *
     * @param catalogo El catalogo de automoviles que se gestionara en la interfaz.
     */
    public Interfaz(Catalogo catalogo) {
        this.catalogo = catalogo;

        frame = new JFrame("Gestor Automoviles");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        frame.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        searchField = new JTextField();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        searchField.setBorder(BorderFactory.createTitledBorder("Buscador por Marca o Modelo"));
        frame.add(searchField, gbc);

        cocheListModel = new DefaultListModel<>();
        JList<Coche> cocheList = new JList<>(cocheListModel);
        JScrollPane cocheScrollPane = new JScrollPane(cocheList);
        TitledBorder cocheBorder = BorderFactory.createTitledBorder("Coches");
        cocheScrollPane.setBorder(cocheBorder);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        frame.add(cocheScrollPane, gbc);

        motoListModel = new DefaultListModel<>();
        JList<Moto> motoList = new JList<>(motoListModel);
        JScrollPane motoScrollPane = new JScrollPane(motoList);
        TitledBorder motoBorder = BorderFactory.createTitledBorder("Motos");
        motoScrollPane.setBorder(motoBorder);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        frame.add(motoScrollPane, gbc);

        camionListModel = new DefaultListModel<>();
        JList<Camion> camionList = new JList<>(camionListModel);
        JScrollPane camionScrollPane = new JScrollPane(camionList);
        TitledBorder camionBorder = BorderFactory.createTitledBorder("Camiones");
        camionScrollPane.setBorder(camionBorder);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        frame.add(camionScrollPane, gbc);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(0, 1));

        JButton agregarCocheButton = new JButton("Agregar Coche");
        JButton agregarMotoButton = new JButton("Agregar Moto");
        JButton agregarCamionButton = new JButton("Agregar Camion");
        JButton salirButton = new JButton("Salir");

        buttonPanel.add(agregarCocheButton);
        buttonPanel.add(agregarMotoButton);
        buttonPanel.add(agregarCamionButton);
        buttonPanel.add(salirButton);
        gbc.gridx = 0; 
        gbc.gridy = 4; 
        gbc.weighty = 1.0; 
        gbc.fill = GridBagConstraints.BOTH;
        frame.add(buttonPanel, gbc);
        refreshLists();

        agregarCocheButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showCocheDialog();
                refreshLists();
            }
        });

        searchField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                filterLists(searchField.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                filterLists(searchField.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                filterLists(searchField.getText());
            }
        });

        agregarMotoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showMotoDialog();
                refreshLists();
            }
        });

        agregarCamionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showCamionDialog();
                refreshLists();
            }
        });

        salirButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Saliendo del programa...");
                System.exit(0);
            }
        });

        cocheList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) { //Doble-click
                    int selectedIndex = cocheList.getSelectedIndex();
                    if (selectedIndex != -1) {
                        int option = JOptionPane.showConfirmDialog(frame,
                                "Eliminar este Coche?", "Confirmar Eliminacion",
                                JOptionPane.YES_NO_OPTION);
                        if (option == JOptionPane.YES_OPTION) {
                            Coche selectedCoche = cocheListModel.get(selectedIndex);
                            catalogo.eliminarAutomovil(selectedCoche.getReferencia());
                            cocheListModel.removeElement(selectedCoche);
                        }
                    }
                    refreshLists();
                }
            }
        });

        motoList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) { // Doble-click
                    int selectedIndex = motoList.getSelectedIndex();
                    if (selectedIndex != -1) {
                        int option = JOptionPane.showConfirmDialog(frame,
                                "Eliminar esta Moto?", "Confirmar Eliminacion",
                                JOptionPane.YES_NO_OPTION);
                        if (option == JOptionPane.YES_OPTION) {
                            Moto selectedMoto = motoListModel.get(selectedIndex);
                            catalogo.eliminarAutomovil(selectedMoto.getReferencia());
                            motoListModel.removeElement(selectedMoto);
                        }
                    }
                    refreshLists();
                }
            }
        });

        camionList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) { // Double-click
                    int selectedIndex = camionList.getSelectedIndex();
                    if (selectedIndex != -1) {
                        int option = JOptionPane.showConfirmDialog(frame,
                                "Eliminar este Camion?", "Confirmar Eliminacion",
                                JOptionPane.YES_NO_OPTION);
                        if (option == JOptionPane.YES_OPTION) {
                            Camion selectedCamion = camionListModel.get(selectedIndex);
                            catalogo.eliminarAutomovil(selectedCamion.getReferencia());
                            camionListModel.removeElement(selectedCamion);
                        }
                    }
                    refreshLists();
                }
            }
        });

        frame.setVisible(true);
    }

    private void showCocheDialog() {
        String marca = JOptionPane.showInputDialog(frame, "Ingrese la marca del Coche:");
        String modelo = JOptionPane.showInputDialog(frame, "Ingrese el modelo del Coche:");
        int year = Integer.parseInt(JOptionPane.showInputDialog(frame, "Ingrese el a\u00f1o del Coche:"));
        double precio = Double.parseDouble(JOptionPane.showInputDialog(frame, "Ingrese el precio del Coche:"));
        int numeroPuertas = Integer.parseInt(JOptionPane.showInputDialog(frame, "Ingrese el numero de puertas del Coche:"));

        Coche coche = new Coche(marca, modelo, year, precio, numeroPuertas);
        catalogo.agregarAutomovil(coche);
        cocheListModel.addElement(coche);
    }

    private void showMotoDialog() {
        String marca = JOptionPane.showInputDialog(frame, "Ingrese la marca de la Moto:");
        String modelo = JOptionPane.showInputDialog(frame, "Ingrese el modelo de la Moto:");
        int year = Integer.parseInt(JOptionPane.showInputDialog(frame, "Ingrese el a\u00f1o de la Moto:"));
        double precio = Double.parseDouble(JOptionPane.showInputDialog(frame, "Ingrese el precio de la Moto:"));
        boolean tieneMarchas = Boolean.parseBoolean(JOptionPane.showInputDialog(frame, "La Moto tiene marchas (true/false):"));

        Moto moto = new Moto(marca, modelo, year, precio, tieneMarchas);
        catalogo.agregarAutomovil(moto);
        motoListModel.addElement(moto);
    }

    private void showCamionDialog() {
        String marca = JOptionPane.showInputDialog(frame, "Ingrese la marca del Camion:");
        String modelo = JOptionPane.showInputDialog(frame, "Ingrese el modelo del Camion:");
        int year = Integer.parseInt(JOptionPane.showInputDialog(frame, "Ingrese el a\u00f1o del Camion:"));
        double precio = Double.parseDouble(JOptionPane.showInputDialog(frame, "Ingrese el precio del Camion:"));
        double capacidadCarga = Double.parseDouble(JOptionPane.showInputDialog(frame, "Ingrese la capacidad de carga del Camion:"));

        Camion camion = new Camion(marca, modelo, year, precio, capacidadCarga);
        catalogo.agregarAutomovil(camion);
        camionListModel.addElement(camion);
    }

    private void refreshLists() {
        cocheListModel.clear();
        motoListModel.clear();
        camionListModel.clear();

        for (Automovil automovil : catalogo.getAutomoviles()) {
            if (automovil instanceof Coche) {
                cocheListModel.addElement((Coche) automovil);
            } else if (automovil instanceof Moto) {
                motoListModel.addElement((Moto) automovil);
            } else if (automovil instanceof Camion) {
                camionListModel.addElement((Camion) automovil);
            }
        }
    }
    
    private void filterLists(String searchTerm) {
        cocheListModel.clear();
        motoListModel.clear();
        camionListModel.clear();

        for (Automovil automovil : catalogo.getAutomoviles()) {
            if (automovil.matchesSearchTerm(searchTerm)) {
                if (automovil instanceof Coche) {
                    cocheListModel.addElement((Coche) automovil);
                } else if (automovil instanceof Moto) {
                    motoListModel.addElement((Moto) automovil);
                } else if (automovil instanceof Camion) {
                    camionListModel.addElement((Camion) automovil);
                }
            }
        }
    }

    /**
     * Metodo principal para iniciar la aplicacion.
     *
     * @param args Los argumentos de la linea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();
        new Interfaz(catalogo);
    }
}
