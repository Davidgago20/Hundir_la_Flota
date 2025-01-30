package hundirflota;

import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame {
    // Constantes con el tamaño de la ventana
    public static final int ANCHO = 500;
    public static final int ALTO = 850;
    
    // Atributos en visibilidad de paquete
    Juego juego;
    Texto texto;
    Titulo titulo;
    Marcador marcador;
    
    /**
     * Constructor de la clase ventana
     */
    public Ventana() {
        setTitle("ILERNAGAMES - HUNDIR LA FLOTA");
        this.setResizable(false);
        setBounds(100, 100, Ventana.ANCHO, Ventana.ALTO);
        setLocationRelativeTo(null);
        BorderLayout layout = new BorderLayout();
        setLayout(layout);
        
        // Crear y añadir el título
        titulo = new Titulo();
        add(titulo, BorderLayout.NORTH);
        
        // Crear un panel para el marcador y el juego
        JPanel panelCentral = new JPanel();
        panelCentral.setLayout(new BorderLayout());
        
        // Crear y añadir el marcador al panel central
        marcador = new Marcador();
        panelCentral.add(marcador, BorderLayout.NORTH);
        
        // Crear y añadir el juego al panel central
        juego = new Juego();
        panelCentral.add(juego, BorderLayout.CENTER);
        
        // Añadir el panel central a la ventana
        add(panelCentral, BorderLayout.CENTER);
        
        // Crear y añadir el texto
        texto = new Texto();
        add(texto, BorderLayout.SOUTH);
        
        setVisible(true);
    }
    
    public Marcador getMarcador(){
        return marcador;
    }
}
