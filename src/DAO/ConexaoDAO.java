package DAO;

import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Connection;

public class ConexaoDAO {
    
    public Connection ConexaoBanco() {
        Connection conexao = null;
        
        try {
            String url = "jdbc:mariadb://localhost:3306/posto_saude?zeroDateTimeBehavior=convertToNull&serverTimezone=UTC";
            String user = "root";
            String password = "";
            conexao = (Connection) DriverManager.getConnection(url, user, password);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro no ConexaoDao" + erro.getMessage());
        }
        
        return conexao;
    }
}
