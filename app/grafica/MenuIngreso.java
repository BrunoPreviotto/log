package grafica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuIngreso extends JFrame implements ActionListener {

    private JLabel nombreEtiqueta, contraseñaEtiqueta;
    private JTextField nombreCaja, contraseñaCaja;
    private JButton botonEntrar;

    public MenuIngreso(){
        setLayout(null);
        setBounds(0,0,400,250);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(true);

        nombreCaja = new JTextField();
        nombreCaja.setBounds(150, 25, 130, 25);
        add(nombreCaja);

        contraseñaCaja = new JTextField();
        contraseñaCaja.setBounds(150, 70, 130, 25);
        add(contraseñaCaja);

        botonEntrar = new JButton("ENTRAR");
        botonEntrar.setBounds(150, 125, 130, 25);
        add(botonEntrar);
        botonEntrar.addActionListener(this);

        nombreEtiqueta = new JLabel("Nombre:");
        nombreEtiqueta.setBounds(50, 25, 90, 25);
        add(nombreEtiqueta);

        contraseñaEtiqueta = new JLabel("Contraseña:");
        contraseñaEtiqueta.setBounds(50, 70, 90, 25);
        add(contraseñaEtiqueta);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
