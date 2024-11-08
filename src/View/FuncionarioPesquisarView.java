package View;

import DAO.FuncionarioDAO;
import DTO.FuncionarioDTO;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FuncionarioPesquisarView extends javax.swing.JFrame {
    private DateTimeFormatter dftData;
    private FuncionarioDAO dao;

    public FuncionarioPesquisarView() {
        initComponents();
        dftData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        dao = new  FuncionarioDAO();
        listarFuncionarios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFuncionario = new javax.swing.JTable();
        buttonAlterar = new javax.swing.JButton();
        labelPostoSaude3 = new javax.swing.JLabel();
        labelIcone1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        buttonInfoFuncionario = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        menuBar = new javax.swing.JMenuBar();
        menuVoltar = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Listagem de Funcionário");

        tabelaFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Cargo", "RG", "O Exp", "CPF", "Aniversário", "Sexo", "Telefone", "Celular", "Endereço", "Bairro", "Cidade", "Estado"
            }
        ));
        jScrollPane1.setViewportView(tabelaFuncionario);

        buttonAlterar.setText("Alterar Funcionário");
        buttonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlterarActionPerformed(evt);
            }
        });

        labelPostoSaude3.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        labelPostoSaude3.setText("Postinho De Saúde");

        labelIcone1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIcone1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/posto.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setText("Lista de Funcionários");

        buttonInfoFuncionario.setText("Dados Funcionário");
        buttonInfoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInfoFuncionarioActionPerformed(evt);
            }
        });

        menuVoltar.setText("Voltar");

        jMenuItem1.setText("Voltar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuVoltar.add(jMenuItem1);

        menuBar.add(menuVoltar);

        menuSair.setText("Sair");

        jMenuItem2.setText("Sair");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuSair.add(jMenuItem2);

        menuBar.add(menuSair);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(buttonAlterar)
                        .addGap(84, 84, 84)
                        .addComponent(buttonInfoFuncionario)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 304, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelIcone1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelPostoSaude3, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(289, 289, 289))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(labelPostoSaude3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIcone1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAlterar)
                    .addComponent(buttonInfoFuncionario))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarActionPerformed
        salvarDadosFuncionario();
    }//GEN-LAST:event_buttonAlterarActionPerformed

    private void buttonInfoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInfoFuncionarioActionPerformed
        // TODO add your handling code here:
         informacaoFuncionario();
    }//GEN-LAST:event_buttonInfoFuncionarioActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new FuncionarioGerenciarView().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
         dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncionarioPesquisarView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAlterar;
    private javax.swing.JButton buttonInfoFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelIcone1;
    private javax.swing.JLabel labelPostoSaude3;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenu menuVoltar;
    private javax.swing.JTable tabelaFuncionario;
    // End of variables declaration//GEN-END:variables

    private void listarFuncionarios() {
        DefaultTableModel model = (DefaultTableModel) tabelaFuncionario.getModel();
        model.setNumRows(0);
        ArrayList<FuncionarioDTO> lista = dao.PesquisarFuncionario();
        
        for(int num = 0; num < lista.size(); num++) {
            model.addRow(
                    new Object[] {
                        lista.get(num).getCodigo(),
                        lista.get(num).getNome(),
                        lista.get(num).getFuncao(),
                        lista.get(num).getRg(),
                        lista.get(num).getOrgaoExpedidor(),
                        lista.get(num).getCpf(),
                        lista.get(num).getDatanasc().format(dftData),
                        lista.get(num).getSexo(),
                        lista.get(num).getTelefone(),
                        lista.get(num).getCelular(),
                        lista.get(num).getEndereco(),
                        lista.get(num).getBairro(),
                        lista.get(num).getCidade(),
                        lista.get(num).getEstado(),
                    }
            );
        } 
    }
    
    private void salvarDadosFuncionario() {
        int linha = tabelaFuncionario.getSelectedRow();
        
        try {
            int codigo;
            String nome, endereco, telefone, celular, rg, orgaoExpedidor, estado, cidade, bairro, cpf, funcao, sexo, data;
            LocalDate dataNasc;
            DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            codigo = Integer.parseInt(tabelaFuncionario.getValueAt(linha , 0).toString());
            nome = tabelaFuncionario.getValueAt(linha , 1).toString();
            funcao = tabelaFuncionario.getValueAt(linha , 2).toString();
            rg  = tabelaFuncionario.getValueAt(linha , 3).toString();
            orgaoExpedidor = tabelaFuncionario.getValueAt(linha , 4).toString();
            cpf = tabelaFuncionario.getValueAt(linha , 5).toString();
            data = tabelaFuncionario.getValueAt(linha , 6).toString();
            sexo = tabelaFuncionario.getValueAt(linha , 7).toString();
            telefone = tabelaFuncionario.getValueAt(linha , 8).toString();
            celular = tabelaFuncionario.getValueAt(linha , 9).toString();
            endereco = tabelaFuncionario.getValueAt(linha , 10).toString();
            bairro = tabelaFuncionario.getValueAt(linha , 11).toString();
            cidade = tabelaFuncionario.getValueAt(linha , 12).toString();
            estado = tabelaFuncionario.getValueAt(linha , 13).toString();
            dataNasc = LocalDate.parse(data, dft);

            FuncionarioDTO funcionario = new FuncionarioDTO(codigo, nome, dataNasc, endereco, telefone, celular, rg, orgaoExpedidor, estado, cidade, bairro, cpf, funcao, sexo);

            FuncionarioAlterarView viewAlterar = new FuncionarioAlterarView();
            viewAlterar.CarregarValores(funcionario);
            viewAlterar.setVisible(true);
            dispose();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Selecione um Funcionário primeiro para alterar!");
        }
    }
    
    private void informacaoFuncionario() {
        int linha = tabelaFuncionario.getSelectedRow();
        
        try {
            int codigo;

            codigo = Integer.parseInt(tabelaFuncionario.getValueAt(linha , 0).toString());

            FuncionarioDTO funcionario = dao.pesquisarFuncionarioCodigo(codigo);

            JOptionPane.showMessageDialog(null, "Código: " + funcionario.getCodigo() + "\n" +
                                                "Nome: " + funcionario.getNome() + "\n" +  
                                                "Função: " + funcionario.getFuncao() + "\n" +
                                                "Rg: " + funcionario.getRg() + "\n" +
                                                "Orgão Expedidor: " + funcionario.getOrgaoExpedidor() + "\n" +
                                                "CPF: " + funcionario.getCpf() + "\n" +
                                                "Data Nascimento: " + funcionario.getDatanasc().format(dftData) + "\n" +
                                                "Sexo: " + funcionario.getSexo() + "\n" +
                                                "Telefone: " + funcionario.getTelefone() + "\n" +
                                                "Celular: " + funcionario.getCelular() + "\n" + 
                                                "Endereço: " + funcionario.getEndereco() + "\n" +
                                                "Bairro: " + funcionario.getBairro() + "\n" +
                                                "Cidade: " + funcionario.getCidade() + "\n" +
                                                "Estado: " + funcionario.getEstado());
       } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Selecione um Funcionário primeiro para ver seus dados!");
        }
    }
}
