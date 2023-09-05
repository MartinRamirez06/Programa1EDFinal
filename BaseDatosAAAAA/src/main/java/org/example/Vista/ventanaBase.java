package org.example.Vista;

import javax.swing.*;
import java.awt.*;

public class ventanaBase extends JFrame {
    private JLabel lblId;
    private JLabel lblNombre;
    private JLabel lblApellido;
    private JLabel lblHora;
    private JLabel lblfecha;
    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JLabel lblId2;
    private JLabel lblNombre2;
    private JLabel lblApellido2;
    private JTextField txtId2;
    private JTextField txtNombre2;
    private JTextField txtApellido2;
    private JButton btnAgregar;
    private JButton btnCargar;
    private JButton btnEliminar;
    private JButton btnActualizar;
    private JButton btnRegresar;
    private JScrollPane scrollPane;
    private GridLayout layout;
    private JTable TblPersona;
    private JPanel panel1;//Formulario para captura los datos
    private JPanel panel2;//Mostrar el formulario
    private JPanel panel3;
    private JLabel ActualizarDATOS;
    private JLabel EspacioEnBlanco;

    public ventanaBase(String title) throws HeadlessException {
        super(title);
        this.setSize(1000,800);
        layout=new GridLayout(2,2);
        this.getContentPane().setLayout(layout);

        //panel1
        panel1=new JPanel(new FlowLayout());
        panel1.setBackground(new Color(239,200,200));
        lblId=new JLabel("Id:");
        lblNombre=new JLabel("Nombre:");
        lblApellido=new JLabel("Apellido:");
        txtId=new JTextField(3);
        txtId.setText("0");
        txtNombre=new JTextField(30);
        txtApellido=new JTextField(20);
        btnAgregar=new JButton("Agregar");
        btnEliminar=new JButton("Eliminar");
        btnActualizar=new JButton("Actualizar");
        ActualizarDATOS=new JLabel("Actualizar Datos Aqui");
        lblId2=new JLabel("Id:");
        lblNombre2=new JLabel("Nombre:");
        lblApellido2=new JLabel("Apellido:");
        EspacioEnBlanco=new JLabel(" \n" );
        txtId2=new JTextField(3);
        txtId2.setText("0");
        txtNombre2=new JTextField(30);
        txtApellido2=new JTextField(20);
        panel1.add(lblId);
        panel1.add(txtId);
        panel1.add(EspacioEnBlanco);
        panel1.add(EspacioEnBlanco);
        panel1.add(lblNombre);
        panel1.add(txtNombre);
        panel1.add(EspacioEnBlanco);
        panel1.add(lblApellido);
        panel1.add(txtApellido);
        panel1.add(EspacioEnBlanco);
        panel1.add(btnAgregar);
        panel1.add(EspacioEnBlanco);
        panel1.add(btnEliminar);
        panel1.add(ActualizarDATOS);
        panel1.add(EspacioEnBlanco);
        panel1.add(EspacioEnBlanco);
        panel1.add(lblId2);
        panel1.add(txtId2);
        panel1.add(EspacioEnBlanco);
        panel1.add(lblNombre2);
        panel1.add(txtNombre2);
        panel1.add(EspacioEnBlanco);
        panel1.add(lblApellido2);
        panel1.add(txtApellido2);
        panel1.add(EspacioEnBlanco);
        panel1.add(btnActualizar);
        //panel2
        panel2=new JPanel(new FlowLayout());
        panel2.setBackground(new Color(255, 251, 200));
        TblPersona=new JTable();
        scrollPane=new JScrollPane();
        panel2.add(TblPersona);
        panel2.add(scrollPane);
        //panel3
        panel3=new JPanel(new FlowLayout());
        panel3.setBackground(new Color(255, 255, 255));
        btnCargar=new JButton("Cargar Tabla");
        btnRegresar=new JButton("Regresar");
        panel3.add(btnCargar);
        panel3.add(btnRegresar);



        this.getContentPane().add(panel1,0);
        this.getContentPane().add(panel2,1);
        this.getContentPane().add(panel3,2);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public ventanaBase(String title, JLabel lblId, JLabel lblNombre, JLabel lblApellido, JLabel lblHora, JLabel lblfecha, JTextField txtId, JTextField txtNombre, JTextField txtApellido, JLabel lblId2, JLabel lblNombre2, JLabel lblApellido2, JTextField txtId2, JTextField txtNombre2, JTextField txtApellido2, JButton btnAgregar, JButton btnCargar, JButton btnEliminar, JButton btnActualizar, JButton btnRegresar, JScrollPane scrollPane, GridLayout layout, JTable tblPersona, JPanel panel1, JPanel panel2, JPanel panel3, JLabel actualizarDATOS, JLabel espacioEnBlanco) throws HeadlessException {
        super(title);
        this.lblId = lblId;
        this.lblNombre = lblNombre;
        this.lblApellido = lblApellido;
        this.lblHora = lblHora;
        this.lblfecha = lblfecha;
        this.txtId = txtId;
        this.txtNombre = txtNombre;
        this.txtApellido = txtApellido;
        this.lblId2 = lblId2;
        this.lblNombre2 = lblNombre2;
        this.lblApellido2 = lblApellido2;
        this.txtId2 = txtId2;
        this.txtNombre2 = txtNombre2;
        this.txtApellido2 = txtApellido2;
        this.btnAgregar = btnAgregar;
        this.btnCargar = btnCargar;
        this.btnEliminar = btnEliminar;
        this.btnActualizar = btnActualizar;
        this.btnRegresar = btnRegresar;
        this.scrollPane = scrollPane;
        this.layout = layout;
        TblPersona = tblPersona;
        this.panel1 = panel1;
        this.panel2 = panel2;
        this.panel3 = panel3;
        ActualizarDATOS = actualizarDATOS;
        EspacioEnBlanco = espacioEnBlanco;
    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JLabel getLblApellido() {
        return lblApellido;
    }

    public void setLblApellido(JLabel lblApellido) {
        this.lblApellido = lblApellido;
    }

    public JLabel getLblHora() {
        return lblHora;
    }

    public void setLblHora(JLabel lblHora) {
        this.lblHora = lblHora;
    }

    public JLabel getLblfecha() {
        return lblfecha;
    }

    public void setLblfecha(JLabel lblfecha) {
        this.lblfecha = lblfecha;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtApellido() {
        return txtApellido;
    }

    public void setTxtApellido(JTextField txtApellido) {
        this.txtApellido = txtApellido;
    }

    public JLabel getLblId2() {
        return lblId2;
    }

    public void setLblId2(JLabel lblId2) {
        this.lblId2 = lblId2;
    }

    public JLabel getLblNombre2() {
        return lblNombre2;
    }

    public void setLblNombre2(JLabel lblNombre2) {
        this.lblNombre2 = lblNombre2;
    }

    public JLabel getLblApellido2() {
        return lblApellido2;
    }

    public void setLblApellido2(JLabel lblApellido2) {
        this.lblApellido2 = lblApellido2;
    }

    public JTextField getTxtId2() {
        return txtId2;
    }

    public void setTxtId2(JTextField txtId2) {
        this.txtId2 = txtId2;
    }

    public JTextField getTxtNombre2() {
        return txtNombre2;
    }

    public void setTxtNombre2(JTextField txtNombre2) {
        this.txtNombre2 = txtNombre2;
    }

    public JTextField getTxtApellido2() {
        return txtApellido2;
    }

    public void setTxtApellido2(JTextField txtApellido2) {
        this.txtApellido2 = txtApellido2;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JButton getBtnRegresar() {
        return btnRegresar;
    }

    public void setBtnRegresar(JButton btnRegresar) {
        this.btnRegresar = btnRegresar;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JTable getTblPersona() {
        return TblPersona;
    }

    public void setTblPersona(JTable tblPersona) {
        TblPersona = tblPersona;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JLabel getActualizarDATOS() {
        return ActualizarDATOS;
    }

    public void setActualizarDATOS(JLabel actualizarDATOS) {
        ActualizarDATOS = actualizarDATOS;
    }

    public JLabel getEspacioEnBlanco() {
        return EspacioEnBlanco;
    }

    public void setEspacioEnBlanco(JLabel espacioEnBlanco) {
        EspacioEnBlanco = espacioEnBlanco;
    }

    @Override
    public String toString() {
        return "ventanaBase{" +
                "lblId=" + lblId +
                ", lblNombre=" + lblNombre +
                ", lblApellido=" + lblApellido +
                ", lblHora=" + lblHora +
                ", lblfecha=" + lblfecha +
                ", txtId=" + txtId +
                ", txtNombre=" + txtNombre +
                ", txtApellido=" + txtApellido +
                ", lblId2=" + lblId2 +
                ", lblNombre2=" + lblNombre2 +
                ", lblApellido2=" + lblApellido2 +
                ", txtId2=" + txtId2 +
                ", txtNombre2=" + txtNombre2 +
                ", txtApellido2=" + txtApellido2 +
                ", btnAgregar=" + btnAgregar +
                ", btnCargar=" + btnCargar +
                ", btnEliminar=" + btnEliminar +
                ", btnActualizar=" + btnActualizar +
                ", btnRegresar=" + btnRegresar +
                ", scrollPane=" + scrollPane +
                ", layout=" + layout +
                ", TblPersona=" + TblPersona +
                ", panel1=" + panel1 +
                ", panel2=" + panel2 +
                ", panel3=" + panel3 +
                ", ActualizarDATOS=" + ActualizarDATOS +
                ", EspacioEnBlanco=" + EspacioEnBlanco +
                '}';
    }

    public void limpiar(){
        txtNombre.setText("");
        txtApellido.setText("");
        }
}
