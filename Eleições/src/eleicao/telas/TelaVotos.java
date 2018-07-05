
package eleicao.telas;

import Classes.Candidato;
import Classes.Pessoas;
import Classes.Voto;
import DAO.CandidatoDAO;
import DAO.PessoasDAO;
import conexao.ConnectionFactory;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class TelaVotos extends javax.swing.JFrame {
    ConnectionFactory conexao = new ConnectionFactory();

   
    public TelaVotos() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbSair = new javax.swing.JButton();
        jlId = new javax.swing.JLabel();
        jbConfirmar = new javax.swing.JButton();
        jtCPFdoCandidato = new javax.swing.JTextField();
        jlTituloDeEleitor = new javax.swing.JLabel();
        jtTituloDeEleitor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        jlId.setText("CPF do Candidato");

        jbConfirmar.setText("Confirma");
        jbConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarActionPerformed(evt);
            }
        });

        jlTituloDeEleitor.setText("Título de eleitor:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlTituloDeEleitor, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlId, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtTituloDeEleitor, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                            .addComponent(jtCPFdoCandidato)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbConfirmar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbSair)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTituloDeEleitor)
                    .addComponent(jtTituloDeEleitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlId)
                    .addComponent(jtCPFdoCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbConfirmar)
                .addContainerGap(301, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarActionPerformed
        
        Voto voto = new Voto();
        PessoasDAO pessoasDAO = new PessoasDAO();
        Pessoas pessoas = new Pessoas();
        Candidato candidatos = new Candidato();
        CandidatoDAO candidatosDAO = new CandidatoDAO();
        
        try {
            pessoas = pessoasDAO.BuscarTituloPessoa(Integer.parseInt(jtTituloDeEleitor.getText()));            
             try {
                candidatos = candidatosDAO.BuscarCpfCandidato(Integer.parseInt(jtCPFdoCandidato.getText()));
                voto.setPessoa(pessoas);
                 voto.setCandidato(candidatos);
                try{
                    conexao.inserirSQL("INSERT INTO voto (`Candidato_Pessoas_cpf_pessoas`,  `Pessoas_titulo_de_eleitor_pessoas`) values ('"+voto.getCandidato().getCpf_pessoas()+"', '"+ voto.getPessoa().getTitulo_de_eleitor_pessoas()+"')");
                    JOptionPane.showMessageDialog(null,  "Voto realizado com sucesso");            
                } catch (SQLException e){            
                    JOptionPane.showMessageDialog(null, "Voto não realizado");
                }          
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,  ""+jtTituloDeEleitor.getText()+ "não existe!");
            }            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,  ""+jtCPFdoCandidato.getText()+ "não existe!");
        }   
    }//GEN-LAST:event_jbConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaVotos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVotos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVotos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVotos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVotos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbConfirmar;
    private javax.swing.JButton jbSair;
    private javax.swing.JLabel jlId;
    private javax.swing.JLabel jlTituloDeEleitor;
    private javax.swing.JTextField jtCPFdoCandidato;
    private javax.swing.JTextField jtTituloDeEleitor;
    // End of variables declaration//GEN-END:variables
}
