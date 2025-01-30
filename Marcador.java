package hundirflota;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;

/**
 *
 * @author david
 */

public class Marcador extends JPanel {
    private JLabel JugadorLabel;
    private JLabel CPULabel;
    private JLabel JugadorPuntos;
    private JLabel CPUPuntos;
    private int PuntoJugador;
    private int PuntoCPU;

    public Marcador() {
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH; // Asegura que los componentes se expandan en ambas direcciones
        gbc.weightx = 1.0; // Todas las columnas tendrán el mismo ancho
        gbc.weighty = 1.0; // Todas las filas tendrán la misma altura
        gbc.insets = new Insets(0, 50, 0, 50);
        
        // Etiqueta para indicar "JUGADOR"
        JugadorLabel = new JLabel("JUGADOR", SwingConstants.CENTER);
        JugadorLabel.setForeground(Color.WHITE);
        JugadorLabel.setOpaque(true);
        JugadorLabel.setBackground(Color.BLUE);
        JugadorLabel.setBorder(new LineBorder(Color.BLACK));
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(JugadorLabel, gbc);

        // Etiqueta para indicar "CPU"
        CPULabel = new JLabel("    CPU    ", SwingConstants.CENTER);
        CPULabel.setForeground(Color.WHITE);
        CPULabel.setOpaque(true);
        CPULabel.setBackground(Color.RED);
        CPULabel.setBorder(new LineBorder(Color.BLACK));
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(CPULabel, gbc);

        // Marcador para el jugador
        JugadorPuntos = new JLabel("0", SwingConstants.CENTER);
        JugadorPuntos.setForeground(Color.BLACK);
        JugadorPuntos.setOpaque(true);
        JugadorPuntos.setBackground(Color.WHITE);
        JugadorPuntos.setBorder(new LineBorder(Color.BLACK));
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(JugadorPuntos, gbc);

        // Marcador para la CPU
        CPUPuntos = new JLabel("0", SwingConstants.CENTER);
        CPUPuntos.setForeground(Color.BLACK);
        CPUPuntos.setOpaque(true);
        CPUPuntos.setBackground(Color.WHITE);
        CPUPuntos.setBorder(new LineBorder(Color.BLACK));
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(CPUPuntos, gbc);
    }
    
    public void anadePJugador(){
        this.PuntoJugador++;
        JugadorPuntos.setText(String.valueOf(this.PuntoJugador));
    }
    
    public void anadePCPU(){
        this.PuntoCPU++;
        CPUPuntos.setText(String.valueOf(PuntoCPU));
        }
}
