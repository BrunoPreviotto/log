package grafica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuInicio extends JFrame implements ActionListener {

    private JButton botonIngresar, botonRegistrarse;
    private MenuIngreso menuIngreso;
    private MenuRegistro menuRegistro;

    public MenuInicio() {
        setLayout(null);
        setBounds(0,0,400,250);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(true);


        botonIngresar = new JButton("INGRESAR");
        botonIngresar.setBounds(150, 25, 130, 50);
        add(botonIngresar);
        botonIngresar.addActionListener(this);

        botonRegistrarse = new JButton("REGISTRARSE");
        botonRegistrarse.setBounds(150, 100, 130, 50);
        add(botonRegistrarse);
        botonRegistrarse.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == botonIngresar){
            this.setVisible(false);
            menuIngreso = new MenuIngreso();
        }
        if(e.getSource() == botonRegistrarse){
            this.setVisible(false);
            menuRegistro = new MenuRegistro();
        }
    }
}
