
package Model;

import java.util.Date;

public class Cliente extends Pessoa{

    private String endereco;
    private String cep;

    public Cliente(int id, String Nome, char sexo, String dataNascimento, String telefone, String email, String rg, String endereco, String cep) {
        super(id, Nome, sexo, dataNascimento, telefone, email, rg);
        this.endereco = endereco;
        this.cep = cep; 
    }

    public Cliente(int id, String Nome, String endereco, String cep) {
        super(id, Nome);
        this.endereco = endereco;
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    @Override
    public String toString(){
        return getNome();
    }

   
    
    
    
}
