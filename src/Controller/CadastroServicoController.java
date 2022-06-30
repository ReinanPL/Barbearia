
package Controller;

import Controller.Helper.CadastroServicoHelper;
import Model.DAO.ServicoDAO;
import Model.Servico;
import view.CadastroServico;


public class CadastroServicoController {
   
    private final CadastroServico view;
    private final CadastroServicoHelper helper;

    public CadastroServicoController(CadastroServico view) {
        this.view = view;
        this.helper = new CadastroServicoHelper(view);
    }

    
    
      public void cadastrarServicos(){
        
        Servico servico = helper.obterModelo();
        new ServicoDAO().insert(servico);
        helper.limparTela();
        usuarioCadastradoSucesso();
        
    }
    
    public void usuarioCadastradoSucesso(){
        
        view.exibeMensagem("Usuário cadastrado com sucesso");
    }
    
    

  

  
    
    
}
