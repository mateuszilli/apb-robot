package view;

import javax.swing.JOptionPane;
import model.bean.Linhas;
import model.bean.Locais;
import model.dao.LocaisDAO;

public class LocaisView extends javax.swing.JFrame {

    private int optGravar;

    public LocaisView() {
        initComponents();
        
        LocaisDAO dao = new LocaisDAO();
        
        for(Locais l:dao.findAll()){
            comboIdLinhas.addItem(l.getLinhas().getIdLinha());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnListarLocais = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textVisualizarLocais = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        lblDescricaoLocais = new javax.swing.JLabel();
        lblIdLinhas = new javax.swing.JLabel();
        lblOrdemLocais = new javax.swing.JLabel();
        jTextHashLocais = new javax.swing.JTextField();
        lblHashLocais = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textDescricaoLocais = new javax.swing.JTextArea();
        btnGravarLocais = new javax.swing.JButton();
        btnNovoLocais = new javax.swing.JButton();
        btnEditarLocais = new javax.swing.JButton();
        btnExcluirLocais = new javax.swing.JButton();
        comboIdLinhas = new javax.swing.JComboBox<>();
        lblIdLocais = new javax.swing.JLabel();
        jTextIdLocais = new javax.swing.JTextField();
        lblTipoLocais = new javax.swing.JLabel();
        jTextOrdemLocais = new javax.swing.JTextField();
        lblBuscarLocais = new javax.swing.JLabel();
        jTextBuscarLocais = new javax.swing.JTextField();
        btnBuscarLocais = new javax.swing.JButton();
        comboTipoLocais = new javax.swing.JComboBox<>();

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Cadastro"));
        jPanel3.add(jPanel4);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Locais");
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Visualização"));
        jPanel1.setLayout(null);

        btnListarLocais.setText("Listar");
        btnListarLocais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarLocaisActionPerformed(evt);
            }
        });
        jPanel1.add(btnListarLocais);
        btnListarLocais.setBounds(10, 430, 390, 32);

        textVisualizarLocais.setEditable(false);
        textVisualizarLocais.setColumns(20);
        textVisualizarLocais.setRows(5);
        jScrollPane2.setViewportView(textVisualizarLocais);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(20, 30, 370, 390);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(430, 10, 410, 480);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro"));
        jPanel5.setLayout(null);

        lblDescricaoLocais.setText("Descrição:");
        jPanel5.add(lblDescricaoLocais);
        lblDescricaoLocais.setBounds(20, 250, 140, 30);

        lblIdLinhas.setText("Identificador da Linha:");
        jPanel5.add(lblIdLinhas);
        lblIdLinhas.setBounds(20, 100, 140, 30);

        lblOrdemLocais.setText("Ordem do Local:");
        jPanel5.add(lblOrdemLocais);
        lblOrdemLocais.setBounds(20, 140, 140, 30);

        jTextHashLocais.setEditable(false);
        jPanel5.add(jTextHashLocais);
        jTextHashLocais.setBounds(160, 220, 210, 30);

        lblHashLocais.setText("Hash do Local:");
        jPanel5.add(lblHashLocais);
        lblHashLocais.setBounds(20, 220, 140, 30);

        textDescricaoLocais.setEditable(false);
        textDescricaoLocais.setColumns(20);
        textDescricaoLocais.setRows(5);
        jScrollPane1.setViewportView(textDescricaoLocais);

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(20, 280, 370, 140);

        btnGravarLocais.setText("Gravar");
        btnGravarLocais.setEnabled(false);
        btnGravarLocais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarLocaisActionPerformed(evt);
            }
        });
        jPanel5.add(btnGravarLocais);
        btnGravarLocais.setBounds(290, 430, 90, 32);

        btnNovoLocais.setText("Novo");
        btnNovoLocais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoLocaisActionPerformed(evt);
            }
        });
        jPanel5.add(btnNovoLocais);
        btnNovoLocais.setBounds(20, 430, 90, 32);

        btnEditarLocais.setText("Editar");
        btnEditarLocais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarLocaisActionPerformed(evt);
            }
        });
        jPanel5.add(btnEditarLocais);
        btnEditarLocais.setBounds(110, 430, 90, 32);

        btnExcluirLocais.setText("Excluir");
        btnExcluirLocais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirLocaisActionPerformed(evt);
            }
        });
        jPanel5.add(btnExcluirLocais);
        btnExcluirLocais.setBounds(200, 430, 90, 32);

        comboIdLinhas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        comboIdLinhas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboIdLinhasActionPerformed(evt);
            }
        });
        jPanel5.add(comboIdLinhas);
        comboIdLinhas.setBounds(160, 100, 210, 30);

        lblIdLocais.setText("Identificador do Local:");
        jPanel5.add(lblIdLocais);
        lblIdLocais.setBounds(20, 60, 140, 30);

        jTextIdLocais.setEditable(false);
        jPanel5.add(jTextIdLocais);
        jTextIdLocais.setBounds(160, 60, 210, 30);

        lblTipoLocais.setText("Tipo do Local:");
        jPanel5.add(lblTipoLocais);
        lblTipoLocais.setBounds(20, 180, 140, 30);

        jTextOrdemLocais.setEditable(false);
        jPanel5.add(jTextOrdemLocais);
        jTextOrdemLocais.setBounds(160, 140, 210, 30);

        lblBuscarLocais.setText("Buscar:");
        jPanel5.add(lblBuscarLocais);
        lblBuscarLocais.setBounds(20, 20, 60, 30);
        jPanel5.add(jTextBuscarLocais);
        jTextBuscarLocais.setBounds(80, 20, 210, 30);

        btnBuscarLocais.setText("Buscar");
        btnBuscarLocais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarLocaisActionPerformed(evt);
            }
        });
        jPanel5.add(btnBuscarLocais);
        btnBuscarLocais.setBounds(291, 20, 80, 32);

        comboTipoLocais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "M", "E", "P" }));
        comboTipoLocais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoLocaisActionPerformed(evt);
            }
        });
        jPanel5.add(comboTipoLocais);
        comboTipoLocais.setBounds(160, 180, 210, 30);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(10, 10, 410, 480);

        setSize(new java.awt.Dimension(868, 537));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarLocaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarLocaisActionPerformed
        Locais loc = new Locais();
        loc.setBuscarLocal(Integer.parseInt(jTextBuscarLocais.getText()));
        optGravar = 1;

        LocaisDAO dao = new LocaisDAO();

        for (Locais l : dao.findID(loc)) {
            jTextIdLocais.setText(Integer.toString(l.getIdLocal()));
            comboIdLinhas.setSelectedItem(Integer.toString(l.getLinhas().getIdLinha()));
            jTextOrdemLocais.setText(Integer.toString(l.getOrdemLocal()));
            comboIdLinhas.setSelectedItem(l.getTipoLocal());
            textDescricaoLocais.setText(l.getDescricaoLocal());
            jTextHashLocais.setText(l.getHashLocal());
        }
    }//GEN-LAST:event_btnBuscarLocaisActionPerformed

    private void btnListarLocaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarLocaisActionPerformed
        LocaisDAO dao = new LocaisDAO();
        textVisualizarLocais.setText("");
        for (Locais loc : dao.findAll()) {
            textVisualizarLocais.append("ID Local: " + Integer.toString(loc.getIdLocal()) + "\tID Linha: " + Integer.toString(loc.getLinhas().getIdLinha()) + "\tORDEM: " + Integer.toString(loc.getLinhas().getIdLinha())
                    + "\nTIPO: " + loc.getTipoLocal() + "\tHASH: " + loc.getHashLocal() + "\nDESCRIÇÃO: " + loc.getDescricaoLocal() + "\n\n");
        }
    }//GEN-LAST:event_btnListarLocaisActionPerformed

    private void btnNovoLocaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoLocaisActionPerformed
        Locais loc = new Locais();
        optGravar = 0;

        jTextIdLocais.setEditable(true);
        comboIdLinhas.setEditable(true);
        jTextOrdemLocais.setEditable(true);
        comboIdLinhas.setEditable(false);
        jTextHashLocais.setEditable(true);
        textDescricaoLocais.setEditable(true);
        jTextIdLocais.setEditable(true);
        jTextIdLocais.setEnabled(true);
        comboIdLinhas.setEnabled(true);
        jTextOrdemLocais.setEnabled(true);
        jTextHashLocais.setEnabled(true);
        textDescricaoLocais.setEnabled(true);
        jTextIdLocais.setText("");
        comboIdLinhas.setSelectedItem("Selecione");
        jTextOrdemLocais.setText("");
        comboIdLinhas.setSelectedItem("Selecione");
        jTextHashLocais.setText("");
        textDescricaoLocais.setText("");
        btnGravarLocais.setEnabled(true);
        jTextBuscarLocais.setText("");
    }//GEN-LAST:event_btnNovoLocaisActionPerformed

    private void btnExcluirLocaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirLocaisActionPerformed
        Locais loc = new Locais();
        loc.setIdLocal(Integer.parseInt(comboIdLinhas.getSelectedItem().toString()));

        LocaisDAO dao = new LocaisDAO();

        if (dao.delete(loc)) {
            JOptionPane.showMessageDialog(null, "Registro excluído!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao excluir registro!");
        }
    }//GEN-LAST:event_btnExcluirLocaisActionPerformed

    private void btnEditarLocaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarLocaisActionPerformed
        jTextIdLocais.setEditable(true);
        comboIdLinhas.setEditable(true);
        jTextOrdemLocais.setEditable(true);
        comboIdLinhas.setEditable(true);
        jTextHashLocais.setEditable(true);
        textDescricaoLocais.setEditable(true);
        jTextIdLocais.setEnabled(true);
        comboIdLinhas.setEnabled(true);
        jTextOrdemLocais.setEnabled(true);
        comboIdLinhas.setEnabled(false);
        jTextHashLocais.setEnabled(true);
        textDescricaoLocais.setEnabled(true);
        btnGravarLocais.setEnabled(true);
    }//GEN-LAST:event_btnEditarLocaisActionPerformed

    private void btnGravarLocaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarLocaisActionPerformed
        if (optGravar == 0) {

            Linhas lin = new Linhas();
            lin.setIdLinha(Integer.parseInt(comboIdLinhas.getSelectedItem().toString()));

            Locais loc = new Locais();

            loc.setIdLocal(Integer.parseInt(jTextIdLocais.getText()));
            loc.setLinhas(lin);
            loc.setOrdemLocal(Integer.parseInt(jTextOrdemLocais.getText()));
            loc.setTipoLocal(comboIdLinhas.getSelectedItem().toString());
            loc.setDescricaoLocal(textDescricaoLocais.getText());
            loc.setHashLocal(jTextHashLocais.getText());

            LocaisDAO dao = new LocaisDAO();

            if (dao.save(loc)) {
                JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");
                jTextIdLocais.setText("");
                comboIdLinhas.setSelectedItem("Selecione");
                jTextOrdemLocais.setText("");
                comboIdLinhas.setSelectedItem("Selecione");
                textDescricaoLocais.setText("");
                jTextHashLocais.setText("");
                jTextIdLocais.setEnabled(false);
                comboIdLinhas.setEnabled(false);
                jTextOrdemLocais.setEditable(false);
                comboIdLinhas.setEditable(false);
                textDescricaoLocais.setEditable(false);
                jTextHashLocais.setEditable(false);
                btnGravarLocais.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao salvar registro!");
            }
        } else {
            
            Linhas lin = new Linhas();
            lin.setIdLinha(Integer.parseInt(comboIdLinhas.getSelectedItem().toString()));

            Locais loc = new Locais();
            loc.setIdLocal(Integer.parseInt(jTextIdLocais.getText()));
            loc.setLinhas(lin);
            loc.setOrdemLocal(Integer.parseInt(jTextOrdemLocais.getText()));
            loc.setTipoLocal(comboIdLinhas.getSelectedItem().toString());
            loc.setDescricaoLocal(textDescricaoLocais.getText());
            loc.setHashLocal(jTextHashLocais.getText());

            LocaisDAO dao = new LocaisDAO();

            if (dao.update(loc)) {
                JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");
                jTextIdLocais.setText("");
                comboIdLinhas.setSelectedItem("Selecione");
                jTextOrdemLocais.setText("");
                comboIdLinhas.setSelectedItem("Selecione");
                textDescricaoLocais.setText("");
                jTextHashLocais.setText("");
                jTextIdLocais.setEnabled(false);
                comboIdLinhas.setEnabled(true);
                jTextOrdemLocais.setEditable(false);
                comboIdLinhas.setEditable(true);
                textDescricaoLocais.setEditable(false);
                jTextHashLocais.setEditable(false);
                btnGravarLocais.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao salvar registro!");
            }
        }
    }//GEN-LAST:event_btnGravarLocaisActionPerformed

    private void comboIdLinhasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboIdLinhasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboIdLinhasActionPerformed

    private void comboTipoLocaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoLocaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTipoLocaisActionPerformed

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
            java.util.logging.Logger.getLogger(LocaisView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LocaisView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LocaisView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LocaisView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LocaisView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarLocais;
    private javax.swing.JButton btnEditarLocais;
    private javax.swing.JButton btnExcluirLocais;
    private javax.swing.JButton btnGravarLocais;
    private javax.swing.JButton btnListarLocais;
    private javax.swing.JButton btnNovoLocais;
    private javax.swing.JComboBox<Object> comboIdLinhas;
    private javax.swing.JComboBox<String> comboTipoLocais;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextBuscarLocais;
    private javax.swing.JTextField jTextHashLocais;
    private javax.swing.JTextField jTextIdLocais;
    private javax.swing.JTextField jTextOrdemLocais;
    private javax.swing.JLabel lblBuscarLocais;
    private javax.swing.JLabel lblDescricaoLocais;
    private javax.swing.JLabel lblHashLocais;
    private javax.swing.JLabel lblIdLinhas;
    private javax.swing.JLabel lblIdLocais;
    private javax.swing.JLabel lblOrdemLocais;
    private javax.swing.JLabel lblTipoLocais;
    private javax.swing.JTextArea textDescricaoLocais;
    private javax.swing.JTextArea textVisualizarLocais;
    // End of variables declaration//GEN-END:variables
}
