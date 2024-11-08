package View;

import DAO.PacienteDAO;
import DAO.VacinaDAO;
import DAO.VacinaPacienteDAO;
import DTO.PacienteDTO;
import DTO.VacinaDTO;
import DTO.VacinaPacienteDTO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VacinaPacienteCadastrarView extends javax.swing.JFrame {
    private DateTimeFormatter dftData;
    private VacinaPacienteDAO dao;
    private VacinaDAO daoVacina;
    private PacienteDAO daoPaciente;
    private ArrayList<VacinaDTO> listaVacina;
    private ArrayList<PacienteDTO> listaPaciente;
    
    public VacinaPacienteCadastrarView() {
        initComponents();
        dftData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        dao = new VacinaPacienteDAO();
        daoVacina = new VacinaDAO();
        daoPaciente = new PacienteDAO();
        listaVacina = new ArrayList<>();
        listaPaciente = new ArrayList<>();
        carregarDadosComoBoxVacina();
        carregarDadosComoBoxPaciente();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelPostoSaude3 = new javax.swing.JLabel();
        labelIcone1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labelPostoSaude4 = new javax.swing.JLabel();
        labelIcone2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        comboBoxVacina = new javax.swing.JComboBox<>();
        comboBoxPaciente = new javax.swing.JComboBox<>();
        fieldData = new javax.swing.JTextField();
        labelVacina = new javax.swing.JLabel();
        labelPaciente = new javax.swing.JLabel();
        labelDose = new javax.swing.JLabel();
        labelData = new javax.swing.JLabel();
        jButtonCadastrar = new javax.swing.JButton();
        fieldDose = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        labelPostoSaude3.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        labelPostoSaude3.setText("Postinho De Saúde");

        labelIcone1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIcone1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/posto.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setText("Cadastrar Funcionário");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Vacina Paciente");

        labelPostoSaude4.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        labelPostoSaude4.setText("Postinho De Saúde");

        labelIcone2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIcone2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/posto.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setText("Cadastrar Vacina Paciente");

        comboBoxVacina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        comboBoxPaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        labelVacina.setText("Vacina");

        labelPaciente.setText("Paciente");

        labelDose.setText("Dose");

        labelData.setText("Data");

        jButtonCadastrar.setText("Cadastrar Vacina Paciente");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jMenu1.setText("Voltar");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Voltar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sair");

        jMenuItem2.setText("Sair");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelIcone2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelPostoSaude4, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboBoxVacina, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelVacina, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboBoxPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelPaciente))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelDose, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fieldDose, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelData, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jButtonCadastrar)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(labelPostoSaude4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIcone2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelVacina)
                    .addComponent(labelPaciente)
                    .addComponent(labelDose)
                    .addComponent(labelData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxVacina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldDose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jButtonCadastrar)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        // TODO add your handling code here:
        cadastrarVacinaPaciente();
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new VacinaGerenciarView().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(VacinaPacienteCadastrarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VacinaPacienteCadastrarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VacinaPacienteCadastrarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VacinaPacienteCadastrarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VacinaPacienteCadastrarView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBoxPaciente;
    private javax.swing.JComboBox<String> comboBoxVacina;
    private javax.swing.JTextField fieldData;
    private javax.swing.JTextField fieldDose;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelDose;
    private javax.swing.JLabel labelIcone1;
    private javax.swing.JLabel labelIcone2;
    private javax.swing.JLabel labelPaciente;
    private javax.swing.JLabel labelPostoSaude3;
    private javax.swing.JLabel labelPostoSaude4;
    private javax.swing.JLabel labelVacina;
    // End of variables declaration//GEN-END:variables
    
    private void carregarDadosComoBoxVacina() {
        listaVacina = daoVacina.PesquisarVacina();
        
        for(VacinaDTO vacina : listaVacina) {
            comboBoxVacina.addItem(vacina.getNomeVaci());
        }
    }
    
    private void carregarDadosComoBoxPaciente() {
        listaPaciente = daoPaciente.pesquisarPaciente();
        
        for(PacienteDTO paciente : listaPaciente) {
            comboBoxPaciente.addItem(paciente.getNome());
        }
    }
    
    private boolean verificaCodigoVacina(int opcao) {
       if (opcao >= 0 && opcao < listaVacina.size()) {
            listaVacina.get(opcao).getCodigo();
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Selecione a Vacina");
            return false;
        }
    }
    
    private boolean verificaCodigoPaciente(int opcao) {
       if (opcao >= 0 && opcao < listaPaciente.size()) {
            listaPaciente.get(opcao).getCodigo();
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Selecione o Paciente");
            return false;
        }
    }
    
    private boolean validaData(String data) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(data.trim());
        } catch (ParseException pe) {
            JOptionPane.showMessageDialog(this, "Formato de data inválido. Por favor, insira a data no formato dd/MM/aaaa.");
            return false;
        }
        return true;
    }
    
    private void cadastrarVacinaPaciente() {
        int indexVacina, indexPaciente, codigoVacina, codigoPaciente;
        String data, dose;
        LocalDate dataVacina;
        
        indexVacina = comboBoxVacina.getSelectedIndex() - 1;
        indexPaciente = comboBoxPaciente.getSelectedIndex() - 1;
        data = fieldData.getText();
        dose = fieldDose.getText();
        
        if(validaData(data) && verificaCodigoVacina(indexVacina) && verificaCodigoPaciente(indexPaciente)) {
            dataVacina = LocalDate.parse(data, dftData);
            codigoVacina = listaVacina.get(indexVacina).getCodigo();
            codigoPaciente = listaPaciente.get(indexPaciente).getCodigo();
            VacinaPacienteDTO vacinaPaciente = new VacinaPacienteDTO(codigoVacina, codigoPaciente, dataVacina, dose);
            
            dao.cadastrarVacinaPaciente(vacinaPaciente);
            JOptionPane.showMessageDialog(this, "Cadastro Realizada com Sucesso!");
            limparCampos();
        }
    }
 
   
    private void limparCampos() {
        fieldData.setText("");
        fieldDose.setText("");
        comboBoxVacina.setSelectedIndex(0);
        comboBoxPaciente.setSelectedIndex(0);
    }
}
