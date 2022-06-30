
package Controller;

import Controller.Helper.CadastroClienteHelper;
import Model.Cliente;
import Model.DAO.ClienteDAO;
import view.CadastroCliente;


public class CadastroClienteController {
    
    private final CadastroCliente view;
    private final CadastroClienteHelper helper;

  

    public CadastroClienteController(CadastroCliente view) {
        this.view = view;
        this.helper = new CadastroClienteHelper(view);
    }

 
    
    public void cadastrarClientes(){
        
        Cliente Cliente = helper.obterModelo();
        new ClienteDAO().insert(Cliente);
        helper.limparTela();
        usuarioCadastradoSucesso();
        
    }
    
    public void usuarioCadastradoSucesso(){
        
        view.exibeMensagem("Usuário cadastrado com sucesso");
    }
    
}
