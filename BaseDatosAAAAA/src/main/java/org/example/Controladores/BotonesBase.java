package org.example.Controladores;

import org.example.Vista.menu;
import org.example.Vista.ventanaBase;
import org.example.modelo.ModeloTablaPersona;
import org.example.modelo.Persona;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BotonesBase extends MouseAdapter {
    private ventanaBase view;
    private ModeloTablaPersona modeloTablaPersona;

    public BotonesBase(ventanaBase view, menu view2) {
        this.view = view;

        modeloTablaPersona = new ModeloTablaPersona();
        this.view.getTblPersona().addMouseListener(this);
        this.view.getBtnCargar().addMouseListener(this);
        this.view.getBtnAgregar().addMouseListener(this);
        this.view.getBtnEliminar().addMouseListener(this);
        this.view.getBtnActualizar().addMouseListener(this);
        this.view.getBtnRegresar().addMouseListener(this);//sebas
    }

    @Override
    public void mouseClicked(MouseEvent e) {
//sebas
        if(e.getSource()==this.view.getBtnRegresar()){
            System.out.println("evento sobre boton inicio");
            JComponent viewmenuOriginal = null;
            viewmenuOriginal.setVisible(true); // muestra la ventana original
            this.view.setVisible(false);
            }


        //---------------------------------lo de abajo es mio
        if (e.getSource() == this.view.getBtnCargar()) {
            modeloTablaPersona.cargarDatos();
            this.view.getTblPersona().setModel(modeloTablaPersona);
            this.view.getTblPersona().updateUI();
        }
        if (e.getSource() == this.view.getBtnAgregar()) {
            Persona persona = new Persona();
            persona.setId(0);
            persona.setNombre(this.view.getTxtNombre().getText());
            persona.setApellido(this.view.getTxtApellido().getText());
            if (modeloTablaPersona.agregarPersona(persona)) {
                JOptionPane.showMessageDialog(view, "Se agrego correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                this.view.getTblPersona().updateUI();
            } else {
                JOptionPane.showMessageDialog(view, "No se pudo agregar a la base de datos.Por favor revise su conexion", "Error al insertar", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (e.getSource() == this.view.getBtnEliminar()) {
            int selectedRow = this.view.getTblPersona().getSelectedRow();
            if (selectedRow != -1) {
                int confirm = JOptionPane.showConfirmDialog(view, "¿Seguro que quieres eliminar esta persona?", "Confirmar eliminacion", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    modeloTablaPersona.eliminarPersona(selectedRow);
                    this.view.getTblPersona().updateUI();
                }
            } else {
                JOptionPane.showMessageDialog(view, "Selecciona una persona para eliminar", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        if (e.getSource() == this.view.getBtnActualizar()) {
            System.out.println("Evento sobre botòn Actualizar");
            int rowIndex = this.view.getTblPersona().getSelectedRow();
            Persona tmp = modeloTablaPersona.getPersonaIndex(rowIndex);
            Persona persona = new Persona();

            persona.setNombre(this.view.getTxtNombre2().getText());
            persona.setApellido(this.view.getTxtApellido2().getText());
            persona.setId(tmp.getId());
            if (modeloTablaPersona.ActualizarPersona(persona)) {
                JOptionPane.showMessageDialog(view, "Se modifico correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                modeloTablaPersona.cargarDatos();
                this.view.getTblPersona().setModel(modeloTablaPersona);
                this.view.getTblPersona().updateUI();
            } else {
                JOptionPane.showMessageDialog(view, "No se pudo modificar", "Error al Insertar", JOptionPane.ERROR_MESSAGE);
            }
            this.view.getTblPersona().updateUI();
        }
            if (e.getSource() == view.getTblPersona()) {
                System.out.println("Evento sobre la tabla");
                int index = this.view.getTblPersona().getSelectedRow();
                Persona tem = modeloTablaPersona.getPersonaIndex(index);

                this.view.getTxtNombre2().setText(tem.getNombre());
                this.view.getTxtApellido2().setText(tem.getApellido());
            }
            this.view.limpiar();
        }
    }
