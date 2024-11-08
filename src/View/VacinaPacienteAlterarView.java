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

public class VacinaPacienteAlterarView extends javax.swing.JFrame {
    private DateTimeFormatter dftData;
    private VacinaPacienteDAO dao;
    private VacinaDAO daoVacina;
    private PacienteDAO daoPaciente;
    private ArrayList<VacinaDTO> listaVacina;
    private ArrayList<PacienteDTO> listaPaciente;

    public VacinaPacienteAlterarView() {
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

        labelData = new javax.swing.JLabel();
        labelIcone2 = new javax.swing.JLabel();
        jButtonCadastrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        comboBoxVacina = new javax.swing.JComboBox<>();
        comboBoxPaciente = new javax.swing.JComboBox<>();
        fieldDose = new javax.swing.JTextField();
        fieldData = new javax.swing.JTextField();
        labelVacina = new javax.swing.JLabel();
        labelPaciente = new javax.swing.JLabel();
        labelDose = new javax.swing.JLabel();
        labelPostoSaude4 = new javax.swing.JLabel();
        labelData1 = new javax.swing.JLabel();
        labelIcone3 = new javax.swing.JLabel();
        jButtonAlterar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        vacinaComboBox = new javax.swing.JComboBox<>();
        pacienteComboBox = new javax.swing.JComboBox<>();
        doseField = new javax.swing.JTextField();
        dataField = new javax.swing.JTextField();
        labelVacina1 = new javax.swing.JLabel();
        labelPaciente1 = new javax.swing.JLabel();
        labelDose1 = new javax.swing.JLabel();
        labelPostoSaude5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        codigoField = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        labelData.setText("Data");

        labelIcone2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIcone2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/posto.png"))); // NOI18N

        jButtonCadastrar.setText("Cadastrar Vacina Paciente");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setText("Cadastrar Vacina Paciente");

        comboBoxVacina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        comboBoxPaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        fieldDose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldDoseActionPerformed(evt);
            }
        });

        labelVacina.setText("Vacina");

        labelPaciente.setText("Paciente");

        labelDose.setText("Dose");

        labelPostoSaude4.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        labelPostoSaude4.setText("Postinho De Saúde");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alterar Vacina Paciente");

        labelData1.setText("Data");

        labelIcone3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIcone3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/posto.png"))); // NOI18N

        jButtonAlterar.setText("Alterar Vacina Paciente");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setText("Cadastrar Vacina Paciente");

        vacinaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        pacienteComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        doseField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doseFieldActionPerformed(evt);
            }
        });

        labelVacina1.setText("Vacina");

        labelPaciente1.setText("Paciente");

        labelDose1.setText("Dose");

        labelPostoSaude5.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        labelPostoSaude5.setText("Postinho De Saúde");

        jLabel1.setText("Código");

        codigoField.setEnabled(false);

        jMenu1.setText("Voltar");

        jMenuItem1.setText("Voltar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vacinaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelVacina1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pacienteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPaciente1))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(doseField, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDose1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelData1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(labelIcone3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(labelPostoSaude5, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel3)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAlterar)
                .addGap(242, 242, 242))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(labelPostoSaude5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIcone3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(1, 1, 1)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelVacina1)
                    .addComponent(labelPaciente1)
                    .addComponent(labelDose1)
                    .addComponent(labelData1)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vacinaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pacienteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jButtonAlterar)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void fieldDoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldDoseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldDoseActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        // TODO add your handling code here:
        alterarVacinaPaciente();
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void doseFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doseFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doseFieldActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new VacinaPacientePesquisarView().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VacinaPacienteAlterarView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigoField;
    private javax.swing.JComboBox<String> comboBoxPaciente;
    private javax.swing.JComboBox<String> comboBoxVacina;
    private javax.swing.JTextField dataField;
    private javax.swing.JTextField doseField;
    private javax.swing.JTextField fieldData;
    private javax.swing.JTextField fieldDose;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelData1;
    private javax.swing.JLabel labelDose;
    private javax.swing.JLabel labelDose1;
    private javax.swing.JLabel labelIcone2;
    private javax.swing.JLabel labelIcone3;
    private javax.swing.JLabel labelPaciente;
    private javax.swing.JLabel labelPaciente1;
    private javax.swing.JLabel labelPostoSaude4;
    private javax.swing.JLabel labelPostoSaude5;
    private javax.swing.JLabel labelVacina;
    private javax.swing.JLabel labelVacina1;
    private javax.swing.JComboBox<String> pacienteComboBox;
    private javax.swing.JComboBox<String> vacinaComboBox;
    // End of variables declaration//GEN-END:variables
    
    public void carregarValores(VacinaPacienteDTO vacinaPaciente) {
        VacinaDTO vacina = daoVacina.PesquisarVacinaCodigo(vacinaPaciente.getCodigoVacina());
        PacienteDTO paciente = daoPaciente.pesquisarPacienteCodigo(vacinaPaciente.getCodigoPaciente());
        
        codigoField.setText(Integer.toString(vacinaPaciente.getCodigo()));
        vacinaComboBox.setSelectedItem(vacina.getNomeVaci());
        pacienteComboBox.setSelectedItem(paciente.getNome());
        dataField.setText(vacinaPaciente.getData().format(dftData));
        doseField.setText(vacinaPaciente.getDose()); 
    } 
    
    private void carregarDadosComoBoxVacina() {
        listaVacina = daoVacina.PesquisarVacina();
        
        for(VacinaDTO vacina : listaVacina) {
            vacinaComboBox.addItem(vacina.getNomeVaci());
        }
    }
    
    private void carregarDadosComoBoxPaciente() {
        listaPaciente = daoPaciente.pesquisarPaciente();
        
        for(PacienteDTO paciente : listaPaciente) {
            pacienteComboBox.addItem(paciente.getNome());
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
    
    private void alterarVacinaPaciente() {
        int codigo, indexVacina, indexPaciente, codigoVacina, codigoPaciente;
        String data, dose;
        LocalDate dataVacina;
        
        codigo = Integer.parseInt(codigoField.getText());
        indexVacina = vacinaComboBox.getSelectedIndex() - 1;
        indexPaciente = pacienteComboBox.getSelectedIndex() - 1;
        data = dataField.getText();
        dose = doseField.getText();

        if(validaData(data) && verificaCodigoVacina(indexVacina) && verificaCodigoPaciente(indexPaciente)) {
            dataVacina = LocalDate.parse(data, dftData);
            codigoVacina = listaVacina.get(indexVacina).getCodigo();
            codigoPaciente = listaPaciente.get(indexPaciente).getCodigo();
            
            VacinaPacienteDTO vacinaPaciente = new VacinaPacienteDTO(codigo, codigoVacina, codigoPaciente, dataVacina, dose);
            dao.alterarVacinaPaciente(vacinaPaciente);
            JOptionPane.showMessageDialog(this, "Alteração Realizada com Sucesso!");
        }
    }
                
}
