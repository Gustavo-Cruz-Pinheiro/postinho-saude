package DAO;

import DTO.FuncionarioDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Connection;

public class FuncionarioDAO {
    Connection conexao;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<FuncionarioDTO> lista = new ArrayList<>();
    ArrayList<FuncionarioDTO> listaMedico = new ArrayList<>();
    ArrayList<FuncionarioDTO> listaEnfermeiro = new ArrayList<>();
    
    public void cadastrarFuncionario(FuncionarioDTO funcionarioDTO) {
        String sql = "INSERT INTO funcionario (nome, datnasc, end, tele, cel, ogexp, rg, uf, cidade, bairro, cpf, funcao, sexo)"
                + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)" ;
        
        conexao = new ConexaoDAO().ConexaoBanco();
        
        try {
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, funcionarioDTO.getNome());
            pstm.setDate(2, java.sql.Date.valueOf(funcionarioDTO.getDatanasc()));
            pstm.setString(3, funcionarioDTO.getEndereco());
            pstm.setString(4, funcionarioDTO.getTelefone());
            pstm.setString(5, funcionarioDTO.getCelular());
            pstm.setString(6, funcionarioDTO.getOrgaoExpedidor());
            pstm.setString(7, funcionarioDTO.getRg());
            pstm.setString(8, funcionarioDTO.getEstado());
            pstm.setString(9, funcionarioDTO.getCidade());
            pstm.setString(10, funcionarioDTO.getBairro());
            pstm.setString(11, funcionarioDTO.getCpf());
            pstm.setString(12, funcionarioDTO.getFuncao());
            pstm.setString(13, funcionarioDTO.getSexo());
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro no FuncionarioDAO" + e);
        }
    }
    
    public ArrayList<FuncionarioDTO> PesquisarFuncionario(){
        String sql = "SELECT codigo, nome, datnasc, end, tele, cel, ogexp, rg, uf, cidade, bairro, cpf, funcao, sexo from funcionario";
        
        conexao = new ConexaoDAO().ConexaoBanco();
        
        try {
            pstm = conexao.prepareStatement(sql);
            rs = pstm.executeQuery();
                
            while (rs.next()) {
                FuncionarioDTO funcionariodto = new FuncionarioDTO();
                
                funcionariodto.setCodigo(rs.getInt("codigo"));
                funcionariodto.setNome(rs.getString("nome")); 
                funcionariodto.setDatanasc(rs.getDate("datnasc").toLocalDate());
                funcionariodto.setEndereco(rs.getString("end"));
                funcionariodto.setTelefone(rs.getString("tele"));
                funcionariodto.setCelular(rs.getString("cel"));
                funcionariodto.setOrgaoExpedidor(rs.getString("ogexp"));
                funcionariodto.setRg(rs.getString("rg"));
                funcionariodto.setEstado(rs.getString("uf"));
                funcionariodto.setCidade(rs.getString("cidade"));
                funcionariodto.setBairro(rs.getString("bairro"));
                funcionariodto.setCpf(rs.getString("cpf"));
                funcionariodto.setFuncao(rs.getString("funcao"));
                funcionariodto.setSexo(rs.getString("sexo"));
                lista.add(funcionariodto);
                    
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro no PesquisarDAO" + e);
        }
        return lista;
    }
    
    public ArrayList<FuncionarioDTO> ListaMedico(){
        String sql = "SELECT codigo, nome, datnasc, end, tele, cel, ogexp, rg, uf, cidade, bairro, cpf, funcao, sexo from funcionario WHERE funcao = 'Medica' OR funcao = 'Medico'";
        
        conexao = new ConexaoDAO().ConexaoBanco();
        
        try {
            pstm = conexao.prepareStatement(sql);
            rs = pstm.executeQuery();
                
            while (rs.next()) {
                FuncionarioDTO funcionariodto = new FuncionarioDTO();
                
                funcionariodto.setCodigo(rs.getInt("codigo"));
                funcionariodto.setNome(rs.getString("nome")); 
                funcionariodto.setDatanasc(rs.getDate("datnasc").toLocalDate());
                funcionariodto.setEndereco(rs.getString("end"));
                funcionariodto.setTelefone(rs.getString("tele"));
                funcionariodto.setCelular(rs.getString("cel"));
                funcionariodto.setOrgaoExpedidor(rs.getString("ogexp"));
                funcionariodto.setRg(rs.getString("rg"));
                funcionariodto.setEstado(rs.getString("uf"));
                funcionariodto.setCidade(rs.getString("cidade"));
                funcionariodto.setBairro(rs.getString("bairro"));
                funcionariodto.setCpf(rs.getString("cpf"));
                funcionariodto.setFuncao(rs.getString("funcao"));
                funcionariodto.setSexo(rs.getString("sexo"));
                listaMedico.add(funcionariodto);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro no PesquisarDAONome" + e);
        }
        return listaMedico;
    }
    
     public ArrayList<FuncionarioDTO> ListaEnfermeiro(){
        String sql = "SELECT codigo, nome, datnasc, end, tele, cel, ogexp, rg, uf, cidade, bairro, cpf, funcao, sexo from funcionario WHERE funcao = 'Enfermeira' OR funcao = 'Enfermeiro'";
        
        conexao = new ConexaoDAO().ConexaoBanco();
        
        try {
            pstm = conexao.prepareStatement(sql);
            rs = pstm.executeQuery();
                
            while (rs.next()) {
               FuncionarioDTO funcionariodto = new FuncionarioDTO();
                
                funcionariodto.setCodigo(rs.getInt("codigo"));
                funcionariodto.setNome(rs.getString("nome")); 
                funcionariodto.setDatanasc(rs.getDate("datnasc").toLocalDate());
                funcionariodto.setEndereco(rs.getString("end"));
                funcionariodto.setTelefone(rs.getString("tele"));
                funcionariodto.setCelular(rs.getString("cel"));
                funcionariodto.setOrgaoExpedidor(rs.getString("ogexp"));
                funcionariodto.setRg(rs.getString("rg"));
                funcionariodto.setEstado(rs.getString("uf"));
                funcionariodto.setCidade(rs.getString("cidade"));
                funcionariodto.setBairro(rs.getString("bairro"));
                funcionariodto.setCpf(rs.getString("cpf"));
                funcionariodto.setFuncao(rs.getString("funcao"));
                funcionariodto.setSexo(rs.getString("sexo"));
                listaEnfermeiro.add(funcionariodto);
             
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro no PesquisarDAONome" + e);
        }
        return listaEnfermeiro;
    }
    
    
    public void alterarFuncionario(FuncionarioDTO funcionarioDTO){
        String sql = "UPDATE funcionario SET nome = ?, datnasc = ?, end = ?, tele = ?, cel = ?, ogexp = ?, rg = ?, uf = ?, cidade = ?, bairro = ?, cpf = ?, funcao = ?, sexo = ? WHERE codigo = ?";
            
        conexao = new ConexaoDAO().ConexaoBanco();
            
        try {
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, funcionarioDTO.getNome());
            pstm.setDate(2, java.sql.Date.valueOf(funcionarioDTO.getDatanasc()));
            pstm.setString(3, funcionarioDTO.getEndereco());
            pstm.setString(4, funcionarioDTO.getTelefone());
            pstm.setString(5, funcionarioDTO.getCelular());
            pstm.setString(6, funcionarioDTO.getOrgaoExpedidor());
            pstm.setString(7, funcionarioDTO.getRg());
            pstm.setString(8, funcionarioDTO.getEstado());
            pstm.setString(9, funcionarioDTO.getCidade());
            pstm.setString(10, funcionarioDTO.getBairro());
            pstm.setString(11, funcionarioDTO.getCpf());
            pstm.setString(12, funcionarioDTO.getFuncao());
            pstm.setString(13, funcionarioDTO.getSexo());
            pstm.setInt(14, funcionarioDTO.getCodigo());
            pstm.execute();
            pstm.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro no Alterar DAO" + e);
            }
        }
    
    public FuncionarioDTO pesquisarFuncionarioCodigo(int codigo) {
         String sql = "SELECT codigo, nome, datnasc, end, tele, cel, ogexp, rg, uf, cidade, bairro, cpf, funcao, sexo FROM funcionario WHERE codigo = ?";
        
        conexao = new ConexaoDAO().ConexaoBanco();
        
        try {
            pstm = conexao.prepareStatement(sql);
            pstm.setInt(1, codigo);
            rs = pstm.executeQuery();
                
            if(rs.next()) {
               FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
                
                funcionarioDTO.setCodigo(rs.getInt("codigo"));
                funcionarioDTO.setNome(rs.getString("nome")); 
                funcionarioDTO.setDatanasc(rs.getDate("datnasc").toLocalDate());
                funcionarioDTO.setEndereco(rs.getString("end"));
                funcionarioDTO.setTelefone(rs.getString("tele"));
                funcionarioDTO.setCelular(rs.getString("cel"));
                funcionarioDTO.setOrgaoExpedidor(rs.getString("ogexp"));
                funcionarioDTO.setRg(rs.getString("rg"));
                funcionarioDTO.setEstado(rs.getString("uf"));
                funcionarioDTO.setCidade(rs.getString("cidade"));
                funcionarioDTO.setBairro(rs.getString("bairro"));
                funcionarioDTO.setCpf(rs.getString("cpf"));
                funcionarioDTO.setFuncao(rs.getString("funcao"));
                funcionarioDTO.setSexo(rs.getString("sexo")); 
                
                return funcionarioDTO;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro no PesquisarDAONome" + e);
        }
        return new FuncionarioDTO();
    }
}