package View;

import DAO.PacienteDAO;
import DTO.PacienteDTO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class PacienteCadastrarView extends javax.swing.JFrame {
    private PacienteDAO dao;
    private DateTimeFormatter dftData;
    
    public PacienteCadastrarView() {
        initComponents();
        dao = new  PacienteDAO();
        dftData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        fieldCertidao = new javax.swing.JTextField();
        labelTelefone = new javax.swing.JLabel();
        fieldTelefone = new javax.swing.JTextField();
        labelSexo1 = new javax.swing.JLabel();
        labelCidade1 = new javax.swing.JLabel();
        fieldCidade = new javax.swing.JTextField();
        labelBairro1 = new javax.swing.JLabel();
        fieldBairro = new javax.swing.JTextField();
        labelCelular1 = new javax.swing.JLabel();
        fieldCelular = new javax.swing.JTextField();
        labelRG1 = new javax.swing.JLabel();
        fieldRg = new javax.swing.JTextField();
        labelUF1 = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        fieldUf = new javax.swing.JTextField();
        fieldNome = new javax.swing.JTextField();
        labeldataNasc = new javax.swing.JLabel();
        buttonCadastrar = new javax.swing.JButton();
        labelPostoSaude3 = new javax.swing.JLabel();
        labelEndereco = new javax.swing.JLabel();
        labelIcone1 = new javax.swing.JLabel();
        labelCertidao = new javax.swing.JLabel();
        fieldDataNasc = new javax.swing.JTextField();
        fieldEndereco = new javax.swing.JTextField();
        comboBoxSexo = new javax.swing.JComboBox<>();
        menuBar = new javax.swing.JMenuBar();
        MenuVoltar = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setText("Cadastrar Paciente");

        fieldCertidao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCertidaoActionPerformed(evt);
            }
        });

        labelTelefone.setText("Telefone (somente números)");

        labelSexo1.setText("Sexo");

        labelCidade1.setText("Cidade");

        fieldCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCidadeActionPerformed(evt);
            }
        });

        labelBairro1.setText("Bairro");

        fieldBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldBairroActionPerformed(evt);
            }
        });

        labelCelular1.setText("Celular (somente números)");

        labelRG1.setText("RG (somente números)");

        fieldRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldRgActionPerformed(evt);
            }
        });

        labelUF1.setText("UF");

        labelNome.setText("Nome");

        fieldUf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldUfActionPerformed(evt);
            }
        });

        labeldataNasc.setText("Data de Nascimento");

        buttonCadastrar.setText("Cadastrar Paciente");
        buttonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarActionPerformed(evt);
            }
        });

        labelPostoSaude3.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        labelPostoSaude3.setText("Postinho De Saúde");

        labelEndereco.setText("Endereço");

        labelIcone1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIcone1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/posto.png"))); // NOI18N

        labelCertidao.setText("Certidão");

        fieldDataNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldDataNascActionPerformed(evt);
            }
        });

        fieldEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldEnderecoActionPerformed(evt);
            }
        });

        comboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Feminino", "Masculino" }));

        MenuVoltar.setText("Voltar");

        jMenuItem1.setText("Voltar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MenuVoltar.add(jMenuItem1);

        menuBar.add(MenuVoltar);

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
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelIcone1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelPostoSaude3, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelEndereco)
                                        .addComponent(fieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelTelefone))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(fieldTelefone)
                                    .addGap(12, 12, 12))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelUF1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fieldUf, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(31, 31, 31)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(fieldRg)
                                            .addGap(12, 12, 12))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(labelRG1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(labelCidade1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(289, 289, 289))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labeldataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fieldDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelSexo1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(fieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelBairro1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCertidao, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fieldCertidao, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCelular1)
                                    .addComponent(fieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonCadastrar)
                            .addGap(268, 268, 268))))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(labelPostoSaude3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIcone1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labeldataNasc)
                            .addComponent(labelSexo1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUF1)
                    .addComponent(labelRG1)
                    .addComponent(labelCertidao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldCertidao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEndereco)
                    .addComponent(labelCidade1)
                    .addComponent(labelBairro1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelefone)
                    .addComponent(labelCelular1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(buttonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fieldCertidaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCertidaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCertidaoActionPerformed

    private void fieldCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCidadeActionPerformed

    private void fieldBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldBairroActionPerformed

    private void fieldRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldRgActionPerformed

    private void fieldUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldUfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldUfActionPerformed

    private void buttonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarActionPerformed
        // TODO add your handling code here:
        cadastrarPaciente();
    }//GEN-LAST:event_buttonCadastrarActionPerformed

    private void fieldDataNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldDataNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldDataNascActionPerformed

    private void fieldEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldEnderecoActionPerformed

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
                new PacienteCadastrarView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuVoltar;
    private javax.swing.JButton buttonCadastrar;
    private javax.swing.JComboBox<String> comboBoxSexo;
    private javax.swing.JTextField fieldBairro;
    private javax.swing.JTextField fieldCelular;
    private javax.swing.JTextField fieldCertidao;
    private javax.swing.JTextField fieldCidade;
    private javax.swing.JTextField fieldDataNasc;
    private javax.swing.JTextField fieldEndereco;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JTextField fieldRg;
    private javax.swing.JTextField fieldTelefone;
    private javax.swing.JTextField fieldUf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelBairro1;
    private javax.swing.JLabel labelCelular1;
    private javax.swing.JLabel labelCertidao;
    private javax.swing.JLabel labelCidade1;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelIcone1;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPostoSaude3;
    private javax.swing.JLabel labelRG1;
    private javax.swing.JLabel labelSexo1;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelUF1;
    private javax.swing.JLabel labeldataNasc;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuSair;
    // End of variables declaration//GEN-END:variables
    
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
    
    private boolean verificaComoBoxSexo(String opcao) {
        if(opcao == "Selecione") {
            JOptionPane.showMessageDialog(this, "Selecione o sexo do Paciente");
            return false;
        }
        return true;
    }
    
    private void cadastrarPaciente() {
        String nome, certidao, endereco, telefone, celular, rg, estado, cidade, bairro, sexo, data;
        LocalDate dataNasc;
        
        nome = fieldNome.getText();
        certidao = fieldCertidao.getText();
        endereco = fieldEndereco.getText();
        telefone = fieldTelefone.getText();
        celular = fieldCelular.getText();
        rg = fieldRg.getText();
        estado = fieldUf.getText();
        cidade = fieldCidade.getText();
        bairro = fieldBairro.getText();
        sexo = comboBoxSexo.getSelectedItem().toString();
        data = fieldDataNasc.getText();
        
        if (verificaComoBoxSexo(sexo) && validaData(data)) {
            dataNasc = LocalDate.parse(data, dftData);
            
            PacienteDTO pacienteDTO = new PacienteDTO(nome, dataNasc, endereco, telefone, celular, rg, estado, cidade, bairro, certidao, sexo);
            dao.cadastrarPaciente(pacienteDTO);
            JOptionPane.showMessageDialog(this, "Cadastro Realizada com Sucesso!");
            
            limparCampos();
        } 
    }
    
    private void limparCampos() {
        fieldNome.setText("");
        fieldCertidao.setText("");
        fieldEndereco.setText("");
        fieldTelefone.setText("");
        fieldCelular.setText("");
        fieldRg.setText("");
        fieldUf.setText("");
        fieldCidade.setText("");
        fieldBairro.setText("");
        comboBoxSexo.setSelectedIndex(0);
        fieldDataNasc.setText("");
    }
}
