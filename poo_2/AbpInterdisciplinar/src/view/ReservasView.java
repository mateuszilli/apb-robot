package view;

import javax.swing.JOptionPane;
import model.bean.Locais;
import model.bean.Paletes;
import model.bean.Reservas;
import model.dao.ReservasDAO;

public class ReservasView extends javax.swing.JFrame {

    private int optGravar;

    public ReservasView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnListarPaletes = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textVisualizarPaletes = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        lblIdPaletes = new javax.swing.JLabel();
        lblIdReservas = new javax.swing.JLabel();
        jTextIdReservas = new javax.swing.JTextField();
        lblIdLocais = new javax.swing.JLabel();
        jTextIdPaletes = new javax.swing.JTextField();
        btnGravarPaletes = new javax.swing.JButton();
        btnNovoPaletes = new javax.swing.JButton();
        btnEditarPaletes = new javax.swing.JButton();
        btnExcluirPaletes = new javax.swing.JButton();
        jTextIdLocais = new javax.swing.JTextField();
        lblBuscarReservas = new javax.swing.JLabel();
        jTextBuscarReservas = new javax.swing.JTextField();
        btnBuscarReservas = new javax.swing.JButton();

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Cadastro"));
        jPanel3.add(jPanel4);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Reservas");
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Visualização"));
        jPanel1.setLayout(null);

        btnListarPaletes.setText("Listar");
        btnListarPaletes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarPaletesActionPerformed(evt);
            }
        });
        jPanel1.add(btnListarPaletes);
        btnListarPaletes.setBounds(10, 280, 390, 32);

        textVisualizarPaletes.setEditable(false);
        textVisualizarPaletes.setColumns(20);
        textVisualizarPaletes.setRows(5);
        jScrollPane2.setViewportView(textVisualizarPaletes);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(20, 30, 370, 250);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(430, 10, 410, 340);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro"));
        jPanel5.setLayout(null);

        lblIdPaletes.setText("Identificador do Palete:");
        jPanel5.add(lblIdPaletes);
        lblIdPaletes.setBounds(20, 210, 140, 30);

        lblIdReservas.setText("Identificador da Reserva:");
        jPanel5.add(lblIdReservas);
        lblIdReservas.setBounds(20, 90, 150, 30);

        jTextIdReservas.setEditable(false);
        jPanel5.add(jTextIdReservas);
        jTextIdReservas.setBounds(180, 90, 190, 30);

        lblIdLocais.setText("Identificador do Local:");
        jPanel5.add(lblIdLocais);
        lblIdLocais.setBounds(20, 150, 140, 30);

        jTextIdPaletes.setEditable(false);
        jPanel5.add(jTextIdPaletes);
        jTextIdPaletes.setBounds(180, 210, 190, 30);

        btnGravarPaletes.setText("Gravar");
        btnGravarPaletes.setEnabled(false);
        btnGravarPaletes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarPaletesActionPerformed(evt);
            }
        });
        jPanel5.add(btnGravarPaletes);
        btnGravarPaletes.setBounds(290, 280, 90, 32);

        btnNovoPaletes.setText("Novo");
        btnNovoPaletes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoPaletesActionPerformed(evt);
            }
        });
        jPanel5.add(btnNovoPaletes);
        btnNovoPaletes.setBounds(20, 280, 90, 32);

        btnEditarPaletes.setText("Editar");
        btnEditarPaletes.setEnabled(false);
        btnEditarPaletes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPaletesActionPerformed(evt);
            }
        });
        jPanel5.add(btnEditarPaletes);
        btnEditarPaletes.setBounds(110, 280, 90, 32);

        btnExcluirPaletes.setText("Excluir");
        btnExcluirPaletes.setEnabled(false);
        btnExcluirPaletes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirPaletesActionPerformed(evt);
            }
        });
        jPanel5.add(btnExcluirPaletes);
        btnExcluirPaletes.setBounds(200, 280, 90, 32);

        jTextIdLocais.setEditable(false);
        jPanel5.add(jTextIdLocais);
        jTextIdLocais.setBounds(180, 150, 190, 30);

        lblBuscarReservas.setText("Buscar:");
        jPanel5.add(lblBuscarReservas);
        lblBuscarReservas.setBounds(20, 30, 60, 30);
        jPanel5.add(jTextBuscarReservas);
        jTextBuscarReservas.setBounds(80, 30, 210, 30);

        btnBuscarReservas.setText("Buscar");
        btnBuscarReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarReservasActionPerformed(evt);
            }
        });
        jPanel5.add(btnBuscarReservas);
        btnBuscarReservas.setBounds(291, 30, 80, 32);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(10, 10, 410, 340);

        setSize(new java.awt.Dimension(868, 400));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarReservasActionPerformed
        Reservas reservas = new Reservas();
        reservas.setBuscarReserva(Integer.parseInt(jTextBuscarReservas.getText()));
        optGravar = 1;

        ReservasDAO dao = new ReservasDAO();

        for (Reservas l : dao.findID(reservas)) {
            jTextIdReservas.setText(Integer.toString(l.getIdReserva()));
            jTextIdLocais.setText(Integer.toString(l.getLocais().getIdLocal()));
            jTextIdPaletes.setText(Integer.toString(l.getPaletes().getIdPalete()));
        }
    }//GEN-LAST:event_btnBuscarReservasActionPerformed

    private void btnListarPaletesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarPaletesActionPerformed
        ReservasDAO dao = new ReservasDAO();
        textVisualizarPaletes.setText("");
        for (Reservas r : dao.findAll()) {
            textVisualizarPaletes.append("ID Reserva: " + Integer.toString(r.getIdReserva()) + "\tID Local: " + Integer.toString(r.getLocais().getIdLocal()) + "\tID Palete: " + Integer.toString(r.getPaletes().getIdPalete()) + "\n\n");
        }
    }//GEN-LAST:event_btnListarPaletesActionPerformed

    private void btnNovoPaletesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoPaletesActionPerformed
        Reservas reservas = new Reservas();
        optGravar = 0;

        jTextBuscarReservas.setText("");
        jTextIdReservas.setText("");
        jTextIdLocais.setText("");
        jTextIdPaletes.setText("");
        jTextBuscarReservas.setEnabled(false);
        jTextIdReservas.setEnabled(true);
        jTextIdLocais.setEnabled(true);
        jTextIdPaletes.setEnabled(true);
        btnGravarPaletes.setEnabled(true);
        jTextBuscarReservas.setEditable(false);
        jTextIdReservas.setEditable(true);
        jTextIdLocais.setEditable(true);
        jTextIdPaletes.setEditable(true);
    }//GEN-LAST:event_btnNovoPaletesActionPerformed

    private void btnEditarPaletesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPaletesActionPerformed
        jTextBuscarReservas.setEnabled(true);
        jTextIdReservas.setEnabled(false);
        jTextIdLocais.setEnabled(true);
        jTextIdPaletes.setEnabled(true);
        btnGravarPaletes.setEnabled(true);
        jTextBuscarReservas.setEditable(true);
        jTextIdReservas.setEditable(false);
        jTextIdLocais.setEditable(true);
        jTextIdPaletes.setEditable(true);
    }//GEN-LAST:event_btnEditarPaletesActionPerformed

    private void btnExcluirPaletesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirPaletesActionPerformed
        Reservas reservas = new Reservas();
        reservas.setIdReserva(Integer.parseInt(jTextIdReservas.getText()));

        ReservasDAO dao = new ReservasDAO();

        if (dao.delete(reservas)) {
            JOptionPane.showMessageDialog(null, "Registro excluído!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao exluir registro!");
        }
    }//GEN-LAST:event_btnExcluirPaletesActionPerformed

    private void btnGravarPaletesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarPaletesActionPerformed
        if (optGravar == 0) {

            Locais locais = new Locais();
            locais.setIdLocal(Integer.parseInt(jTextIdLocais.getText()));

            Paletes paletes = new Paletes();
            paletes.setIdPalete(Integer.parseInt(jTextIdPaletes.getText()));

            Reservas reservas = new Reservas();
            reservas.setIdReserva(Integer.parseInt(jTextIdReservas.getText()));
            reservas.setLocais(locais);
            reservas.setPaletes(paletes);

            ReservasDAO dao = new ReservasDAO();

            if (dao.save(reservas)) {
                JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");
                jTextIdLocais.setText("");
                jTextIdPaletes.setText("");
                jTextIdReservas.setText("");
                jTextIdLocais.setEnabled(false);
                jTextIdPaletes.setEnabled(false);
                jTextIdReservas.setEnabled(false);
                jTextIdPaletes.setEditable(false);
                jTextIdLocais.setEditable(false);
                jTextIdReservas.setEditable(false);
                btnGravarPaletes.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao salvar registro!");
            }
        } else {
            Locais locais = new Locais();
            locais.setIdLocal(Integer.parseInt(jTextIdLocais.getText()));

            Paletes paletes = new Paletes();
            paletes.setIdPalete(Integer.parseInt(jTextIdPaletes.getText()));

            Reservas reservas = new Reservas();
            reservas.setIdReserva(Integer.parseInt(jTextIdReservas.getText()));
            reservas.setLocais(locais);
            reservas.setPaletes(paletes);

            ReservasDAO dao = new ReservasDAO();

            if (dao.update(reservas)) {
                JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");
                jTextIdLocais.setText("");
                jTextIdPaletes.setText("");
                jTextIdReservas.setText("");
                jTextIdLocais.setEnabled(false);
                jTextIdPaletes.setEnabled(false);
                jTextIdReservas.setEnabled(false);
                jTextIdPaletes.setEditable(false);
                jTextIdLocais.setEditable(false);
                jTextIdReservas.setEditable(false);
                btnGravarPaletes.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao salvar registro!");
            }
        }
    }//GEN-LAST:event_btnGravarPaletesActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReservasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservasView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarReservas;
    private javax.swing.JButton btnEditarPaletes;
    private javax.swing.JButton btnExcluirPaletes;
    private javax.swing.JButton btnGravarPaletes;
    private javax.swing.JButton btnListarPaletes;
    private javax.swing.JButton btnNovoPaletes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextBuscarReservas;
    private javax.swing.JTextField jTextIdLocais;
    private javax.swing.JTextField jTextIdPaletes;
    private javax.swing.JTextField jTextIdReservas;
    private javax.swing.JLabel lblBuscarReservas;
    private javax.swing.JLabel lblIdLocais;
    private javax.swing.JLabel lblIdPaletes;
    private javax.swing.JLabel lblIdReservas;
    private javax.swing.JTextArea textVisualizarPaletes;
    // End of variables declaration//GEN-END:variables
}
