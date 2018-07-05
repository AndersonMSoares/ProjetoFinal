
package eleicao.telas;


import Classes.Cidade;
import Classes.Estado;
import Classes.Pessoas;
import DAO.CidadeDAO;
import DAO.PessoasDAO;
import conexao.ConnectionFactory;
import static conexao.ConnectionFactory.getConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.List;

public class TelaPessoas extends javax.swing.JFrame {
        ConnectionFactory conexao = new ConnectionFactory();
        PessoasDAO pessoaDAO = new PessoasDAO();
        CidadeDAO cidadeDAO = new CidadeDAO();
  
    public TelaPessoas() {
        initComponents();
         preenchercombo();
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbVoltar = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jlNome = new javax.swing.JLabel();
        jlCpf = new javax.swing.JLabel();
        jlIdade = new javax.swing.JLabel();
        jlCidade = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jtCpf = new javax.swing.JTextField();
        jtIdade = new javax.swing.JTextField();
        jbPesquisar = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbCadastrar = new javax.swing.JButton();
        jlTituloDeEleitor = new javax.swing.JLabel();
        jtTituloDeEleitor = new javax.swing.JTextField();
        jComboBoxCidade = new javax.swing.JComboBox<>();
        jbLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbVoltar.setText("Voltar");
        jbVoltar.setPreferredSize(new java.awt.Dimension(100, 23));
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });

        jbSair.setText("Sair");
        jbSair.setPreferredSize(new java.awt.Dimension(100, 23));
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        jlNome.setText("Nome:");

        jlCpf.setText("CPF:");

        jlIdade.setText("Idade:");

        jlCidade.setText("Cidade:");

        jtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCpfActionPerformed(evt);
            }
        });

        jtIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtIdadeActionPerformed(evt);
            }
        });

        jbPesquisar.setText("Pesquisar pelo cpf");
        jbPesquisar.setPreferredSize(new java.awt.Dimension(100, 23));
        jbPesquisar.setRequestFocusEnabled(false);
        jbPesquisar.setSelected(true);
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        jbAlterar.setText("Alterar");
        jbAlterar.setPreferredSize(new java.awt.Dimension(100, 23));
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbCadastrar.setText("Cadastrar");
        jbCadastrar.setPreferredSize(new java.awt.Dimension(100, 23));
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });

        jlTituloDeEleitor.setText("Título de eleitor:");

        jComboBoxCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione uma cidade>" }));
        jComboBoxCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCidadeActionPerformed(evt);
            }
        });

        jbLimpar.setText("Limpar");
        jbLimpar.setPreferredSize(new java.awt.Dimension(100, 23));
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNome)
                            .addComponent(jlCpf))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtNome)
                            .addComponent(jtCpf)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlTituloDeEleitor)
                                    .addComponent(jlIdade))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxCidade, 0, 408, Short.MAX_VALUE)
                                    .addComponent(jtIdade)
                                    .addComponent(jtTituloDeEleitor)))
                            .addComponent(jlCidade))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNome)
                            .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlCpf)
                            .addComponent(jtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlTituloDeEleitor)
                            .addComponent(jtTituloDeEleitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlIdade))
                        .addGap(26, 26, 26)
                        .addComponent(jlCidade))
                    .addComponent(jComboBoxCidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(192, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
        new TelaInicial().setVisible(true);
        dispose();
    }//GEN-LAST:event_jbVoltarActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        Pessoas pessoas = new Pessoas();
        // fazendo a validação dos dados
        int b = 0;
        int c = 0;
        
        try { // Busca o id da cidade
            b = cidadeDAO.BuscarIdCidade(jComboBoxCidade.getSelectedItem().toString());
        } catch (SQLException ex) {
            Logger.getLogger(TelaPessoas.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (Integer.parseInt( jtIdade.getText()) < 18){
             JOptionPane.showMessageDialog(null,  "A pessoa cadastrada precisa ter mais de 18 anos");
        } else{
            if(jtNome.getText().isEmpty()|| jtCpf.getText().isEmpty() || jtTituloDeEleitor.getText().isEmpty() ||jtIdade.getText().isEmpty() || (jComboBoxCidade.getSelectedItem().equals("<Selecione uma cidade>"))){
                JOptionPane.showMessageDialog(null, "OS campos não podem ser vazios");
            }       
            pessoas.setNome_pessoas(jtNome.getText());
            pessoas.setCpf_pessoas(Integer.parseInt(jtCpf.getText()));
            pessoas.setTitulo_de_eleitor_pessoas(Integer.parseInt(jtTituloDeEleitor.getText()));
            pessoas.setIdade_pessoas(Integer.parseInt(jtIdade.getText()));
            pessoas.setId_cidade(b);

            try{
                conexao.inserirSQL("INSERT INTO pessoas (cpf_pessoas,  titulo_de_eleitor_pessoas, nome_pessoas, idade_pessoas, cidade_id_cidade) values ('"+pessoas.getCpf_pessoas()+"', '"+pessoas.getTitulo_de_eleitor_pessoas()+"' ,  '"+pessoas.getNome_pessoas()+"', '"+pessoas.getIdade_pessoas()+"',  '"+pessoas.getId_cidade()+"')");
                JOptionPane.showMessageDialog(null,  "Pessoa " + jtNome.getText() + " cadastrado com sucesso");
            } catch (SQLException e){ 
                JOptionPane.showMessageDialog(null, "Usuário já cadastrados! Verifique o número do CPF ou Título de eleitor");
            }       
        }                                                                                                                                                                                                            
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCpfActionPerformed
    }//GEN-LAST:event_jtCpfActionPerformed

    private void jtIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIdadeActionPerformed
    }//GEN-LAST:event_jtIdadeActionPerformed

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        Pessoas pessoas  = new Pessoas();
        if (jtCpf.getText()!= "") {
            try {
                pessoas = pessoaDAO.BuscarCpfPessoa(Integer.parseInt(jtCpf.getText()));
                jtNome.setText(pessoas.getNome_pessoas());
                jtTituloDeEleitor.setText(""+pessoas.getTitulo_de_eleitor_pessoas());
                jtIdade.setText(""+pessoas.getIdade_pessoas());           
                Cidade cid = new Cidade();	
            
                int xa = pessoas.getCidade().getId_cidade();           
                try {
                    cid = cidadeDAO.BuscarNomeCidade(xa);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,  "cidade não encontrado");
            }
            jComboBoxCidade.setSelectedItem(cid.getNome_cidade());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,  "CPF não encontrado");
            }
            catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null,  "Preencha o cpf para realizar a busca");
            }
            catch(NullPointerException ex){
                 JOptionPane.showMessageDialog(null,  "cpf nao encontrado");
            }
        }else{
            JOptionPane.showMessageDialog(null,  "Preencha o cpf para realizar a busca");
        }
            
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void jComboBoxCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCidadeActionPerformed
    }//GEN-LAST:event_jComboBoxCidadeActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        Pessoas pessoas = new Pessoas();
        PessoasDAO pessoasDAO = new PessoasDAO();
        CidadeDAO cidadeDAO = new CidadeDAO();
        ResultSet rs;
        
            try {
                int a = cidadeDAO.BuscarIdCidade(jComboBoxCidade.getSelectedItem().toString());
                try {
                pessoas = pessoasDAO.BuscarCpfPessoa(Integer.parseInt(jtCpf.getText()));
                conexao.updateSQL("UPDATE pessoas set nome_pessoas = '"+jtNome.getText()+"',  idade_pessoas = '"+jtIdade.getText()+"', Cidade_id_cidade = '"+a+"' where cpf_pessoas = '"+pessoas.getCpf_pessoas()+"';");
                JOptionPane.showMessageDialog(null,  "Dados do " +jtNome.getText()+ " alterados com sucesso" );
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,  "Atualição não realizada");
            }  
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,  "Cpf não encontrado");
            }              
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed

        jtNome.setText("");
        jtCpf.setText("");
        jtTituloDeEleitor.setText("");
        jtIdade.setText("");
        jComboBoxCidade.setSelectedItem("<Selecione uma cidade>");
    }//GEN-LAST:event_jbLimparActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPessoas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPessoas().setVisible(true);
            }
        });
    }
    
    public void preenchercombo(){
        List<Cidade> cid = new ArrayList<>();
	int teste=0;
        cid = cidadeDAO.BuscarTodasAsCidades();
        int ss = cid.size();
        while(teste<ss){
            jComboBoxCidade.addItem(cid.get(teste).getNome_cidade());
            teste++;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxCidade;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JLabel jlCidade;
    private javax.swing.JLabel jlCpf;
    private javax.swing.JLabel jlIdade;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlTituloDeEleitor;
    private javax.swing.JTextField jtCpf;
    private javax.swing.JTextField jtIdade;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtTituloDeEleitor;
    // End of variables declaration//GEN-END:variables
}
