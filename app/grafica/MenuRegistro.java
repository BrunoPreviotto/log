package grafica;

import BaseDeDatos.OperarSobreBaseDeDatos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuRegistro extends JFrame implements ActionListener {

    private JLabel nombreEtiqueta, contraseñaEtiqueta;
    private JTextField nombreCaja, contraseñaCaja;
    private JButton botonRegistrarse;

    public MenuRegistro(){
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

        botonRegistrarse = new JButton("REGISTRAR");
        botonRegistrarse.setBounds(150, 125, 130, 25);
        add(botonRegistrarse);
        botonRegistrarse.addActionListener(this);

        nombreEtiqueta = new JLabel("Nombre:");
        nombreEtiqueta.setBounds(50, 25, 90, 25);
        add(nombreEtiqueta);

        contraseñaEtiqueta = new JLabel("Contraseña:");
        contraseñaEtiqueta.setBounds(50, 70, 90, 25);
        add(contraseñaEtiqueta);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == botonRegistrarse){
            OperarSobreBaseDeDatos operarSobreBaseDeDatos = new OperarSobreBaseDeDatos();
            if(!nombreCaja.getText().equals(null) && !contraseñaCaja.getText().equals(null)){
                operarSobreBaseDeDatos.crearUsuario(nombreCaja.getText(), contraseñaCaja.getText());
                nombreCaja.setText("");
                contraseñaCaja.setText("");
            }
        }
    }
}
