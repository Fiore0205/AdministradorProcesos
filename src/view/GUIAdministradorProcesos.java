/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import model.AdministradorProcesos;
import model.Recurso;

/**
 *
 * @author fioli
 */
public class GUIAdministradorProcesos extends javax.swing.JFrame {


    public GUIAdministradorProcesos() {
        initComponents();
    }

    public JButton getBtnAgregarMaquina() {
        return btnAgregarMaquina;
    }

    public void setBtnAgregarMaquina(JButton btnAgregarMaquina) {
        this.btnAgregarMaquina = btnAgregarMaquina;
    }

    public JButton getBtnAgregarProceso() {
        return btnAgregarProceso;
    }

    public void setBtnAgregarProceso(JButton btnAgregarProceso) {
        this.btnAgregarProceso = btnAgregarProceso;
    }

    public JButton getBtnAsignarRecursosMaquina() {
        return btnAsignarRecursosMaquina;
    }

    public void setBtnAsignarRecursosMaquina(JButton btnAsignarRecursosMaquina) {
        this.btnAsignarRecursosMaquina = btnAsignarRecursosMaquina;
    }

    public JButton getBtnAsignarRecursosProceso() {
        return btnAsignarRecursosProceso;
    }

    public void setBtnAsignarRecursosProceso(JButton btnAsignarRecursosProceso) {
        this.btnAsignarRecursosProceso = btnAsignarRecursosProceso;
    }

    public JButton getBtnConsultarMaquina() {
        return btnConsultarMaquina;
    }

    public void setBtnConsultarMaquina(JButton btnConsultarMaquina) {
        this.btnConsultarMaquina = btnConsultarMaquina;
    }

    public JButton getBtnConsultarProceso() {
        return btnConsultarProceso;
    }

    public void setBtnConsultarProceso(JButton btnConsultarProceso) {
        this.btnConsultarProceso = btnConsultarProceso;
    }

    public JButton getBtnCrearMaquina() {
        return btnCrearMaquina;
    }

    public void setBtnCrearMaquina(JButton btnCrearMaquina) {
        this.btnCrearMaquina = btnCrearMaquina;
    }

    public JButton getBtnCrearProceso() {
        return btnCrearProceso;
    }

    public void setBtnCrearProceso(JButton btnCrearProceso) {
        this.btnCrearProceso = btnCrearProceso;
    }

    public JButton getBtnEliminarMaquina() {
        return btnEliminarMaquina;
    }

    public void setBtnEliminarMaquina(JButton btnEliminarMaquina) {
        this.btnEliminarMaquina = btnEliminarMaquina;
    }

    public JButton getBtnEliminarProceso() {
        return btnEliminarProceso;
    }

    public void setBtnEliminarProceso(JButton btnEliminarProceso) {
        this.btnEliminarProceso = btnEliminarProceso;
    }

    public JButton getBtnModificarMaquina() {
        return btnModificarMaquina;
    }

    public void setBtnModificarMaquina(JButton btnModificarMaquina) {
        this.btnModificarMaquina = btnModificarMaquina;
    }

    public JButton getBtnModificarProceso() {
        return btnModificarProceso;
    }

    public void setBtnModificarProceso(JButton btnModificarProceso) {
        this.btnModificarProceso = btnModificarProceso;
    }

    public String getTxtAreaListaMaquina() {
        return txtAreaListaMaquina.getText();
    }

    public void setTxtAreaListaMaquina(String txtAreaListaMaquina) {
        this.txtAreaListaMaquina.setText(txtAreaListaMaquina);
    }

    public String getTxtAreaListaProcesos() {
        return txtAreaListaProcesos.getText();
    }

    public void setTxtAreaListaProcesos(String txtAreaListaProcesos) {
        this.txtAreaListaProcesos.setText(txtAreaListaProcesos);
    }

    public String getTxtAreaListaRecursos() {
        return txtAreaListaRecursos.getText();
    }

    public void setTxtAreaListaRecursos(String txtAreaListaRecursos) {
        this.txtAreaListaRecursos.setText(txtAreaListaRecursos);
    }

    public String getTxtAreaListaRecursosMaquina() {
        return txtAreaListaRecursosMaquina.getText();
    }

    public void setTxtAreaListaRecursosMaquina(String txtAreaListaRecursosMaquina) {
        this.txtAreaListaRecursosMaquina.setText(txtAreaListaRecursosMaquina);
    }

    public String getTxtNMaquina() {
        return txtNMaquina.getText();
    }

    public void setTxtNMaquina(String txtNMaquina) {
        this.txtNMaquina.setText(txtNMaquina);
    }

    public String getTxtNProceso() {
        return txtNProceso.getText();
    }

    public void setTxtNProceso(String txtNProceso) {
        this.txtNProceso.setText(txtNProceso);
    }

    public String getTxtNombreMaquina() {
        return txtNombreMaquina.getText();
    }

    public void setTxtNombreMaquina(String txtNombreMaquina) {
        this.txtNombreMaquina.setText(txtNombreMaquina);
    }

    public String getTxtNombreProceso() {
        return txtNombreProceso.getText();
    }

    public void setTxtNombreProceso(String txtNombreProceso) {
        this.txtNombreProceso.setText(txtNombreProceso);
    }

    public String getTxtPrioridadProceso() {
        return txtPrioridadProceso.getText();
    }

    public void setTxtPrioridadProceso(String txtPrioridadProceso) {
        this.txtPrioridadProceso.setText(txtPrioridadProceso);
    }

    public String getTxtTiempoInicio() {
        return txtTiempoInicio.getText();
    }

    public void setTxtTiempoInicio(String txtTiempoInicio) {
        this.txtTiempoInicio.setText(txtTiempoInicio);
    }

    public String getTxtTipoProceso() {
        return txtTipoProceso.getText();
    }

    public void setTxtTipoProceso(String txtTipoProceso) {
        this.txtTipoProceso.setText(txtTipoProceso);
    }

    public String getTxtUCPUMaquina() {
        return txtUCPUMaquina.getText();
    }

    public void setTxtUCPUMaquina(String txtUCPUMaquina) {
        this.txtUCPUMaquina.setText(txtUCPUMaquina);
    }

    public String getTxtUCPUProceso() {
        return txtUCPUProceso.getText();
    }

    public void setTxtUCPUProceso(String txtUCPUProceso) {
        this.txtUCPUProceso.setText(txtUCPUProceso);
    }

    public String getTxtUMemMaquina() {
        return txtUMemMaquina.getText();
    }

    public void setTxtUMemMaquina(String txtUMemMaquina) {
        this.txtUMemMaquina.setText(txtUMemMaquina);
    }

    public String getTxtUMemProceso() {
        return txtUMemProceso.getText();
    }

    public void setTxtUMemProceso(String txtUMemProceso) {
        this.txtUMemProceso.setText(txtUMemProceso);
    }

    public String getTxtUTiempoProceso() {
        return txtUTiempoProceso.getText();
    }

    public void setTxtUTiempoProceso(String txtUTiempoProceso) {
        this.txtUTiempoProceso.setText(txtUTiempoProceso);
    }

    public String getLblTipoSimulacion() {
        return lblTipoSimulacion.getText();
    }

    public void setLblTipoSimulacion(String lblTipoSimulacion) {
        this.lblTipoSimulacion.setText(lblTipoSimulacion);
    }

    public JButton getBtnCM() {
        return btnCM;
    }

    public void setBtnCM(JButton btnCM) {
        this.btnCM = btnCM;
    }

    public JButton getBtnIniciarODL() {
        return btnIniciarODL;
    }

    public void setBtnIniciarODL(JButton btnIniciarODL) {
        this.btnIniciarODL = btnIniciarODL;
    }

    public JButton getBtnIniciarTMC() {
        return btnIniciarTMC;
    }

    public void setBtnIniciarTMC(JButton btnIniciarTMC) {
        this.btnIniciarTMC = btnIniciarTMC;
    }

    public JButton getBtnODL() {
        return btnODL;
    }

    public void setBtnODL(JButton btnODL) {
        this.btnODL = btnODL;
    }

    public JButton getBtnPRI() {
        return btnPRI;
    }

    public void setBtnPRI(JButton btnPRI) {
        this.btnPRI = btnPRI;
    }

    public JButton getBtnPararODL() {
        return btnPararODL;
    }

    public void setBtnPararODL(JButton btnPararODL) {
        this.btnPararODL = btnPararODL;
    }

    public JButton getBtnPararTMC() {
        return btnPararTMC;
    }

    public void setBtnPararTMC(JButton btnPararTMC) {
        this.btnPararTMC = btnPararTMC;
    }

    public JButton getBtnRR() {
        return btnRR;
    }

    public void setBtnRR(JButton btnRR) {
        this.btnRR = btnRR;
    }

    public JButton getBtnTMC() {
        return btnTMC;
    }

    public void setBtnTMC(JButton btnTMC) {
        this.btnTMC = btnTMC;
    }

    public JPanel getPanel_ODL() {
        return panel_ODL;
    }

    public void setPanel_ODL(JPanel panel_ODL) {
        this.panel_ODL = panel_ODL;
    }

    public JPanel getPanel_TMC() {
        return panel_TMC;
    }

    public void setPanel_TMC(JPanel panel_TMC) {
        this.panel_TMC = panel_TMC;
    }

    public JPanel getPanel_botones_algoritmos() {
        return panel_botones_algoritmos;
    }

    public void setPanel_botones_algoritmos(JPanel panel_botones_algoritmos) {
        this.panel_botones_algoritmos = panel_botones_algoritmos;
    }

    public JPanel getPanel_parent() {
        return panel_parent;
    }

    public void setPanel_parent(JPanel panel_parent) {
        this.panel_parent = panel_parent;
    }

    public String getTxtAreaListaTablaEstadosODL() {
        return txtAreaListaTablaEstadosODL.getText();
    }

    public void setTxtAreaListaTablaEstadosODL(String txtAreaListaTablaEstadosODL) {
        this.txtAreaListaTablaEstadosODL.setText(txtAreaListaTablaEstadosODL);
    }

    public String getTxtAreaListaTablaEstadosTMC() {
        return txtAreaListaTablaEstadosTMC.getText();
    }

    public void setTxtAreaListaTablaEstadosTMC(String txtAreaListaTablaEstadosTMC) {
        this.txtAreaListaTablaEstadosTMC.setText(txtAreaListaTablaEstadosTMC);
    }

    public String getTxtAreaListarRecursosMaquinasODL() {
        return txtAreaListarRecursosMaquinasODL.getText();
    }

    public void setTxtAreaListarRecursosMaquinasODL(String txtAreaListarRecursosMaquinasODL) {
        this.txtAreaListarRecursosMaquinasODL.setText(txtAreaListarRecursosMaquinasODL);
    }

    public String getTxtAreaListarRecursosMaquinasTMC() {
        return txtAreaListarRecursosMaquinasTMC.getText();
    }

    public void setTxtAreaListarRecursosMaquinasTMC(String txtAreaListarRecursosMaquinasTMC) {
        this.txtAreaListarRecursosMaquinasTMC.setText(txtAreaListarRecursosMaquinasTMC);
    }

    public String getTxtAreaMemoriaMaquinasODL() {
        return txtAreaMemoriaMaquinasODL.getText();
    }

    public void setTxtAreaMemoriaMaquinasODL(String txtAreaMemoriaMaquinasODL) {
        this.txtAreaMemoriaMaquinasODL.setText(txtAreaMemoriaMaquinasODL);
    }

    public String getTxtAreaMemoriaMaquinasTMC() {
        return txtAreaMemoriaMaquinasTMC.getText();
    }

    public void setTxtAreaMemoriaMaquinasTMC(String txtAreaMemoriaMaquinasTMC) {
        this.txtAreaMemoriaMaquinasTMC.setText(txtAreaMemoriaMaquinasTMC);
    }
    
    
    
    

    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelMaquina = new javax.swing.JPanel();
        txtUMemMaquina = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtUCPUMaquina = new javax.swing.JTextField();
        btnAsignarRecursosMaquina = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaListaRecursosMaquina = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAreaListaMaquina = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        txtNMaquina = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtNombreMaquina = new javax.swing.JTextField();
        txtTiempoInicio = new javax.swing.JTextField();
        btnCrearMaquina = new javax.swing.JButton();
        btnModificarMaquina = new javax.swing.JButton();
        btnEliminarMaquina = new javax.swing.JButton();
        btnConsultarMaquina = new javax.swing.JButton();
        btnAgregarMaquina = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        lblTipoSimulacion = new javax.swing.JLabel();
        jPanelProcesos = new javax.swing.JPanel();
        btnCrearProceso = new javax.swing.JButton();
        btnModificarProceso = new javax.swing.JButton();
        btnEliminarProceso = new javax.swing.JButton();
        btnConsultarProceso = new javax.swing.JButton();
        btnAgregarProceso = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNProceso = new javax.swing.JTextField();
        txtTipoProceso = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreProceso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrioridadProceso = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtUTiempoProceso = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtUMemProceso = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtUCPUProceso = new javax.swing.JTextField();
        btnAsignarRecursosProceso = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaListaRecursos = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaListaProcesos = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        panel_botones_algoritmos = new javax.swing.JPanel();
        btnTMC = new javax.swing.JButton();
        btnODL = new javax.swing.JButton();
        btnRR = new javax.swing.JButton();
        btnPRI = new javax.swing.JButton();
        btnCM = new javax.swing.JButton();
        panel_parent = new javax.swing.JPanel();
        panel_TMC = new javax.swing.JPanel();
        btnIniciarTMC = new javax.swing.JButton();
        btnPararTMC = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtAreaListaTablaEstadosTMC = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtAreaListarRecursosMaquinasTMC = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtAreaMemoriaMaquinasTMC = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        panel_ODL = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtAreaListaTablaEstadosODL = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtAreaListarRecursosMaquinasODL = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtAreaMemoriaMaquinasODL = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        btnIniciarODL = new javax.swing.JButton();
        btnPararODL = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(102, 102, 255));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("UCPU:");

        btnAsignarRecursosMaquina.setBackground(new java.awt.Color(153, 153, 255));
        btnAsignarRecursosMaquina.setText("Asignar Recursos");
        btnAsignarRecursosMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarRecursosMaquinaActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Lista Máquinas");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Lista Recursos (DISP)");

        txtAreaListaRecursosMaquina.setColumns(20);
        txtAreaListaRecursosMaquina.setRows(5);
        jScrollPane3.setViewportView(txtAreaListaRecursosMaquina);

        txtAreaListaMaquina.setColumns(20);
        txtAreaListaMaquina.setRows(5);
        jScrollPane4.setViewportView(txtAreaListaMaquina);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Datos de Máquina");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("#Maquina:");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Nombre:");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Tiempo Inicio:");

        txtNombreMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreMaquinaActionPerformed(evt);
            }
        });

        btnCrearMaquina.setBackground(new java.awt.Color(153, 153, 255));
        btnCrearMaquina.setText("Crear");
        btnCrearMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearMaquinaActionPerformed(evt);
            }
        });

        btnModificarMaquina.setBackground(new java.awt.Color(153, 153, 255));
        btnModificarMaquina.setText("Modificar");
        btnModificarMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarMaquinaActionPerformed(evt);
            }
        });

        btnEliminarMaquina.setBackground(new java.awt.Color(153, 153, 255));
        btnEliminarMaquina.setText("Eliminar");
        btnEliminarMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMaquinaActionPerformed(evt);
            }
        });

        btnConsultarMaquina.setBackground(new java.awt.Color(153, 153, 255));
        btnConsultarMaquina.setText("Consultar");
        btnConsultarMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarMaquinaActionPerformed(evt);
            }
        });

        btnAgregarMaquina.setBackground(new java.awt.Color(153, 153, 255));
        btnAgregarMaquina.setText("Agregar");
        btnAgregarMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMaquinaActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("UMem:");

        lblTipoSimulacion.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanelMaquinaLayout = new javax.swing.GroupLayout(jPanelMaquina);
        jPanelMaquina.setLayout(jPanelMaquinaLayout);
        jPanelMaquinaLayout.setHorizontalGroup(
            jPanelMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMaquinaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelMaquinaLayout.createSequentialGroup()
                        .addGroup(jPanelMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnConsultarMaquina, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(btnEliminarMaquina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(7, 7, 7)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTiempoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMaquinaLayout.createSequentialGroup()
                        .addGroup(jPanelMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCrearMaquina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnModificarMaquina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelMaquinaLayout.createSequentialGroup()
                                .addGap(0, 3, Short.MAX_VALUE)
                                .addComponent(btnAgregarMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanelMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMaquinaLayout.createSequentialGroup()
                                .addGap(18, 22, Short.MAX_VALUE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombreMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelMaquinaLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanelMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAsignarRecursosMaquina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanelMaquinaLayout.createSequentialGroup()
                                        .addGroup(jPanelMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelMaquinaLayout.createSequentialGroup()
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtNMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanelMaquinaLayout.createSequentialGroup()
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtUCPUMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanelMaquinaLayout.createSequentialGroup()
                                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtUMemMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addGroup(jPanelMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelMaquinaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(jPanelMaquinaLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(59, 59, 59))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMaquinaLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTipoSimulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );
        jPanelMaquinaLayout.setVerticalGroup(
            jPanelMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMaquinaLayout.createSequentialGroup()
                .addGroup(jPanelMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMaquinaLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel14)
                        .addGroup(jPanelMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelMaquinaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)
                                    .addComponent(btnCrearMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnModificarMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16)
                                    .addComponent(txtNombreMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(jPanelMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnEliminarMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17)
                                    .addComponent(txtTiempoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanelMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtUMemMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20))
                                .addGap(32, 32, 32)
                                .addGroup(jPanelMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(txtUCPUMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnAsignarRecursosMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMaquinaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13)
                                .addGap(297, 297, 297))))
                    .addGroup(jPanelMaquinaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTipoSimulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelMaquinaLayout.createSequentialGroup()
                                    .addComponent(btnConsultarMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnAgregarMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Máquina", jPanelMaquina);

        btnCrearProceso.setText("Crear");
        btnCrearProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearProcesoActionPerformed(evt);
            }
        });

        btnModificarProceso.setText("Modificar");
        btnModificarProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProcesoActionPerformed(evt);
            }
        });

        btnEliminarProceso.setText("Eliminar");
        btnEliminarProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProcesoActionPerformed(evt);
            }
        });

        btnConsultarProceso.setText("Consultar");
        btnConsultarProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarProcesoActionPerformed(evt);
            }
        });

        btnAgregarProceso.setText("Agregar");
        btnAgregarProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProcesoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Datos de Procesos");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("#Proceso:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Prioridad:");

        txtNombreProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProcesoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Tipo:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("UTiempo:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("UMem:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("UCPU:");

        btnAsignarRecursosProceso.setText("Asignar Recursos");
        btnAsignarRecursosProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarRecursosProcesoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Lista Procesos");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Lista Recursos Requeridos");

        txtAreaListaRecursos.setColumns(20);
        txtAreaListaRecursos.setRows(5);
        jScrollPane1.setViewportView(txtAreaListaRecursos);

        txtAreaListaProcesos.setColumns(20);
        txtAreaListaProcesos.setRows(5);
        jScrollPane2.setViewportView(txtAreaListaProcesos);

        javax.swing.GroupLayout jPanelProcesosLayout = new javax.swing.GroupLayout(jPanelProcesos);
        jPanelProcesos.setLayout(jPanelProcesosLayout);
        jPanelProcesosLayout.setHorizontalGroup(
            jPanelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProcesosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelProcesosLayout.createSequentialGroup()
                        .addComponent(btnModificarProceso, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelProcesosLayout.createSequentialGroup()
                        .addGroup(jPanelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAgregarProceso, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(btnConsultarProceso, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(btnCrearProceso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminarProceso, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelProcesosLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelProcesosLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrioridadProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelProcesosLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTipoProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelProcesosLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUTiempoProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelProcesosLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUMemProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelProcesosLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUCPUProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAsignarRecursosProceso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProcesosLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(41, 41, 41))
        );
        jPanelProcesosLayout.setVerticalGroup(
            jPanelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProcesosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelProcesosLayout.createSequentialGroup()
                        .addGroup(jPanelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(btnCrearProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModificarProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtNombreProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminarProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtPrioridadProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelProcesosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtTipoProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelProcesosLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(btnConsultarProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
                .addGroup(jPanelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProcesosLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnAgregarProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelProcesosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtUTiempoProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtUMemProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanelProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtUCPUProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAsignarRecursosProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Proceso", jPanelProcesos);

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));
        jPanel1.setLayout(null);

        panel_botones_algoritmos.setBackground(new java.awt.Color(102, 153, 255));
        panel_botones_algoritmos.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(153, 153, 153)));
        panel_botones_algoritmos.setForeground(new java.awt.Color(255, 255, 255));

        btnTMC.setBackground(new java.awt.Color(204, 204, 255));
        btnTMC.setText("Tiempo + Corto");
        btnTMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTMCActionPerformed(evt);
            }
        });

        btnODL.setBackground(new java.awt.Color(222, 69, 18));
        btnODL.setFont(new java.awt.Font("Dubai Medium", 1, 12)); // NOI18N
        btnODL.setForeground(new java.awt.Color(255, 255, 255));
        btnODL.setText("Orden de Llegada");
        btnODL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnODL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnODLActionPerformed(evt);
            }
        });

        btnRR.setBackground(new java.awt.Color(204, 204, 255));
        btnRR.setText("Round Robin");

        btnPRI.setBackground(new java.awt.Color(204, 204, 255));
        btnPRI.setText("Prioridad");

        btnCM.setBackground(new java.awt.Color(204, 204, 255));
        btnCM.setText("Colas Múltiples");

        javax.swing.GroupLayout panel_botones_algoritmosLayout = new javax.swing.GroupLayout(panel_botones_algoritmos);
        panel_botones_algoritmos.setLayout(panel_botones_algoritmosLayout);
        panel_botones_algoritmosLayout.setHorizontalGroup(
            panel_botones_algoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_botones_algoritmosLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(panel_botones_algoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCM, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPRI, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRR, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnODL, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTMC, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        panel_botones_algoritmosLayout.setVerticalGroup(
            panel_botones_algoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_botones_algoritmosLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnODL, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTMC, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRR, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPRI, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCM, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        jPanel1.add(panel_botones_algoritmos);
        panel_botones_algoritmos.setBounds(0, 0, 270, 480);

        panel_parent.setLayout(new java.awt.CardLayout());

        panel_TMC.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 204)));

        btnIniciarTMC.setText("Iniciar");

        btnPararTMC.setText("Parar");

        txtAreaListaTablaEstadosTMC.setColumns(20);
        txtAreaListaTablaEstadosTMC.setRows(5);
        jScrollPane8.setViewportView(txtAreaListaTablaEstadosTMC);

        txtAreaListarRecursosMaquinasTMC.setColumns(20);
        txtAreaListarRecursosMaquinasTMC.setRows(5);
        jScrollPane9.setViewportView(txtAreaListarRecursosMaquinasTMC);

        txtAreaMemoriaMaquinasTMC.setColumns(20);
        txtAreaMemoriaMaquinasTMC.setRows(5);
        jScrollPane10.setViewportView(txtAreaMemoriaMaquinasTMC);

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Mapa Memoria");

        javax.swing.GroupLayout panel_TMCLayout = new javax.swing.GroupLayout(panel_TMC);
        panel_TMC.setLayout(panel_TMCLayout);
        panel_TMCLayout.setHorizontalGroup(
            panel_TMCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_TMCLayout.createSequentialGroup()
                .addGroup(panel_TMCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_TMCLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187))
                    .addGroup(panel_TMCLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(panel_TMCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane10)
                            .addGroup(panel_TMCLayout.createSequentialGroup()
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_TMCLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnIniciarTMC, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPararTMC, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(27, 27, 27))
        );
        panel_TMCLayout.setVerticalGroup(
            panel_TMCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TMCLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panel_TMCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciarTMC)
                    .addComponent(btnPararTMC))
                .addGap(37, 37, 37)
                .addGroup(panel_TMCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        panel_parent.add(panel_TMC, "card3");

        panel_ODL.setBackground(new java.awt.Color(0, 51, 204));
        panel_ODL.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(153, 153, 153)));

        txtAreaListaTablaEstadosODL.setColumns(20);
        txtAreaListaTablaEstadosODL.setRows(5);
        jScrollPane5.setViewportView(txtAreaListaTablaEstadosODL);

        txtAreaListarRecursosMaquinasODL.setColumns(20);
        txtAreaListarRecursosMaquinasODL.setRows(5);
        jScrollPane6.setViewportView(txtAreaListarRecursosMaquinasODL);

        txtAreaMemoriaMaquinasODL.setColumns(20);
        txtAreaMemoriaMaquinasODL.setRows(5);
        jScrollPane7.setViewportView(txtAreaMemoriaMaquinasODL);

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Mapa Memoria");

        btnIniciarODL.setText("Iniciar");

        btnPararODL.setText("Parar");

        javax.swing.GroupLayout panel_ODLLayout = new javax.swing.GroupLayout(panel_ODL);
        panel_ODL.setLayout(panel_ODLLayout);
        panel_ODLLayout.setHorizontalGroup(
            panel_ODLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ODLLayout.createSequentialGroup()
                .addGroup(panel_ODLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_ODLLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187))
                    .addGroup(panel_ODLLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(panel_ODLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane7)
                            .addGroup(panel_ODLLayout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_ODLLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnIniciarODL, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPararODL, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(27, 27, 27))
        );
        panel_ODLLayout.setVerticalGroup(
            panel_ODLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ODLLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panel_ODLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciarODL)
                    .addComponent(btnPararODL))
                .addGap(37, 37, 37)
                .addGroup(panel_ODLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        panel_parent.add(panel_ODL, "card2");

        jPanel1.add(panel_parent);
        panel_parent.setBounds(280, 0, 560, 480);

        jTabbedPane1.addTab("Algoritmos Planificación", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProcesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProcesoActionPerformed

    private void btnCrearProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearProcesoActionPerformed
        
    }//GEN-LAST:event_btnCrearProcesoActionPerformed

    private void btnAsignarRecursosProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarRecursosProcesoActionPerformed
        
    }//GEN-LAST:event_btnAsignarRecursosProcesoActionPerformed

    private void btnModificarProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProcesoActionPerformed
        
    }//GEN-LAST:event_btnModificarProcesoActionPerformed

    private void btnEliminarProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProcesoActionPerformed
        
    }//GEN-LAST:event_btnEliminarProcesoActionPerformed

    private void btnConsultarProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarProcesoActionPerformed
         
    }//GEN-LAST:event_btnConsultarProcesoActionPerformed

    private void btnAgregarProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProcesoActionPerformed
       
    }//GEN-LAST:event_btnAgregarProcesoActionPerformed

    private void btnAsignarRecursosMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarRecursosMaquinaActionPerformed

    }//GEN-LAST:event_btnAsignarRecursosMaquinaActionPerformed

    private void txtNombreMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreMaquinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreMaquinaActionPerformed

    private void btnCrearMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearMaquinaActionPerformed
  
    }//GEN-LAST:event_btnCrearMaquinaActionPerformed

    private void btnModificarMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarMaquinaActionPerformed
        
    }//GEN-LAST:event_btnModificarMaquinaActionPerformed

    private void btnEliminarMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMaquinaActionPerformed
        
    }//GEN-LAST:event_btnEliminarMaquinaActionPerformed

    private void btnConsultarMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarMaquinaActionPerformed
        
    }//GEN-LAST:event_btnConsultarMaquinaActionPerformed

    private void btnAgregarMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMaquinaActionPerformed
        
    }//GEN-LAST:event_btnAgregarMaquinaActionPerformed

    private void btnODLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnODLActionPerformed
        panel_parent.removeAll();
        panel_parent.add(panel_ODL);
        panel_parent.repaint();
        panel_parent.revalidate();
    }//GEN-LAST:event_btnODLActionPerformed

    private void btnTMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTMCActionPerformed
        panel_parent.removeAll();
        panel_parent.add(panel_TMC);
        panel_parent.repaint();
        panel_parent.revalidate();
    }//GEN-LAST:event_btnTMCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarMaquina;
    private javax.swing.JButton btnAgregarProceso;
    private javax.swing.JButton btnAsignarRecursosMaquina;
    private javax.swing.JButton btnAsignarRecursosProceso;
    private javax.swing.JButton btnCM;
    private javax.swing.JButton btnConsultarMaquina;
    private javax.swing.JButton btnConsultarProceso;
    private javax.swing.JButton btnCrearMaquina;
    private javax.swing.JButton btnCrearProceso;
    private javax.swing.JButton btnEliminarMaquina;
    private javax.swing.JButton btnEliminarProceso;
    private javax.swing.JButton btnIniciarODL;
    private javax.swing.JButton btnIniciarTMC;
    private javax.swing.JButton btnModificarMaquina;
    private javax.swing.JButton btnModificarProceso;
    private javax.swing.JButton btnODL;
    private javax.swing.JButton btnPRI;
    private javax.swing.JButton btnPararODL;
    private javax.swing.JButton btnPararTMC;
    private javax.swing.JButton btnRR;
    private javax.swing.JButton btnTMC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelMaquina;
    private javax.swing.JPanel jPanelProcesos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblTipoSimulacion;
    private javax.swing.JPanel panel_ODL;
    private javax.swing.JPanel panel_TMC;
    private javax.swing.JPanel panel_botones_algoritmos;
    private javax.swing.JPanel panel_parent;
    private javax.swing.JTextArea txtAreaListaMaquina;
    private javax.swing.JTextArea txtAreaListaProcesos;
    private javax.swing.JTextArea txtAreaListaRecursos;
    private javax.swing.JTextArea txtAreaListaRecursosMaquina;
    private javax.swing.JTextArea txtAreaListaTablaEstadosODL;
    private javax.swing.JTextArea txtAreaListaTablaEstadosTMC;
    private javax.swing.JTextArea txtAreaListarRecursosMaquinasODL;
    private javax.swing.JTextArea txtAreaListarRecursosMaquinasTMC;
    private javax.swing.JTextArea txtAreaMemoriaMaquinasODL;
    private javax.swing.JTextArea txtAreaMemoriaMaquinasTMC;
    private javax.swing.JTextField txtNMaquina;
    private javax.swing.JTextField txtNProceso;
    private javax.swing.JTextField txtNombreMaquina;
    private javax.swing.JTextField txtNombreProceso;
    private javax.swing.JTextField txtPrioridadProceso;
    private javax.swing.JTextField txtTiempoInicio;
    private javax.swing.JTextField txtTipoProceso;
    private javax.swing.JTextField txtUCPUMaquina;
    private javax.swing.JTextField txtUCPUProceso;
    private javax.swing.JTextField txtUMemMaquina;
    private javax.swing.JTextField txtUMemProceso;
    private javax.swing.JTextField txtUTiempoProceso;
    // End of variables declaration//GEN-END:variables
}
