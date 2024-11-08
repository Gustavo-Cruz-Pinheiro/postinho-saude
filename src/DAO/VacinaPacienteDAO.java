package DAO;

import DTO.VacinaPacienteDTO;
import org.mariadb.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VacinaPacienteDAO {
    Connection conexao;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<VacinaPacienteDTO> lista = new ArrayList<>();
    
    public void cadastrarVacinaPaciente(VacinaPacienteDTO vacinaPacienteDTO) {
        String sql = "INSERT INTO vacinapaciente (codigo_vacina, codigo_paciente, data, dose)"
                + "VALUES(?, ?, ?, ?)" ;
        
        conexao = new ConexaoDAO().ConexaoBanco();
        
        try {
            pstm = conexao.prepareStatement(sql);
            pstm.setInt(1, vacinaPacienteDTO.getCodigoVacina());
            pstm.setInt(2, vacinaPacienteDTO.getCodigoPaciente());
            pstm.setDate(3, java.sql.Date.valueOf(vacinaPacienteDTO.getData()));
            pstm.setString(4, vacinaPacienteDTO.getDose());
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro na VacinaPacienteDAO" + e);
        }
    }
    
    public ArrayList<VacinaPacienteDTO> PesquisarVacinaPaciente(){
        String sql = "SELECT vp.codigo, vp.codigo_vacina, vp.codigo_paciente, vp.data, vp.dose, v.nomeVaci, p.nome FROM vacinapaciente vp INNER JOIN vacina v ON v.codigo = vp.codigo_vacina INNER JOIN paciente p ON p.codigo = vp.codigo_paciente;";
        
        conexao = new ConexaoDAO().ConexaoBanco();
        
        try {
            pstm = conexao.prepareStatement(sql);
            rs = pstm.executeQuery();
                
            while (rs.next()) {
                VacinaPacienteDTO vacinaPaciente = new VacinaPacienteDTO();
                
                vacinaPaciente.setCodigo(rs.getInt("vp.codigo"));
                vacinaPaciente.setCodigoVacina(rs.getInt("vp.codigo_vacina"));
                vacinaPaciente.setCodigoPaciente(rs.getInt("vp.codigo_paciente"));
                vacinaPaciente.setData(rs.getDate("vp.data").toLocalDate());
                vacinaPaciente.setDose(rs.getString("vp.dose"));
                vacinaPaciente.setNomeVacina(rs.getString("v.nomeVaci"));
                vacinaPaciente.setNomePaciente(rs.getString("p.nome"));
                lista.add(vacinaPaciente);       
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro no PesquisarDAO" + e);
        }
        return lista;
    }
    
    
    public void alterarVacinaPaciente(VacinaPacienteDTO vacinaPacienteDTO){
        String sql = "UPDATE vacinapaciente SET codigo_vacina = ?, codigo_paciente = ?, data = ?, dose = ? WHERE codigo = ?";
            
        conexao = new ConexaoDAO().ConexaoBanco();
            
        try {
            pstm = conexao.prepareStatement(sql);
            pstm.setInt(1, vacinaPacienteDTO.getCodigoVacina());
            pstm.setInt(2, vacinaPacienteDTO.getCodigoPaciente());
            pstm.setDate(3, java.sql.Date.valueOf(vacinaPacienteDTO.getData()));
            pstm.setString(4, vacinaPacienteDTO.getDose());
            pstm.setInt(5, vacinaPacienteDTO.getCodigo());
            pstm.execute();
            pstm.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no Alterar DAO" + e);
        }
    }
    
    
    public ArrayList<VacinaPacienteDTO> PesquisarVacinaPacienteCodigo(int codigo){
        String sql = "SELECT vp.codigo, vp.codigo_vacina, vp.codigo_paciente, vp.data, vp.dose, v.nomeVaci, p.nome FROM vacinapaciente vp INNER JOIN vacina v ON v.codigo = vp.codigo_vacina INNER JOIN paciente p ON p.codigo = vp.codigo_paciente WHERE p.codigo = ?";
        
        conexao = new ConexaoDAO().ConexaoBanco();
        
        try {
            pstm = conexao.prepareStatement(sql);
            pstm.setInt(1, codigo);
            rs = pstm.executeQuery();
                
            while (rs.next()) {
                VacinaPacienteDTO vacinaPaciente = new VacinaPacienteDTO();
                
                vacinaPaciente.setCodigo(rs.getInt("vp.codigo"));
                vacinaPaciente.setCodigoVacina(rs.getInt("vp.codigo_vacina"));
                vacinaPaciente.setCodigoPaciente(rs.getInt("vp.codigo_paciente"));
                vacinaPaciente.setData(rs.getDate("vp.data").toLocalDate());
                vacinaPaciente.setDose(rs.getString("vp.dose"));
                vacinaPaciente.setNomeVacina(rs.getString("v.nomeVaci"));
                vacinaPaciente.setNomePaciente(rs.getString("p.nome"));
                lista.add(vacinaPaciente);       
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro no PesquisarDAO" + e);
        }
        return lista;
    }
    
}
