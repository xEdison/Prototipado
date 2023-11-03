package ejercicio4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    private JTextField txtNombre;
    private JTextField txtCiudad;
    private JLabel txtFrase;
    
    public Ventana() {
        setTitle("ventana");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        txtNombre = new JTextField(20);
        txtCiudad = new JTextField(20);
        txtFrase = new JLabel();
        
        JButton btnAceptar = new JButton("Aceptar");
        JButton btnDesactivar = new JButton("Desactivar");
        JButton btnActivar = new JButton("Activar");
        
    
        add(new JLabel("Nombre: "));
        add(txtNombre);
        add(new JLabel("Ciudad: "));
        add(txtCiudad);
        add(btnAceptar);
        add(btnDesactivar);
        add(btnActivar);
        add(txtFrase);
        

        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = txtNombre.getText();
                String ciudad = txtCiudad.getText();
                txtFrase.setText("Usted se llama " + nombre + " y vive en " + ciudad + ".");
            }
        });
        

        btnDesactivar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNombre.setEnabled(false);
                txtCiudad.setEnabled(false);
            }
        });
        

        btnActivar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNombre.setEnabled(true);
                txtCiudad.setEnabled(true);
            }
        });
    }
    
   
}
