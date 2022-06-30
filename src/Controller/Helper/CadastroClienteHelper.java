/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.Cliente;
import view.CadastroCliente;

/**
 *
 * @author Reinan
 */
public class CadastroClienteHelper implements IHelper {
    
    private final CadastroCliente view;

    public CadastroClienteHelper(CadastroCliente view) {
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
     public Cliente obterModelo() { 
        String idString = view.getIdTxt().getText(); 
        int id = Integer.parseInt(idString);
        String nome = view.getNomeTxt().getText();
        String stringSexo = (String) view.getSexooTxt().getSelectedItem();
        char sexo = obterChar(stringSexo);
        String dataNascimento = view.getTextFormatedData().getText();
        String telefone = view.getTelefoneTxt().getText();
        String email = view.getEmailTxt().getText();
        String rg = view.getRgTxt().getText();
        String endereco = view.getEnderecoTxt().getText();
        String cep = (String) view.getCepTxt().getText();
        
        Cliente usuario = new Cliente(id, nome, sexo, dataNascimento, telefone, email, rg, endereco, cep);
        return usuario; 
     }
   
    @Override
    public void limparTela() {
    
        view.getIdTxt().setText("");
        view.getTextFormatedData().setText("");
        view.getTelefoneTxt().setText("");
        view.getEmailTxt().setText("");
        view.getRgTxt().setText("");
        view.getEnderecoTxt().setText("");
        view.getCepTxt().setText("");
}
    
}
