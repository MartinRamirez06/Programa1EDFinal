package org.example.Controladores;

import java.awt.event.MouseAdapter;

import javax.swing.JOptionPane;

import org.example.Vista.menu;
import org.example.Vista.ventanaBase;
import java.awt.event.MouseEvent;

public class BotonesMenu extends MouseAdapter{
    private menu view2;
    private ventanaBase viewBaseOriginal;

    public BotonesMenu(menu view2,ventanaBase viewBase) {
        this.view2 = view2;
        this.viewBaseOriginal=viewBase;
        this.view2.getBotonInicio().addMouseListener(this);
        this.view2.getBotonSalir().addMouseListener(this);

    }
    public void mouseClicked(MouseEvent e) {
        if (e.getSource()==this.view2.getBotonInicio()) {
            System.out.println("evento sobre boton inicio");
            viewBaseOriginal.setVisible(true); // muestra la ventana original
            this.view2.setVisible(false);


        }

        if(e.getSource()==this.view2.getBotonSalir()){
            System.out.println("evento sobre boton salir");
            System.exit(0);

        }

    }
}




