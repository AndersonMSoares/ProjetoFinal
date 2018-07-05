package eleicao.telas;

import Classes.Candidato;
import Classes.Cargo;
import Classes.Partido;
import Classes.Pessoas;
import DAO.CandidatoDAO;
import DAO.CargoDAO;
import DAO.PartidoDAO;
import DAO.PessoasDAO;
import conexao.ConnectionFactory;
import static conexao.ConnectionFactory.getConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaCandidato extends javax.swing.JFrame {

    ConnectionFactory conexao = new ConnectionFactory();
    PessoasDAO pessoasDAO = new PessoasDAO();
    PartidoDAO partidoDAO = new PartidoDAO();
    CargoDAO cargoDAO = new CargoDAO();
    CandidatoDAO candidatoDAO = new CandidatoDAO();

    public TelaCandidato() {
        initComponents();
        preenchercombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbVoltar = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbCadastrar = new javax.swing.JButton();
        jlCpf = new javax.swing.JLabel();
        JTCPF = new javax.swing.JTextField();
        jlPartido = new javax.swing.JLabel();
        jbLimpar = new javax.swing.JButton();
        jcPartido = new javax.swing.JComboBox<>();
        jlCargo = new javax.swing.JLabel();
        jcCargo = new javax.swing.JComboBox<>();
        jbSair = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(650, 500));

        jbVoltar.setText("Voltar");
        jbVoltar.setPreferredSize(new java.awt.Dimension(100, 23));
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
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

        jlCpf.setText("CPF:");

        JTCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTCPFActionPerformed(evt);
            }
        });

        jlPartido.setText("Partido:");

        jbLimpar.setText("Limpar");
        jbLimpar.setPreferredSize(new java.awt.Dimension(100, 23));
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jcPartido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione um partido>" }));
        jcPartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcPartidoActionPerformed(evt);
            }
        });

        jlCargo.setText("Cargo:");

        jcCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione um cargo>" }));
        jcCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCargoActionPerformed(evt);
            }
        });

        jbSair.setText("Sair");
        jbSair.setPreferredSize(new java.awt.Dimension(100, 23));
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.setPreferredSize(new java.awt.Dimension(100, 23));
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(378, 378, 378)
                        .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlCpf)
                        .addGap(33, 33, 33)
                        .addComponent(JTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlPartido)
                        .addGap(18, 18, 18)
                        .addComponent(jcPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlCargo)
                        .addGap(23, 23, 23)
                        .addComponent(jcCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jlCpf))
                    .addComponent(JTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jlPartido))
                    .addComponent(jcPartido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jlCargo))
                    .addComponent(jcCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
        new TelaInicial().setVisible(true);
        dispose();
    }//GEN-LAST:event_jbVoltarActionPerformed

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        Candidato candidato = new Candidato();
        int b = 0, c = 0, d = 0;

        try {
            // fazendo a validação dos dados
            if (pessoasDAO.BuscarCpf(Integer.parseInt(JTCPF.getText())) == 0) {
                JOptionPane.showMessageDialog(null, "Nao existe pessoa cadastrada com este cpf");
            } else {

                if ((jcCargo.getSelectedItem().equals("<Escolha um cargo>")) || (jcPartido.getSelectedItem().equals("<Escolha um partido>"))) {
                    JOptionPane.showMessageDialog(null, "OS campos não podem ser vazios");
                } else {

                    try {

                        b = pessoasDAO.BuscarCpf(Integer.parseInt(JTCPF.getText()));
                        if (b != 0) {
                            c = cargoDAO.RetornaIdCargo(jcCargo.getSelectedItem().toString());
                            d = partidoDAO.RetornaIdPartido(jcPartido.getSelectedItem().toString());
                            try {
                                conexao.inserirSQL("INSERT INTO candidato (pessoas_cpf_pessoas, partido_id_partido, cargo_id_cargo) values ('" + b + "', '" + d + "', '" + c + "')");
                                JOptionPane.showMessageDialog(null, "Candidato  cadastrado com sucesso");
                            } catch (SQLException ex) {
                                JOptionPane.showMessageDialog(null, "Candidato já cadastrado ");
                            }

                            // não aparece quando n é possível cadastrar
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(TelaCandidato.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaCandidato.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed

        JTCPF.setText("");
        jcCargo.setSelectedItem("<Escolha um cargo>");
        jcPartido.setSelectedItem("<Selecione um cargo>");
    }//GEN-LAST:event_jbLimparActionPerformed

    private void JTCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTCPFActionPerformed

    private void jcPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcPartidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcPartidoActionPerformed

    private void jcCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcCargoActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        Candidato candidato = new Candidato();

        ResultSet rs;

        int a = cargoDAO.RetornaIdCargo(jcCargo.getSelectedItem().toString());
        int b = partidoDAO.RetornaIdPartido(jcPartido.getSelectedItem().toString());
        try {
            candidato = candidatoDAO.BuscarCpfCandidato(Integer.parseInt(JTCPF.getText()));
            conexao.updateSQL("UPDATE candidato set  partido_id_partido = '" + b + "',cargo_id_cargo = '" + a + "' where pessoas_cpf_pessoas = '" + candidato.getCpf_pessoas() + "';");
            JOptionPane.showMessageDialog(null, "Dados  alterados com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Atualição não realizada");
        }
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        Candidato candidato = new Candidato();
        if (JTCPF.getText() == null) {
            JOptionPane.showMessageDialog(null, "Cpf vazio");
        } else {

            try {
                candidato = candidatoDAO.BuscarCpfCandidato(Integer.parseInt(JTCPF.getText()));
                Partido par = new Partido();
                Cargo car = new Cargo();

                int xa = (Integer.parseInt(candidato.getCargo_candidato()));
                int xb = (Integer.parseInt(candidato.getPartido_candidato()));
                try {
                    par = partidoDAO.BuscarIdPartido(xb);
                    car = cargoDAO.BuscarIdCargo(xa);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Partido ou cargo não encontrado");
                }
                jcPartido.setSelectedItem(par.getNome_partido());
                jcCargo.setSelectedItem(car.getNome_cargo());

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Cpf não encontrado");

            } catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "Candidato nao encontrado");
            }
        }
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCandidato().setVisible(true);
            }
        });
    }

    public void preenchercombo() {
        List<Cargo> cid = new ArrayList<>();
        int teste = 0;
        cid = cargoDAO.BuscarNomeCargo();
        int ss = cid.size();
        while (teste < ss) {
            jcCargo.addItem(cid.get(teste).getNome_cargo());
            teste++;
        }

        List<Partido> par = new ArrayList<>();
        teste = 0;
        par = partidoDAO.BuscarNomePartido();
        ss = par.size();
        while (teste < ss) {
            jcPartido.addItem(par.get(teste).getNome_partido());
            teste++;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTCPF;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JComboBox<String> jcCargo;
    private javax.swing.JComboBox<String> jcPartido;
    private javax.swing.JLabel jlCargo;
    private javax.swing.JLabel jlCpf;
    private javax.swing.JLabel jlPartido;
    // End of variables declaration//GEN-END:variables
}
