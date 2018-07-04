package view;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.bean.Paletes;
import model.dao.*;

public class PaletesView extends javax.swing.JFrame {

    private int optGravar;

    public PaletesView() {
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
        lblDescricaoPaletes = new javax.swing.JLabel();
        lblBuscarPaletes = new javax.swing.JLabel();
        jTextBuscarPaletes = new javax.swing.JTextField();
        lblValidadePaletes = new javax.swing.JLabel();
        jTextValidadePaletes = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textDescricaoPaletes = new javax.swing.JTextArea();
        btnGravarPaletes = new javax.swing.JButton();
        btnNovoPaletes = new javax.swing.JButton();
        btnEditarPaletes = new javax.swing.JButton();
        btnExcluirPaletes = new javax.swing.JButton();
        lblIdPaletes = new javax.swing.JLabel();
        jTextIdPaletes = new javax.swing.JTextField();
        btnBuscarPaletes = new javax.swing.JButton();

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Cadastro"));
        jPanel3.add(jPanel4);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Paletes");
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
        btnListarPaletes.setBounds(10, 430, 390, 32);

        textVisualizarPaletes.setEditable(false);
        textVisualizarPaletes.setColumns(20);
        textVisualizarPaletes.setRows(5);
        jScrollPane2.setViewportView(textVisualizarPaletes);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(20, 30, 370, 390);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(430, 10, 410, 480);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro"));
        jPanel5.setLayout(null);

        lblDescricaoPaletes.setText("Descrição:");
        jPanel5.add(lblDescricaoPaletes);
        lblDescricaoPaletes.setBounds(20, 210, 140, 30);

        lblBuscarPaletes.setText("Buscar:");
        jPanel5.add(lblBuscarPaletes);
        lblBuscarPaletes.setBounds(20, 30, 60, 30);
        jPanel5.add(jTextBuscarPaletes);
        jTextBuscarPaletes.setBounds(80, 30, 210, 30);

        lblValidadePaletes.setText("Validade do Palete:");
        jPanel5.add(lblValidadePaletes);
        lblValidadePaletes.setBounds(20, 150, 140, 30);

        jTextValidadePaletes.setEditable(false);
        jPanel5.add(jTextValidadePaletes);
        jTextValidadePaletes.setBounds(160, 150, 210, 30);

        textDescricaoPaletes.setEditable(false);
        textDescricaoPaletes.setColumns(20);
        textDescricaoPaletes.setRows(5);
        jScrollPane1.setViewportView(textDescricaoPaletes);

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(20, 240, 370, 180);

        btnGravarPaletes.setText("Gravar");
        btnGravarPaletes.setEnabled(false);
        btnGravarPaletes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarPaletesActionPerformed(evt);
            }
        });
        jPanel5.add(btnGravarPaletes);
        btnGravarPaletes.setBounds(290, 430, 90, 32);

        btnNovoPaletes.setText("Novo");
        btnNovoPaletes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoPaletesActionPerformed(evt);
            }
        });
        jPanel5.add(btnNovoPaletes);
        btnNovoPaletes.setBounds(20, 430, 90, 32);

        btnEditarPaletes.setText("Editar");
        btnEditarPaletes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPaletesActionPerformed(evt);
            }
        });
        jPanel5.add(btnEditarPaletes);
        btnEditarPaletes.setBounds(110, 430, 90, 32);

        btnExcluirPaletes.setText("Excluir");
        btnExcluirPaletes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirPaletesActionPerformed(evt);
            }
        });
        jPanel5.add(btnExcluirPaletes);
        btnExcluirPaletes.setBounds(200, 430, 90, 32);

        lblIdPaletes.setText("Identificador do Palete:");
        jPanel5.add(lblIdPaletes);
        lblIdPaletes.setBounds(20, 90, 140, 30);

        jTextIdPaletes.setEditable(false);
        jPanel5.add(jTextIdPaletes);
        jTextIdPaletes.setBounds(160, 90, 210, 30);

        btnBuscarPaletes.setText("Buscar");
        btnBuscarPaletes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPaletesActionPerformed(evt);
            }
        });
        jPanel5.add(btnBuscarPaletes);
        btnBuscarPaletes.setBounds(291, 30, 80, 32);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(10, 10, 410, 480);

        setSize(new java.awt.Dimension(868, 537));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarPaletesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarPaletesActionPerformed

        PaletesDAO dao = new PaletesDAO();
        textVisualizarPaletes.setText("");
        for (Paletes p : dao.findAll()) {
            textVisualizarPaletes.append("ID: " + Integer.toString(p.getIdPalete()) + "\tVALIDADE:" + p.getValidadePalete() + "\nDESCRIÇÃO: " + p.getDescricaoPalete() + "\n\n");
        }


    }//GEN-LAST:event_btnListarPaletesActionPerformed

    private void btnBuscarPaletesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPaletesActionPerformed
        Paletes paletes = new Paletes();
        paletes.setBuscarPalete(Integer.parseInt(jTextBuscarPaletes.getText()));
        optGravar = 1;

        PaletesDAO dao = new PaletesDAO();

        for (Paletes p : dao.findID(paletes)) {
            jTextIdPaletes.setText(Integer.toString(p.getIdPalete()));
            textDescricaoPaletes.setText(p.getDescricaoPalete());
            jTextValidadePaletes.setText(p.getValidadePalete());
        }

    }//GEN-LAST:event_btnBuscarPaletesActionPerformed

    private void btnNovoPaletesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoPaletesActionPerformed
        Paletes paletes = new Paletes();
        optGravar = 0;

        jTextIdPaletes.setEditable(true);
        jTextValidadePaletes.setEditable(true);
        textDescricaoPaletes.setEditable(true);
        jTextIdPaletes.setEnabled(true);
        jTextValidadePaletes.setEnabled(true);
        textDescricaoPaletes.setEnabled(true);
        jTextIdPaletes.setText("");
        jTextValidadePaletes.setText("");
        textDescricaoPaletes.setText("");
        jTextBuscarPaletes.setText("");
        btnGravarPaletes.setEnabled(true);
    }//GEN-LAST:event_btnNovoPaletesActionPerformed

    private void btnEditarPaletesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPaletesActionPerformed
        jTextValidadePaletes.setEditable(true);
        textDescricaoPaletes.setEditable(true);
        jTextValidadePaletes.setEnabled(true);
        textDescricaoPaletes.setEnabled(true);
        btnGravarPaletes.setEnabled(true);
    }//GEN-LAST:event_btnEditarPaletesActionPerformed

    private void btnGravarPaletesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarPaletesActionPerformed

        if (optGravar == 0) {
            Paletes paletes = new Paletes();
            paletes.setIdPalete(Integer.parseInt(jTextIdPaletes.getText()));
            paletes.setValidadePalete(jTextValidadePaletes.getText());
            paletes.setDescricaoPalete(textDescricaoPaletes.getText());

            PaletesDAO dao = new PaletesDAO();

            if (dao.save(paletes)) {
                JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");
                jTextBuscarPaletes.setText("");
                jTextIdPaletes.setText("");
                jTextValidadePaletes.setText("");
                textDescricaoPaletes.setText("");
                jTextIdPaletes.setEnabled(false);
                jTextValidadePaletes.setEditable(false);
                textDescricaoPaletes.setEditable(false);
                btnGravarPaletes.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao salvar registro!");
            }
        } else {
            Paletes paletes = new Paletes();

            paletes.setIdPalete(Integer.parseInt(jTextIdPaletes.getText()));

            paletes.setValidadePalete(jTextValidadePaletes.getText());
            paletes.setDescricaoPalete(textDescricaoPaletes.getText());

            PaletesDAO dao = new PaletesDAO();

            if (dao.update(paletes)) {
                JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");
                jTextBuscarPaletes.setText("");
                jTextIdPaletes.setText("");
                jTextValidadePaletes.setText("");
                textDescricaoPaletes.setText("");
                jTextIdPaletes.setEnabled(false);
                jTextValidadePaletes.setEditable(false);
                textDescricaoPaletes.setEditable(false);
                btnGravarPaletes.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao salvar registro!");
            }
        }

    }//GEN-LAST:event_btnGravarPaletesActionPerformed

    private void btnExcluirPaletesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirPaletesActionPerformed
        Paletes paletes = new Paletes();
        paletes.setIdPalete(Integer.parseInt(jTextIdPaletes.getText()));

        PaletesDAO dao = new PaletesDAO();

        if (dao.delete(paletes)) {
            JOptionPane.showMessageDialog(null, "Registro excluído!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao exluir registro!");
        }
    }//GEN-LAST:event_btnExcluirPaletesActionPerformed

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
            java.util.logging.Logger.getLogger(PaletesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaletesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaletesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaletesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaletesView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarPaletes;
    private javax.swing.JButton btnEditarPaletes;
    private javax.swing.JButton btnExcluirPaletes;
    private javax.swing.JButton btnGravarPaletes;
    private javax.swing.JButton btnListarPaletes;
    private javax.swing.JButton btnNovoPaletes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextBuscarPaletes;
    private javax.swing.JTextField jTextIdPaletes;
    private javax.swing.JTextField jTextValidadePaletes;
    private javax.swing.JLabel lblBuscarPaletes;
    private javax.swing.JLabel lblDescricaoPaletes;
    private javax.swing.JLabel lblIdPaletes;
    private javax.swing.JLabel lblValidadePaletes;
    private javax.swing.JTextArea textDescricaoPaletes;
    private javax.swing.JTextArea textVisualizarPaletes;
    // End of variables declaration//GEN-END:variables

    public boolean getBuscarPaletes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
