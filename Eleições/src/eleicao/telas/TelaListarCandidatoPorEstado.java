
package eleicao.telas;

import Classes.Cargo;
import Classes.Estado;
import DAO.CandidatoDAO;
import DAO.EstadoDAO;
import DAO.PessoasDAO;
import conexao.ConnectionFactory;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class TelaListarCandidatoPorEstado extends javax.swing.JFrame {
     ConnectionFactory conexao = new ConnectionFactory();
     EstadoDAO estadoDAO = new EstadoDAO();
   
    public TelaListarCandidatoPorEstado() {
        initComponents();
        preenchercombo();
        preencher();
    }
    
    private void preencher(){
        CandidatoDAO candidatosDAO = new CandidatoDAO();
        Timer timer = new Timer();
        TimerTask tarefa;
        tarefa = new TimerTask() {
            public void run() {
                DefaultTableModel modelo = new DefaultTableModel();//(lista.toArray(new String[lista.size()][]), new String [] {"Nome do Serviço", "Valor", "Quantidade", "Data"});
                modelo = (DefaultTableModel) jTable2.getModel();
                modelo.setRowCount(0);
                ResultSet rs;
                try {
                    rs = candidatosDAO.BuscarCandidatoPorEstado(jComboBoxEstado.getSelectedItem().toString());
                    //Solicitacao p = new Solicitacao(); // Objeto "p" receberá os valores de cada pessoa do "List"
                    int posicaoLinha=0;
                    while (rs.next()){               
                        modelo.insertRow(posicaoLinha, new Object[] {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),});
                        posicaoLinha++;
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(TelaListarPessoasPorCidade.class.getName()).log(Level.SEVERE, null, ex);
                }               
                jTable2.setModel(modelo);
            }};
            timer.scheduleAtFixedRate(tarefa, 0, 6000);
            jTable2.setVisible(true);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlEstado = new javax.swing.JLabel();
        jbVoltar = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlEstado.setText("Estado:");

        jbVoltar.setText("Voltar");
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });

        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleciona o estado>" }));
        jComboBoxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEstadoActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Título", "Idade", "Cidade", "Estado", "Partido", "Cargo"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1237, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSair)
                    .addComponent(jbVoltar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEstado)
                    .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
        new TelaInicial().setVisible(true);
        dispose();
    }//GEN-LAST:event_jbVoltarActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jComboBoxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEstadoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaListarCandidatoPorEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaListarCandidatoPorEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaListarCandidatoPorEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaListarCandidatoPorEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaListarCandidatoPorEstado().setVisible(true);
            }
        });
    }
   public void preenchercombo(){
       
        
        List<Estado> est = new ArrayList<>();
	int teste1=0;
        est = estadoDAO.BuscarNomeEstado();
        int sse = est.size();
        while(teste1<sse){
            jComboBoxEstado.addItem(est.get(teste1).getNome_estado());
            teste1++;
        }
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JLabel jlEstado;
    // End of variables declaration//GEN-END:variables
}
