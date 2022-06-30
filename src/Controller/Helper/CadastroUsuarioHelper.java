
package Controller.Helper;

import Model.Usuario;
import view.CadastroUsuario;


public class CadastroUsuarioHelper implements IHelper {
    private final CadastroUsuario view;

    public CadastroUsuarioHelper(CadastroUsuario view) {
        this.view = view;
    }
    
     public char obterChar(String nome){
        
        if(nome=="M"){
            char sexo = 'M';
            return sexo;
      } else if(nome == "F"){
            char sexo = 'F';
            return sexo;
         }   
        return 0;
      
     }
    
    
    @Override
     public Usuario obterModelo() { 
        String idString = view.getIdTxt().getText(); 
        int id = Integer.parseInt(idString);
        String nome = view.getNomeTxt().getText();
        String stringSexo = (String) view.getSexooTxt().getSelectedItem();
        char sexo = obterChar(stringSexo);
        String dataNascimento = view.getTextFormatedData().getText();
        String telefone = view.getTelefoneTxt().getText();
        String email = view.getEmailTxt().getText();
        String rg = view.getRgTxt().getText();
        String senha = view.getSenhaTxt().getText();
        String nivelAcesso = (String) view.getJCboxNivelAcesso().getSelectedItem();
        
        Usuario usuario = new Usuario(id, nome, sexo, dataNascimento, telefone, email, rg, senha, nivelAcesso);
        return usuario; 
     }
   
    @Override
    public void limparTela() {
    
        view.getIdTxt().setText("");
        view.getTextFormatedData().setText("");
        view.getTelefoneTxt().setText("");
        view.getEmailTxt().setText("");
        view.getRgTxt().setText("");
        view.getSenhaTxt().setText("");
}
    
}
