	package ejercicio10;

	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	public class Ventana extends JFrame {

	    private JTextField txtPalabra1;
	    private JTextField txtPalabra2;
	    private JLabel etiTexto;
	    private JButton btnConcatena;

	    public Ventana() {
	        setTitle("Concatenador de Palabras");
	        setSize(300, 150);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);

	        txtPalabra1 = new JTextField(15);
	        txtPalabra2 = new JTextField(15);
	        etiTexto = new JLabel("Texto concatenado:");
	        btnConcatena = new JButton("Concatena");

	        JPanel panel = new JPanel(new GridLayout(3, 2));
	        panel.add(new JLabel("Palabra 1:"));
	        panel.add(txtPalabra1);
	        panel.add(new JLabel("Palabra 2:"));
	        panel.add(txtPalabra2);
	        panel.add(etiTexto);
	        panel.add(btnConcatena);
	        add(panel, BorderLayout.CENTER);

	        btnConcatena.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                concatenarPalabras();
	            }
	        });
	    }

	    private void concatenarPalabras() {
	        String palabra1 = txtPalabra1.getText();
	        String palabra2 = txtPalabra2.getText();
	        String textoConcatenado = palabra1 + palabra2;
	        etiTexto.setText("Texto concatenado: " + textoConcatenado);
	    }

	   
	}
