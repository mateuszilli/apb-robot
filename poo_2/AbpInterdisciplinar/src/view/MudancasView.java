package view;

import model.bean.Locais;
import model.dao.LocaisDAO;

public class MudancasView extends javax.swing.JFrame {

    private int optGravar;

    public MudancasView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnOrdenar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textVisualizarMudancas = new javax.swing.JTextArea();

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Cadastro"));
        jPanel3.add(jPanel4);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mudanças");
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Visualização"));
        jPanel1.setLayout(null);

        btnOrdenar.setText("Ordenar");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });
        jPanel1.add(btnOrdenar);
        btnOrdenar.setBounds(10, 430, 390, 32);

        textVisualizarMudancas.setEditable(false);
        textVisualizarMudancas.setColumns(20);
        textVisualizarMudancas.setRows(5);
        jScrollPane2.setViewportView(textVisualizarMudancas);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(20, 30, 370, 390);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 410, 480);

        setSize(new java.awt.Dimension(445, 537));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed

            LocaisDAO dao = new LocaisDAO();
            
            for (Locais l : dao.findPos()) {
                textVisualizarMudancas.append("ID Palete: " + Integer.toString(l.getPaletes().getIdPalete()) + "\tLOCAL ATUAL: " + Integer.toString(l.getIdLocalAtual())
                + "\nLocal Mudança: " + Integer.toString(l.getIdLocal())+"\n\n");
                
        }
    }//GEN-LAST:event_btnOrdenarActionPerformed

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
            java.util.logging.Logger.getLogger(MudancasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MudancasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MudancasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MudancasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new MudancasView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea textVisualizarMudancas;
    // End of variables declaration//GEN-END:variables
}
