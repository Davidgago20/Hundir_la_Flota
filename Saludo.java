package hundirflota;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author david
 */
public class Saludo extends JDialog {

    public Saludo(JFrame parent) {
        super(parent, "ILERNAGAMES - HUNDIR LA FLOTA", true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel label = new JLabel("¡Bienvenido al juego!");
        label.setFont(new Font("Arial", Font.BOLD, 34));
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(label);
        panel.add(Box.createRigidArea(new Dimension(10, 20))); // Espacio de 20 píxeles entre los componentes

        JButton button = new JButton("Comenzar");
        button.addActionListener(e -> {
            dispose();
        });
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(button);

        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        getContentPane().add(panel);

        pack(); // Ajustar automáticamente el tamaño del diálogo
        setLocationRelativeTo(parent);
        setVisible(true);
    }
}
