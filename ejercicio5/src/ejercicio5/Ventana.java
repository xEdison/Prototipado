package ejercicio5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ventana extends JFrame {

    private JLabel etiPal1, etiPal2, etiPal3, etiPal4, etiOcultar;

    public Ventana() {

        setTitle("Etiquetas Ocultar/Mostrar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new FlowLayout());

   
        etiPal1 = new JLabel("Palabra 1");
        etiPal2 = new JLabel("Palabra 2");
        etiPal3 = new JLabel("Palabra 3");
        etiPal4 = new JLabel("Palabra 4");
        etiOcultar = new JLabel("Ocultar");

        
        add(etiPal1);
        add(etiPal2);
        add(etiPal3);
        add(etiPal4);
        add(etiOcultar);

      
        etiOcultar.addMouseListener(new MouseListener() {
           

            @Override
            public void mouseEntered(MouseEvent e) {
               
                etiPal1.setVisible(false);
                etiPal2.setVisible(false);
                etiPal3.setVisible(false);
                etiPal4.setVisible(false);
            }

            @Override
            public void mouseExited(MouseEvent e) {
              
                etiPal1.setVisible(true);
                etiPal2.setVisible(true);
                etiPal3.setVisible(true);
                etiPal4.setVisible(true);
            }

			@Override
			public void mouseClicked(MouseEvent e) {
			
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			}
        
        });
    }
}

   
    

