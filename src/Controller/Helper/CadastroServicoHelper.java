package Controller.Helper;
import Model.Servico;
import view.CadastroServico;

public class CadastroServicoHelper implements IHelper {
    
    private final CadastroServico view;

    public CadastroServicoHelper(CadastroServico view) {
        this.view = view;
    }    

    /**
     *
     * @return
     */
    @Override
    public Servico obterModelo() {
        
        String idString = view.getIdTxt().getText();
        int id = Integer.parseInt(idString);
        String descricao = view.getDescricaoTxt().getText();
        String floatValor = view.getValorTxt().getText();
        float valor = new Float(floatValor);
        
        Servico servico = new Servico(id, descricao, valor);
        
        return servico;
        
       

    }

    @Override
    public void limparTela() {
        
        view.getIdTxt().setText("");
        view.getDescricaoTxt().setText("");
        view.getValorTxt().setText("");
        
    }
    
    
    
   
    
}
