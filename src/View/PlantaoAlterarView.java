package View;

import DAO.FuncionarioDAO;
import DAO.PlantaoDAO;
import DTO.FuncionarioDTO;
import DTO.PlantaoDTO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PlantaoAlterarView extends javax.swing.JFrame {
    private FuncionarioDAO daoFuncionario;
    private PlantaoDAO daoPlantao;
    private DateTimeFormatter dftData;
    private DateTimeFormatter dftTime;
    private ArrayList<FuncionarioDTO> listaMedico;
    private ArrayList<FuncionarioDTO> listaEnfermeiro;

    public PlantaoAlterarView() {
        initComponents();
        dftData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        dftTime = DateTimeFormatter.ofPattern("HH:mm");
        daoFuncionario = new FuncionarioDAO();
        daoPlantao = new PlantaoDAO();
        listaMedico = new ArrayList<>();
        listaEnfermeiro = new ArrayList<>();
        carregarDadosComboBoxMedico();
        carregarDadosComboBoxEnfermeira();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelPostoSaude4 = new javax.swing.JLabel();
        labelIcone2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        labelEnfermeira = new javax.swing.JLabel();
        buttonCadastrar = new javax.swing.JButton();
        labelData = new javax.swing.JLabel();
        fieldData = new javax.swing.JTextField();
        labelHoraEntrada = new javax.swing.JLabel();
        fieldHoraEntrada = new javax.swing.JTextField();
        fieldHoraSaida = new javax.swing.JTextField();
        labelHoraSaida = new javax.swing.JLabel();
        comboBoxMedico = new javax.swing.JComboBox<>();
        comboBoxEnfermeira = new javax.swing.JComboBox<>();
        labelMedico = new javax.swing.JLabel();
        fieldCodigo = new javax.swing.JTextField();
        labelCodigo = new javax.swing.JLabel();
        labelPostoSaude5 = new javax.swing.JLabel();
        labelIcone3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        menuBar = new javax.swing.JMenuBar();
        menuVoltar = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        labelPostoSaude4.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        labelPostoSaude4.setText("Postinho De Saúde");

        labelIcone2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIcone2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/posto.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setText("Cadastrar Plantão");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alterar Plantão");

        labelEnfermeira.setText("Enfermeiro(a)");

        buttonCadastrar.setText("Alterar Plantão");
        buttonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarActionPerformed(evt);
            }
        });

        labelData.setText("Data");

        fieldData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldDataActionPerformed(evt);
            }
        });

        labelHoraEntrada.setText("Hora de Entrada");

        fieldHoraSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldHoraSaidaActionPerformed(evt);
            }
        });

        labelHoraSaida.setText("Hora de Saída ");

        comboBoxMedico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        comboBoxEnfermeira.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        labelMedico.setText("Médico(a)");

        fieldCodigo.setEnabled(false);

        labelCodigo.setText("Código");

        labelPostoSaude5.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        labelPostoSaude5.setText("Postinho De Saúde");

        labelIcone3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIcone3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/posto.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setText("Alterar Plantão");

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
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldHoraSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelHoraSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboBoxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelData, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboBoxEnfermeira, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelHoraEntrada)
                            .addComponent(fieldHoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelEnfermeira, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel3)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelIcone3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelPostoSaude5, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(labelPostoSaude5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIcone3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(1, 1, 1)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigo)
                    .addComponent(labelData)
                    .addComponent(labelHoraEntrada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldHoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHoraSaida)
                    .addComponent(labelMedico)
                    .addComponent(labelEnfermeira))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldHoraSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxEnfermeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(buttonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarActionPerformed
        // TODO add your handling code here:
        alterarPlantao();
    }//GEN-LAST:event_buttonCadastrarActionPerformed

    private void fieldHoraSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldHoraSaidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldHoraSaidaActionPerformed

    private void fieldDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldDataActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new PlantaoPesquisarView().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
         dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlantaoAlterarView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCadastrar;
    private javax.swing.JComboBox<String> comboBoxEnfermeira;
    private javax.swing.JComboBox<String> comboBoxMedico;
    private javax.swing.JTextField fieldCodigo;
    private javax.swing.JTextField fieldData;
    private javax.swing.JTextField fieldHoraEntrada;
    private javax.swing.JTextField fieldHoraSaida;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelEnfermeira;
    private javax.swing.JLabel labelHoraEntrada;
    private javax.swing.JLabel labelHoraSaida;
    private javax.swing.JLabel labelIcone2;
    private javax.swing.JLabel labelIcone3;
    private javax.swing.JLabel labelMedico;
    private javax.swing.JLabel labelPostoSaude4;
    private javax.swing.JLabel labelPostoSaude5;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenu menuVoltar;
    // End of variables declaration//GEN-END:variables
    
    public void carregarValores(PlantaoDTO plantao){
        FuncionarioDTO medico = daoFuncionario.pesquisarFuncionarioCodigo(plantao.getCodigoMedico());
        FuncionarioDTO enfermeira = daoFuncionario.pesquisarFuncionarioCodigo(plantao.getCondigoEnfermeira());
        
        fieldCodigo.setText(Integer.toString(plantao.getCodigo()));
        fieldData.setText(plantao.getData().format(dftData));
        fieldHoraEntrada.setText(plantao.getHoraEntrada().format(dftTime));
        fieldHoraSaida.setText(plantao.getHoraEntrada().format(dftTime));
        comboBoxEnfermeira.setSelectedItem(enfermeira.getNome());
        comboBoxMedico.setSelectedItem(medico.getNome());
        
    }
    
    public void carregarDadosComboBoxMedico() {
        listaMedico = daoFuncionario.ListaMedico();
        
        for(FuncionarioDTO funcionario : listaMedico) {
            comboBoxMedico.addItem(funcionario.getNome());
        }
    }
    
    public void carregarDadosComboBoxEnfermeira() {
        listaEnfermeiro = daoFuncionario.ListaEnfermeiro();
        
        for(FuncionarioDTO funcionario : listaEnfermeiro) {
            comboBoxEnfermeira.addItem(funcionario.getNome());
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
    
    private boolean validaHora(String hora) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
        timeFormat.setLenient(false);
        try {
            timeFormat.parse(hora.trim());
        } catch (ParseException pe) {
            JOptionPane.showMessageDialog(this, "Formato de hora inválido. Por favor, insira a hora no formato HH:mm.");
            return false;
        }
        return true;
    }
    
    private boolean verificaCodigoMedico(int opcao) {
       if (opcao >= 0 && opcao < listaMedico.size()) {
            listaMedico.get(opcao).getCodigo();
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Selecione o Médico(a)");
            return false;
        }
    }
    
    private boolean verificaCodigoEnfermeiro(int opcao) {
        if (opcao >= 0 && opcao < listaEnfermeiro.size()) {
            listaEnfermeiro.get(opcao).getCodigo();
            return true; 
        } else {
            JOptionPane.showMessageDialog(this, "Selecione o Enfermeiro(a)");
            return false;
        }
    }
    
    private void alterarPlantao() {
        int codigo, indexEnfermeira, indexMedico, codigoEnfermeira, codigoMedico;
        String data, horaE, horaS;
        LocalDate dataPlantao;
        LocalTime horaEntrada, horaSaida;
        
        codigo = Integer.parseInt(fieldCodigo.getText());
        data = fieldData.getText();
        horaE = fieldHoraEntrada.getText();
        horaS = fieldHoraSaida.getText();
        indexMedico = comboBoxMedico.getSelectedIndex() - 1;
        indexEnfermeira = comboBoxEnfermeira.getSelectedIndex() - 1;
        
        if (validaData(data) && validaHora(horaE) && validaHora(horaS) && verificaCodigoMedico(indexMedico) && verificaCodigoEnfermeiro(indexEnfermeira)) {
            dataPlantao = LocalDate.parse(data, dftData);
            horaEntrada = LocalTime.parse(horaE, dftTime);
            horaSaida = LocalTime.parse(horaS, dftTime);
            codigoEnfermeira = listaEnfermeiro.get(indexEnfermeira).getCodigo();
            codigoMedico = listaMedico.get(indexMedico).getCodigo();

            PlantaoDTO plantaoDTO = new PlantaoDTO(codigo, dataPlantao, horaEntrada, horaSaida, codigoEnfermeira, codigoMedico);
            daoPlantao.alterarPlantao(plantaoDTO);
            JOptionPane.showMessageDialog(this, "Alteração Realizada com Sucesso!");
        }
    }
}
