
package Model;

import java.util.Date;


public class Usuario extends Pessoa {
    protected String senha;
    protected String nivelAcesso;

    public Usuario(int id, String Nome, char sexo, String dataNascimento, String telefone, String email, String rg, String senha, String nivelAcesso ) {
        super(id, Nome, sexo, dataNascimento, telefone, email, rg);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }
    

    public Usuario(int id, String Nome, String senha) {
        super(id, Nome);
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
    
    
    
}
