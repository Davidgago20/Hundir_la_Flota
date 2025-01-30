package hundirflota;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;
import hundirflota.colorBarcos.*;

/**
 * Clase Título
 *
 * @author ilernagames
 */
public class Titulo extends JPanel {

    JPanel barra;
    JPanel panel_titulo = new JPanel();
    JLabel titulo;

    /**
     * Constructor de la clase Título
     */
    public Titulo() {
        barra = new JPanel();
        setLayout(new GridLayout(2, 1));
        panel_titulo.setBorder(new EmptyBorder(0, 0, 0, 0));
        add(barra);
        add(panel_titulo);
        this.setBorder(new EmptyBorder(0, 0, 0, 0));
        // Datos del título
        titulo = new JLabel("ILERNAGAMES - HUNDIR LA FLOTA", SwingConstants.CENTER);
        titulo.setFont(new Font("Verdana", 1, 17));
        titulo.setForeground(Color.DARK_GRAY);
        titulo.setVisible(true);
        crearMenu();
        panel_titulo.add(titulo);
    }
    
    /**
     * Crea el menú para elegir los colores
     * AQUÍ CREAREMOS EL MENÚ DE LOS COLORES
     */
    private void crearMenu() {
        JMenuBar menu = new JMenuBar();
        JMenu color_barcos = new JMenu("Color Barcos");
        // Color Violeta
        JMenuItem color_violeta = new JMenuItem("Violeta");
        color_violeta.addActionListener(new EColorVioleta());
        // Color Verde Lima
        JMenuItem color_verdelima = new JMenuItem("Verde Lima");
        color_verdelima.addActionListener(new EColorVerdeLima());
        // Color Coral
        JMenuItem color_coral = new JMenuItem("Coral");
        color_coral.addActionListener(new EColorCoral());
        // Color Magenta Oscuro
        JMenuItem color_magentaoscuro = new JMenuItem("Magenta Oscuro");
        color_magentaoscuro.addActionListener(new EColorMagentaOscuro());
        // Color Amarillo Verdoso
        JMenuItem color_amarilloverdoso = new JMenuItem("Amarillo Verdoso");
        color_amarilloverdoso.addActionListener(new EColorAmarilloVerdoso());
        // Añadimos los diferentes colores
        color_barcos.add(color_violeta);
        color_barcos.add(color_verdelima);
        color_barcos.add(color_coral);
        color_barcos.add(color_magentaoscuro);
        color_barcos.add(color_amarilloverdoso);
        menu.add(color_barcos);
        barra.add(menu);
    }

    class eColorVerde implements ActionListener {

        Color color = Color.green;

        @Override
        public void actionPerformed(ActionEvent e) {

            for (int x = 0; x < 100; x++) {
                if (Partida.tableroJugador.botones[x].getActivo()
                        && !Partida.tableroJugador.botones[x].getTocado()
                        && !Partida.tableroJugador.botones[x].getHundido()) {
                    Partida.tableroJugador.botones[x].setBackground(color);
                }
            }
            Boton.color = color;
        }

    }
}