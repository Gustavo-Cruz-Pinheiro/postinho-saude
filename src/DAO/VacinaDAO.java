package DAO;

import DTO.VacinaDTO;
import org.mariadb.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VacinaDAO {
    Connection conexao;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<VacinaDTO> lista = new ArrayList<>();
    
    public void cadastrarVacina(VacinaDTO vacina) {
        String sql = "INSERT INTO vacina (nomeVaci, form_admvaci, via_admvaci, lugar_admvaci, descricao)"
                + "VALUES(?, ?, ?, ?, ?)" ;
        
        conexao = new ConexaoDAO().ConexaoBanco();
        
        try {
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, vacina.getNomeVaci());
            pstm.setString(2, vacina.getForm_admvaci());
            pstm.setString(3, vacina.getVia_admvaci());
            pstm.setString(4, vacina.getLugar_admvaci());
            pstm.setString(5, vacina.getDescricao());
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Erro no VacinaDAO" + e);
        }
    }
    
    public ArrayList<VacinaDTO> PesquisarVacina(){
        String sql = "SELECT codigo, nomeVaci, form_admvaci, via_admvaci, lugar_admvaci, descricao FROM vacina";
        
        conexao = new ConexaoDAO().ConexaoBanco();
        
        try {
            pstm = conexao.prepareStatement(sql);
            rs = pstm.executeQuery();
                
            while (rs.next()) {
                VacinaDTO vacina = new VacinaDTO();
                
                vacina.setCodigo(rs.getInt("codigo"));
                vacina.setNomeVaci(rs.getString("nomeVaci"));
                vacina.setForm_admvaci(rs.getString("form_admvaci"));
                vacina.setVia_admvaci(rs.getString("via_admvaci"));
                vacina.setLugar_admvaci(rs.getString("lugar_admvaci"));
                vacina.setDescricao(rs.getString("descricao"));
                lista.add(vacina);       
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro no PesquisarDAO" + e);
        }
        return lista;
    }
    
    public VacinaDTO PesquisarVacinaCodigo(int codigo){
        String sql = "SELECT codigo, nomeVaci, form_admvaci, via_admvaci, lugar_admvaci, descricao FROM vacina WHERE codigo = ?";
        
        conexao = new ConexaoDAO().ConexaoBanco();
        
        try {
            pstm = conexao.prepareStatement(sql);
            pstm.setInt(1, codigo);
            rs = pstm.executeQuery();
                
            if(rs.next()) {
                VacinaDTO vacina = new VacinaDTO();
                
                vacina.setCodigo(rs.getInt("codigo"));
                vacina.setNomeVaci(rs.getString("nomeVaci"));
                vacina.setForm_admvaci(rs.getString("form_admvaci"));
                vacina.setVia_admvaci(rs.getString("via_admvaci"));
                vacina.setLugar_admvaci(rs.getString("lugar_admvaci"));
                vacina.setDescricao(rs.getString("descricao"));
                return vacina;       
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro no PesquisarDAO" + e);
        }
        return new VacinaDTO();
    }
    
    public void alterarVacina(VacinaDTO vacina){
        String sql = "UPDATE vacina SET nomeVaci = ?, form_admvaci = ?, via_admvaci = ?, lugar_admvaci = ?, descricao = ? WHERE codigo = ?";
            
        conexao = new ConexaoDAO().ConexaoBanco();
            
        try {
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, vacina.getNomeVaci());
            pstm.setString(2, vacina.getForm_admvaci());
            pstm.setString(3, vacina.getVia_admvaci());
            pstm.setString(4, vacina.getLugar_admvaci());
            pstm.setString(5, vacina.getDescricao());
            pstm.setInt(6, vacina.getCodigo());
            pstm.execute();
            pstm.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro no Alterar DAO" + e);
            }
    }
}
