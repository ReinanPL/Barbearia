
package Controller;

import View.Agenda;
import View.MenuPrincipal;
import view.CadastroCliente;
import view.CadastroServico;
import view.CadastroUsuario;


public class MenuPrincipalController {
 
private final MenuPrincipal view;

    public MenuPrincipalController(MenuPrincipal view) {
        this.view = view;
    }

    public void navegarPraAgenda(){
        Agenda agenda = new Agenda();
        agenda.setVisible(true);
    }
    
    public void navegarPraCadastroUsuario(){
        CadastroUsuario cad = new CadastroUsuario();
        cad.setVisible(true);
    }
    
    public void navegarPraCadastroCliente(){
        CadastroCliente cad = new CadastroCliente();
        cad.setVisible(true);
    }
    
    public void navegarPraCadastroServico(){
        CadastroServico cad = new CadastroServico();
        cad.setVisible(true);
    }
    
    
}
