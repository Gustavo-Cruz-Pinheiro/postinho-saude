package View;

import DAO.PacienteDAO;
import DTO.PacienteDTO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class PacienteAlterarView extends javax.swing.JFrame {
    private PacienteDAO dao;
    private DateTimeFormatter dftData;

    public PacienteAlterarView() {
        initComponents();
        dao = new  PacienteDAO();
        dftData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        buttonAlterar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fieldCelular = new javax.swing.JTextField();
        labelRG1 = new javax.swing.JLabel();
        fieldRg = new javax.swing.JTextField();
        labelUF1 = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        fieldUf = new javax.swing.JTextField();
        fieldNome = new javax.swing.JTextField();
        labeldataNasc = new javax.swing.JLabel();
        labelPostoSaude3 = new javax.swing.JLabel();
        labelEndereco = new javax.swing.JLabel();
        labelIcone1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labelCertidao = new javax.swing.JLabel();
        fieldCertidao = new javax.swing.JTextField();
        fieldDataNasc = new javax.swing.JTextField();
        labelTelefone = new javax.swing.JLabel();
        fieldEndereco = new javax.swing.JTextField();
        fieldTelefone = new javax.swing.JTextField();
        comboBoxSexo = new javax.swing.JComboBox<>();
        labelSexo1 = new javax.swing.JLabel();
        labelCidade1 = new javax.swing.JLabel();
        fieldCidade = new javax.swing.JTextField();
        labelBairro1 = new javax.swing.JLabel();
        fieldBairro = new javax.swing.JTextField();
        labelCelular1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fieldCodigo = new javax.swing.JTextField();
        menuBar = new javax.swing.JMenuBar();
        menuVoltar = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonAlterar.setText("Alterar Paciente");
        buttonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlterarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setText("Alterar Paciente");

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

        labelPostoSaude3.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        labelPostoSaude3.setText("Postinho De Saúde");

        labelEndereco.setText("Endereço");

        labelIcone1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIcone1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/posto.png"))); // NOI18N

        labelCertidao.setText("Certidão");

        fieldCertidao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCertidaoActionPerformed(evt);
            }
        });

        fieldDataNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldDataNascActionPerformed(evt);
            }
        });

        labelTelefone.setText("Telefone (somente números)");

        fieldEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldEnderecoActionPerformed(evt);
            }
        });

        comboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Feminino", "Masculino" }));

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

        jLabel2.setText("Código");

        fieldCodigo.setEnabled(false);
        fieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCodigoActionPerformed(evt);
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
                .addGap(310, 310, 310)
                .addComponent(buttonAlterar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelUF1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldUf, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelEndereco))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(labelRG1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(fieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCidade1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelBairro1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelCertidao, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelSexo1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(fieldCertidao, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(52, 52, 52))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCelular1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(labelIcone1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(labelPostoSaude3, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labeldataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fieldDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(198, 198, 198))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(labelPostoSaude3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIcone1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labeldataNasc)
                    .addComponent(labelSexo1)
                    .addComponent(labelNome)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(18, 18, 18)
                .addComponent(buttonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarActionPerformed
        // TODO add your handling code here:
       alterarPaciente();
    }//GEN-LAST:event_buttonAlterarActionPerformed

    private void fieldRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldRgActionPerformed

    private void fieldUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldUfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldUfActionPerformed

    private void fieldCertidaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCertidaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCertidaoActionPerformed

    private void fieldDataNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldDataNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldDataNascActionPerformed

    private void fieldEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldEnderecoActionPerformed

    private void fieldCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCidadeActionPerformed

    private void fieldBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldBairroActionPerformed

    private void fieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCodigoActionPerformed

    private void menuVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuVoltarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new PacientePesquisarView().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
         dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PacienteAlterarView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAlterar;
    private javax.swing.JComboBox<String> comboBoxSexo;
    private javax.swing.JTextField fieldBairro;
    private javax.swing.JTextField fieldCelular;
    private javax.swing.JTextField fieldCertidao;
    private javax.swing.JTextField fieldCidade;
    private javax.swing.JTextField fieldCodigo;
    private javax.swing.JTextField fieldDataNasc;
    private javax.swing.JTextField fieldEndereco;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JTextField fieldRg;
    private javax.swing.JTextField fieldTelefone;
    private javax.swing.JTextField fieldUf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JSeparator jSeparator1;
    private java.awt.Label label1;
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
    private javax.swing.JMenu menuVoltar;
    // End of variables declaration//GEN-END:variables

    public void CarregarValores(PacienteDTO paciente){
        fieldCodigo.setText(Integer.toString(paciente.getCodigo()));
        fieldNome.setText(paciente.getNome());
        fieldEndereco.setText(paciente.getEndereco());
        fieldTelefone.setText(paciente.getTelefone());
        fieldCelular.setText(paciente.getCelular());
        fieldRg.setText(paciente.getRg());
        fieldUf.setText(paciente.getEstado());
        fieldCidade.setText(paciente.getCidade());
        fieldBairro.setText(paciente.getBairro());
        fieldCertidao.setText(paciente.getCertidao());
        comboBoxSexo.setSelectedItem(paciente.getSexo());
        fieldDataNasc.setText(paciente.getDatanasc().format(dftData));
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
    
    private boolean verificaComoBoxSexo(String opcao) {
        if(opcao == "Selecione") {
            JOptionPane.showMessageDialog(this, "Selecione o sexo do Paciente");
            return false;
        }
        return true;
    }
    
    private void alterarPaciente() {
        int codigo;
        String nome, certidao, endereco, telefone, celular, rg, estado, cidade, bairro, sexo, data;
        LocalDate dataNasc;
        
        codigo = Integer.parseInt(fieldCodigo.getText());
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
            
            PacienteDTO pacienteDTO = new PacienteDTO(codigo, nome, dataNasc, endereco, telefone, celular, rg, estado, cidade, bairro, certidao, sexo);
            dao.alterarPaciente(pacienteDTO);
            JOptionPane.showMessageDialog(this, "Alteração Realizada com Sucesso!");

        }        
    }
}
