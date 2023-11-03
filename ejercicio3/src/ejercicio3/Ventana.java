package ejercicio3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ventana extends JFrame {
    public JTextField txtTexto;
    public JLabel etiTexto;

    public Ventana() {
        
        setTitle("Ejemplo de JTextField y JLabel");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

      
        txtTexto = new JTextField(20);
        etiTexto = new JLabel();

        JButton btnVaciar = new JButton("Vaciar");


        add(txtTexto);
        add(etiTexto);
        add(btnVaciar);

 
        btnVaciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtTexto.setText("");
                etiTexto.setText("");
            }
        });


        txtTexto.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
              
                etiTexto.setText(txtTexto.getText());
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
    }

   
}
