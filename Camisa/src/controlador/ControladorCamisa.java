package controlador;

import dao.CamisaDao;
import javax.swing.JOptionPane;
import modelo.Camisa;
import tela.manutencao.Manutencao_Camisa;

public class ControladorCamisa {
    public static void inserir(Manutencao_Camisa man){
        Camisa objeto = new Camisa();
        objeto.setCor(man.jtfCor.getText());
        objeto.setTamanho(man.jtfTamanho.getText());
        
        boolean resultado = CamisaDao.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}
}
