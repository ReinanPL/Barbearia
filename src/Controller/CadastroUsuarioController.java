/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.CadastroUsuarioHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import view.CadastroUsuario;

/**
 *
 * @author Reinan
 */
public class CadastroUsuarioController {
    private final CadastroUsuario view;
    private final CadastroUsuarioHelper helper;

  

    public CadastroUsuarioController(CadastroUsuario view) {
        this.view = view;
        this.helper = new CadastroUsuarioHelper(view);
    }

 
    
    public void cadastrarUsuarios(){
        
        Usuario usuario = helper.obterModelo();
        new UsuarioDAO().insert(usuario);
        helper.limparTela();
        usuarioCadastradoSucesso();
        
    }
    
    public void usuarioCadastradoSucesso(){
        
        view.exibeMensagem("Usuário cadastrado com sucesso");
    }
    
}
