package View;

import DAO.LoginDAO;
import DTO.LoginDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class LoginPesquisarView extends javax.swing.JFrame {
    private LoginDAO dao;
    
    public LoginPesquisarView() {
        initComponents();
        dao = new LoginDAO();
        listarUsuarios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        labelPostoSaude3 = new javax.swing.JLabel();
        labelIcone1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        labelPostoSaude4 = new javax.swing.JLabel();
        labelIcone2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usuariotabela = new javax.swing.JTable();
        buttonAlterar = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menuVoltar = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        MenuSair = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        labelPostoSaude3.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        labelPostoSaude3.setText("Postinho De Saúde");

        labelIcone1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIcone1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/posto.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setText("Lista de Pacientes");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pesquisar Usuário");

        labelPostoSaude4.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        labelPostoSaude4.setText("Postinho De Saúde");

        labelIcone2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIcone2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/posto.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setText("Lista de Usuários");

        usuariotabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Usuário"
            }
        ));
        usuariotabela.setToolTipText("");
        jScrollPane1.setViewportView(usuariotabela);

        buttonAlterar.setText("Alterar Usuário");
        buttonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlterarActionPerformed(evt);
            }
        });

        menuVoltar.setText("Voltar");
        menuVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVoltarActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Voltar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuVoltar.add(jMenuItem1);

        menuBar.add(menuVoltar);

        MenuSair.setText("Sair");

        jMenuItem2.setText("Sair");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        MenuSair.add(jMenuItem2);

        menuBar.add(MenuSair);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelIcone2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelPostoSaude4, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(labelPostoSaude4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIcone2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarActionPerformed
        // TODO add your handling code here:
        salvarDadosUsuario();
    }//GEN-LAST:event_buttonAlterarActionPerformed

    private void menuVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuVoltarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new LoginGerenciarView().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
         dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPesquisarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPesquisarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPesquisarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPesquisarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPesquisarView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuSair;
    private javax.swing.JButton buttonAlterar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelIcone1;
    private javax.swing.JLabel labelIcone2;
    private javax.swing.JLabel labelPostoSaude3;
    private javax.swing.JLabel labelPostoSaude4;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuVoltar;
    private javax.swing.JTable usuariotabela;
    // End of variables declaration//GEN-END:variables

    private void listarUsuarios(){
        DefaultTableModel model = (DefaultTableModel) usuariotabela.getModel();
        model.setNumRows(0);
        ArrayList<LoginDTO> lista = dao.PesquisarLogin();
        
        for(int num = 0; num < lista.size(); num++) {
            model.addRow(
                    new Object[] {
                        lista.get(num).getCodigo(),
                        lista.get(num).getUsuario(),
                    }
            );
        } 
    }
    
    private void salvarDadosUsuario() {
        int linha = usuariotabela.getSelectedRow();
        
        try {
            int codigo;
            String usuario, senha;

            codigo = Integer.parseInt(usuariotabela.getValueAt(linha , 0).toString());
            usuario = usuariotabela.getValueAt(linha , 1).toString();
            senha = dao.PesquisarLoginCodigo(codigo);
            
            LoginDTO login = new LoginDTO(codigo, usuario, senha);
            
            LoginAlterarView alterarView = new LoginAlterarView();
            alterarView.CarregarValores(login);
            alterarView.setVisible(true);
            dispose();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Selecione um Paciente primeiro para alterar!");
        }
    }
}
