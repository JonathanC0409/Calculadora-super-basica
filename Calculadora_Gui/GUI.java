import java.awt.Color;

import javax.swing.*;

public class GUI extends JFrame{
    JPanel panel;
    JLabel etiqueta1,etiqueta2,etiqueta3;
    JTextField leerNumero1,leerNumero2,resultado;
    JButton bSuma,bResta,bDivision,bMultiplicacion;
    JOptionPane mensaje;
    private Calculadora calculadora;
    public GUI(){
        calculadora = new Calculadora();
        setTitle("Calculadora");
        setBounds(500,200,350,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        setContentPane(panel);
        panel.setLayout(null);

        //
        etiqueta1 = new JLabel("Numero 1:");
        etiqueta2 = new JLabel("Numero 2:");
        etiqueta3 = new JLabel("Resultado:");

        leerNumero1 = new JTextField();
        leerNumero2 = new JTextField();
        resultado = new JTextField();

        bSuma = new JButton("+");
        bResta = new JButton("-");
        bMultiplicacion = new JButton("X");
        bDivision = new JButton("÷");

        mensaje = new JOptionPane();

        etiqueta1.setBounds(25,20,60,40);
        panel.add(etiqueta1);
        leerNumero1.setBounds(100,30,50,20);
        panel.add(leerNumero1);
        
        etiqueta2.setBounds(25,65,60,40);
        panel.add(etiqueta2);
        leerNumero2.setBounds(100,75,50,20);
        panel.add(leerNumero2);

        etiqueta3.setBounds(25,160,60,40);
        panel.add(etiqueta3);

        resultado.setBounds(100,170,50,20);
        panel.add(resultado);
        resultado.setEditable(false);

        //
        bSuma.setBounds(200,25,45,30);
        panel.add(bSuma);
        bSuma.addActionListener(e -> {
            calculadora.sumar(Double.parseDouble(leerNumero1.getText()), Double.parseDouble(leerNumero2.getText()));
            resultado.setText(String.valueOf(calculadora.getResultado()));
        });

        bResta.setBounds(200,75,45,30);
        bResta.setBackground(Color.white);
        panel.add(bResta);
        bResta.addActionListener(e -> {
            calculadora.restar(Double.parseDouble(leerNumero1.getText()), Double.parseDouble(leerNumero2.getText()));
            resultado.setText(String.valueOf(calculadora.getResultado()));
        });

        bMultiplicacion.setBounds(260,25,45,30);
        panel.add(bMultiplicacion);
        bMultiplicacion.addActionListener(e -> {
            calculadora.multiplicar(Double.parseDouble(leerNumero1.getText()), Double.parseDouble(leerNumero2.getText()));
            resultado.setText(String.valueOf(calculadora.getResultado()));
        });

        bDivision.setBounds(260,75,45,30);
        panel.add(bDivision);
        bDivision.addActionListener(e -> {
            try {
                calculadora.dividir(Double.parseDouble(leerNumero1.getText()), Double.parseDouble(leerNumero2.getText()));
            } catch (Exception i) {
                mensaje.showMessageDialog(this,i.getMessage());
            }
            
            resultado.setText(String.valueOf(calculadora.getResultado()));
        });

        setVisible(true);
    }
}
