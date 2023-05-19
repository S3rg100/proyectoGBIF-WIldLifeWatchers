package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaginaInicioUsuario {
    private JFrame frame;

    public void mostrarEscenaUsuario() {
        frame = new JFrame("Escena de Usuario");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        initComponentsUsuario();
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void initComponentsUsuario() {
        JPanel contentPane = new JPanel();
        contentPane.setBackground(new Color(194, 230, 202)); // Fondo verde claro

        // Configuración del layout
        contentPane.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10); // Espacios entre los componentes

        // Configuración del botón "Ver Cámaras"
        JButton verCamarasButton = new JButton("Ver Cámaras");
        verCamarasButton.setPreferredSize(new Dimension(200, 50));
        verCamarasButton.setBackground(Color.WHITE);
        verCamarasButton.setForeground(Color.BLACK);
        verCamarasButton.setFont(new Font("Arial", Font.BOLD, 16));
        verCamarasButton.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK, 2),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)
        ));
        verCamarasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para cuando se haga clic en el botón "Ver Cámaras"
                System.out.println("Botón 'Ver Cámaras' presionado (Escena Usuario)");
            }
        });

        // Configuración del botón "Ver Datos"
        JButton verDatosButton = new JButton("Ver Datos");
        verDatosButton.setPreferredSize(new Dimension(200, 50));
        verDatosButton.setBackground(Color.WHITE);
        verDatosButton.setForeground(Color.BLACK);
        verDatosButton.setFont(new Font("Arial", Font.BOLD, 16));
        verDatosButton.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK, 2),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)
        ));
        verDatosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para cuando se haga clic en el botón "Ver Datos"
                System.out.println("Botón 'Ver Datos' presionado (Escena Usuario)");
            }
        });

        // Posicionamiento de los botones en el centro
        constraints.gridx = 0;
        constraints.gridy = 0;
        contentPane.add(verCamarasButton, constraints);
        constraints.gridy = 1;
        contentPane.add(verDatosButton, constraints);

        frame.setContentPane(contentPane);
    }

    public void mostrarEscenaExperto() {
        frame = new JFrame("Escena de Experto");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        initComponentsExperto();
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void initComponentsExperto() {
        JPanel contentPane = new JPanel();
        contentPane.setBackground(new Color(194, 230, 202)); // Fondo verde claro

        // Configuración del layout
        contentPane.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10); // Espacios entre los componentes

        // Configuración del botón "Clasificar Imágenes"
        JButton clasificarButton = new JButton("Clasificar Imágenes");
        clasificarButton.setPreferredSize(new Dimension(200, 50));
        clasificarButton.setBackground(Color.WHITE);
        clasificarButton.setForeground(Color.BLACK);
        clasificarButton.setFont(new Font("Arial", Font.BOLD, 16));
        clasificarButton.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK, 2),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)
        ));
        clasificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para cuando se haga clic en el botón "Clasificar Imágenes"
                System.out.println("Botón 'Clasificar Imágenes' presionado (Escena Experto)");
            }
        });

        // Posicionamiento del botón en el centro
        constraints.gridx = 0;
        constraints.gridy = 0;
        contentPane.add(clasificarButton, constraints);

        frame.setContentPane(contentPane);
    }

    public void mostrarEscenaAdministrador() {
        frame = new JFrame("Escena de Administrador");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        initComponentsAdministrador();
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void initComponentsAdministrador() {
        JPanel contentPane = new JPanel();
        contentPane.setBackground(new Color(194, 230, 202)); // Fondo verde claro

        // Configuración del layout
        contentPane.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10); // Espacios entre los componentes

        // Configuración del botón "Clasificar Imágenes"
        JButton clasificarButton = new JButton("Clasificar Imágenes");
        clasificarButton.setPreferredSize(new Dimension(200, 50));
        clasificarButton.setBackground(Color.WHITE);
        clasificarButton.setForeground(Color.BLACK);
        clasificarButton.setFont(new Font("Arial", Font.BOLD, 16));
        clasificarButton.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK, 2),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)
        ));
        clasificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para cuando se haga clic en el botón "Clasificar Imágenes"
                System.out.println("Botón 'Clasificar Imágenes' presionado (Escena Administrador)");
            }
        });

        // Configuración del botón "Administrar Roles"
        JButton administrarRolesButton = new JButton("Administrar Roles");
        administrarRolesButton.setPreferredSize(new Dimension(200, 50));
        administrarRolesButton.setBackground(Color.WHITE);
        administrarRolesButton.setForeground(Color.BLACK);
        administrarRolesButton.setFont(new Font("Arial", Font.BOLD, 16));
        administrarRolesButton.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK, 2),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)
        ));
        administrarRolesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para cuando se haga clic en el botón "Administrar Roles"
                System.out.println("Botón 'Administrar Roles' presionado (Escena Administrador)");
            }
        });

        // Posicionamiento de los botones en el centro
        constraints.gridx = 0;
        constraints.gridy = 0;
        contentPane.add(clasificarButton, constraints);
        constraints.gridy = 1;
        contentPane.add(administrarRolesButton, constraints);

        frame.setContentPane(contentPane);
    }

    public static void main(String[] args) {
        PaginaInicioUsuario paginaInicio = new PaginaInicioUsuario();
        paginaInicio.mostrarEscenaUsuario();
        // Para mostrar otras escenas, simplemente llamar a sus métodos correspondientes
        // paginaInicio.mostrarEscenaExperto();
        // paginaInicio.mostrarEscenaAdministrador();
    }
}
