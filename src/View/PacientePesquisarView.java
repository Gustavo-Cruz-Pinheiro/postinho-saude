package View;

import DAO.PacienteDAO;
import DTO.PacienteDTO;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PacientePesquisarView extends javax.swing.JFrame {
    private PacienteDAO dao;
    private DateTimeFormatter dftData;

    public PacientePesquisarView() {
        initComponents();
        dao = new  PacienteDAO();
        dftData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        listarPacientes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPaciente = new javax.swing.JTable();
        buttonAlterar = new javax.swing.JButton();
        labelPostoSaude3 = new javax.swing.JLabel();
        labelIcone1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        ButtonDadosPaciente = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menuVoltar = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Listagem de Paciente");

        tabelaPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Certidao", "RG", "DataNasc", "Sexo", "Telefone", "Celular", "Endereço", "Bairro", "Cidade", "Estado"
            }
        ));
        jScrollPane1.setViewportView(tabelaPaciente);

        buttonAlterar.setText("Alterar Paciente");
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
        jLabel1.setText("Lista de Pacientes");

        ButtonDadosPaciente.setText("Dados Paciente");
        ButtonDadosPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDadosPacienteActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelIcone1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelPostoSaude3, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(buttonAlterar)
                        .addGap(111, 111, 111)
                        .addComponent(ButtonDadosPaciente)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(labelPostoSaude3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIcone1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAlterar)
                    .addComponent(ButtonDadosPaciente))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarActionPerformed
        salvarDadosPaciente();
    }//GEN-LAST:event_buttonAlterarActionPerformed

    private void ButtonDadosPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDadosPacienteActionPerformed
        // TODO add your handling code here:
       informacaoPaciente();
    }//GEN-LAST:event_ButtonDadosPacienteActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new PacienteGerenciarView().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
         dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PacientePesquisarView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonDadosPaciente;
    private javax.swing.JButton buttonAlterar;
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
    private javax.swing.JTable tabelaPaciente;
    // End of variables declaration//GEN-END:variables

    private void listarPacientes() {
        DefaultTableModel model = (DefaultTableModel) tabelaPaciente.getModel();
        model.setNumRows(0);
        ArrayList<PacienteDTO> lista = dao.pesquisarPaciente();
        
        for(int num = 0; num < lista.size(); num++) {
            model.addRow(
                    new Object[] {
                        lista.get(num).getCodigo(),
                        lista.get(num).getNome(),
                        lista.get(num).getCertidao(),
                        lista.get(num).getRg(),
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
    
    private void salvarDadosPaciente() {
        int linha = tabelaPaciente.getSelectedRow();
       
        try {
            int codigo;
            String nome, certidao, endereco, telefone, celular, rg, estado, cidade, bairro, sexo, data;
            LocalDate dataNasc;

            codigo = Integer.parseInt(tabelaPaciente.getValueAt(linha , 0).toString());
            nome = tabelaPaciente.getValueAt(linha , 1).toString();
            certidao = tabelaPaciente.getValueAt(linha , 2).toString();
            rg  = tabelaPaciente.getValueAt(linha , 3).toString();
            data = tabelaPaciente.getValueAt(linha , 4).toString();
            sexo = tabelaPaciente.getValueAt(linha , 5).toString();
            telefone = tabelaPaciente.getValueAt(linha , 6).toString();
            celular = tabelaPaciente.getValueAt(linha , 7).toString();
            endereco = tabelaPaciente.getValueAt(linha , 8).toString();
            bairro = tabelaPaciente.getValueAt(linha , 9).toString();
            cidade = tabelaPaciente.getValueAt(linha , 10).toString();
            estado = tabelaPaciente.getValueAt(linha , 11).toString();
            dataNasc = LocalDate.parse(data, dftData);
           
            PacienteDTO pacienteDTO = new PacienteDTO(codigo, nome, dataNasc, endereco, telefone, celular, rg, estado, cidade, bairro, certidao, sexo);

            PacienteAlterarView viewAlterar = new PacienteAlterarView();
            viewAlterar.CarregarValores(pacienteDTO);
            viewAlterar.setVisible(true);
            dispose();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Selecione um Paciente primeiro para alterar!");
        }
    }
    
    private void informacaoPaciente() {
        int linha = tabelaPaciente.getSelectedRow();
        
        try {
            int codigo;

            codigo = Integer.parseInt(tabelaPaciente.getValueAt(linha , 0).toString());
            PacienteDTO paciente = dao.pesquisarPacienteCodigo(codigo);

            JOptionPane.showMessageDialog(null, "Código: " + paciente.getCodigo() + "\n" +
                                                "Nome: " + paciente.getNome() + "\n" +  
                                                "Certidão: " + paciente.getCertidao() + "\n" +
                                                "Rg: " + paciente.getRg() + "\n" +
                                                "Data de Nascimento: " + paciente.getDatanasc().format(dftData) + "\n" +
                                                "Sexo: " + paciente.getSexo() + "\n" +
                                                "Telefone: " + paciente.getTelefone() + "\n" +
                                                "Celular: " + paciente.getCelular() + "\n" + 
                                                "Endereço: " + paciente.getEndereco() + "\n" +
                                                "Bairro: " + paciente.getBairro() + "\n" +
                                                "Cidade: " + paciente.getCidade() + "\n" +
                                                "Estado: " + paciente.getEstado());
       } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Selecione um Paciente primeiro para ver seus dados!");
        }
    }
}
