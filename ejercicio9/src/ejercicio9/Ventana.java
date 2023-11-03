package ejercicio9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {

    private JTextField txtPrimerTrimestre;
    private JTextField txtSegundoTrimestre;
    private JTextField txtTercerTrimestre;
    private JLabel etiNotaFinal;
    private JLabel etiResultado;
    private JButton btnCalcular;

    public Ventana() {
        setTitle("Calculadora de Notas");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        txtPrimerTrimestre = new JTextField(10);
        txtSegundoTrimestre = new JTextField(10);
        txtTercerTrimestre = new JTextField(10);
        etiNotaFinal = new JLabel("Nota Final:");
        etiResultado = new JLabel("Resultado:");
        btnCalcular = new JButton("Calcular");
        
        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.add(new JLabel("Primer Trimestre:"));
        panel.add(txtPrimerTrimestre);
        panel.add(new JLabel("Segundo Trimestre:"));
        panel.add(txtSegundoTrimestre);
        panel.add(new JLabel("Tercer Trimestre:"));
        panel.add(txtTercerTrimestre);
        panel.add(etiNotaFinal);
        panel.add(etiResultado);
        add(panel, BorderLayout.CENTER);
        add(btnCalcular, BorderLayout.SOUTH);
        
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularNotaFinal();
            }
        });
    }

    private void calcularNotaFinal() {
        try {
            double primerTrimestre = Double.parseDouble(txtPrimerTrimestre.getText());
            double segundoTrimestre = Double.parseDouble(txtSegundoTrimestre.getText());
            double tercerTrimestre = Double.parseDouble(txtTercerTrimestre.getText());
            
            double notaFinal = (primerTrimestre + segundoTrimestre + tercerTrimestre) / 3.0;
            
            etiNotaFinal.setText("Nota Final: " + notaFinal);
            if (notaFinal < 5) {
                etiResultado.setText("Resultado: SUSPENSO");
                etiNotaFinal.setForeground(Color.RED);
                etiResultado.setForeground(Color.RED);
            } else {
                etiResultado.setText("Resultado: APROBADO");
                etiNotaFinal.setForeground(Color.BLACK);
                etiResultado.setForeground(Color.BLACK);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese notas válidas para los trimestres.");
        }
    }

    
    
}
