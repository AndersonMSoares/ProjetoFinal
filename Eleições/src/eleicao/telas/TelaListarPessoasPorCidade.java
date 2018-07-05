
package eleicao.telas;

import Classes.Cargo;
import Classes.Cidade;
import Classes.Estado;
import Classes.Partido;
import DAO.CidadeDAO;
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
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;


public class TelaListarPessoasPorCidade extends javax.swing.JFrame {
        ConnectionFactory conexao = new ConnectionFactory();
        EstadoDAO estadoDAO = new EstadoDAO();
        CidadeDAO cidadeDAO = new CidadeDAO();
        PessoasDAO pessoasDAO = new PessoasDAO();

    public TelaListarPessoasPorCidade() {
        initComponents();
        preenchercombo();
        preencher();
    }
    
    private void preencher(){
        PessoasDAO pessoasDAO = new PessoasDAO();
        Timer timer = new Timer();
        TimerTask tarefa;
        tarefa = new TimerTask() {
            public void run() {
                DefaultTableModel modelo = new DefaultTableModel();//(lista.toArray(new String[lista.size()][]), new String [] {"Nome do Serviço", "Valor", "Quantidade", "Data"});
                modelo = (DefaultTableModel) jTable2.getModel();
                modelo.setRowCount(0);
                ResultSet rs;
                try {
                    rs = pessoasDAO.BuscarPessoaPorCidade(jComboBoxCidade.getSelectedItem().toString());
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbVoltar = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jlCidade = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jComboBoxCidade = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jlCidade.setText("Cidade:");

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jComboBoxCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleciona o cidade>" }));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1072, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlCidade)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxCidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jbVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSair)
                    .addComponent(jbVoltar))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCidade)
                    .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(173, Short.MAX_VALUE))
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
        List <Pessoas> pessoas  = new ArrayList<>();
        try {
           pessoas = pessoasDAO.ListadePessoasPorCidade(jComboBoxCidade.getSelectedItem().toString());
            int teste1=0;
            int sse = pessoas.size();
        while(teste1 < sse){
            System.out.println(""+pessoas );
            teste1++;
        }
        } catch (SQLException ex) {
            Logger.getLogger(TelaPessoas.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }//GEN-LAST:event_jbBuscarActionPerformed

    
    public void preencherTabela(String SQL){
        
    }
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
            java.util.logging.Logger.getLogger(TelaListarPessoasPorCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaListarPessoasPorCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaListarPessoasPorCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaListarPessoasPorCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new TelaListarPessoasPorCidade().setVisible(true);
            }
        });
    }
    public void preenchercombo(){     
     
       
        List<Cidade> cidade = new ArrayList<>();
	int teste2=0;
        cidade = cidadeDAO.BuscarTodasAsCidades();
        int ssi = cidade.size();
        while(teste2<ssi){
            jComboBoxCidade.addItem(cidade.get(teste2).getNome_cidade());
            teste2++;
        }
    }
    
    public void invisivel (){
        //jTable1.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxCidade;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JLabel jlCidade;
    // End of variables declaration//GEN-END:variables
}
