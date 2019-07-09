package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Camisa;

public class CamisaDao {
     public static boolean inserir(Camisa objeto) {
        String sql = "INSERT INTO Camisa (cor, tamanho) VALUES (?, ?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, objeto.getCor());
            ps.setString(2, objeto.getTamanho());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
     
     public static void main(String[] args) {
        Camisa objeto = new Camisa();
        objeto.setCor("azul");
        objeto.setTamanho("M");
        
        boolean resultado = inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
}
