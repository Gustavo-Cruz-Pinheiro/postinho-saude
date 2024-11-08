package DAO;

import DTO.PacienteDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Connection;

public class PacienteDAO {
    Connection conexao;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<PacienteDTO> lista = new ArrayList<>();
    
    public void cadastrarPaciente(PacienteDTO pacienteDTO) {
        String sql = "INSERT INTO paciente (nome, datnasc, end, tele, cel, sexo, rg, uf, cidade, bairro, certidao)"
                + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)" ;
        
        conexao = new ConexaoDAO().ConexaoBanco();
        
        try {
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, pacienteDTO.getNome());
            pstm.setDate(2, java.sql.Date.valueOf(pacienteDTO.getDatanasc()));
            pstm.setString(3, pacienteDTO.getEndereco());
            pstm.setString(4, pacienteDTO.getTelefone());
            pstm.setString(5, pacienteDTO.getCelular());
            pstm.setString(6, pacienteDTO.getSexo());
            pstm.setString(7, pacienteDTO.getRg());
            pstm.setString(8, pacienteDTO.getEstado());
            pstm.setString(9, pacienteDTO.getCidade());
            pstm.setString(10, pacienteDTO.getBairro());
            pstm.setString(11, pacienteDTO.getCertidao());
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro no FuncionarioDAO" + e);
        }
    }
    
    public ArrayList<PacienteDTO> pesquisarPaciente(){
        String sql = "SELECT codigo, nome, datnasc, end, tele, cel, sexo, rg, uf, cidade, bairro, certidao from paciente";
        
        conexao = new ConexaoDAO().ConexaoBanco();
        
        try {
            pstm = conexao.prepareStatement(sql);
            rs = pstm.executeQuery();
                
            while (rs.next()) {
                PacienteDTO pacienteDTO = new PacienteDTO();
                pacienteDTO.setCodigo(rs.getInt("codigo"));
                pacienteDTO.setNome(rs.getString("nome")); 
                pacienteDTO.setDatanasc(rs.getDate("datnasc").toLocalDate());
                pacienteDTO.setEndereco(rs.getString("end"));
                pacienteDTO.setTelefone(rs.getString("tele"));
                pacienteDTO.setCelular(rs.getString("cel"));
                pacienteDTO.setSexo(rs.getString("sexo"));
                pacienteDTO.setRg(rs.getString("rg"));
                pacienteDTO.setEstado(rs.getString("uf"));
                pacienteDTO.setCidade(rs.getString("cidade"));
                pacienteDTO.setBairro(rs.getString("bairro"));
                pacienteDTO.setCertidao(rs.getString("certidao"));
                
                lista.add(pacienteDTO);
                    
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro no PesquisarDAO" + e);
        }
        return lista;
    }
    
    public void alterarPaciente(PacienteDTO pacienteDTO){
        String sql = "UPDATE paciente SET nome = ?, datnasc = ?, end = ?, tele = ?, cel = ?, sexo = ?, rg = ?, uf = ?, cidade = ?, bairro = ?, certidao = ? WHERE codigo = ?";
            
        conexao = new ConexaoDAO().ConexaoBanco();
            
        try {
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, pacienteDTO.getNome());
            pstm.setDate(2, java.sql.Date.valueOf( pacienteDTO.getDatanasc()));
            pstm.setString(3,  pacienteDTO.getEndereco());
            pstm.setString(4,  pacienteDTO.getTelefone());
            pstm.setString(5,  pacienteDTO.getCelular());
            pstm.setString(6, pacienteDTO.getSexo());
            pstm.setString(7, pacienteDTO.getRg());
            pstm.setString(8, pacienteDTO.getEstado());
            pstm.setString(9, pacienteDTO.getCidade());
            pstm.setString(10, pacienteDTO.getBairro());
            pstm.setString(11, pacienteDTO.getCertidao());
            pstm.setInt(12, pacienteDTO.getCodigo());
            pstm.execute();
            pstm.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro no Alterar DAO" + e);
            }
     }
    
    public PacienteDTO pesquisarPacienteCodigo(int codigo){
        String sql = "SELECT codigo, nome, datnasc, end, tele, cel, sexo, rg, uf, cidade, bairro, certidao from paciente WHERE codigo = ?";
        
        conexao = new ConexaoDAO().ConexaoBanco();
        
        try{
            pstm = conexao.prepareStatement(sql);
            pstm.setInt(1, codigo);
            rs = pstm.executeQuery();
            
            if(rs.next()) {
                PacienteDTO pacienteDTO = new PacienteDTO();
                pacienteDTO.setCodigo(rs.getInt("codigo"));
                pacienteDTO.setNome(rs.getString("nome")); 
                pacienteDTO.setDatanasc(rs.getDate("datnasc").toLocalDate());
                pacienteDTO.setEndereco(rs.getString("end"));
                pacienteDTO.setTelefone(rs.getString("tele"));
                pacienteDTO.setCelular(rs.getString("cel"));
                pacienteDTO.setSexo(rs.getString("sexo"));
                pacienteDTO.setRg(rs.getString("rg"));
                pacienteDTO.setEstado(rs.getString("uf"));
                pacienteDTO.setCidade(rs.getString("cidade"));
                pacienteDTO.setBairro(rs.getString("bairro"));
                pacienteDTO.setCertidao(rs.getString("certidao"));

                return pacienteDTO;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro no PesquisarDAO" + e);
        }
        return new PacienteDTO();
    }
    
    
    public boolean efetuarLogin(String rg){
        String sql = "SELECT rg from paciente WHERE rg = ?";
        
        conexao = new ConexaoDAO().ConexaoBanco();
        
        try{
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, rg);
            rs = pstm.executeQuery();
            
            if(rs.next()) {
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro no PesquisarDAO" + e);
        }
        return false;
    }
    
    public int pesquisarPacienteRG(String rg){
        String sql = "SELECT codigo FROM paciente WHERE rg = ?";
        
        conexao = new ConexaoDAO().ConexaoBanco();
        
        try{
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, rg);
            rs = pstm.executeQuery();
            
            if(rs.next()) {
                int codigo;
                
                codigo = rs.getInt("codigo");
                return codigo;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro no PesquisarDAO" + e);
        }
        return 0;
    }
    

}
