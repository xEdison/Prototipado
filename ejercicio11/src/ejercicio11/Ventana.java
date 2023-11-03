	package ejercicio11;

	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.MouseAdapter;
	import java.awt.event.MouseEvent;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	public class Ventana extends JFrame {

	    private JLabel[] etiquetas;
	    private JTextField txtNumero;
	    private JButton btnBorrar;

	    public Ventana() {
	        // Configuración de la ventana
	        setTitle("Etiquetas Numeradas");
	        setSize(300, 200);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);

	        // Crear componentes
	        etiquetas = new JLabel[10];
	        for (int i = 0; i < 10; i++) {
	            etiquetas[i] = new JLabel("eti" + (i + 1));
	        }
	        txtNumero = new JTextField(10);
	        btnBorrar = new JButton("Borrar");

	        // Agregar componentes a la ventana
	        JPanel panel = new JPanel(new GridLayout(4, 3));
	        for (int i = 0; i < 10; i++) {
	            panel.add(etiquetas[i]);
	        }
	        panel.add(txtNumero);
	        panel.add(btnBorrar);
	        add(panel, BorderLayout.CENTER);

	        // Manejo de eventos
	        for (int i = 0; i < 10; i++) {
	            final int numero = i;
	            etiquetas[i].addMouseListener(new MouseAdapter() {
	                @Override
	                public void mouseEntered(MouseEvent e) {
	                    agregarNumeroAlCuadro(numero);
	                }
	            });
	        }

	        btnBorrar.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                txtNumero.setText("");
	            }
	        });
	    }

	    private void agregarNumeroAlCuadro(int numero) {
	        String textoActual = txtNumero.getText();
	        txtNumero.setText(textoActual + numero);
	    }

	   
	}
