
package eleicao.telas;

import DAO.CargoDAO;
import DAO.PartidoDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class TelaListarTodosOsCargos extends javax.swing.JFrame {

 
    public TelaListarTodosOsCargos() {
        initComponents();
        preencher();
    }
    private void preencher(){
        CargoDAO  cargoDAO = new CargoDAO();

        Timer timer = new Timer();
        TimerTask tarefa;
        tarefa = new TimerTask() {
            public void run() {
                DefaultTableModel modelo = new DefaultTableModel();//(lista.toArray(new String[lista.size()][]), new String [] {"Nome do Serviço", "Valor", "Quantidade", "Data"});
                modelo = (DefaultTableModel) jTable2.getModel();
                modelo.setRowCount(0);
                ResultSet rs = null;
                try {
                    rs = cargoDAO.BuscarTodosCargos();
                } catch (SQLException ex) {
                    Logger.getLogger(TelaListarTodasPessoas.class.getName()).log(Level.SEVERE, null, ex);
                }
                int posicaoLinha=0;
                try {
                    while (rs.next()){

                        modelo.insertRow(posicaoLinha, new Object[] {rs.getString(1), rs.getString(2), rs.getString(3)});
                        posicaoLinha++;
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(TelaListarTodasPessoas.class.getName()).log(Level.SEVERE, null, ex);
                }                             
                jTable2.setModel(modelo);
            }};
            timer.scheduleAtFixedRate(tarefa, 0, 6000);
            jTable2.setVisible(true);      
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbSair = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jbVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id cargo", "Nome", "Salário"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jbVoltar.setText("Voltar");
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbVoltar)
                    .addComponent(jbSair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
        new TelaInicial().setVisible(true);
        dispose();
    }//GEN-LAST:event_jbVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaListarTodosOsCargos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaListarTodosOsCargos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaListarTodosOsCargos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaListarTodosOsCargos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaListarTodosOsCargos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbVoltar;
    // End of variables declaration//GEN-END:variables
}
