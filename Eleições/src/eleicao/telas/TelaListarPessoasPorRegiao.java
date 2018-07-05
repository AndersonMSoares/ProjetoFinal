
package eleicao.telas;

import Classes.Cidade;
import Classes.Estado;
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


public class TelaListarPessoasPorRegiao extends javax.swing.JFrame {
        ConnectionFactory conexao = new ConnectionFactory();
        EstadoDAO estadoDAO = new EstadoDAO();
        PessoasDAO pessoasDAO = new PessoasDAO();

    public TelaListarPessoasPorRegiao() {
        initComponents();
        preenchercombo();
        preencher();
    }

  private void preencher(){
        
        Timer timer = new Timer();
        TimerTask tarefa;
        tarefa = new TimerTask() {
            public void run() {
                DefaultTableModel modelo = new DefaultTableModel();//(lista.toArray(new String[lista.size()][]), new String [] {"Nome do Serviço", "Valor", "Quantidade", "Data"});
                modelo = (DefaultTableModel) jTable2.getModel();
                modelo.setRowCount(0);
                ResultSet rs;
                try {
                    rs = estadoDAO.BuscarPessoasPorRegiao(jComboBoxRegiao.getSelectedItem().toString());
                //Solicitacao p = new Solicitacao(); // Objeto "p" receberá os valores de cada pessoa do "List"
                int posicaoLinha=0;
                while (rs.next()){
                    modelo.insertRow(posicaoLinha, new Object[] {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)});
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
  
   
    public void preenchercombo(){     

        List<Estado> estado = new ArrayList<>();
	int teste2=0;
        estado = estadoDAO.BuscarNomeEstado();
        int ssi = estado.size();
        while(teste2<ssi){
            jComboBoxRegiao.addItem(estado.get(teste2).getRegiao_estado());
            teste2++;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbVoltar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jlRegiao = new javax.swing.JLabel();
        jComboBoxRegiao = new javax.swing.JComboBox<>();
        jbSair = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbVoltar.setText("Voltar");
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Título", "Idade", "Cidade", "Estado"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jlRegiao.setText("Região:");

        jComboBoxRegiao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleciona o região>" }));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(992, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jlRegiao)
                            .addGap(18, 18, 18)
                            .addComponent(jComboBoxRegiao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(jbVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(967, 967, 967)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbSair)
                .addGap(99, 99, 99)
                .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jbVoltar)
                    .addGap(56, 56, 56)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlRegiao)
                        .addComponent(jComboBoxRegiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(67, 67, 67)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addContainerGap()))
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
            java.util.logging.Logger.getLogger(TelaListarPessoasPorRegiao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaListarPessoasPorRegiao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaListarPessoasPorRegiao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaListarPessoasPorRegiao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaListarPessoasPorRegiao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxRegiao;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JLabel jlRegiao;
    // End of variables declaration//GEN-END:variables
}
