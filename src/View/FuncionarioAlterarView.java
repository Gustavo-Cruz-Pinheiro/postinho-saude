package View;

import DAO.FuncionarioDAO;
import DTO.FuncionarioDTO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class FuncionarioAlterarView extends javax.swing.JFrame {
    private FuncionarioDAO dao;
    private DateTimeFormatter dftData;
 
    public FuncionarioAlterarView() {
        dao = new  FuncionarioDAO();
        dftData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTelefone = new javax.swing.JLabel();
        fieldTelefone = new javax.swing.JTextField();
        labelCelular = new javax.swing.JLabel();
        fieldCelular = new javax.swing.JTextField();
        labelRG = new javax.swing.JLabel();
        fieldRg = new javax.swing.JTextField();
        labelOrgExpedidor = new javax.swing.JLabel();
        fieldOrgExpedidor = new javax.swing.JTextField();
        labelUF = new javax.swing.JLabel();
        fieldUf = new javax.swing.JTextField();
        buttonAlterar = new javax.swing.JToggleButton();
        labelCodigo = new javax.swing.JLabel();
        fieldCodigo = new javax.swing.JTextField();
        labelNomeAlterar = new javax.swing.JLabel();
        fieldNome = new javax.swing.JTextField();
        labelEndereco = new javax.swing.JLabel();
        fieldEndereco = new javax.swing.JTextField();
        labelCPF = new javax.swing.JLabel();
        fieldCPF = new javax.swing.JTextField();
        labelCidade = new javax.swing.JLabel();
        fieldCidade = new javax.swing.JTextField();
        labelBairro = new javax.swing.JLabel();
        fieldBairro = new javax.swing.JTextField();
        labelFuncao = new javax.swing.JLabel();
        labelPostoSaude3 = new javax.swing.JLabel();
        labelIcone1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        comboBoxFuncao = new javax.swing.JComboBox<>();
        comboBoxSexo = new javax.swing.JComboBox<>();
        labeldataNasc = new javax.swing.JLabel();
        fieldDataNasc = new javax.swing.JTextField();
        labelSexo = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuVoltar = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alterar Funcionário");

        labelTelefone.setText("Telefone (somente números)");

        labelCelular.setText("Celular (somente números)");

        fieldCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCelularActionPerformed(evt);
            }
        });

        labelRG.setText("RG (somente números)");

        fieldRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldRgActionPerformed(evt);
            }
        });

        labelOrgExpedidor.setText("Orgão Expedidor");

        fieldOrgExpedidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldOrgExpedidorActionPerformed(evt);
            }
        });

        labelUF.setText("UF");

        fieldUf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldUfActionPerformed(evt);
            }
        });

        buttonAlterar.setText("Alterar Funcionário");
        buttonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlterarActionPerformed(evt);
            }
        });

        labelCodigo.setText("Código");

        fieldCodigo.setEnabled(false);
        fieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCodigoActionPerformed(evt);
            }
        });

        labelNomeAlterar.setText("Nome");

        labelEndereco.setText("Endereço");

        fieldEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldEnderecoActionPerformed(evt);
            }
        });

        labelCPF.setText("CPF (somente números)");

        labelCidade.setText("Cidade");

        fieldCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCidadeActionPerformed(evt);
            }
        });

        labelBairro.setText("Bairro");

        fieldBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldBairroActionPerformed(evt);
            }
        });

        labelFuncao.setText("Função");

        labelPostoSaude3.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        labelPostoSaude3.setText("Postinho De Saúde");

        labelIcone1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIcone1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/posto.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setText("Alterar Funcionário");

        comboBoxFuncao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Medica", "Medico", "Enfermeira", "Enfermeiro" }));

        comboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Feminino", "Masculino" }));

        labeldataNasc.setText("Data de Nascimento");

        fieldDataNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldDataNascActionPerformed(evt);
            }
        });

        labelSexo.setText("Sexo");

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
                        .addGap(291, 291, 291)
                        .addComponent(buttonAlterar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                                .addComponent(labelIcone1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelPostoSaude3, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labeldataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(183, 183, 183))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(fieldDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelUF, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fieldUf, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelEndereco))
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelOrgExpedidor)
                                            .addComponent(fieldOrgExpedidor, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(41, 41, 41)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelRG)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelTelefone))
                                        .addGap(36, 36, 36)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelCelular)
                                            .addComponent(fieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelCPF)
                                        .addGap(51, 51, 51))
                                    .addComponent(fieldCPF)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(347, 347, 347)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(50, 50, 50)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(474, 474, 474)
                                        .addComponent(labelFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(comboBoxFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fieldCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(36, 36, 36)
                                        .addComponent(labelNomeAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(430, 430, 430)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(comboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(labelPostoSaude3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIcone1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelNomeAlterar))
                            .addComponent(labeldataNasc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelSexo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUF)
                    .addComponent(labelOrgExpedidor)
                    .addComponent(labelRG)
                    .addComponent(labelCPF))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldOrgExpedidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEndereco)
                    .addComponent(labelBairro)
                    .addComponent(labelCidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelefone)
                    .addComponent(labelFuncao)
                    .addComponent(labelCelular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(buttonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fieldRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldRgActionPerformed

    }//GEN-LAST:event_fieldRgActionPerformed

    private void fieldOrgExpedidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldOrgExpedidorActionPerformed

    }//GEN-LAST:event_fieldOrgExpedidorActionPerformed

    private void fieldUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldUfActionPerformed

    }//GEN-LAST:event_fieldUfActionPerformed

    private void buttonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarActionPerformed

        alterarFuncionario();
    }//GEN-LAST:event_buttonAlterarActionPerformed

    private void fieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCodigoActionPerformed
 
    }//GEN-LAST:event_fieldCodigoActionPerformed

    private void fieldEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldEnderecoActionPerformed

    private void fieldCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCidadeActionPerformed

    }//GEN-LAST:event_fieldCidadeActionPerformed

    private void fieldBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldBairroActionPerformed

    private void fieldDataNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldDataNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldDataNascActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new FuncionarioPesquisarView().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void fieldCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCelularActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncionarioAlterarView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton buttonAlterar;
    private javax.swing.JComboBox<String> comboBoxFuncao;
    private javax.swing.JComboBox<String> comboBoxSexo;
    private javax.swing.JTextField fieldBairro;
    private javax.swing.JTextField fieldCPF;
    private javax.swing.JTextField fieldCelular;
    private javax.swing.JTextField fieldCidade;
    private javax.swing.JTextField fieldCodigo;
    private javax.swing.JTextField fieldDataNasc;
    private javax.swing.JTextField fieldEndereco;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JTextField fieldOrgExpedidor;
    private javax.swing.JTextField fieldRg;
    private javax.swing.JTextField fieldTelefone;
    private javax.swing.JTextField fieldUf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelBairro;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelCelular;
    private javax.swing.JLabel labelCidade;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelFuncao;
    private javax.swing.JLabel labelIcone1;
    private javax.swing.JLabel labelNomeAlterar;
    private javax.swing.JLabel labelOrgExpedidor;
    private javax.swing.JLabel labelPostoSaude3;
    private javax.swing.JLabel labelRG;
    private javax.swing.JLabel labelSexo;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelUF;
    private javax.swing.JLabel labeldataNasc;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenu menuVoltar;
    // End of variables declaration//GEN-END:variables

    public void CarregarValores(FuncionarioDTO funcionario){
        
        fieldCodigo.setText(Integer.toString(funcionario.getCodigo()));
        fieldNome.setText(funcionario.getNome());
        fieldEndereco.setText(funcionario.getEndereco());
        fieldTelefone.setText(funcionario.getTelefone());
        fieldCelular.setText(funcionario.getCelular());
        fieldRg.setText(funcionario.getRg());
        fieldOrgExpedidor.setText(funcionario.getOrgaoExpedidor());
        fieldUf.setText(funcionario.getEstado());
        fieldCidade.setText(funcionario.getCidade());
        fieldBairro.setText(funcionario.getBairro());
        fieldCPF.setText(funcionario.getCpf());
        comboBoxFuncao.setSelectedItem(funcionario.getFuncao());
        comboBoxSexo.setSelectedItem(funcionario.getSexo());
        fieldDataNasc.setText(funcionario.getDatanasc().format(dftData));
      
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
    
    private boolean verificaComoBoxFuncao(String opcao) {
        if(opcao == "Selecione") {
            JOptionPane.showMessageDialog(this, "Selecione a função do funcionário");
            return false;
        }
        return true;
    }
    
    private boolean verificaComoBoxSexo(String opcao) {
        if(opcao == "Selecione") {
            JOptionPane.showMessageDialog(this, "Selecione o sexo do funcionário");
            return false;
        }
        return true;
    }
    
    private void alterarFuncionario() {
        int codigo;
        String nome, endereco, telefone, celular, rg, orgaoExpedidor, estado, cidade, bairro, cpf, funcao, sexo, data;
        LocalDate dataNasc;
        
        codigo = Integer.parseInt(fieldCodigo.getText());
        nome = fieldNome.getText();
        endereco = fieldEndereco.getText();
        telefone = fieldTelefone.getText();
        celular = fieldCelular.getText();
        rg = fieldRg.getText();
        orgaoExpedidor = fieldOrgExpedidor.getText();
        estado = fieldUf.getText();
        cidade = fieldCidade.getText();
        bairro = fieldBairro.getText();
        cpf = fieldCPF.getText();
        funcao = comboBoxFuncao.getSelectedItem().toString();
        sexo = comboBoxSexo.getSelectedItem().toString();
        data = fieldDataNasc.getText();
        
        if (verificaComoBoxFuncao(funcao) && verificaComoBoxSexo(sexo) && validaData(data)) {
            dataNasc = LocalDate.parse(data, dftData);
       
            FuncionarioDTO funcionario = new FuncionarioDTO(codigo, nome, dataNasc, endereco, telefone, celular, rg, orgaoExpedidor, estado, cidade, bairro, cpf, funcao, sexo);
            dao.alterarFuncionario(funcionario);
            
            JOptionPane.showMessageDialog(this, "Alteração Realizada com Sucesso!");
        }
    }
}
