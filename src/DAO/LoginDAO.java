package DAO;

import DTO.LoginDTO;
import org.mariadb.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LoginDAO {
    Connection conexao;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<LoginDTO> lista = new ArrayList<>();
    
    public void cadastrarLogin(LoginDTO login) {
        String sql = "INSERT INTO login (usuario, senha) VALUES(?, ?)" ;
        
        conexao = new ConexaoDAO().ConexaoBanco();
        
        try {
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1,login.getUsuario());
            pstm.setString(2, login.getSenha());
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Erro no FuncionarioDAO" + e);
        }
    }
    
    public ArrayList<LoginDTO> PesquisarLogin(){
        String sql = "SELECT codigo, usuario, senha from login";
        
        conexao = new ConexaoDAO().ConexaoBanco();
        
        try {
            pstm = conexao.prepareStatement(sql);
            rs = pstm.executeQuery();
                
            while (rs.next()) {
                LoginDTO login = new LoginDTO();
                
                login.setCodigo(rs.getInt("codigo"));
                login.setUsuario(rs.getString("usuario"));
                login.setSenha(rs.getString("senha"));
                lista.add(login);       
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro no PesquisarDAO" + e);
        }
        return lista;
    }
    
    public String PesquisarLoginCodigo(int codigo){
        String sql = "SELECT senha from login WHERE codigo = ?";
        
        conexao = new ConexaoDAO().ConexaoBanco();
        try {
            pstm = conexao.prepareStatement(sql);
            pstm.setInt(1, codigo);
            rs = pstm.executeQuery();
                
            if(rs.next()) {
                String senha;
                senha = rs.getString("senha");
                return senha;
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro no PesquisarDAO" + e);
        }
        return null;
    }
    
    public void alterarLogin(LoginDTO login){
        String sql = "UPDATE login SET usuario = ?, senha = ? WHERE codigo = ?";
            
        conexao = new ConexaoDAO().ConexaoBanco();
            
        try {
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, login.getUsuario());
            pstm.setString(2, login.getSenha());
            pstm.setInt(3, login.getCodigo());
            pstm.execute();
            pstm.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro no Alterar DAO" + e);
            }
    }
    
    public boolean efetuarLogin(String usuario, String senha) {
        String sql = "SELECT usuario, senha from login WHERE usuario = ? AND senha = ?";
        
        conexao = new ConexaoDAO().ConexaoBanco();
            
        try {
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, usuario);
            pstm.setString(2, senha);
            
            rs = pstm.executeQuery();
                
            if(rs.next()) {
               return true;
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no Alterar DAO" + e);
        }
        return false;
    }
}
