package hundirflota;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author david
 */
public class Derrota extends JDialog {

    public Derrota (JFrame parent) {
        super(parent, "ILERNAGAMES - HUNDIR LA FLOTA", true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel label = new JLabel("¡PERDISTE!");
        label.setFont(new Font("Arial", Font.BOLD, 34));
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        label.setPreferredSize(new Dimension(250, 50));
                
        panel.add(Box.createVerticalGlue());
        panel.add(label);
        panel.add(Box.createVerticalGlue());
        
        add(panel); 

        pack();
        setSize(300,150);
        setLocationRelativeTo(parent);
        setVisible(true);
    }
}