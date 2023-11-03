package ejercicio6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class principal {

    public static void main(String[] args) {
        
        JFrame ventana = new JFrame("Etiqueta y Botones");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 200);
        ventana.setLayout(null); 

    
        JLabel etiNombre = new JLabel("Su Nombre");
        etiNombre.setBackground(Color.YELLOW);
        etiNombre.setOpaque(true);
        etiNombre.setBounds(150, 100, 100, 30);
        ventana.add(etiNombre);

       
        JButton btnEsquina = new JButton("Esquina");
        JButton btnCentro = new JButton("Centro");
        JButton btnAgrandar = new JButton("Agrandar");
        JButton btnAchicar = new JButton("Achicar");

        btnEsquina.setBounds(10, 10, 90, 30);
        btnCentro.setBounds(110, 10, 90, 30);
        btnAgrandar.setBounds(210, 10, 90, 30);
        btnAchicar.setBounds(310, 10, 90, 30);

    
        ventana.add(btnEsquina);
        ventana.add(btnCentro);
        ventana.add(btnAgrandar);
        ventana.add(btnAchicar);


        btnEsquina.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiNombre.setLocation(10, 10); 
            }
        });

        btnCentro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiNombre.setLocation(150, 100);
            }
        });

        btnAgrandar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiNombre.setSize(etiNombre.getWidth() + 20, etiNombre.getHeight() + 10);
            }
        });

        btnAchicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiNombre.setSize(etiNombre.getWidth() - 20, etiNombre.getHeight() - 10);
            }
        });

      
        btnEsquina.addMouseListener(new ButtonMouseListener(btnEsquina));
        btnCentro.addMouseListener(new ButtonMouseListener(btnCentro));
        btnAgrandar.addMouseListener(new ButtonMouseListener(btnAgrandar));
        btnAchicar.addMouseListener(new ButtonMouseListener(btnAchicar));

    
        ventana.setVisible(true);
    }

    static class ButtonMouseListener extends MouseAdapter {
        private JButton button;

        public ButtonMouseListener(JButton button) {
            this.button = button;
        }

        @Override
        public void mouseEntered(MouseEvent e) {
     
            button.setSize(button.getWidth() + 10, button.getHeight() + 5);
        }

        @Override
        public void mouseExited(MouseEvent e) {
         
            button.setSize(button.getWidth() - 10, button.getHeight() - 5);
        }
    }
}
