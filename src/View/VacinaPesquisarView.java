package View;

import DAO.VacinaDAO;
import DTO.VacinaDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VacinaPesquisarView extends javax.swing.JFrame {
    VacinaDAO dao;
    
    public VacinaPesquisarView() {
        initComponents();
        dao = new VacinaDAO();
        listarVacina();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        labelPostoSaude3 = new javax.swing.JLabel();
        labelIcone1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaVacina = new javax.swing.JTable();
        ButtonAlterar = new javax.swing.JButton();
        buttonInformacao = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pesquisar Vacina");

        labelPostoSaude3.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        labelPostoSaude3.setText("Postinho De Saúde");

        labelIcone1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIcone1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/posto.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setText("Lista de Vacinas");

        tabelaVacina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Forma", "Via", "Descrição", "Lugar"
            }
        ));
        jScrollPane1.setViewportView(tabelaVacina);

        ButtonAlterar.setText("Alterar Vacina");
        ButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAlterarActionPerformed(evt);
            }
        });

        buttonInformacao.setText("Dados Vacina");
        buttonInformacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInformacaoActionPerformed(evt);
            }
        });

        jMenu3.setText("Voltar");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Voltar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Sair");

        jMenuItem2.setText("Sair");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelIcone1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelPostoSaude3, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(ButtonAlterar)
                        .addGap(100, 100, 100)
                        .addComponent(buttonInformacao)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(labelPostoSaude3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIcone1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonAlterar)
                    .addComponent(buttonInformacao))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
        new VacinaGerenciarView().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void ButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAlterarActionPerformed
        // TODO add your handling code here:
        salvarDadosVacina();
    }//GEN-LAST:event_ButtonAlterarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new VacinaGerenciarView().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void buttonInformacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInformacaoActionPerformed
        // TODO add your handling code here:
        informacaoVacina();
    }//GEN-LAST:event_buttonInformacaoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VacinaPesquisarView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAlterar;
    private javax.swing.JButton buttonInformacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelIcone1;
    private javax.swing.JLabel labelPostoSaude3;
    private javax.swing.JTable tabelaVacina;
    // End of variables declaration//GEN-END:variables
    
    private void listarVacina() {
        DefaultTableModel model = (DefaultTableModel) tabelaVacina.getModel();
        model.setNumRows(0);
        
        ArrayList<VacinaDTO> lista = dao.PesquisarVacina();
        
        for(int num = 0; num < lista.size(); num++) {
            model.addRow(
                    new Object[] {
                        lista.get(num).getCodigo(),
                        lista.get(num).getNomeVaci(),
                        lista.get(num).getForm_admvaci(),
                        lista.get(num).getVia_admvaci(),
                        lista.get(num).getDescricao(),
                        lista.get(num).getLugar_admvaci(),
                    }
            );
        }
    }
    
    private void salvarDadosVacina() {
        int linha = tabelaVacina.getSelectedRow();
        
        try {
            int codigo;
            String nome, forma, via, lugar, descricao;
        
            codigo = Integer.parseInt(tabelaVacina.getValueAt(linha, 0).toString());
            nome = tabelaVacina.getValueAt(linha, 1).toString();
            forma = tabelaVacina.getValueAt(linha, 2).toString();
            via = tabelaVacina.getValueAt(linha, 3).toString();
            descricao = tabelaVacina.getValueAt(linha, 4).toString();
            lugar = tabelaVacina.getValueAt(linha, 5).toString();
            
            VacinaDTO vacina = new VacinaDTO(codigo, nome, forma, via, lugar, descricao);
            
            VacinaAlterarView viewAlterar = new VacinaAlterarView();
            
            viewAlterar.carregarValores(vacina);
            viewAlterar.setVisible(true);
            dispose();
        } catch(Exception erro) {
            JOptionPane.showMessageDialog(null, "Selecione uma Vacina primeiro para alterar!");
        }
    }
    
    private void informacaoVacina() {
        int linha = tabelaVacina.getSelectedRow();
        
        try {
            int codigo;

            codigo = Integer.parseInt(tabelaVacina.getValueAt(linha , 0).toString());

            VacinaDTO vacina = dao.PesquisarVacinaCodigo(codigo);

            JOptionPane.showMessageDialog(null, "Código: " + vacina.getCodigo() + "\n" +
                                                "Nome: " + vacina.getNomeVaci() + "\n" +  
                                                "Forma: " + vacina.getForm_admvaci() + "\n" +
                                                "Via: " + vacina.getVia_admvaci() + "\n" +
                                                "Descrição: " + vacina.getDescricao());
       } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Selecione uma Vacina primeiro para ver seus dados!");
       }
    }

}
