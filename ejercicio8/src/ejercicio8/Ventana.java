package ejercicio8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    private JLabel etiTexto;
    private JButton btnAzul, btnRojo, btnVerde, btnFondoAzul, btnFondoRojo, btnFondoVerde, btnTransparente, btnOpaca;

    public Ventana() {
        setTitle("Cambiar Colores");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        etiTexto = new JLabel("Texto de prueba");
        etiTexto.setBounds(10, 10, 200, 30);
        add(etiTexto);

        btnAzul = new JButton("Azul");
        btnAzul.setBounds(10, 50, 80, 30);
        add(btnAzul);

        btnRojo = new JButton("Rojo");
        btnRojo.setBounds(100, 50, 80, 30);
        add(btnRojo);

        btnVerde = new JButton("Verde");
        btnVerde.setBounds(190, 50, 80, 30);
        add(btnVerde);

        btnFondoAzul = new JButton("Fondo Azul");
        btnFondoAzul.setBounds(10, 90, 120, 30);
        add(btnFondoAzul);

        btnFondoRojo = new JButton("Fondo Rojo");
        btnFondoRojo.setBounds(140, 90, 120, 30);
        add(btnFondoRojo);

        btnFondoVerde = new JButton("Fondo Verde");
        btnFondoVerde.setBounds(10, 130, 120, 30);
        add(btnFondoVerde);

        btnTransparente = new JButton("Transparente");
        btnTransparente.setBounds(140, 130, 120, 30);
        add(btnTransparente);

        btnOpaca = new JButton("Opaca");
        btnOpaca.setBounds(10, 170, 80, 30);
        add(btnOpaca);

        btnAzul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setForeground(Color.BLUE);
            }
        });

        btnRojo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setForeground(Color.RED);
            }
        });

        btnVerde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setForeground(Color.GREEN);
            }
        });

        btnFondoAzul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setBackground(Color.BLUE);
            }
        });

        btnFondoRojo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setBackground(Color.RED);
            }
        });

        btnFondoVerde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setBackground(Color.GREEN);
            }
        });

        btnTransparente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setOpaque(false);
            }
        });

        btnOpaca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setOpaque(true);
            }
        });
    }

  
}