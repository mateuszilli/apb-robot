package view;

import javax.swing.JOptionPane;
import model.bean.Linhas;
import model.dao.LinhasDAO;

public class LinhasView extends javax.swing.JFrame {

    private int optGravar;

    public LinhasView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnListarLinhas = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textVisualizarLinhas = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        lblDescricaoLinhas = new javax.swing.JLabel();
        lblIdLinhas = new javax.swing.JLabel();
        jTextIdLinhas = new javax.swing.JTextField();
        lblOrdemLinhas = new javax.swing.JLabel();
        jTextOrdemLinhas = new javax.swing.JTextField();
        lblSentidoLinhas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textDescricaoLinhas = new javax.swing.JTextArea();
        btnGravarLinhas = new javax.swing.JButton();
        btnNovoLinhas = new javax.swing.JButton();
        btnEditarLinhas = new javax.swing.JButton();
        btnExcluirLinhas = new javax.swing.JButton();
        comboSentidoLInhas = new javax.swing.JComboBox<>();
        lblBuscarLinhas = new javax.swing.JLabel();
        jTextBuscarLinhas = new javax.swing.JTextField();
        btnBuscarLinhas = new javax.swing.JButton();

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Cadastro"));
        jPanel3.add(jPanel4);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Linhas");
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Visualização"));
        jPanel1.setLayout(null);

        btnListarLinhas.setText("Listar");
        btnListarLinhas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarLinhasActionPerformed(evt);
            }
        });
        jPanel1.add(btnListarLinhas);
        btnListarLinhas.setBounds(10, 430, 390, 32);

        textVisualizarLinhas.setEditable(false);
        textVisualizarLinhas.setColumns(20);
        textVisualizarLinhas.setRows(5);
        jScrollPane2.setViewportView(textVisualizarLinhas);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(20, 30, 370, 390);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(430, 10, 410, 480);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro"));
        jPanel5.setLayout(null);

        lblDescricaoLinhas.setText("Descrição:");
        jPanel5.add(lblDescricaoLinhas);
        lblDescricaoLinhas.setBounds(20, 230, 140, 30);

        lblIdLinhas.setText("Identificador da Linha:");
        jPanel5.add(lblIdLinhas);
        lblIdLinhas.setBounds(20, 70, 140, 30);

        jTextIdLinhas.setEditable(false);
        jPanel5.add(jTextIdLinhas);
        jTextIdLinhas.setBounds(160, 70, 210, 30);

        lblOrdemLinhas.setText("Ordem da Linha:");
        jPanel5.add(lblOrdemLinhas);
        lblOrdemLinhas.setBounds(20, 120, 140, 30);

        jTextOrdemLinhas.setEditable(false);
        jPanel5.add(jTextOrdemLinhas);
        jTextOrdemLinhas.setBounds(160, 120, 210, 30);

        lblSentidoLinhas.setText("Sentido da Linha");
        jPanel5.add(lblSentidoLinhas);
        lblSentidoLinhas.setBounds(20, 170, 140, 30);

        textDescricaoLinhas.setEditable(false);
        textDescricaoLinhas.setColumns(20);
        textDescricaoLinhas.setRows(5);
        jScrollPane1.setViewportView(textDescricaoLinhas);

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(20, 260, 370, 160);

        btnGravarLinhas.setText("Gravar");
        btnGravarLinhas.setEnabled(false);
        btnGravarLinhas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarLinhasActionPerformed(evt);
            }
        });
        jPanel5.add(btnGravarLinhas);
        btnGravarLinhas.setBounds(290, 430, 90, 32);

        btnNovoLinhas.setText("Novo");
        btnNovoLinhas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoLinhasActionPerformed(evt);
            }
        });
        jPanel5.add(btnNovoLinhas);
        btnNovoLinhas.setBounds(20, 430, 90, 32);

        btnEditarLinhas.setText("Editar");
        btnEditarLinhas.setEnabled(false);
        btnEditarLinhas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarLinhasActionPerformed(evt);
            }
        });
        jPanel5.add(btnEditarLinhas);
        btnEditarLinhas.setBounds(110, 430, 90, 32);

        btnExcluirLinhas.setText("Excluir");
        btnExcluirLinhas.setEnabled(false);
        btnExcluirLinhas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirLinhasActionPerformed(evt);
            }
        });
        jPanel5.add(btnExcluirLinhas);
        btnExcluirLinhas.setBounds(200, 430, 90, 32);

        comboSentidoLInhas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "H", "V" }));
        comboSentidoLInhas.setEnabled(false);
        jPanel5.add(comboSentidoLInhas);
        comboSentidoLInhas.setBounds(160, 170, 210, 30);

        lblBuscarLinhas.setText("Buscar:");
        jPanel5.add(lblBuscarLinhas);
        lblBuscarLinhas.setBounds(20, 30, 60, 30);
        jPanel5.add(jTextBuscarLinhas);
        jTextBuscarLinhas.setBounds(80, 30, 210, 30);

        btnBuscarLinhas.setText("Buscar");
        btnBuscarLinhas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarLinhasActionPerformed(evt);
            }
        });
        jPanel5.add(btnBuscarLinhas);
        btnBuscarLinhas.setBounds(291, 30, 80, 32);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(10, 10, 410, 480);

        setSize(new java.awt.Dimension(868, 537));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarLinhasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarLinhasActionPerformed
        LinhasDAO dao = new LinhasDAO();
        textVisualizarLinhas.setText("");
        for (Linhas l : dao.findAll()) {
            textVisualizarLinhas.append("ID Linha: " + Integer.toString(l.getIdLinha()) + "\tORDEM: " + l.getOrdemLinha() + "\tSENTIDO: " + l.getSentidoLinha() + "\nDESCRIÇÃO: " + l.getDescricaoLinha() + "\n\n");
        }
    }//GEN-LAST:event_btnListarLinhasActionPerformed

    private void btnBuscarLinhasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarLinhasActionPerformed
        Linhas lin = new Linhas();
        lin.setBuscarLinha(Integer.parseInt(jTextBuscarLinhas.getText()));
        optGravar = 1;

        LinhasDAO dao = new LinhasDAO();

        for (Linhas l : dao.findID(lin)) {
            jTextIdLinhas.setText(Integer.toString(l.getIdLinha()));
            jTextOrdemLinhas.setText(Integer.toString(l.getOrdemLinha()));
            comboSentidoLInhas.setSelectedItem(l.getSentidoLinha());
            textDescricaoLinhas.setText(l.getDescricaoLinha());
        }
        btnEditarLinhas.setEnabled(true);
        btnExcluirLinhas.setEnabled(true);
    }//GEN-LAST:event_btnBuscarLinhasActionPerformed

    private void btnNovoLinhasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoLinhasActionPerformed
        Linhas lin = new Linhas();
        optGravar = 0;

        comboSentidoLInhas.setEnabled(true);
        jTextIdLinhas.setEditable(true);
        jTextOrdemLinhas.setEditable(true);
        textDescricaoLinhas.setEditable(true);
        btnGravarLinhas.setEnabled(true);
        jTextBuscarLinhas.setEnabled(true);
        jTextIdLinhas.setEnabled(true);
        jTextOrdemLinhas.setEditable(true);
        textDescricaoLinhas.setEditable(true);
        btnGravarLinhas.setEnabled(true);
        jTextBuscarLinhas.setText("");
        jTextIdLinhas.setText("");
        jTextOrdemLinhas.setText("");
        comboSentidoLInhas.setSelectedItem("Selecione");
        textDescricaoLinhas.setText("");
    }//GEN-LAST:event_btnNovoLinhasActionPerformed

    private void btnEditarLinhasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarLinhasActionPerformed
        comboSentidoLInhas.setEnabled(true);
        jTextBuscarLinhas.setEnabled(true);
        jTextIdLinhas.setEnabled(true);
        jTextOrdemLinhas.setEditable(true);
        textDescricaoLinhas.setEditable(true);
        btnGravarLinhas.setEnabled(true);
        btnExcluirLinhas.setEnabled(true);
    }//GEN-LAST:event_btnEditarLinhasActionPerformed

    private void btnExcluirLinhasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirLinhasActionPerformed
        Linhas lin = new Linhas();
        lin.setIdLinha(Integer.parseInt(jTextIdLinhas.getText()));

        LinhasDAO dao = new LinhasDAO();

        if (dao.delete(lin)) {
            JOptionPane.showMessageDialog(null, "Registro excluído!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao exluir registro!");
        }
    }//GEN-LAST:event_btnExcluirLinhasActionPerformed

    private void btnGravarLinhasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarLinhasActionPerformed

        if (optGravar == 0) {
            Linhas lin = new Linhas();
            lin.setIdLinha(Integer.parseInt(jTextIdLinhas.getText()));
            lin.setOrdemLinha(Integer.parseInt(jTextOrdemLinhas.getText()));
            lin.setSentidoLinha(comboSentidoLInhas.getSelectedItem().toString());
            lin.setDescricaoLinha(textDescricaoLinhas.getText());

            LinhasDAO dao = new LinhasDAO();

            if (dao.save(lin)) {
                JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");
                jTextBuscarLinhas.setText("");
                jTextIdLinhas.setText("");
                jTextOrdemLinhas.setText("");
                comboSentidoLInhas.setSelectedItem("Selecione");
                textDescricaoLinhas.setText("");
                jTextIdLinhas.setEnabled(false);
                jTextOrdemLinhas.setEditable(false);
                textDescricaoLinhas.setEditable(false);
                btnGravarLinhas.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao salvar registro!");
            }
        } else {
            Linhas lin = new Linhas();
            
            lin.setIdLinha(Integer.parseInt(jTextIdLinhas.getText()));
                
            lin.setBuscarLinha(Integer.parseInt(jTextIdLinhas.getText()));
            lin.setOrdemLinha(Integer.parseInt(jTextOrdemLinhas.getText()));
            lin.setSentidoLinha(comboSentidoLInhas.getSelectedItem().toString());
            lin.setDescricaoLinha(textDescricaoLinhas.getText());
            
            LinhasDAO dao = new LinhasDAO();

            if (dao.update(lin)) {
                JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");
                jTextBuscarLinhas.setText("");
                jTextIdLinhas.setText("");
                jTextOrdemLinhas.setText("");
                comboSentidoLInhas.setSelectedItem("Selecione");
                textDescricaoLinhas.setText("");
                jTextIdLinhas.setEnabled(false);
                jTextOrdemLinhas.setEditable(false);
                textDescricaoLinhas.setEditable(false);
                btnGravarLinhas.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao salvar registro!");
            }
        }
    }//GEN-LAST:event_btnGravarLinhasActionPerformed

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
            java.util.logging.Logger.getLogger(LinhasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LinhasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LinhasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LinhasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LinhasView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarLinhas;
    private javax.swing.JButton btnEditarLinhas;
    private javax.swing.JButton btnExcluirLinhas;
    private javax.swing.JButton btnGravarLinhas;
    private javax.swing.JButton btnListarLinhas;
    private javax.swing.JButton btnNovoLinhas;
    private javax.swing.JComboBox<String> comboSentidoLInhas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextBuscarLinhas;
    private javax.swing.JTextField jTextIdLinhas;
    private javax.swing.JTextField jTextOrdemLinhas;
    private javax.swing.JLabel lblBuscarLinhas;
    private javax.swing.JLabel lblDescricaoLinhas;
    private javax.swing.JLabel lblIdLinhas;
    private javax.swing.JLabel lblOrdemLinhas;
    private javax.swing.JLabel lblSentidoLinhas;
    private javax.swing.JTextArea textDescricaoLinhas;
    private javax.swing.JTextArea textVisualizarLinhas;
    // End of variables declaration//GEN-END:variables
}
