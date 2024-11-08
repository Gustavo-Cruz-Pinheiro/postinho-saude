package DAO;

import DTO.PlantaoDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Connection;

public class PlantaoDAO {
    Connection conexao;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<PlantaoDTO> lista = new ArrayList<>();
    
    public void cadastrarPlantao(PlantaoDTO plantaoDTO) {
        String sql = "INSERT INTO plantao (data, horaEntrada, horaSaida, codigo_enf, codigo_med)"
                + "VALUES(?, ?, ?, ?, ?)" ;
        
        conexao = new ConexaoDAO().ConexaoBanco();
        
        try {
            pstm = conexao.prepareStatement(sql);
            pstm.setDate(1, java.sql.Date.valueOf(plantaoDTO.getData()));
            pstm.setTime(2, java.sql.Time.valueOf(plantaoDTO.getHoraEntrada()));
            pstm.setTime(3, java.sql.Time.valueOf(plantaoDTO.getHoraSaida()));
            pstm.setInt(4, plantaoDTO.getCondigoEnfermeira());
            pstm.setInt(5, plantaoDTO.getCodigoMedico());
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro no PlantaoDAO" + e);
        }
    }
    
    public ArrayList<PlantaoDTO> PesquisarPlantao(){
        String sql = "SELECT p.codigo, p.data, p.horaEntrada, p.horaSaida, p.codigo_enf, p.codigo_med, med.nome, enf.nome from plantao p INNER JOIN funcionario med ON med.codigo = p.codigo_med INNER JOIN funcionario enf ON enf.codigo = p.codigo_enf;";
        
        conexao = new ConexaoDAO().ConexaoBanco();
        
        try {
            pstm = conexao.prepareStatement(sql);
            rs = pstm.executeQuery();
                
            while (rs.next()) {
                PlantaoDTO plantao = new PlantaoDTO();
                
                plantao.setCodigo(rs.getInt("p.codigo"));
                plantao.setData(rs.getDate("p.data").toLocalDate());
                plantao.setHoraEntrada(rs.getTime("p.horaEntrada").toLocalTime());
                plantao.setHoraSaida(rs.getTime("p.horaSaida").toLocalTime());
                plantao.setCondigoEnfermeira(rs.getInt("p.codigo_enf"));
                plantao.setCodigoMedico(rs.getInt("p.codigo_med"));
                plantao.setNomeMedico(rs.getString("med.nome"));
                plantao.setNomeEnfermeira(rs.getString("enf.nome"));
                lista.add(plantao);       
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro no PesquisarDAO" + e);
        }
        return lista;
    }
    
    
    public void alterarPlantao(PlantaoDTO plantaoDTO){
        String sql = "UPDATE plantao SET data = ?, horaEntrada = ?, horaSaida = ?, codigo_enf = ?, codigo_med = ? WHERE codigo = ?";
            
        conexao = new ConexaoDAO().ConexaoBanco();
            
        try {
            pstm = conexao.prepareStatement(sql);
            pstm.setDate(1, java.sql.Date.valueOf(plantaoDTO.getData()));
            pstm.setTime(2, java.sql.Time.valueOf(plantaoDTO.getHoraEntrada()));
            pstm.setTime(3, java.sql.Time.valueOf(plantaoDTO.getHoraSaida()));
            pstm.setInt(4, plantaoDTO.getCondigoEnfermeira());
            pstm.setInt(5, plantaoDTO.getCodigoMedico());
            pstm.setInt(6, plantaoDTO.getCodigo());
            pstm.execute();
            pstm.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro no Alterar DAO" + e);
            }
    }
    
 
}
