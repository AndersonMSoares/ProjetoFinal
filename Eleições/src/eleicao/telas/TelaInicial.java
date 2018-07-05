
package eleicao.telas;

import javax.swing.table.DefaultTableModel;


public class TelaInicial extends javax.swing.JFrame {

    public TelaInicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jbGerenciarPessoas = new javax.swing.JButton();
        jbGerenciarCandidato = new javax.swing.JButton();
        jbListarPessoas = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jButtonListarTodosCandidatos = new javax.swing.JButton();
        jButtonListarPessoasPorcidade = new javax.swing.JButton();
        jButtonListarPessoasPorEstado = new javax.swing.JButton();
        jButtonListarCandidatoPorCidade = new javax.swing.JButton();
        jButtonListarCandidatoPorEstado = new javax.swing.JButton();
        jbListarTodosOSVotos = new javax.swing.JButton();
        jButtonListarTodosOsPartidos = new javax.swing.JButton();
        jButtonListarTodosCargos = new javax.swing.JButton();
        jButtonListarPessoasPorRegiao = new javax.swing.JButton();
        jButtonListarCandidatoPorREgiao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("ELEIÇÕES");

        jbGerenciarPessoas.setText("Gerenciar Pessoas");
        jbGerenciarPessoas.setPreferredSize(new java.awt.Dimension(700, 23));
        jbGerenciarPessoas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGerenciarPessoasActionPerformed(evt);
            }
        });

        jbGerenciarCandidato.setText("Gerenciar Candidato");
        jbGerenciarCandidato.setPreferredSize(new java.awt.Dimension(200, 23));
        jbGerenciarCandidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGerenciarCandidatoActionPerformed(evt);
            }
        });

        jbListarPessoas.setText("Listar Todas as  Pessoas");
        jbListarPessoas.setPreferredSize(new java.awt.Dimension(200, 23));
        jbListarPessoas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListarPessoasActionPerformed(evt);
            }
        });

        jbSair.setText("Sair");
        jbSair.setPreferredSize(new java.awt.Dimension(100, 23));
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        jButtonListarTodosCandidatos.setText("Listas candidatos");
        jButtonListarTodosCandidatos.setPreferredSize(new java.awt.Dimension(200, 23));
        jButtonListarTodosCandidatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarTodosCandidatosActionPerformed(evt);
            }
        });

        jButtonListarPessoasPorcidade.setText("Listar Pessas por cidade");
        jButtonListarPessoasPorcidade.setPreferredSize(new java.awt.Dimension(200, 23));
        jButtonListarPessoasPorcidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarPessoasPorcidadeActionPerformed(evt);
            }
        });

        jButtonListarPessoasPorEstado.setText("Listar Pessoas por estado");
        jButtonListarPessoasPorEstado.setPreferredSize(new java.awt.Dimension(200, 23));
        jButtonListarPessoasPorEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarPessoasPorEstadoActionPerformed(evt);
            }
        });

        jButtonListarCandidatoPorCidade.setText("Listar Candidato por cidade");
        jButtonListarCandidatoPorCidade.setPreferredSize(new java.awt.Dimension(200, 23));
        jButtonListarCandidatoPorCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarCandidatoPorCidadeActionPerformed(evt);
            }
        });

        jButtonListarCandidatoPorEstado.setText("Listar Candidato por estado");
        jButtonListarCandidatoPorEstado.setPreferredSize(new java.awt.Dimension(200, 23));
        jButtonListarCandidatoPorEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarCandidatoPorEstadoActionPerformed(evt);
            }
        });

        jbListarTodosOSVotos.setText("Listar Votos");
        jbListarTodosOSVotos.setPreferredSize(new java.awt.Dimension(200, 23));
        jbListarTodosOSVotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListarTodosOSVotosActionPerformed(evt);
            }
        });

        jButtonListarTodosOsPartidos.setText("Listar todos os partidos");
        jButtonListarTodosOsPartidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarTodosOsPartidosActionPerformed(evt);
            }
        });

        jButtonListarTodosCargos.setText("Listar todos cargos");
        jButtonListarTodosCargos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarTodosCargosActionPerformed(evt);
            }
        });

        jButtonListarPessoasPorRegiao.setText("Listar Pessoas por região");
        jButtonListarPessoasPorRegiao.setPreferredSize(new java.awt.Dimension(200, 23));
        jButtonListarPessoasPorRegiao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarPessoasPorRegiaoActionPerformed(evt);
            }
        });

        jButtonListarCandidatoPorREgiao.setText("Listar Candidato por região");
        jButtonListarCandidatoPorREgiao.setPreferredSize(new java.awt.Dimension(200, 23));
        jButtonListarCandidatoPorREgiao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarCandidatoPorREgiaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(199, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonListarTodosOsPartidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonListarTodosCargos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22)
                        .addComponent(jbListarTodosOSVotos, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButtonListarPessoasPorcidade, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                .addComponent(jButtonListarPessoasPorEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addComponent(jbListarPessoas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                .addComponent(jButtonListarPessoasPorRegiao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addComponent(jbGerenciarPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jbGerenciarCandidato, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(jButtonListarCandidatoPorEstado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jButtonListarTodosCandidatos, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jButtonListarCandidatoPorCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jButtonListarCandidatoPorREgiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGerenciarPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbGerenciarCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonListarTodosCandidatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbListarPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonListarPessoasPorcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonListarCandidatoPorCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonListarPessoasPorEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonListarCandidatoPorEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonListarPessoasPorRegiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonListarCandidatoPorREgiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonListarTodosOsPartidos)
                    .addComponent(jbListarTodosOSVotos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonListarTodosCargos)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGerenciarCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGerenciarCandidatoActionPerformed
        new TelaCandidato().setVisible(true);
        dispose();
    }//GEN-LAST:event_jbGerenciarCandidatoActionPerformed

    private void jbGerenciarPessoasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGerenciarPessoasActionPerformed
        new TelaPessoas().setVisible(true);;
        dispose();
    }//GEN-LAST:event_jbGerenciarPessoasActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbListarPessoasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListarPessoasActionPerformed
        new TelaListarTodasPessoas().setVisible(true);
        dispose();
    }//GEN-LAST:event_jbListarPessoasActionPerformed

    private void jButtonListarPessoasPorcidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarPessoasPorcidadeActionPerformed
        new TelaListarPessoasPorCidade().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonListarPessoasPorcidadeActionPerformed

    private void jButtonListarPessoasPorEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarPessoasPorEstadoActionPerformed
        new TelaListarPessoasPorEstado().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonListarPessoasPorEstadoActionPerformed

    private void jButtonListarTodosCandidatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarTodosCandidatosActionPerformed
        new TelaListarTodosCandidatos().setVisible(true);
    }//GEN-LAST:event_jButtonListarTodosCandidatosActionPerformed

    private void jButtonListarCandidatoPorCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarCandidatoPorCidadeActionPerformed
        new TelaListarCandidatosPorCidade().setVisible(true);
    }//GEN-LAST:event_jButtonListarCandidatoPorCidadeActionPerformed

    private void jButtonListarCandidatoPorEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarCandidatoPorEstadoActionPerformed
        new TelaListarCandidatoPorEstado().setVisible(true);
    }//GEN-LAST:event_jButtonListarCandidatoPorEstadoActionPerformed

    private void jbListarTodosOSVotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListarTodosOSVotosActionPerformed
        new TelaListarTodosOsVotos().setVisible(true);
    }//GEN-LAST:event_jbListarTodosOSVotosActionPerformed

    private void jButtonListarTodosOsPartidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarTodosOsPartidosActionPerformed
       new TelaListarTodosOsPartidos().setVisible(true);
    }//GEN-LAST:event_jButtonListarTodosOsPartidosActionPerformed

    private void jButtonListarTodosCargosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarTodosCargosActionPerformed
        new TelaListarTodosOsCargos().setVisible(true);
    }//GEN-LAST:event_jButtonListarTodosCargosActionPerformed

    private void jButtonListarPessoasPorRegiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarPessoasPorRegiaoActionPerformed
        new TelaListarPessoasPorRegiao().setVisible(true);
    }//GEN-LAST:event_jButtonListarPessoasPorRegiaoActionPerformed

    private void jButtonListarCandidatoPorREgiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarCandidatoPorREgiaoActionPerformed
       new TelaListarCandidatosPorRegiao().setVisible(true);
    }//GEN-LAST:event_jButtonListarCandidatoPorREgiaoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonListarCandidatoPorCidade;
    private javax.swing.JButton jButtonListarCandidatoPorEstado;
    private javax.swing.JButton jButtonListarCandidatoPorREgiao;
    private javax.swing.JButton jButtonListarPessoasPorEstado;
    private javax.swing.JButton jButtonListarPessoasPorRegiao;
    private javax.swing.JButton jButtonListarPessoasPorcidade;
    private javax.swing.JButton jButtonListarTodosCandidatos;
    private javax.swing.JButton jButtonListarTodosCargos;
    private javax.swing.JButton jButtonListarTodosOsPartidos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbGerenciarCandidato;
    private javax.swing.JButton jbGerenciarPessoas;
    private javax.swing.JButton jbListarPessoas;
    private javax.swing.JButton jbListarTodosOSVotos;
    private javax.swing.JButton jbSair;
    // End of variables declaration//GEN-END:variables
}
