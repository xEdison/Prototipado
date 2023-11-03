package ejercicio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    public JLabel etiNombre;
    public JLabel etiCiudad;

    public Ventana() {
        
        setTitle("Programa en Java");
        setBounds(550, 250, 500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        
        etiNombre = new JLabel("Edison");
        etiCiudad = new JLabel("Arménia");
        add(etiNombre);
        add(etiCiudad);
        

       
        JButton btnOcultarNombre = new JButton("Ocultar Nombre");
        JButton btnVisuNombre = new JButton("Visualizar Nombre");
        JButton btnOcultarCiudad = new JButton("Ocultar Ciudad");
        JButton btnVisuCiudad = new JButton("Visualizar Ciudad");

        add(btnOcultarNombre);
        add(btnVisuNombre);
        add(btnOcultarCiudad);
        add(btnVisuCiudad);

        
        btnOcultarNombre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiNombre.setVisible(false);
            }
        });

        btnVisuNombre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiNombre.setVisible(true);
            }
        });

        btnOcultarCiudad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiCiudad.setVisible(false);
            }
        });

        btnVisuCiudad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiCiudad.setVisible(true);
            }
        });
    }


}