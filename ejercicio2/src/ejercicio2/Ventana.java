package ejercicio2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    private JTextField txtTexto;
    private JLabel etiTexto1;
    private JLabel etiTexto2;
    private JButton btnTraspasa1;
    private JButton btnTraspasa2;

    public Ventana() {

        setTitle("ventana");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        txtTexto = new JTextField(20);
        etiTexto1 = new JLabel();
        etiTexto2 = new JLabel();
        btnTraspasa1 = new JButton("Traspasa 1");
        btnTraspasa2 = new JButton("Traspasa 2");

    
        add(txtTexto);
        add(etiTexto1);
        add(etiTexto2);
        add(btnTraspasa1);
        add(btnTraspasa2);


        btnTraspasa1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = txtTexto.getText();
                etiTexto1.setText(texto);
            }
        });

        btnTraspasa2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = txtTexto.getText();
                etiTexto2.setText(texto);
            }
        });
    }

    
}
