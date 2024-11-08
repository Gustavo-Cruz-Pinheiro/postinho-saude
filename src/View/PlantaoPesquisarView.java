package View;

import DAO.PlantaoDAO;
import DTO.PlantaoDTO;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PlantaoPesquisarView extends javax.swing.JFrame {
    private DateTimeFormatter dftData;
    private DateTimeFormatter dftTime;
    ArrayList<PlantaoDTO> lista;
    PlantaoDAO dao;

    public PlantaoPesquisarView() {
        initComponents();
        dftData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        dftTime = DateTimeFormatter.ofPattern("HH:mm");
        dao = new PlantaoDAO();
        lista = dao.PesquisarPlantao();
        listarPlantao();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPlantao = new javax.swing.JTable();
        buttonAlterar = new javax.swing.JButton();
        labelPostoSaude3 = new javax.swing.JLabel();
        labelIcone1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        menuBar = new javax.swing.JMenuBar();
        menuVoltar = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Listagem de Plantão");

        tabelaPlantao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Data", "Hora Entrada", "Hora Saida", "Código Enfermeira", "Enfermeira", "Código Medica", "Médico"
            }
        ));
        jScrollPane1.setViewportView(tabelaPlantao);

        buttonAlterar.setText("Alterar Plantão");
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
        jLabel1.setText("Lista de Plantões");

        menuVoltar.setText("Voltar");
        menuVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVoltarActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Voltar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuVoltar.add(jMenuItem2);

        menuBar.add(menuVoltar);

        menuSair.setText("Sair");

        jMenuItem3.setText("Sair");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuSair.add(jMenuItem3);

        menuBar.add(menuSair);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelIcone1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelPostoSaude3, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(buttonAlterar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(labelPostoSaude3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIcone1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(buttonAlterar)
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarActionPerformed
        salvarDadosPlantao();
    }//GEN-LAST:event_buttonAlterarActionPerformed

    private void menuVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVoltarActionPerformed
        // TODO add your handling code here:
        new PlantaoGerenciarView().setVisible(true);
        dispose();
    }//GEN-LAST:event_menuVoltarActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        new PlantaoGerenciarView().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlantaoPesquisarView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAlterar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelIcone1;
    private javax.swing.JLabel labelPostoSaude3;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenu menuVoltar;
    private javax.swing.JTable tabelaPlantao;
    // End of variables declaration//GEN-END:variables
    
    private void listarPlantao() {
        DefaultTableModel model = (DefaultTableModel) tabelaPlantao.getModel();
        
        model.setNumRows(0);
        
        for(int num = 0; num < lista.size(); num++) {
            model.addRow(
                    new Object[] {
                        lista.get(num).getCodigo(),
                        lista.get(num).getData().format(dftData),
                        lista.get(num).getHoraEntrada().format(dftTime),
                        lista.get(num).getHoraSaida().format(dftTime),
                        lista.get(num).getCondigoEnfermeira(),
                        lista.get(num).getNomeEnfermeira(),
                        lista.get(num).getCodigoMedico(),
                        lista.get(num).getNomeMedico(),
                    }
            );
        } 
    }
    
    private void salvarDadosPlantao() {
        int linha = tabelaPlantao.getSelectedRow();
        
        try {
            int codigo, indexEnfermeira, indexMedico, codigoEnfermeira, codigoMedico;
            String data, horaE, horaS;
            LocalDate dataPlantao;
            LocalTime horaEntrada, horaSaida;

            codigo = Integer.parseInt(tabelaPlantao.getValueAt(linha , 0).toString());
            data = tabelaPlantao.getValueAt(linha , 1).toString();
            dataPlantao = LocalDate.parse(data, dftData);
            horaE = tabelaPlantao.getValueAt(linha, 2).toString();
            horaEntrada = LocalTime.parse(horaE, dftTime);
            horaS = tabelaPlantao.getValueAt(linha, 3).toString();
            horaSaida = LocalTime.parse(horaS, dftTime);
            codigoEnfermeira = Integer.parseInt(tabelaPlantao.getValueAt(linha, 4).toString());
            codigoMedico = Integer.parseInt(tabelaPlantao.getValueAt(linha, 6).toString());

            PlantaoDTO plantao = new PlantaoDTO(codigo, dataPlantao, horaEntrada, horaSaida, codigoEnfermeira, codigoMedico);
            PlantaoAlterarView viewAlterar = new PlantaoAlterarView();
            viewAlterar.carregarValores(plantao);
            viewAlterar.setVisible(true);
            dispose();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Selecione um Plantão primeiro para alterar!");
        }
    }
}
